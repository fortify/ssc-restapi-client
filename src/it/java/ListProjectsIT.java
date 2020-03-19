import com.fortify.ssc.restclient.*;
import com.fortify.ssc.restclient.auth.*;
import com.fortify.ssc.restclient.model.*;
import com.fortify.ssc.restclient.api.ProjectControllerApi;
import com.fortify.ssc.restclient.api.ProjectVersionOfProjectControllerApi;
import org.apache.commons.codec.binary.Base64;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.StringWriter;
import java.io.PrintWriter;
import java.util.Properties;

public class ListProjectsIT {
    private static Logger LOGGER = LogManager.getLogger(ListProjectsIT.class.getName());

    private Properties props;

    private ApiClient defaultClient;
    private ProjectControllerApi apiInstance;

    public void initFromProperties(Properties props) throws java.io.UnsupportedEncodingException {
        this.props = props;
        defaultClient = Configuration.getDefaultApiClient();
        String apiToken = props.getProperty("it.fortifyApiToken");
        if (apiToken == null || apiToken.trim().length() == 0) {
            throw new RuntimeException("Missing it.fortifyApiToken");
        }
        String apiBase = props.getProperty("it.fortifyApiBase");
        if (apiBase == null || apiBase.trim().length() == 0) {
            throw new RuntimeException("Missing it.fortifyApiBase");
        }
        defaultClient.setBasePath(apiBase);
        // Configure API key authorization: FortifyToken
        ApiKeyAuth fortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
        fortifyToken.setApiKey(Base64.encodeBase64String(apiToken.getBytes("UTF-8")));
        fortifyToken.setApiKeyPrefix("FortifyToken");
    }

    @Before
    public void init() throws java.io.IOException, java.io.UnsupportedEncodingException {
        Properties props = new Properties();
        try (java.io.InputStream stream = this.getClass().getResourceAsStream("/integration-test.properties")) {
            if (stream == null) {
                props = System.getProperties();
            } else {
                props.load(stream);
            }
        }
        initFromProperties(props);
    }

    @Test
    public void testList() throws ApiException {
        String projectName = props.getProperty("it.fortifyProjectName");
        if (projectName == null || projectName.trim().length() == 0) {
            throw new RuntimeException("Missing it.fortifyProjectName");
        }
        String fields = null; // "id,name,description,createdBy,creationDate,issueTemplateId,id";

        Integer start = null;
        Integer limit = null;
        String q = "name:" + projectName;
        Boolean fulltextsearch = null;
        String orderby = null;

        LOGGER.info("Connecting to " + defaultClient.getBasePath() + " and reading a project " + projectName + "...");
        ProjectControllerApi projectController = new ProjectControllerApi();
        ApiResultListProject projectsResult = null;
        try {
            projectsResult = projectController.listProject(fields, start, limit, q, fulltextsearch, orderby);
            LOGGER.info(projectsResult);

            assertEquals(1L, projectsResult.getCount().longValue());
            assertEquals(projectName, ((Project)projectsResult.getData().get(0)).getName());
        } catch (ApiException e) {
            LOGGER.error("HTTP response code " + e.getCode());
            if (e.getCode() == 401) {
                LOGGER.error("Expected a fresh CIToken in it.fortifyApiToken");
            } else {
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw));
                LOGGER.warn(sw.toString());
            }
            throw e;
        }

        Long projectId = ((Project)projectsResult.getData().get(0)).getId();
        q = null;
        Boolean includeInactive = null;
        Boolean myAssignedIssues = null;
        LOGGER.info("Reading project " + projectId.longValue());
        ProjectVersionOfProjectControllerApi versionsOfProjectController = new ProjectVersionOfProjectControllerApi();
        try {
            ApiResultListProjectVersion versionsResult = versionsOfProjectController.listProjectVersionOfProject(projectId,
                    fields, start, limit, q, fulltextsearch, orderby, includeInactive, myAssignedIssues);
            LOGGER.info(versionsResult);
        } catch (ApiException e) {
            String codeMessage = "HTTP response code " + e.getCode();
            if (e.getCode() == 401) {
                LOGGER.error(codeMessage + ": Expected a fresh CIToken in it.fortifyApiToken");
            } else {
                LOGGER.error(codeMessage);
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw));
                LOGGER.warn(sw.toString());
            }
            throw e;
        }
    }

    public static void main(String[] args) throws java.io.IOException, java.io.UnsupportedEncodingException, ApiException {
        ListProjectsIT ts = new ListProjectsIT();
        ts.init();
        ts.testList();
    }
}

