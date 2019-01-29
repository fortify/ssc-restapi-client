# ssc-restapi-client
Communicate with Fortify Software Security Center through REST API in java, a swagger generated client

## Generated client notice:

To regenerate the client, we used this command:

```shell
java -jar swagger-codegen-cli-2.3.1.jar generate -i spec.json -l java -o ssc-restapi-client -c config.json
```

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.fortify</groupId>
    <artifactId>ssc-restapi-client</artifactId>
    <version>2.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.fortify:ssc-restapi-client:2.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/ssc-restapi-client-2.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.fortify.ssc.restclient.*;
import com.fortify.ssc.restclient.auth.*;
import com.fortify.ssc.restclient.model.*;
import com.fortify.ssc.restclient.api.AaTrainingStatusOfProjectVersionControllerApi;

import java.io.File;
import java.util.*;

public class AaTrainingStatusOfProjectVersionControllerApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: FortifyToken
        ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
        FortifyToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //FortifyToken.setApiKeyPrefix("Token");

        AaTrainingStatusOfProjectVersionControllerApi apiInstance = new AaTrainingStatusOfProjectVersionControllerApi();
        Long parentId = 789L; // Long | parentId
        String fields = "fields_example"; // String | Output fields
        try {
            ApiResultListAATrainingStatus result = apiInstance.listAaTrainingStatusOfProjectVersion(parentId, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AaTrainingStatusOfProjectVersionControllerApi#listAaTrainingStatusOfProjectVersion");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AaTrainingStatusOfProjectVersionControllerApi* | [**listAaTrainingStatusOfProjectVersion**](docs/AaTrainingStatusOfProjectVersionControllerApi.md#listAaTrainingStatusOfProjectVersion) | **GET** /projectVersions/{parentId}/auditAssistantTrainingStatus | list
*ActivityFeedControllerApi* | [**listActivityFeed**](docs/ActivityFeedControllerApi.md#listActivityFeed) | **GET** /activityFeedEvents | list
*AlertDefinitionControllerApi* | [**createAlertDefinition**](docs/AlertDefinitionControllerApi.md#createAlertDefinition) | **POST** /alertDefinitions | create
*AlertDefinitionControllerApi* | [**deleteAlertDefinition**](docs/AlertDefinitionControllerApi.md#deleteAlertDefinition) | **DELETE** /alertDefinitions/{id} | delete
*AlertDefinitionControllerApi* | [**listAlertDefinition**](docs/AlertDefinitionControllerApi.md#listAlertDefinition) | **GET** /alertDefinitions | list
*AlertDefinitionControllerApi* | [**multiDeleteAlertDefinition**](docs/AlertDefinitionControllerApi.md#multiDeleteAlertDefinition) | **DELETE** /alertDefinitions | multiDelete
*AlertDefinitionControllerApi* | [**readAlertDefinition**](docs/AlertDefinitionControllerApi.md#readAlertDefinition) | **GET** /alertDefinitions/{id} | read
*AlertDefinitionControllerApi* | [**updateAlertDefinition**](docs/AlertDefinitionControllerApi.md#updateAlertDefinition) | **PUT** /alertDefinitions/{id} | update
*AlertHistoryControllerApi* | [**doActionAlertHistory**](docs/AlertHistoryControllerApi.md#doActionAlertHistory) | **POST** /alerts/action | doAction
*AlertHistoryControllerApi* | [**listAlertHistory**](docs/AlertHistoryControllerApi.md#listAlertHistory) | **GET** /alerts | list
*AlertHistoryControllerApi* | [**setStatusForAlertHistory**](docs/AlertHistoryControllerApi.md#setStatusForAlertHistory) | **POST** /alerts/action/setStatus | setStatusFor
*AlertableEventTypeControllerApi* | [**listAlertableEventType**](docs/AlertableEventTypeControllerApi.md#listAlertableEventType) | **GET** /alertableEventTypes | list
*ApplicationStateControllerApi* | [**getApplicationState**](docs/ApplicationStateControllerApi.md#getApplicationState) | **GET** /applicationState | get
*ApplicationStateControllerApi* | [**putApplicationState**](docs/ApplicationStateControllerApi.md#putApplicationState) | **PUT** /applicationState | put
*ArtifactControllerApi* | [**approveArtifact**](docs/ArtifactControllerApi.md#approveArtifact) | **POST** /artifacts/action/approve | approve
*ArtifactControllerApi* | [**deleteArtifact**](docs/ArtifactControllerApi.md#deleteArtifact) | **DELETE** /artifacts/{id} | delete
*ArtifactControllerApi* | [**doActionArtifact**](docs/ArtifactControllerApi.md#doActionArtifact) | **POST** /artifacts/{id}/action | doAction
*ArtifactControllerApi* | [**purgeArtifact**](docs/ArtifactControllerApi.md#purgeArtifact) | **POST** /artifacts/action/purge | purge
*ArtifactControllerApi* | [**readArtifact**](docs/ArtifactControllerApi.md#readArtifact) | **GET** /artifacts/{id} | read
*ArtifactOfProjectVersionControllerApi* | [**listArtifactOfProjectVersion**](docs/ArtifactOfProjectVersionControllerApi.md#listArtifactOfProjectVersion) | **GET** /projectVersions/{parentId}/artifacts | list
*ArtifactOfProjectVersionControllerApi* | [**uploadArtifactOfProjectVersion**](docs/ArtifactOfProjectVersionControllerApi.md#uploadArtifactOfProjectVersion) | **POST** /projectVersions/{parentId}/artifacts | upload
*AttributeDefinitionControllerApi* | [**createAttributeDefinition**](docs/AttributeDefinitionControllerApi.md#createAttributeDefinition) | **POST** /attributeDefinitions | create
*AttributeDefinitionControllerApi* | [**deleteAttributeDefinition**](docs/AttributeDefinitionControllerApi.md#deleteAttributeDefinition) | **DELETE** /attributeDefinitions/{id} | delete
*AttributeDefinitionControllerApi* | [**listAttributeDefinition**](docs/AttributeDefinitionControllerApi.md#listAttributeDefinition) | **GET** /attributeDefinitions | list
*AttributeDefinitionControllerApi* | [**multiDeleteAttributeDefinition**](docs/AttributeDefinitionControllerApi.md#multiDeleteAttributeDefinition) | **DELETE** /attributeDefinitions | multiDelete
*AttributeDefinitionControllerApi* | [**readAttributeDefinition**](docs/AttributeDefinitionControllerApi.md#readAttributeDefinition) | **GET** /attributeDefinitions/{id} | read
*AttributeDefinitionControllerApi* | [**updateAttributeDefinition**](docs/AttributeDefinitionControllerApi.md#updateAttributeDefinition) | **PUT** /attributeDefinitions/{id} | update
*AttributeOfProjectControllerApi* | [**createAttributeOfProject**](docs/AttributeOfProjectControllerApi.md#createAttributeOfProject) | **POST** /projects/{parentId}/attributes | create
*AttributeOfProjectControllerApi* | [**listAttributeOfProject**](docs/AttributeOfProjectControllerApi.md#listAttributeOfProject) | **GET** /projects/{parentId}/attributes | list
*AttributeOfProjectControllerApi* | [**readAttributeOfProject**](docs/AttributeOfProjectControllerApi.md#readAttributeOfProject) | **GET** /projects/{parentId}/attributes/{id} | read
*AttributeOfProjectControllerApi* | [**updateCollectionAttributeOfProject**](docs/AttributeOfProjectControllerApi.md#updateCollectionAttributeOfProject) | **PUT** /projects/{parentId}/attributes | updateCollection
*AttributeOfProjectVersionControllerApi* | [**createAttributeOfProjectVersion**](docs/AttributeOfProjectVersionControllerApi.md#createAttributeOfProjectVersion) | **POST** /projectVersions/{parentId}/attributes | create
*AttributeOfProjectVersionControllerApi* | [**listAttributeOfProjectVersion**](docs/AttributeOfProjectVersionControllerApi.md#listAttributeOfProjectVersion) | **GET** /projectVersions/{parentId}/attributes | list
*AttributeOfProjectVersionControllerApi* | [**readAttributeOfProjectVersion**](docs/AttributeOfProjectVersionControllerApi.md#readAttributeOfProjectVersion) | **GET** /projectVersions/{parentId}/attributes/{id} | read
*AttributeOfProjectVersionControllerApi* | [**updateCollectionAttributeOfProjectVersion**](docs/AttributeOfProjectVersionControllerApi.md#updateCollectionAttributeOfProjectVersion) | **PUT** /projectVersions/{parentId}/attributes | updateCollection
*AuditAssistantStatusOfProjectVersionControllerApi* | [**listAuditAssistantStatusOfProjectVersion**](docs/AuditAssistantStatusOfProjectVersionControllerApi.md#listAuditAssistantStatusOfProjectVersion) | **GET** /projectVersions/{parentId}/auditAssistantStatus | list
*AuditHistoryOfIssueControllerApi* | [**listAuditHistoryOfIssue**](docs/AuditHistoryOfIssueControllerApi.md#listAuditHistoryOfIssue) | **GET** /issues/{parentId}/auditHistory | list
*AuthEntityControllerApi* | [**listAuthEntity**](docs/AuthEntityControllerApi.md#listAuthEntity) | **GET** /authEntities | list
*AuthEntityControllerApi* | [**multiDeleteAuthEntity**](docs/AuthEntityControllerApi.md#multiDeleteAuthEntity) | **DELETE** /authEntities | multiDelete
*AuthEntityControllerApi* | [**readAuthEntity**](docs/AuthEntityControllerApi.md#readAuthEntity) | **GET** /authEntities/{id} | read
*AuthEntityOfProjectControllerApi* | [**listAuthEntityOfProject**](docs/AuthEntityOfProjectControllerApi.md#listAuthEntityOfProject) | **GET** /projects/{parentId}/authEntities | list
*AuthEntityOfProjectControllerApi* | [**readAuthEntityOfProject**](docs/AuthEntityOfProjectControllerApi.md#readAuthEntityOfProject) | **GET** /projects/{parentId}/authEntities/{id} | read
*AuthEntityOfProjectControllerApi* | [**updateCollectionAuthEntityOfProject**](docs/AuthEntityOfProjectControllerApi.md#updateCollectionAuthEntityOfProject) | **PUT** /projects/{parentId}/authEntities | updateCollection
*AuthEntityOfProjectVersionControllerApi* | [**listAuthEntityOfProjectVersion**](docs/AuthEntityOfProjectVersionControllerApi.md#listAuthEntityOfProjectVersion) | **GET** /projectVersions/{parentId}/authEntities | list
*AuthEntityOfProjectVersionControllerApi* | [**readAuthEntityOfProjectVersion**](docs/AuthEntityOfProjectVersionControllerApi.md#readAuthEntityOfProjectVersion) | **GET** /projectVersions/{parentId}/authEntities/{id} | read
*AuthEntityOfProjectVersionControllerApi* | [**updateCollectionAuthEntityOfProjectVersion**](docs/AuthEntityOfProjectVersionControllerApi.md#updateCollectionAuthEntityOfProjectVersion) | **PUT** /projectVersions/{parentId}/authEntities | updateCollection
*AuthTokenControllerApi* | [**createAuthToken**](docs/AuthTokenControllerApi.md#createAuthToken) | **POST** /tokens | create
*AuthTokenControllerApi* | [**deleteAuthToken**](docs/AuthTokenControllerApi.md#deleteAuthToken) | **DELETE** /tokens/{id} | delete
*AuthTokenControllerApi* | [**listAuthToken**](docs/AuthTokenControllerApi.md#listAuthToken) | **GET** /tokens | list
*AuthTokenControllerApi* | [**multiDeleteAuthToken**](docs/AuthTokenControllerApi.md#multiDeleteAuthToken) | **DELETE** /tokens | Revoke authentication tokens using ONE of two choices: (1) all tokens owned by the requesting user, OR (2) list of token ids.
*AuthTokenControllerApi* | [**revokeAuthToken**](docs/AuthTokenControllerApi.md#revokeAuthToken) | **POST** /tokens/action/revoke | Revoke authentication tokens by value
*AuthTokenControllerApi* | [**updateAuthToken**](docs/AuthTokenControllerApi.md#updateAuthToken) | **PUT** /tokens/{id} | update
*BugFilingRequirementsOfProjectVersionControllerApi* | [**doActionBugFilingRequirementsOfProjectVersion**](docs/BugFilingRequirementsOfProjectVersionControllerApi.md#doActionBugFilingRequirementsOfProjectVersion) | **POST** /projectVersions/{parentId}/bugfilingrequirements/action | doAction
*BugFilingRequirementsOfProjectVersionControllerApi* | [**listBugFilingRequirementsOfProjectVersion**](docs/BugFilingRequirementsOfProjectVersionControllerApi.md#listBugFilingRequirementsOfProjectVersion) | **GET** /projectVersions/{parentId}/bugfilingrequirements | list
*BugFilingRequirementsOfProjectVersionControllerApi* | [**loginBugFilingRequirementsOfProjectVersion**](docs/BugFilingRequirementsOfProjectVersionControllerApi.md#loginBugFilingRequirementsOfProjectVersion) | **POST** /projectVersions/{parentId}/bugfilingrequirements/action/login | login
*BugFilingRequirementsOfProjectVersionControllerApi* | [**updateCollectionBugFilingRequirementsOfProjectVersion**](docs/BugFilingRequirementsOfProjectVersionControllerApi.md#updateCollectionBugFilingRequirementsOfProjectVersion) | **PUT** /projectVersions/{parentId}/bugfilingrequirements | updateCollection
*BugTrackerControllerApi* | [**listBugTracker**](docs/BugTrackerControllerApi.md#listBugTracker) | **GET** /bugtrackers | list
*BugTrackerOfProjectVersionControllerApi* | [**doActionBugTrackerOfProjectVersion**](docs/BugTrackerOfProjectVersionControllerApi.md#doActionBugTrackerOfProjectVersion) | **POST** /projectVersions/{parentId}/bugtracker/action | doAction
*BugTrackerOfProjectVersionControllerApi* | [**listBugTrackerOfProjectVersion**](docs/BugTrackerOfProjectVersionControllerApi.md#listBugTrackerOfProjectVersion) | **GET** /projectVersions/{parentId}/bugtracker | list
*BugTrackerOfProjectVersionControllerApi* | [**testBugTrackerOfProjectVersion**](docs/BugTrackerOfProjectVersionControllerApi.md#testBugTrackerOfProjectVersion) | **POST** /projectVersions/{parentId}/bugtracker/action/test | test
*BugTrackerOfProjectVersionControllerApi* | [**updateCollectionBugTrackerOfProjectVersion**](docs/BugTrackerOfProjectVersionControllerApi.md#updateCollectionBugTrackerOfProjectVersion) | **PUT** /projectVersions/{parentId}/bugtracker | updateCollection
*BugfieldTemplateGroupControllerApi* | [**createBugfieldTemplateGroup**](docs/BugfieldTemplateGroupControllerApi.md#createBugfieldTemplateGroup) | **POST** /bugfieldTemplateGroups | create
*BugfieldTemplateGroupControllerApi* | [**deleteBugfieldTemplateGroup**](docs/BugfieldTemplateGroupControllerApi.md#deleteBugfieldTemplateGroup) | **DELETE** /bugfieldTemplateGroups/{id} | delete
*BugfieldTemplateGroupControllerApi* | [**listBugfieldTemplateGroup**](docs/BugfieldTemplateGroupControllerApi.md#listBugfieldTemplateGroup) | **GET** /bugfieldTemplateGroups | list
*BugfieldTemplateGroupControllerApi* | [**multiDeleteBugfieldTemplateGroup**](docs/BugfieldTemplateGroupControllerApi.md#multiDeleteBugfieldTemplateGroup) | **DELETE** /bugfieldTemplateGroups | multiDelete
*BugfieldTemplateGroupControllerApi* | [**readBugfieldTemplateGroup**](docs/BugfieldTemplateGroupControllerApi.md#readBugfieldTemplateGroup) | **GET** /bugfieldTemplateGroups/{id} | read
*BugfieldTemplateGroupControllerApi* | [**updateBugfieldTemplateGroup**](docs/BugfieldTemplateGroupControllerApi.md#updateBugfieldTemplateGroup) | **PUT** /bugfieldTemplateGroups/{id} | update
*BulkControllerApi* | [**postBulk**](docs/BulkControllerApi.md#postBulk) | **POST** /bulk | post
*CloudJobControllerApi* | [**cancelCloudJob**](docs/CloudJobControllerApi.md#cancelCloudJob) | **POST** /cloudjobs/action/cancel | cancel
*CloudJobControllerApi* | [**doActionCloudJob**](docs/CloudJobControllerApi.md#doActionCloudJob) | **POST** /cloudjobs/{jobToken}/action | doAction
*CloudJobControllerApi* | [**listCloudJob**](docs/CloudJobControllerApi.md#listCloudJob) | **GET** /cloudjobs | list
*CloudJobControllerApi* | [**readCloudJob**](docs/CloudJobControllerApi.md#readCloudJob) | **GET** /cloudjobs/{jobToken} | read
*CloudJobOfCloudPoolControllerApi* | [**listCloudJobOfCloudPool**](docs/CloudJobOfCloudPoolControllerApi.md#listCloudJobOfCloudPool) | **GET** /cloudpools/{parentId}/jobs | list
*CloudJobOfCloudWorkerControllerApi* | [**listCloudJobOfCloudWorker**](docs/CloudJobOfCloudWorkerControllerApi.md#listCloudJobOfCloudWorker) | **GET** /cloudworkers/{parentId}/cloudjobs | list
*CloudPoolControllerApi* | [**createCloudPool**](docs/CloudPoolControllerApi.md#createCloudPool) | **POST** /cloudpools | create
*CloudPoolControllerApi* | [**deleteCloudPool**](docs/CloudPoolControllerApi.md#deleteCloudPool) | **DELETE** /cloudpools/{uuid} | delete
*CloudPoolControllerApi* | [**listCloudPool**](docs/CloudPoolControllerApi.md#listCloudPool) | **GET** /cloudpools | list
*CloudPoolControllerApi* | [**readCloudPool**](docs/CloudPoolControllerApi.md#readCloudPool) | **GET** /cloudpools/{uuid} | read
*CloudPoolControllerApi* | [**updateCloudPool**](docs/CloudPoolControllerApi.md#updateCloudPool) | **PUT** /cloudpools/{uuid} | update
*CloudPoolMappingControllerApi* | [**mapByVersionIdCloudPoolMapping**](docs/CloudPoolMappingControllerApi.md#mapByVersionIdCloudPoolMapping) | **GET** /cloudmappings/mapByVersionId | mapByVersionId
*CloudPoolMappingControllerApi* | [**mapByVersionIdsCloudPoolMapping**](docs/CloudPoolMappingControllerApi.md#mapByVersionIdsCloudPoolMapping) | **POST** /cloudmappings/mapByVersionIds | mapByVersionIds
*CloudPoolMappingControllerApi* | [**mapByVersionNameCloudPoolMapping**](docs/CloudPoolMappingControllerApi.md#mapByVersionNameCloudPoolMapping) | **GET** /cloudmappings/mapByVersionName | mapByVersionName
*CloudSystemMetricsControllerApi* | [**getCloudSystemMetrics**](docs/CloudSystemMetricsControllerApi.md#getCloudSystemMetrics) | **GET** /cloudsystem/metrics | get
*CloudSystemPollStatusControllerApi* | [**getCloudSystemPollStatus**](docs/CloudSystemPollStatusControllerApi.md#getCloudSystemPollStatus) | **GET** /cloudsystem/pollstatus | get
*CloudSystemSettingsControllerApi* | [**getCloudSystemSettings**](docs/CloudSystemSettingsControllerApi.md#getCloudSystemSettings) | **GET** /cloudsystem/settings | get
*CloudWorkerControllerApi* | [**listCloudWorker**](docs/CloudWorkerControllerApi.md#listCloudWorker) | **GET** /cloudworkers | list
*CloudWorkerControllerApi* | [**readCloudWorker**](docs/CloudWorkerControllerApi.md#readCloudWorker) | **GET** /cloudworkers/{uuid} | read
*CloudWorkerOfCloudPoolControllerApi* | [**assignCloudWorkerOfCloudPool**](docs/CloudWorkerOfCloudPoolControllerApi.md#assignCloudWorkerOfCloudPool) | **POST** /cloudpools/{parentId}/workers/action/assign | assign
*CloudWorkerOfCloudPoolControllerApi* | [**disableCloudWorkerOfCloudPool**](docs/CloudWorkerOfCloudPoolControllerApi.md#disableCloudWorkerOfCloudPool) | **POST** /cloudpools/{parentId}/workers/action/disable | disable
*CloudWorkerOfCloudPoolControllerApi* | [**doActionCloudWorkerOfCloudPool**](docs/CloudWorkerOfCloudPoolControllerApi.md#doActionCloudWorkerOfCloudPool) | **POST** /cloudpools/{parentId}/workers/action | doAction
*CloudWorkerOfCloudPoolControllerApi* | [**listCloudWorkerOfCloudPool**](docs/CloudWorkerOfCloudPoolControllerApi.md#listCloudWorkerOfCloudPool) | **GET** /cloudpools/{parentId}/workers | list
*CloudWorkerOfCloudPoolControllerApi* | [**replaceCloudWorkerOfCloudPool**](docs/CloudWorkerOfCloudPoolControllerApi.md#replaceCloudWorkerOfCloudPool) | **POST** /cloudpools/{parentId}/workers/action/replace | replace
*ConfigurationControllerApi* | [**getConfiguration**](docs/ConfigurationControllerApi.md#getConfiguration) | **GET** /configuration | get
*ConfigurationControllerApi* | [**getFullTextIndexStatusConfiguration**](docs/ConfigurationControllerApi.md#getFullTextIndexStatusConfiguration) | **GET** /configuration/searchIndex | getFullTextIndexStatus
*ConfigurationControllerApi* | [**readConfiguration**](docs/ConfigurationControllerApi.md#readConfiguration) | **GET** /configuration/{id} | read
*ConfigurationControllerApi* | [**updateConfiguration**](docs/ConfigurationControllerApi.md#updateConfiguration) | **PUT** /configuration | update
*ConfigurationControllerApi* | [**validateAuditAssistantConnectionConfiguration**](docs/ConfigurationControllerApi.md#validateAuditAssistantConnectionConfiguration) | **POST** /configuration/validateAuditAssistantConnection | validateAuditAssistantConnection
*ConfigurationControllerApi* | [**validateReportConnectionConfiguration**](docs/ConfigurationControllerApi.md#validateReportConnectionConfiguration) | **POST** /configuration/validateReportConnection | validateReportConnection
*CustomTagControllerApi* | [**createCustomTag**](docs/CustomTagControllerApi.md#createCustomTag) | **POST** /customTags | create
*CustomTagControllerApi* | [**deleteCustomTag**](docs/CustomTagControllerApi.md#deleteCustomTag) | **DELETE** /customTags/{id} | delete
*CustomTagControllerApi* | [**listCustomTag**](docs/CustomTagControllerApi.md#listCustomTag) | **GET** /customTags | list
*CustomTagControllerApi* | [**multiDeleteCustomTag**](docs/CustomTagControllerApi.md#multiDeleteCustomTag) | **DELETE** /customTags | multiDelete
*CustomTagControllerApi* | [**readCustomTag**](docs/CustomTagControllerApi.md#readCustomTag) | **GET** /customTags/{id} | read
*CustomTagControllerApi* | [**updateCustomTag**](docs/CustomTagControllerApi.md#updateCustomTag) | **PUT** /customTags/{id} | update
*CustomTagOfIssueTemplateControllerApi* | [**listCustomTagOfIssueTemplate**](docs/CustomTagOfIssueTemplateControllerApi.md#listCustomTagOfIssueTemplate) | **GET** /issueTemplates/{parentId}/customTags | list
*CustomTagOfProjectVersionControllerApi* | [**createCustomTagOfProjectVersion**](docs/CustomTagOfProjectVersionControllerApi.md#createCustomTagOfProjectVersion) | **POST** /projectVersions/{parentId}/customTags | create
*CustomTagOfProjectVersionControllerApi* | [**listCustomTagOfProjectVersion**](docs/CustomTagOfProjectVersionControllerApi.md#listCustomTagOfProjectVersion) | **GET** /projectVersions/{parentId}/customTags | list
*CustomTagOfProjectVersionControllerApi* | [**updateCollectionCustomTagOfProjectVersion**](docs/CustomTagOfProjectVersionControllerApi.md#updateCollectionCustomTagOfProjectVersion) | **PUT** /projectVersions/{parentId}/customTags | updateCollection
*CustomTagOfProjectVersionControllerApi* | [**updateCustomTagOfProjectVersion**](docs/CustomTagOfProjectVersionControllerApi.md#updateCustomTagOfProjectVersion) | **PUT** /projectVersions/{parentId}/customTags/{id} | update
*DashboardVersionControllerApi* | [**listDashboardVersion**](docs/DashboardVersionControllerApi.md#listDashboardVersion) | **GET** /dashboardVersions | list
*DataExportControllerApi* | [**deleteDataExport**](docs/DataExportControllerApi.md#deleteDataExport) | **DELETE** /dataExports/{id} | delete
*DataExportControllerApi* | [**doActionDataExport**](docs/DataExportControllerApi.md#doActionDataExport) | **POST** /dataExports/action | doAction
*DataExportControllerApi* | [**exportAuditToCSVForDataExport**](docs/DataExportControllerApi.md#exportAuditToCSVForDataExport) | **POST** /dataExports/action/exportAuditToCsv | exportAuditToCSVFor
*DataExportControllerApi* | [**exportIssuesStatsToCSVForDataExport**](docs/DataExportControllerApi.md#exportIssuesStatsToCSVForDataExport) | **POST** /dataExports/action/exportIssueStatsToCsv | exportIssuesStatsToCSVFor
*DataExportControllerApi* | [**listDataExport**](docs/DataExportControllerApi.md#listDataExport) | **GET** /dataExports | list
*DynamicScanRequestOfProjectVersionControllerApi* | [**cancelDynamicScanRequestOfProjectVersion**](docs/DynamicScanRequestOfProjectVersionControllerApi.md#cancelDynamicScanRequestOfProjectVersion) | **POST** /projectVersions/{parentId}/dynamicScanRequests/{id}/action | Cancel a Dynamic Scan Request
*DynamicScanRequestOfProjectVersionControllerApi* | [**createDynamicScanRequestOfProjectVersion**](docs/DynamicScanRequestOfProjectVersionControllerApi.md#createDynamicScanRequestOfProjectVersion) | **POST** /projectVersions/{parentId}/dynamicScanRequests | create
*DynamicScanRequestOfProjectVersionControllerApi* | [**listDynamicScanRequestOfProjectVersion**](docs/DynamicScanRequestOfProjectVersionControllerApi.md#listDynamicScanRequestOfProjectVersion) | **GET** /projectVersions/{parentId}/dynamicScanRequests | list
*DynamicScanRequestOfProjectVersionControllerApi* | [**readDynamicScanRequestOfProjectVersion**](docs/DynamicScanRequestOfProjectVersionControllerApi.md#readDynamicScanRequestOfProjectVersion) | **GET** /projectVersions/{parentId}/dynamicScanRequests/{id} | read
*DynamicScanRequestOfProjectVersionControllerApi* | [**updateDynamicScanRequestOfProjectVersion**](docs/DynamicScanRequestOfProjectVersionControllerApi.md#updateDynamicScanRequestOfProjectVersion) | **PUT** /projectVersions/{parentId}/dynamicScanRequests/{id} | update
*DynamicScanRequestTemplateOfProjectVersionControllerApi* | [**getDynamicScanRequestTemplateOfProjectVersion**](docs/DynamicScanRequestTemplateOfProjectVersionControllerApi.md#getDynamicScanRequestTemplateOfProjectVersion) | **GET** /projectVersions/{parentId}/dynamicScanRequestTemplate | get
*DynamicScanRequestsSummaryOfProjectVersionControllerApi* | [**getDynamicScanRequestsSummaryOfProjectVersion**](docs/DynamicScanRequestsSummaryOfProjectVersionControllerApi.md#getDynamicScanRequestsSummaryOfProjectVersion) | **GET** /projectVersions/{parentId}/dynamicScanRequestsSummary | get
*EngineTypeControllerApi* | [**listEngineType**](docs/EngineTypeControllerApi.md#listEngineType) | **GET** /engineTypes | list
*EventLogControllerApi* | [**listEventLog**](docs/EventLogControllerApi.md#listEventLog) | **GET** /events | list
*FeatureControllerApi* | [**listFeature**](docs/FeatureControllerApi.md#listFeature) | **GET** /features | list
*FeatureControllerApi* | [**readFeature**](docs/FeatureControllerApi.md#readFeature) | **GET** /features/{id} | read
*FileTokenControllerApi* | [**createFileToken**](docs/FileTokenControllerApi.md#createFileToken) | **POST** /fileTokens | Create single-use file transfer token
*FileTokenControllerApi* | [**multiDeleteFileToken**](docs/FileTokenControllerApi.md#multiDeleteFileToken) | **DELETE** /fileTokens | Call this operation after every file upload activity
*FilterSetOfProjectVersionControllerApi* | [**listFilterSetOfProjectVersion**](docs/FilterSetOfProjectVersionControllerApi.md#listFilterSetOfProjectVersion) | **GET** /projectVersions/{parentId}/filterSets | list
*FolderControllerApi* | [**getFolder**](docs/FolderControllerApi.md#getFolder) | **GET** /folders | get
*FolderOfProjectVersionControllerApi* | [**listFolderOfProjectVersion**](docs/FolderOfProjectVersionControllerApi.md#listFolderOfProjectVersion) | **GET** /projectVersions/{parentId}/folders | list
*FolderOfProjectVersionControllerApi* | [**readFolderOfProjectVersion**](docs/FolderOfProjectVersionControllerApi.md#readFolderOfProjectVersion) | **GET** /projectVersions/{parentId}/folders/{id} | read
*GroupOfAuthEntityControllerApi* | [**listGroupOfAuthEntity**](docs/GroupOfAuthEntityControllerApi.md#listGroupOfAuthEntity) | **GET** /authEntities/{parentId}/groups | list
*IidMigrationControllerApi* | [**readIidMigration**](docs/IidMigrationControllerApi.md#readIidMigration) | **GET** /iidMigrations/{id} | read
*IidMigrationOfProjectVersionControllerApi* | [**createIidMigrationOfProjectVersion**](docs/IidMigrationOfProjectVersionControllerApi.md#createIidMigrationOfProjectVersion) | **POST** /projectVersions/{parentId}/iidMigrations | create
*IidMigrationOfProjectVersionControllerApi* | [**listIidMigrationOfProjectVersion**](docs/IidMigrationOfProjectVersionControllerApi.md#listIidMigrationOfProjectVersion) | **GET** /projectVersions/{parentId}/iidMigrations | list
*InternalCustomTagControllerApi* | [**listInternalCustomTag**](docs/InternalCustomTagControllerApi.md#listInternalCustomTag) | **GET** /internalCustomTags | list
*IssueAgingControllerApi* | [**listIssueAging**](docs/IssueAgingControllerApi.md#listIssueAging) | **GET** /issueaging | list
*IssueAgingGroupControllerApi* | [**listIssueAgingGroup**](docs/IssueAgingGroupControllerApi.md#listIssueAgingGroup) | **GET** /issueaginggroup | list
*IssueAgingPortletControllerApi* | [**getIssueAgingPortlet**](docs/IssueAgingPortletControllerApi.md#getIssueAgingPortlet) | **GET** /portlets/issueaging | get
*IssueAssignmentOfProjectVersionControllerApi* | [**listIssueAssignmentOfProjectVersion**](docs/IssueAssignmentOfProjectVersionControllerApi.md#listIssueAssignmentOfProjectVersion) | **GET** /projectVersions/{parentId}/issueAssignment | list
*IssueAssignmentOfProjectVersionControllerApi* | [**readIssueAssignmentOfProjectVersion**](docs/IssueAssignmentOfProjectVersionControllerApi.md#readIssueAssignmentOfProjectVersion) | **GET** /projectVersions/{parentId}/issueAssignment/{id} | read
*IssueAttachmentOfIssueControllerApi* | [**createIssueAttachmentOfIssue**](docs/IssueAttachmentOfIssueControllerApi.md#createIssueAttachmentOfIssue) | **POST** /issues/{parentId}/attachments | create
*IssueAttachmentOfIssueControllerApi* | [**deleteIssueAttachmentOfIssue**](docs/IssueAttachmentOfIssueControllerApi.md#deleteIssueAttachmentOfIssue) | **DELETE** /issues/{parentId}/attachments/{id} | delete
*IssueAttachmentOfIssueControllerApi* | [**listIssueAttachmentOfIssue**](docs/IssueAttachmentOfIssueControllerApi.md#listIssueAttachmentOfIssue) | **GET** /issues/{parentId}/attachments | list
*IssueAttachmentOfIssueControllerApi* | [**multiDeleteIssueAttachmentOfIssue**](docs/IssueAttachmentOfIssueControllerApi.md#multiDeleteIssueAttachmentOfIssue) | **DELETE** /issues/{parentId}/attachments | multiDelete
*IssueAttachmentOfIssueControllerApi* | [**readIssueAttachmentOfIssue**](docs/IssueAttachmentOfIssueControllerApi.md#readIssueAttachmentOfIssue) | **GET** /issues/{parentId}/attachments/{id} | read
*IssueAttachmentOfIssueControllerApi* | [**updateIssueAttachmentOfIssue**](docs/IssueAttachmentOfIssueControllerApi.md#updateIssueAttachmentOfIssue) | **PUT** /issues/{parentId}/attachments/{id} | update
*IssueAuditCommentControllerApi* | [**listIssueAuditComment**](docs/IssueAuditCommentControllerApi.md#listIssueAuditComment) | **GET** /comments | list
*IssueAuditCommentOfIssueControllerApi* | [**createIssueAuditCommentOfIssue**](docs/IssueAuditCommentOfIssueControllerApi.md#createIssueAuditCommentOfIssue) | **POST** /issues/{parentId}/comments | create
*IssueAuditCommentOfIssueControllerApi* | [**listIssueAuditCommentOfIssue**](docs/IssueAuditCommentOfIssueControllerApi.md#listIssueAuditCommentOfIssue) | **GET** /issues/{parentId}/comments | list
*IssueControllerApi* | [**listIssue**](docs/IssueControllerApi.md#listIssue) | **GET** /issues | list
*IssueControllerApi* | [**readIssue**](docs/IssueControllerApi.md#readIssue) | **GET** /issues/{id} | read
*IssueDetailControllerApi* | [**listIssueDetail**](docs/IssueDetailControllerApi.md#listIssueDetail) | **GET** /issueDetails | list
*IssueDetailControllerApi* | [**readIssueDetail**](docs/IssueDetailControllerApi.md#readIssueDetail) | **GET** /issueDetails/{id} | read
*IssueGroupOfProjectVersionControllerApi* | [**listIssueGroupOfProjectVersion**](docs/IssueGroupOfProjectVersionControllerApi.md#listIssueGroupOfProjectVersion) | **GET** /projectVersions/{parentId}/issueGroups | list
*IssueOfProjectVersionControllerApi* | [**assignUserForIssueOfProjectVersion**](docs/IssueOfProjectVersionControllerApi.md#assignUserForIssueOfProjectVersion) | **POST** /projectVersions/{parentId}/issues/action/assignUser | assignUserFor
*IssueOfProjectVersionControllerApi* | [**auditIssueOfProjectVersion**](docs/IssueOfProjectVersionControllerApi.md#auditIssueOfProjectVersion) | **POST** /projectVersions/{parentId}/issues/action/audit | audit
*IssueOfProjectVersionControllerApi* | [**doActionIssueOfProjectVersion**](docs/IssueOfProjectVersionControllerApi.md#doActionIssueOfProjectVersion) | **POST** /projectVersions/{parentId}/issues/action | doAction
*IssueOfProjectVersionControllerApi* | [**fileBugForIssueOfProjectVersion**](docs/IssueOfProjectVersionControllerApi.md#fileBugForIssueOfProjectVersion) | **POST** /projectVersions/{parentId}/issues/action/fileBug | fileBugFor
*IssueOfProjectVersionControllerApi* | [**listIssueOfProjectVersion**](docs/IssueOfProjectVersionControllerApi.md#listIssueOfProjectVersion) | **GET** /projectVersions/{parentId}/issues | list
*IssueOfProjectVersionControllerApi* | [**readIssueOfProjectVersion**](docs/IssueOfProjectVersionControllerApi.md#readIssueOfProjectVersion) | **GET** /projectVersions/{parentId}/issues/{id} | read
*IssueOfProjectVersionControllerApi* | [**suppressIssueOfProjectVersion**](docs/IssueOfProjectVersionControllerApi.md#suppressIssueOfProjectVersion) | **POST** /projectVersions/{parentId}/issues/action/suppress | suppress
*IssueOfProjectVersionControllerApi* | [**updateTagForIssueOfProjectVersion**](docs/IssueOfProjectVersionControllerApi.md#updateTagForIssueOfProjectVersion) | **POST** /projectVersions/{parentId}/issues/action/updateTag | updateTagFor
*IssueSelectorSetOfProjectVersionControllerApi* | [**getIssueSelectorSetOfProjectVersion**](docs/IssueSelectorSetOfProjectVersionControllerApi.md#getIssueSelectorSetOfProjectVersion) | **GET** /projectVersions/{parentId}/issueSelectorSet | get
*IssueStatisticsOfProjectVersionControllerApi* | [**listIssueStatisticsOfProjectVersion**](docs/IssueStatisticsOfProjectVersionControllerApi.md#listIssueStatisticsOfProjectVersion) | **GET** /projectVersions/{parentId}/issueStatistics | list
*IssueSummaryOfProjectVersionControllerApi* | [**listIssueSummaryOfProjectVersion**](docs/IssueSummaryOfProjectVersionControllerApi.md#listIssueSummaryOfProjectVersion) | **GET** /projectVersions/{parentId}/issueSummaries | list
*IssueTemplateControllerApi* | [**deleteIssueTemplate**](docs/IssueTemplateControllerApi.md#deleteIssueTemplate) | **DELETE** /issueTemplates/{id} | delete
*IssueTemplateControllerApi* | [**listIssueTemplate**](docs/IssueTemplateControllerApi.md#listIssueTemplate) | **GET** /issueTemplates | list
*IssueTemplateControllerApi* | [**multiDeleteIssueTemplate**](docs/IssueTemplateControllerApi.md#multiDeleteIssueTemplate) | **DELETE** /issueTemplates | multiDelete
*IssueTemplateControllerApi* | [**readIssueTemplate**](docs/IssueTemplateControllerApi.md#readIssueTemplate) | **GET** /issueTemplates/{id} | read
*IssueTemplateControllerApi* | [**updateIssueTemplate**](docs/IssueTemplateControllerApi.md#updateIssueTemplate) | **PUT** /issueTemplates/{id} | update
*IssueViewTemplateControllerApi* | [**listIssueViewTemplate**](docs/IssueViewTemplateControllerApi.md#listIssueViewTemplate) | **GET** /issueViewTemplates | list
*IssueViewTemplateControllerApi* | [**readIssueViewTemplate**](docs/IssueViewTemplateControllerApi.md#readIssueViewTemplate) | **GET** /issueViewTemplates/{id} | read
*JobControllerApi* | [**cancelJob**](docs/JobControllerApi.md#cancelJob) | **POST** /jobs/action/cancel | cancel
*JobControllerApi* | [**doActionJob**](docs/JobControllerApi.md#doActionJob) | **POST** /jobs/{jobName}/action | doAction
*JobControllerApi* | [**listJob**](docs/JobControllerApi.md#listJob) | **GET** /jobs | list
*JobControllerApi* | [**readJob**](docs/JobControllerApi.md#readJob) | **GET** /jobs/{jobName} | read
*JobControllerApi* | [**updateJob**](docs/JobControllerApi.md#updateJob) | **PUT** /jobs/{jobName} | update
*JobPriorityChangeCategoryWarningOfJobControllerApi* | [**listJobPriorityChangeCategoryWarningOfJob**](docs/JobPriorityChangeCategoryWarningOfJobControllerApi.md#listJobPriorityChangeCategoryWarningOfJob) | **GET** /jobs/{parentId}/warnings | list
*LdapObjectControllerApi* | [**createLdapObject**](docs/LdapObjectControllerApi.md#createLdapObject) | **POST** /ldapObjects | create
*LdapObjectControllerApi* | [**deleteLdapObject**](docs/LdapObjectControllerApi.md#deleteLdapObject) | **DELETE** /ldapObjects/{id} | delete
*LdapObjectControllerApi* | [**doCollectionActionLdapObject**](docs/LdapObjectControllerApi.md#doCollectionActionLdapObject) | **POST** /ldapObjects/action | doCollectionAction
*LdapObjectControllerApi* | [**listLdapObject**](docs/LdapObjectControllerApi.md#listLdapObject) | **GET** /ldapObjects | list
*LdapObjectControllerApi* | [**multiDeleteLdapObject**](docs/LdapObjectControllerApi.md#multiDeleteLdapObject) | **DELETE** /ldapObjects | multiDelete
*LdapObjectControllerApi* | [**readLdapObject**](docs/LdapObjectControllerApi.md#readLdapObject) | **GET** /ldapObjects/{id} | read
*LdapObjectControllerApi* | [**refreshLdapObject**](docs/LdapObjectControllerApi.md#refreshLdapObject) | **POST** /ldapObjects/action/refresh | refresh
*LdapObjectControllerApi* | [**updateLdapObject**](docs/LdapObjectControllerApi.md#updateLdapObject) | **PUT** /ldapObjects/{id} | update
*LdapServerControllerApi* | [**createLdapServer**](docs/LdapServerControllerApi.md#createLdapServer) | **POST** /ldapServers | create
*LdapServerControllerApi* | [**deleteLdapServer**](docs/LdapServerControllerApi.md#deleteLdapServer) | **DELETE** /ldapServers/{id} | delete
*LdapServerControllerApi* | [**doCollectionActionLdapServer**](docs/LdapServerControllerApi.md#doCollectionActionLdapServer) | **POST** /ldapServers/action | doCollectionAction
*LdapServerControllerApi* | [**listLdapServer**](docs/LdapServerControllerApi.md#listLdapServer) | **GET** /ldapServers | list
*LdapServerControllerApi* | [**multiDeleteLdapServer**](docs/LdapServerControllerApi.md#multiDeleteLdapServer) | **DELETE** /ldapServers | multiDelete
*LdapServerControllerApi* | [**readLdapServer**](docs/LdapServerControllerApi.md#readLdapServer) | **GET** /ldapServers/{id} | read
*LdapServerControllerApi* | [**testLdapServer**](docs/LdapServerControllerApi.md#testLdapServer) | **POST** /ldapServers/action/test | test
*LdapServerControllerApi* | [**updateLdapServer**](docs/LdapServerControllerApi.md#updateLdapServer) | **PUT** /ldapServers/{id} | update
*LicenseControllerApi* | [**getLicense**](docs/LicenseControllerApi.md#getLicense) | **GET** /license | get
*LocalUserControllerApi* | [**checkLocalUser**](docs/LocalUserControllerApi.md#checkLocalUser) | **POST** /localUsers/action/checkPasswordStrength | check
*LocalUserControllerApi* | [**createLocalUser**](docs/LocalUserControllerApi.md#createLocalUser) | **POST** /localUsers | create
*LocalUserControllerApi* | [**deleteLocalUser**](docs/LocalUserControllerApi.md#deleteLocalUser) | **DELETE** /localUsers/{id} | delete
*LocalUserControllerApi* | [**listLocalUser**](docs/LocalUserControllerApi.md#listLocalUser) | **GET** /localUsers | list
*LocalUserControllerApi* | [**multiDeleteLocalUser**](docs/LocalUserControllerApi.md#multiDeleteLocalUser) | **DELETE** /localUsers | multiDelete
*LocalUserControllerApi* | [**readLocalUser**](docs/LocalUserControllerApi.md#readLocalUser) | **GET** /localUsers/{id} | read
*LocalUserControllerApi* | [**updateLocalUser**](docs/LocalUserControllerApi.md#updateLocalUser) | **PUT** /localUsers/{id} | update
*ParserPluginImageControllerApi* | [**getParserPluginImage**](docs/ParserPluginImageControllerApi.md#getParserPluginImage) | **GET** /pluginimage/parser | get
*PerformanceIndicatorControllerApi* | [**createPerformanceIndicator**](docs/PerformanceIndicatorControllerApi.md#createPerformanceIndicator) | **POST** /performanceIndicators | create
*PerformanceIndicatorControllerApi* | [**deletePerformanceIndicator**](docs/PerformanceIndicatorControllerApi.md#deletePerformanceIndicator) | **DELETE** /performanceIndicators/{id} | delete
*PerformanceIndicatorControllerApi* | [**listPerformanceIndicator**](docs/PerformanceIndicatorControllerApi.md#listPerformanceIndicator) | **GET** /performanceIndicators | list
*PerformanceIndicatorControllerApi* | [**multiDeletePerformanceIndicator**](docs/PerformanceIndicatorControllerApi.md#multiDeletePerformanceIndicator) | **DELETE** /performanceIndicators | multiDelete
*PerformanceIndicatorControllerApi* | [**updatePerformanceIndicator**](docs/PerformanceIndicatorControllerApi.md#updatePerformanceIndicator) | **PUT** /performanceIndicators/{id} | update
*PerformanceIndicatorHistoryOfProjectVersionControllerApi* | [**listPerformanceIndicatorHistoryOfProjectVersion**](docs/PerformanceIndicatorHistoryOfProjectVersionControllerApi.md#listPerformanceIndicatorHistoryOfProjectVersion) | **GET** /projectVersions/{parentId}/performanceIndicatorHistories | list
*PerformanceIndicatorHistoryOfProjectVersionControllerApi* | [**readPerformanceIndicatorHistoryOfProjectVersion**](docs/PerformanceIndicatorHistoryOfProjectVersionControllerApi.md#readPerformanceIndicatorHistoryOfProjectVersion) | **GET** /projectVersions/{parentId}/performanceIndicatorHistories/{id} | read
*PermissionControllerApi* | [**listPermission**](docs/PermissionControllerApi.md#listPermission) | **GET** /permissions | list
*PermissionControllerApi* | [**readPermission**](docs/PermissionControllerApi.md#readPermission) | **GET** /permissions/{id} | read
*PermissionOfRoleControllerApi* | [**listPermissionOfRole**](docs/PermissionOfRoleControllerApi.md#listPermissionOfRole) | **GET** /roles/{parentId}/permissions | list
*PermissionRequiredByPermissionControllerApi* | [**listPermissionRequiredByPermission**](docs/PermissionRequiredByPermissionControllerApi.md#listPermissionRequiredByPermission) | **GET** /permissions/{parentId}/dependsOn | list
*PersonaControllerApi* | [**createPersona**](docs/PersonaControllerApi.md#createPersona) | **POST** /personas | create
*PersonaControllerApi* | [**deletePersona**](docs/PersonaControllerApi.md#deletePersona) | **DELETE** /personas/{id} | delete
*PersonaControllerApi* | [**listPersona**](docs/PersonaControllerApi.md#listPersona) | **GET** /personas | list
*PersonaControllerApi* | [**readPersona**](docs/PersonaControllerApi.md#readPersona) | **GET** /personas/{id} | read
*PersonaControllerApi* | [**updatePersona**](docs/PersonaControllerApi.md#updatePersona) | **PUT** /personas/{id} | update
*PluginControllerApi* | [**deletePlugin**](docs/PluginControllerApi.md#deletePlugin) | **DELETE** /plugins/{id} | delete
*PluginControllerApi* | [**disablePlugin**](docs/PluginControllerApi.md#disablePlugin) | **POST** /plugins/action/disable | disable
*PluginControllerApi* | [**doActionPlugin**](docs/PluginControllerApi.md#doActionPlugin) | **POST** /plugins/{id}/action | doAction
*PluginControllerApi* | [**enablePlugin**](docs/PluginControllerApi.md#enablePlugin) | **POST** /plugins/action/enable | enable
*PluginControllerApi* | [**listPlugin**](docs/PluginControllerApi.md#listPlugin) | **GET** /plugins | list
*PluginControllerApi* | [**readPlugin**](docs/PluginControllerApi.md#readPlugin) | **GET** /plugins/{id} | read
*PluginImageControllerApi* | [**getPluginImage**](docs/PluginImageControllerApi.md#getPluginImage) | **GET** /pluginimage | get
*PluginLocalizationControllerApi* | [**readPluginLocalization**](docs/PluginLocalizationControllerApi.md#readPluginLocalization) | **GET** /pluginlocalization | read
*ProjectControllerApi* | [**doCollectionActionProject**](docs/ProjectControllerApi.md#doCollectionActionProject) | **POST** /projects/action | doCollectionAction
*ProjectControllerApi* | [**listProject**](docs/ProjectControllerApi.md#listProject) | **GET** /projects | list
*ProjectControllerApi* | [**readProject**](docs/ProjectControllerApi.md#readProject) | **GET** /projects/{id} | read
*ProjectControllerApi* | [**testProject**](docs/ProjectControllerApi.md#testProject) | **POST** /projects/action/test | test
*ProjectControllerApi* | [**updateProject**](docs/ProjectControllerApi.md#updateProject) | **PUT** /projects/{id} | update
*ProjectVersionControllerApi* | [**auditByAuditAssistantProjectVersion**](docs/ProjectVersionControllerApi.md#auditByAuditAssistantProjectVersion) | **POST** /projectVersions/action/auditByAuditAssistant | auditByAuditAssistant
*ProjectVersionControllerApi* | [**copyCurrentStateForProjectVersion**](docs/ProjectVersionControllerApi.md#copyCurrentStateForProjectVersion) | **POST** /projectVersions/action/copyCurrentState | copyCurrentStateFor
*ProjectVersionControllerApi* | [**copyProjectVersion**](docs/ProjectVersionControllerApi.md#copyProjectVersion) | **POST** /projectVersions/action/copyFromPartial | copy
*ProjectVersionControllerApi* | [**createProjectVersion**](docs/ProjectVersionControllerApi.md#createProjectVersion) | **POST** /projectVersions | create
*ProjectVersionControllerApi* | [**deleteProjectVersion**](docs/ProjectVersionControllerApi.md#deleteProjectVersion) | **DELETE** /projectVersions/{id} | delete
*ProjectVersionControllerApi* | [**doActionProjectVersion**](docs/ProjectVersionControllerApi.md#doActionProjectVersion) | **POST** /projectVersions/{id}/action | doAction
*ProjectVersionControllerApi* | [**doCollectionActionProjectVersion**](docs/ProjectVersionControllerApi.md#doCollectionActionProjectVersion) | **POST** /projectVersions/action | doCollectionAction
*ProjectVersionControllerApi* | [**listProjectVersion**](docs/ProjectVersionControllerApi.md#listProjectVersion) | **GET** /projectVersions | list
*ProjectVersionControllerApi* | [**purgeProjectVersion**](docs/ProjectVersionControllerApi.md#purgeProjectVersion) | **POST** /projectVersions/action/purge | purge
*ProjectVersionControllerApi* | [**readProjectVersion**](docs/ProjectVersionControllerApi.md#readProjectVersion) | **GET** /projectVersions/{id} | read
*ProjectVersionControllerApi* | [**refreshProjectVersion**](docs/ProjectVersionControllerApi.md#refreshProjectVersion) | **POST** /projectVersions/action/refresh | refresh
*ProjectVersionControllerApi* | [**testProjectVersion**](docs/ProjectVersionControllerApi.md#testProjectVersion) | **POST** /projectVersions/action/test | test
*ProjectVersionControllerApi* | [**trainAuditAssistantProjectVersion**](docs/ProjectVersionControllerApi.md#trainAuditAssistantProjectVersion) | **POST** /projectVersions/action/trainAuditAssistant | trainAuditAssistant
*ProjectVersionControllerApi* | [**updateProjectVersion**](docs/ProjectVersionControllerApi.md#updateProjectVersion) | **PUT** /projectVersions/{id} | update
*ProjectVersionOfAlertDefinitionControllerApi* | [**listProjectVersionOfAlertDefinition**](docs/ProjectVersionOfAlertDefinitionControllerApi.md#listProjectVersionOfAlertDefinition) | **GET** /alertDefinitions/{parentId}/projectVersions | list
*ProjectVersionOfAuthEntityControllerApi* | [**assignProjectVersionOfAuthEntity**](docs/ProjectVersionOfAuthEntityControllerApi.md#assignProjectVersionOfAuthEntity) | **POST** /authEntities/{parentId}/projectVersions/action/assign | assign
*ProjectVersionOfAuthEntityControllerApi* | [**doActionProjectVersionOfAuthEntity**](docs/ProjectVersionOfAuthEntityControllerApi.md#doActionProjectVersionOfAuthEntity) | **POST** /authEntities/{parentId}/projectVersions/action | doAction
*ProjectVersionOfAuthEntityControllerApi* | [**listProjectVersionOfAuthEntity**](docs/ProjectVersionOfAuthEntityControllerApi.md#listProjectVersionOfAuthEntity) | **GET** /authEntities/{parentId}/projectVersions | list
*ProjectVersionOfAuthEntityControllerApi* | [**multiDeleteProjectVersionOfAuthEntity**](docs/ProjectVersionOfAuthEntityControllerApi.md#multiDeleteProjectVersionOfAuthEntity) | **DELETE** /authEntities/{parentId}/projectVersions | multiDelete
*ProjectVersionOfAuthEntityControllerApi* | [**updateProjectVersionOfAuthEntity**](docs/ProjectVersionOfAuthEntityControllerApi.md#updateProjectVersionOfAuthEntity) | **PUT** /authEntities/{parentId}/projectVersions | update
*ProjectVersionOfCloudPoolControllerApi* | [**assignProjectVersionOfCloudPool**](docs/ProjectVersionOfCloudPoolControllerApi.md#assignProjectVersionOfCloudPool) | **POST** /cloudpools/{parentId}/versions/action/assign | assign
*ProjectVersionOfCloudPoolControllerApi* | [**doActionProjectVersionOfCloudPool**](docs/ProjectVersionOfCloudPoolControllerApi.md#doActionProjectVersionOfCloudPool) | **POST** /cloudpools/{parentId}/versions/action | doAction
*ProjectVersionOfCloudPoolControllerApi* | [**listProjectVersionOfCloudPool**](docs/ProjectVersionOfCloudPoolControllerApi.md#listProjectVersionOfCloudPool) | **GET** /cloudpools/{parentId}/versions | list
*ProjectVersionOfCloudPoolControllerApi* | [**replaceProjectVersionOfCloudPool**](docs/ProjectVersionOfCloudPoolControllerApi.md#replaceProjectVersionOfCloudPool) | **POST** /cloudpools/{parentId}/versions/action/replace | replace
*ProjectVersionOfProjectControllerApi* | [**createProjectVersionOfProject**](docs/ProjectVersionOfProjectControllerApi.md#createProjectVersionOfProject) | **POST** /projects/{parentId}/versions | create
*ProjectVersionOfProjectControllerApi* | [**listProjectVersionOfProject**](docs/ProjectVersionOfProjectControllerApi.md#listProjectVersionOfProject) | **GET** /projects/{parentId}/versions | list
*ReportDefinitionControllerApi* | [**createReportDefinition**](docs/ReportDefinitionControllerApi.md#createReportDefinition) | **POST** /reportDefinitions | create
*ReportDefinitionControllerApi* | [**deleteReportDefinition**](docs/ReportDefinitionControllerApi.md#deleteReportDefinition) | **DELETE** /reportDefinitions/{id} | delete
*ReportDefinitionControllerApi* | [**listReportDefinition**](docs/ReportDefinitionControllerApi.md#listReportDefinition) | **GET** /reportDefinitions | list
*ReportDefinitionControllerApi* | [**multiDeleteReportDefinition**](docs/ReportDefinitionControllerApi.md#multiDeleteReportDefinition) | **DELETE** /reportDefinitions | multiDelete
*ReportDefinitionControllerApi* | [**readReportDefinition**](docs/ReportDefinitionControllerApi.md#readReportDefinition) | **GET** /reportDefinitions/{id} | read
*ReportDefinitionControllerApi* | [**updateReportDefinition**](docs/ReportDefinitionControllerApi.md#updateReportDefinition) | **PUT** /reportDefinitions/{id} | update
*ReportLibraryControllerApi* | [**createReportLibrary**](docs/ReportLibraryControllerApi.md#createReportLibrary) | **POST** /reportLibraries | create
*ReportLibraryControllerApi* | [**deleteReportLibrary**](docs/ReportLibraryControllerApi.md#deleteReportLibrary) | **DELETE** /reportLibraries/{id} | delete
*ReportLibraryControllerApi* | [**listReportLibrary**](docs/ReportLibraryControllerApi.md#listReportLibrary) | **GET** /reportLibraries | list
*ReportLibraryControllerApi* | [**multiDeleteReportLibrary**](docs/ReportLibraryControllerApi.md#multiDeleteReportLibrary) | **DELETE** /reportLibraries | multiDelete
*ReportLibraryControllerApi* | [**readReportLibrary**](docs/ReportLibraryControllerApi.md#readReportLibrary) | **GET** /reportLibraries/{id} | read
*ReportLibraryControllerApi* | [**updateReportLibrary**](docs/ReportLibraryControllerApi.md#updateReportLibrary) | **PUT** /reportLibraries/{id} | update
*ResponsibilityAssignmentOfProjectControllerApi* | [**listResponsibilityAssignmentOfProject**](docs/ResponsibilityAssignmentOfProjectControllerApi.md#listResponsibilityAssignmentOfProject) | **GET** /projects/{parentId}/responsibilities | list
*ResponsibilityAssignmentOfProjectControllerApi* | [**readResponsibilityAssignmentOfProject**](docs/ResponsibilityAssignmentOfProjectControllerApi.md#readResponsibilityAssignmentOfProject) | **GET** /projects/{parentId}/responsibilities/{guid} | read
*ResponsibilityAssignmentOfProjectControllerApi* | [**updateCollectionResponsibilityAssignmentOfProject**](docs/ResponsibilityAssignmentOfProjectControllerApi.md#updateCollectionResponsibilityAssignmentOfProject) | **PUT** /projects/{parentId}/responsibilities | updateCollection
*ResponsibilityAssignmentOfProjectVersionControllerApi* | [**listResponsibilityAssignmentOfProjectVersion**](docs/ResponsibilityAssignmentOfProjectVersionControllerApi.md#listResponsibilityAssignmentOfProjectVersion) | **GET** /projectVersions/{parentId}/responsibilities | list
*ResponsibilityAssignmentOfProjectVersionControllerApi* | [**readResponsibilityAssignmentOfProjectVersion**](docs/ResponsibilityAssignmentOfProjectVersionControllerApi.md#readResponsibilityAssignmentOfProjectVersion) | **GET** /projectVersions/{parentId}/responsibilities/{guid} | read
*ResponsibilityAssignmentOfProjectVersionControllerApi* | [**updateCollectionResponsibilityAssignmentOfProjectVersion**](docs/ResponsibilityAssignmentOfProjectVersionControllerApi.md#updateCollectionResponsibilityAssignmentOfProjectVersion) | **PUT** /projectVersions/{parentId}/responsibilities | updateCollection
*ResultProcessingRuleOfProjectVersionControllerApi* | [**listResultProcessingRuleOfProjectVersion**](docs/ResultProcessingRuleOfProjectVersionControllerApi.md#listResultProcessingRuleOfProjectVersion) | **GET** /projectVersions/{parentId}/resultProcessingRules | list
*ResultProcessingRuleOfProjectVersionControllerApi* | [**updateCollectionResultProcessingRuleOfProjectVersion**](docs/ResultProcessingRuleOfProjectVersionControllerApi.md#updateCollectionResultProcessingRuleOfProjectVersion) | **PUT** /projectVersions/{parentId}/resultProcessingRules | updateCollection
*RoleControllerApi* | [**createRole**](docs/RoleControllerApi.md#createRole) | **POST** /roles | create
*RoleControllerApi* | [**deleteRole**](docs/RoleControllerApi.md#deleteRole) | **DELETE** /roles/{id} | delete
*RoleControllerApi* | [**listRole**](docs/RoleControllerApi.md#listRole) | **GET** /roles | list
*RoleControllerApi* | [**multiDeleteRole**](docs/RoleControllerApi.md#multiDeleteRole) | **DELETE** /roles | multiDelete
*RoleControllerApi* | [**readRole**](docs/RoleControllerApi.md#readRole) | **GET** /roles/{id} | read
*RoleControllerApi* | [**updateRole**](docs/RoleControllerApi.md#updateRole) | **PUT** /roles/{id} | update
*RoleOfAuthEntityControllerApi* | [**listRoleOfAuthEntity**](docs/RoleOfAuthEntityControllerApi.md#listRoleOfAuthEntity) | **GET** /authEntities/{parentId}/roles | list
*RulepackCoreControllerApi* | [**deleteRulepackCore**](docs/RulepackCoreControllerApi.md#deleteRulepackCore) | **DELETE** /coreRulepacks/{id} | delete
*RulepackCoreControllerApi* | [**listRulepackCore**](docs/RulepackCoreControllerApi.md#listRulepackCore) | **GET** /coreRulepacks | list
*RulepackCoreControllerApi* | [**multiDeleteRulepackCore**](docs/RulepackCoreControllerApi.md#multiDeleteRulepackCore) | **DELETE** /coreRulepacks | multiDelete
*RulepackUpdateControllerApi* | [**listRulepackUpdate**](docs/RulepackUpdateControllerApi.md#listRulepackUpdate) | **GET** /updateRulepacks | list
*SavedReportControllerApi* | [**createSavedReport**](docs/SavedReportControllerApi.md#createSavedReport) | **POST** /reports | create
*SavedReportControllerApi* | [**deleteSavedReport**](docs/SavedReportControllerApi.md#deleteSavedReport) | **DELETE** /reports/{id} | delete
*SavedReportControllerApi* | [**listSavedReport**](docs/SavedReportControllerApi.md#listSavedReport) | **GET** /reports | list
*SavedReportControllerApi* | [**readSavedReport**](docs/SavedReportControllerApi.md#readSavedReport) | **GET** /reports/{id} | read
*ScanControllerApi* | [**readScan**](docs/ScanControllerApi.md#readScan) | **GET** /scans/{id} | read
*ScanErrorOfArtifactControllerApi* | [**listScanErrorOfArtifact**](docs/ScanErrorOfArtifactControllerApi.md#listScanErrorOfArtifact) | **GET** /artifacts/{parentId}/scanerrors | list
*ScanOfArtifactControllerApi* | [**listScanOfArtifact**](docs/ScanOfArtifactControllerApi.md#listScanOfArtifact) | **GET** /artifacts/{parentId}/scans | list
*SourceFileOfProjectVersionControllerApi* | [**listSourceFileOfProjectVersion**](docs/SourceFileOfProjectVersionControllerApi.md#listSourceFileOfProjectVersion) | **GET** /projectVersions/{parentId}/sourceFiles | list
*SourceFileOfProjectVersionControllerApi* | [**readSourceFileOfProjectVersion**](docs/SourceFileOfProjectVersionControllerApi.md#readSourceFileOfProjectVersion) | **GET** /projectVersions/{parentId}/sourceFiles/{id} | read
*SystemConfigurationControllerApi* | [**listSystemConfiguration**](docs/SystemConfigurationControllerApi.md#listSystemConfiguration) | **GET** /systemConfiguration | list
*SystemConfigurationControllerApi* | [**readSystemConfiguration**](docs/SystemConfigurationControllerApi.md#readSystemConfiguration) | **GET** /systemConfiguration/{name} | read
*TokenDefinitionControllerApi* | [**listTokenDefinition**](docs/TokenDefinitionControllerApi.md#listTokenDefinition) | **GET** /tokenDefinitions | list
*UnassignedCloudWorkerOfCloudPoolControllerApi* | [**listUnassignedCloudWorkerOfCloudPool**](docs/UnassignedCloudWorkerOfCloudPoolControllerApi.md#listUnassignedCloudWorkerOfCloudPool) | **GET** /cloudpools/disabledWorkers | list
*UserIssueSearchOptionOfProjectVersionControllerApi* | [**listUserIssueSearchOptionOfProjectVersion**](docs/UserIssueSearchOptionOfProjectVersionControllerApi.md#listUserIssueSearchOptionOfProjectVersion) | **GET** /projectVersions/{parentId}/issueSearchOptions | list
*UserIssueSearchOptionOfProjectVersionControllerApi* | [**readUserIssueSearchOptionOfProjectVersion**](docs/UserIssueSearchOptionOfProjectVersionControllerApi.md#readUserIssueSearchOptionOfProjectVersion) | **GET** /projectVersions/{parentId}/issueSearchOptions/{optionType} | read
*UserIssueSearchOptionOfProjectVersionControllerApi* | [**updateUserIssueSearchOptionOfProjectVersion**](docs/UserIssueSearchOptionOfProjectVersionControllerApi.md#updateUserIssueSearchOptionOfProjectVersion) | **PUT** /projectVersions/{parentId}/issueSearchOptions | update
*UserIssueSearchOptionsControllerApi* | [**getUserIssueSearchOptions**](docs/UserIssueSearchOptionsControllerApi.md#getUserIssueSearchOptions) | **GET** /userIssueSearchOptions | get
*UserIssueSearchOptionsControllerApi* | [**updateUserIssueSearchOptions**](docs/UserIssueSearchOptionsControllerApi.md#updateUserIssueSearchOptions) | **PUT** /userIssueSearchOptions | update
*UserIssueSearchOptionsOfProjectVersionControllerApi* | [**getUserIssueSearchOptionsOfProjectVersion**](docs/UserIssueSearchOptionsOfProjectVersionControllerApi.md#getUserIssueSearchOptionsOfProjectVersion) | **GET** /projectVersions/{parentId}/userIssueSearchOptions | get
*UserIssueSearchOptionsOfProjectVersionControllerApi* | [**updateUserIssueSearchOptionsOfProjectVersion**](docs/UserIssueSearchOptionsOfProjectVersionControllerApi.md#updateUserIssueSearchOptionsOfProjectVersion) | **PUT** /projectVersions/{parentId}/userIssueSearchOptions | update
*UserPreferencesControllerApi* | [**postUserPreferences**](docs/UserPreferencesControllerApi.md#postUserPreferences) | **POST** /userSession/prefs | post
*UserPreferencesControllerApi* | [**updateUserPreferences**](docs/UserPreferencesControllerApi.md#updateUserPreferences) | **PUT** /userSession/prefs | update
*UserSessionInfoControllerApi* | [**postUserSessionInfo**](docs/UserSessionInfoControllerApi.md#postUserSessionInfo) | **POST** /userSession/info | post
*UserSessionStateControllerApi* | [**listUserSessionState**](docs/UserSessionStateControllerApi.md#listUserSessionState) | **GET** /userSession/state | list
*UserSessionStateControllerApi* | [**putUserSessionState**](docs/UserSessionStateControllerApi.md#putUserSessionState) | **PUT** /userSession/state | put
*ValidateEquationControllerApi* | [**doValidateEquation**](docs/ValidateEquationControllerApi.md#doValidateEquation) | **POST** /validateEquation | DoValidation
*ValidateSearchStringControllerApi* | [**doValidateSearchString**](docs/ValidateSearchStringControllerApi.md#doValidateSearchString) | **POST** /validateSearchString | DoValidation
*VariableControllerApi* | [**createVariable**](docs/VariableControllerApi.md#createVariable) | **POST** /variables | create
*VariableControllerApi* | [**deleteVariable**](docs/VariableControllerApi.md#deleteVariable) | **DELETE** /variables/{id} | delete
*VariableControllerApi* | [**listVariable**](docs/VariableControllerApi.md#listVariable) | **GET** /variables | list
*VariableControllerApi* | [**multiDeleteVariable**](docs/VariableControllerApi.md#multiDeleteVariable) | **DELETE** /variables | multiDelete
*VariableControllerApi* | [**updateVariable**](docs/VariableControllerApi.md#updateVariable) | **PUT** /variables/{id} | update
*VariableHistoryOfProjectVersionControllerApi* | [**listVariableHistoryOfProjectVersion**](docs/VariableHistoryOfProjectVersionControllerApi.md#listVariableHistoryOfProjectVersion) | **GET** /projectVersions/{parentId}/variableHistories | list
*VariableHistoryOfProjectVersionControllerApi* | [**readVariableHistoryOfProjectVersion**](docs/VariableHistoryOfProjectVersionControllerApi.md#readVariableHistoryOfProjectVersion) | **GET** /projectVersions/{parentId}/variableHistories/{id} | read


## Documentation for Models

 - [AATrainingStatus](docs/AATrainingStatus.md)
 - [ActivityFeed](docs/ActivityFeed.md)
 - [AlertDefinitionDto](docs/AlertDefinitionDto.md)
 - [AlertHistoryEntry](docs/AlertHistoryEntry.md)
 - [AlertSetStatusRequest](docs/AlertSetStatusRequest.md)
 - [AlertTriggerDto](docs/AlertTriggerDto.md)
 - [AlertableEventType](docs/AlertableEventType.md)
 - [ApiActionResponse](docs/ApiActionResponse.md)
 - [ApiBulkRequestItem](docs/ApiBulkRequestItem.md)
 - [ApiBulkResponseData](docs/ApiBulkResponseData.md)
 - [ApiBulkResponseItemResponse](docs/ApiBulkResponseItemResponse.md)
 - [ApiCollectionActionlong](docs/ApiCollectionActionlong.md)
 - [ApiCollectionActionstring](docs/ApiCollectionActionstring.md)
 - [ApiResourceAction](docs/ApiResourceAction.md)
 - [ApiResult](docs/ApiResult.md)
 - [ApiResultAlertDefinitionDto](docs/ApiResultAlertDefinitionDto.md)
 - [ApiResultApiActionResponse](docs/ApiResultApiActionResponse.md)
 - [ApiResultApplicationNameTestResponse](docs/ApiResultApplicationNameTestResponse.md)
 - [ApiResultApplicationState](docs/ApiResultApplicationState.md)
 - [ApiResultArraystring](docs/ApiResultArraystring.md)
 - [ApiResultArtifact](docs/ApiResultArtifact.md)
 - [ApiResultAttribute](docs/ApiResultAttribute.md)
 - [ApiResultAttributeDefinition](docs/ApiResultAttributeDefinition.md)
 - [ApiResultAuthenticationEntity](docs/ApiResultAuthenticationEntity.md)
 - [ApiResultAuthenticationToken](docs/ApiResultAuthenticationToken.md)
 - [ApiResultBugFilingRequirementsResponse](docs/ApiResultBugFilingRequirementsResponse.md)
 - [ApiResultBugfieldTemplateGroupDto](docs/ApiResultBugfieldTemplateGroupDto.md)
 - [ApiResultCloudJob](docs/ApiResultCloudJob.md)
 - [ApiResultCloudPool](docs/ApiResultCloudPool.md)
 - [ApiResultCloudPoolMapping](docs/ApiResultCloudPoolMapping.md)
 - [ApiResultCloudPoolProjectVersionActionResponse](docs/ApiResultCloudPoolProjectVersionActionResponse.md)
 - [ApiResultCloudPoolWorkerActionResponse](docs/ApiResultCloudPoolWorkerActionResponse.md)
 - [ApiResultCloudSystemMetrics](docs/ApiResultCloudSystemMetrics.md)
 - [ApiResultCloudSystemPollStatus](docs/ApiResultCloudSystemPollStatus.md)
 - [ApiResultCloudSystemSettings](docs/ApiResultCloudSystemSettings.md)
 - [ApiResultCloudWorker](docs/ApiResultCloudWorker.md)
 - [ApiResultConfigProperties](docs/ApiResultConfigProperties.md)
 - [ApiResultConfigProperty](docs/ApiResultConfigProperty.md)
 - [ApiResultCustomTag](docs/ApiResultCustomTag.md)
 - [ApiResultDynamicScanRequest](docs/ApiResultDynamicScanRequest.md)
 - [ApiResultDynamicScanRequestTemplate](docs/ApiResultDynamicScanRequestTemplate.md)
 - [ApiResultDynamicScanRequestsSummary](docs/ApiResultDynamicScanRequestsSummary.md)
 - [ApiResultFeature](docs/ApiResultFeature.md)
 - [ApiResultFileToken](docs/ApiResultFileToken.md)
 - [ApiResultFolder](docs/ApiResultFolder.md)
 - [ApiResultIIDMigration](docs/ApiResultIIDMigration.md)
 - [ApiResultIssueActionResponse](docs/ApiResultIssueActionResponse.md)
 - [ApiResultIssueAgingPortlet](docs/ApiResultIssueAgingPortlet.md)
 - [ApiResultIssueAssignment](docs/ApiResultIssueAssignment.md)
 - [ApiResultIssueAttachment](docs/ApiResultIssueAttachment.md)
 - [ApiResultIssueAuditComment](docs/ApiResultIssueAuditComment.md)
 - [ApiResultIssueFileBugResponse](docs/ApiResultIssueFileBugResponse.md)
 - [ApiResultIssueFilterSelectorSet](docs/ApiResultIssueFilterSelectorSet.md)
 - [ApiResultIssueSearchOption](docs/ApiResultIssueSearchOption.md)
 - [ApiResultIssueTemplate](docs/ApiResultIssueTemplate.md)
 - [ApiResultIssueViewTemplate](docs/ApiResultIssueViewTemplate.md)
 - [ApiResultJob](docs/ApiResultJob.md)
 - [ApiResultLDAPEntity](docs/ApiResultLDAPEntity.md)
 - [ApiResultLdapRefreshResponse](docs/ApiResultLdapRefreshResponse.md)
 - [ApiResultLdapServerDto](docs/ApiResultLdapServerDto.md)
 - [ApiResultLicense](docs/ApiResultLicense.md)
 - [ApiResultListAATrainingStatus](docs/ApiResultListAATrainingStatus.md)
 - [ApiResultListActivityFeed](docs/ApiResultListActivityFeed.md)
 - [ApiResultListAlertDefinitionDto](docs/ApiResultListAlertDefinitionDto.md)
 - [ApiResultListAlertHistoryEntry](docs/ApiResultListAlertHistoryEntry.md)
 - [ApiResultListAlertableEventType](docs/ApiResultListAlertableEventType.md)
 - [ApiResultListArtifact](docs/ApiResultListArtifact.md)
 - [ApiResultListAttribute](docs/ApiResultListAttribute.md)
 - [ApiResultListAttributeDefinition](docs/ApiResultListAttributeDefinition.md)
 - [ApiResultListAuditAssistantStatus](docs/ApiResultListAuditAssistantStatus.md)
 - [ApiResultListAuthenticationEntity](docs/ApiResultListAuthenticationEntity.md)
 - [ApiResultListAuthenticationToken](docs/ApiResultListAuthenticationToken.md)
 - [ApiResultListBugFilingRequirements](docs/ApiResultListBugFilingRequirements.md)
 - [ApiResultListBugTracker](docs/ApiResultListBugTracker.md)
 - [ApiResultListBugfieldTemplateGroupDto](docs/ApiResultListBugfieldTemplateGroupDto.md)
 - [ApiResultListBulkResponseItem](docs/ApiResultListBulkResponseItem.md)
 - [ApiResultListCloudJob](docs/ApiResultListCloudJob.md)
 - [ApiResultListCloudPool](docs/ApiResultListCloudPool.md)
 - [ApiResultListCloudPoolMapping](docs/ApiResultListCloudPoolMapping.md)
 - [ApiResultListCloudWorker](docs/ApiResultListCloudWorker.md)
 - [ApiResultListCustomTag](docs/ApiResultListCustomTag.md)
 - [ApiResultListDashboardVersion](docs/ApiResultListDashboardVersion.md)
 - [ApiResultListDataExport](docs/ApiResultListDataExport.md)
 - [ApiResultListDynamicScanRequest](docs/ApiResultListDynamicScanRequest.md)
 - [ApiResultListEngineType](docs/ApiResultListEngineType.md)
 - [ApiResultListEventLog](docs/ApiResultListEventLog.md)
 - [ApiResultListFeature](docs/ApiResultListFeature.md)
 - [ApiResultListFilterSet](docs/ApiResultListFilterSet.md)
 - [ApiResultListFolder](docs/ApiResultListFolder.md)
 - [ApiResultListIIDMigration](docs/ApiResultListIIDMigration.md)
 - [ApiResultListIssueAgingDto](docs/ApiResultListIssueAgingDto.md)
 - [ApiResultListIssueAgingGroupDto](docs/ApiResultListIssueAgingGroupDto.md)
 - [ApiResultListIssueAssignment](docs/ApiResultListIssueAssignment.md)
 - [ApiResultListIssueAttachment](docs/ApiResultListIssueAttachment.md)
 - [ApiResultListIssueAuditComment](docs/ApiResultListIssueAuditComment.md)
 - [ApiResultListIssueAuditHistoryDto](docs/ApiResultListIssueAuditHistoryDto.md)
 - [ApiResultListIssueSearchOption](docs/ApiResultListIssueSearchOption.md)
 - [ApiResultListIssueStatistics](docs/ApiResultListIssueStatistics.md)
 - [ApiResultListIssueSummary](docs/ApiResultListIssueSummary.md)
 - [ApiResultListIssueTemplate](docs/ApiResultListIssueTemplate.md)
 - [ApiResultListIssueViewTemplate](docs/ApiResultListIssueViewTemplate.md)
 - [ApiResultListJob](docs/ApiResultListJob.md)
 - [ApiResultListJobPriorityChangeCategoryWarning](docs/ApiResultListJobPriorityChangeCategoryWarning.md)
 - [ApiResultListLDAPEntity](docs/ApiResultListLDAPEntity.md)
 - [ApiResultListLdapServerDto](docs/ApiResultListLdapServerDto.md)
 - [ApiResultListLocalUser](docs/ApiResultListLocalUser.md)
 - [ApiResultListPerformanceIndicator](docs/ApiResultListPerformanceIndicator.md)
 - [ApiResultListPerformanceIndicatorHistory](docs/ApiResultListPerformanceIndicatorHistory.md)
 - [ApiResultListPermission](docs/ApiResultListPermission.md)
 - [ApiResultListPersona](docs/ApiResultListPersona.md)
 - [ApiResultListPluginMetaData](docs/ApiResultListPluginMetaData.md)
 - [ApiResultListProject](docs/ApiResultListProject.md)
 - [ApiResultListProjectVersion](docs/ApiResultListProjectVersion.md)
 - [ApiResultListProjectVersionBugTracker](docs/ApiResultListProjectVersionBugTracker.md)
 - [ApiResultListProjectVersionIssue](docs/ApiResultListProjectVersionIssue.md)
 - [ApiResultListProjectVersionIssueDetails](docs/ApiResultListProjectVersionIssueDetails.md)
 - [ApiResultListProjectVersionIssueGroup](docs/ApiResultListProjectVersionIssueGroup.md)
 - [ApiResultListReportDefinition](docs/ApiResultListReportDefinition.md)
 - [ApiResultListReportLibrary](docs/ApiResultListReportLibrary.md)
 - [ApiResultListResponsibilityAssignment](docs/ApiResultListResponsibilityAssignment.md)
 - [ApiResultListResultProcessingRule](docs/ApiResultListResultProcessingRule.md)
 - [ApiResultListRole](docs/ApiResultListRole.md)
 - [ApiResultListRulepackCore](docs/ApiResultListRulepackCore.md)
 - [ApiResultListRulepacksBatchProcessStatus](docs/ApiResultListRulepacksBatchProcessStatus.md)
 - [ApiResultListSavedReport](docs/ApiResultListSavedReport.md)
 - [ApiResultListScan](docs/ApiResultListScan.md)
 - [ApiResultListSourceFileDto](docs/ApiResultListSourceFileDto.md)
 - [ApiResultListSystemConfiguration](docs/ApiResultListSystemConfiguration.md)
 - [ApiResultListTokenDefinition](docs/ApiResultListTokenDefinition.md)
 - [ApiResultListUserSessionState](docs/ApiResultListUserSessionState.md)
 - [ApiResultListVariable](docs/ApiResultListVariable.md)
 - [ApiResultListVariableHistory](docs/ApiResultListVariableHistory.md)
 - [ApiResultListscanError](docs/ApiResultListscanError.md)
 - [ApiResultLocalUser](docs/ApiResultLocalUser.md)
 - [ApiResultPasswordStrengthCheckResponse](docs/ApiResultPasswordStrengthCheckResponse.md)
 - [ApiResultPerformanceIndicator](docs/ApiResultPerformanceIndicator.md)
 - [ApiResultPerformanceIndicatorHistory](docs/ApiResultPerformanceIndicatorHistory.md)
 - [ApiResultPermission](docs/ApiResultPermission.md)
 - [ApiResultPersona](docs/ApiResultPersona.md)
 - [ApiResultPluginLocalization](docs/ApiResultPluginLocalization.md)
 - [ApiResultPluginMetaData](docs/ApiResultPluginMetaData.md)
 - [ApiResultProject](docs/ApiResultProject.md)
 - [ApiResultProjectVersion](docs/ApiResultProjectVersion.md)
 - [ApiResultProjectVersionIssue](docs/ApiResultProjectVersionIssue.md)
 - [ApiResultProjectVersionIssueDetails](docs/ApiResultProjectVersionIssueDetails.md)
 - [ApiResultProjectVersionRefreshResponse](docs/ApiResultProjectVersionRefreshResponse.md)
 - [ApiResultProjectVersionTestResponse](docs/ApiResultProjectVersionTestResponse.md)
 - [ApiResultReportDefinition](docs/ApiResultReportDefinition.md)
 - [ApiResultReportLibrary](docs/ApiResultReportLibrary.md)
 - [ApiResultResponsibilityAssignment](docs/ApiResultResponsibilityAssignment.md)
 - [ApiResultRole](docs/ApiResultRole.md)
 - [ApiResultSavedReport](docs/ApiResultSavedReport.md)
 - [ApiResultScan](docs/ApiResultScan.md)
 - [ApiResultSearchIndexStatus](docs/ApiResultSearchIndexStatus.md)
 - [ApiResultSourceFileDto](docs/ApiResultSourceFileDto.md)
 - [ApiResultSystemConfiguration](docs/ApiResultSystemConfiguration.md)
 - [ApiResultUserIssueSearchOptions](docs/ApiResultUserIssueSearchOptions.md)
 - [ApiResultUserPreferences](docs/ApiResultUserPreferences.md)
 - [ApiResultUserSessionInformation](docs/ApiResultUserSessionInformation.md)
 - [ApiResultValidationStatus](docs/ApiResultValidationStatus.md)
 - [ApiResultVariable](docs/ApiResultVariable.md)
 - [ApiResultVariableHistory](docs/ApiResultVariableHistory.md)
 - [ApiResultVoid](docs/ApiResultVoid.md)
 - [ApplicationNameTestRequest](docs/ApplicationNameTestRequest.md)
 - [ApplicationNameTestResponse](docs/ApplicationNameTestResponse.md)
 - [ApplicationState](docs/ApplicationState.md)
 - [Artifact](docs/Artifact.md)
 - [ArtifactApproveRequest](docs/ArtifactApproveRequest.md)
 - [ArtifactPurgeRequest](docs/ArtifactPurgeRequest.md)
 - [AssignedUser](docs/AssignedUser.md)
 - [Attribute](docs/Attribute.md)
 - [AttributeDefinition](docs/AttributeDefinition.md)
 - [AttributeOption](docs/AttributeOption.md)
 - [AuditAssistantStatus](docs/AuditAssistantStatus.md)
 - [AuthTokenRevokeRequest](docs/AuthTokenRevokeRequest.md)
 - [AuthenticationEntity](docs/AuthenticationEntity.md)
 - [AuthenticationToken](docs/AuthenticationToken.md)
 - [BugFilingRequirements](docs/BugFilingRequirements.md)
 - [BugFilingRequirementsRequest](docs/BugFilingRequirementsRequest.md)
 - [BugFilingRequirementsResponse](docs/BugFilingRequirementsResponse.md)
 - [BugParam](docs/BugParam.md)
 - [BugStateManagementCfg](docs/BugStateManagementCfg.md)
 - [BugTracker](docs/BugTracker.md)
 - [BugTrackerConfiguration](docs/BugTrackerConfiguration.md)
 - [BugTrackerRequest](docs/BugTrackerRequest.md)
 - [BugfieldTemplateDto](docs/BugfieldTemplateDto.md)
 - [BugfieldTemplateGroupDto](docs/BugfieldTemplateGroupDto.md)
 - [BulkRequestData](docs/BulkRequestData.md)
 - [BulkResponseItem](docs/BulkResponseItem.md)
 - [CloudJob](docs/CloudJob.md)
 - [CloudJobCancelRequest](docs/CloudJobCancelRequest.md)
 - [CloudPool](docs/CloudPool.md)
 - [CloudPoolMapping](docs/CloudPoolMapping.md)
 - [CloudPoolProjectVersionActionResponse](docs/CloudPoolProjectVersionActionResponse.md)
 - [CloudPoolProjectVersionAssignRequest](docs/CloudPoolProjectVersionAssignRequest.md)
 - [CloudPoolProjectVersionReplaceRequest](docs/CloudPoolProjectVersionReplaceRequest.md)
 - [CloudPoolStats](docs/CloudPoolStats.md)
 - [CloudPoolWorkerActionResponse](docs/CloudPoolWorkerActionResponse.md)
 - [CloudPoolWorkerAssignRequest](docs/CloudPoolWorkerAssignRequest.md)
 - [CloudPoolWorkerDisableRequest](docs/CloudPoolWorkerDisableRequest.md)
 - [CloudPoolWorkerReplaceRequest](docs/CloudPoolWorkerReplaceRequest.md)
 - [CloudScanConfig](docs/CloudScanConfig.md)
 - [CloudSystemMetrics](docs/CloudSystemMetrics.md)
 - [CloudSystemPollStatus](docs/CloudSystemPollStatus.md)
 - [CloudSystemSettings](docs/CloudSystemSettings.md)
 - [CloudWorker](docs/CloudWorker.md)
 - [ConfigProperties](docs/ConfigProperties.md)
 - [ConfigProperty](docs/ConfigProperty.md)
 - [ConfigPropertyValueItem](docs/ConfigPropertyValueItem.md)
 - [ConfigPropertyValueValidation](docs/ConfigPropertyValueValidation.md)
 - [CustomTag](docs/CustomTag.md)
 - [CustomTagInfo](docs/CustomTagInfo.md)
 - [CustomTagLookup](docs/CustomTagLookup.md)
 - [CustomTagLookupInfo](docs/CustomTagLookupInfo.md)
 - [DashboardVersion](docs/DashboardVersion.md)
 - [DataExport](docs/DataExport.md)
 - [DynamicScanRequest](docs/DynamicScanRequest.md)
 - [DynamicScanRequestParameter](docs/DynamicScanRequestParameter.md)
 - [DynamicScanRequestParameterDefinition](docs/DynamicScanRequestParameterDefinition.md)
 - [DynamicScanRequestParameterOption](docs/DynamicScanRequestParameterOption.md)
 - [DynamicScanRequestTemplate](docs/DynamicScanRequestTemplate.md)
 - [DynamicScanRequestsSummary](docs/DynamicScanRequestsSummary.md)
 - [EmbeddedReportDefinition](docs/EmbeddedReportDefinition.md)
 - [EmbeddedRoles](docs/EmbeddedRoles.md)
 - [EmbeddedScans](docs/EmbeddedScans.md)
 - [EngineType](docs/EngineType.md)
 - [EntityStateIdentifier](docs/EntityStateIdentifier.md)
 - [EventLog](docs/EventLog.md)
 - [ExportAuditToCSVRequest](docs/ExportAuditToCSVRequest.md)
 - [ExportIssueStatsToCSVRequest](docs/ExportIssueStatsToCSVRequest.md)
 - [ExternalBugInfo](docs/ExternalBugInfo.md)
 - [Feature](docs/Feature.md)
 - [FileToken](docs/FileToken.md)
 - [FilterSet](docs/FilterSet.md)
 - [Folder](docs/Folder.md)
 - [FolderDto](docs/FolderDto.md)
 - [FortifyJob](docs/FortifyJob.md)
 - [IIDMigration](docs/IIDMigration.md)
 - [IidMapping](docs/IidMapping.md)
 - [InputReportParameter](docs/InputReportParameter.md)
 - [InputStream](docs/InputStream.md)
 - [IssueActionResponse](docs/IssueActionResponse.md)
 - [IssueAgingDto](docs/IssueAgingDto.md)
 - [IssueAgingGroupDto](docs/IssueAgingGroupDto.md)
 - [IssueAgingPortlet](docs/IssueAgingPortlet.md)
 - [IssueAssignUserRequest](docs/IssueAssignUserRequest.md)
 - [IssueAssignment](docs/IssueAssignment.md)
 - [IssueAttachment](docs/IssueAttachment.md)
 - [IssueAuditComment](docs/IssueAuditComment.md)
 - [IssueAuditHistoryDto](docs/IssueAuditHistoryDto.md)
 - [IssueAuditRequest](docs/IssueAuditRequest.md)
 - [IssueAuditResult](docs/IssueAuditResult.md)
 - [IssueFileBugRequest](docs/IssueFileBugRequest.md)
 - [IssueFileBugResponse](docs/IssueFileBugResponse.md)
 - [IssueFilterSelector](docs/IssueFilterSelector.md)
 - [IssueFilterSelectorSet](docs/IssueFilterSelectorSet.md)
 - [IssuePrimaryTag](docs/IssuePrimaryTag.md)
 - [IssueSearchOption](docs/IssueSearchOption.md)
 - [IssueSelector](docs/IssueSelector.md)
 - [IssueStatistics](docs/IssueStatistics.md)
 - [IssueSummary](docs/IssueSummary.md)
 - [IssueSuppressRequest](docs/IssueSuppressRequest.md)
 - [IssueTemplate](docs/IssueTemplate.md)
 - [IssueUpdateTagRequest](docs/IssueUpdateTagRequest.md)
 - [IssueViewTemplate](docs/IssueViewTemplate.md)
 - [Job](docs/Job.md)
 - [JobCancelRequest](docs/JobCancelRequest.md)
 - [JobPriorityChangeCategoryWarning](docs/JobPriorityChangeCategoryWarning.md)
 - [JobPriorityChangeInfo](docs/JobPriorityChangeInfo.md)
 - [LDAPEntity](docs/LDAPEntity.md)
 - [LdapRefreshResponse](docs/LdapRefreshResponse.md)
 - [LdapServerDto](docs/LdapServerDto.md)
 - [LdapServerTestRequest](docs/LdapServerTestRequest.md)
 - [License](docs/License.md)
 - [LicenseCapability](docs/LicenseCapability.md)
 - [LocalUser](docs/LocalUser.md)
 - [PasswordStrengthCheckRequest](docs/PasswordStrengthCheckRequest.md)
 - [PasswordStrengthCheckResponse](docs/PasswordStrengthCheckResponse.md)
 - [PerformanceIndicator](docs/PerformanceIndicator.md)
 - [PerformanceIndicatorHistory](docs/PerformanceIndicatorHistory.md)
 - [Permission](docs/Permission.md)
 - [Persona](docs/Persona.md)
 - [PluginConfiguration](docs/PluginConfiguration.md)
 - [PluginDisableRequest](docs/PluginDisableRequest.md)
 - [PluginEnableRequest](docs/PluginEnableRequest.md)
 - [PluginLocalization](docs/PluginLocalization.md)
 - [PluginMetaData](docs/PluginMetaData.md)
 - [Project](docs/Project.md)
 - [ProjectVersion](docs/ProjectVersion.md)
 - [ProjectVersionAuditByAssistantRequest](docs/ProjectVersionAuditByAssistantRequest.md)
 - [ProjectVersionAuthEntityAssignRequest](docs/ProjectVersionAuthEntityAssignRequest.md)
 - [ProjectVersionBugTracker](docs/ProjectVersionBugTracker.md)
 - [ProjectVersionCopyCurrentStateRequest](docs/ProjectVersionCopyCurrentStateRequest.md)
 - [ProjectVersionCopyPartialRequest](docs/ProjectVersionCopyPartialRequest.md)
 - [ProjectVersionIssue](docs/ProjectVersionIssue.md)
 - [ProjectVersionIssueDetails](docs/ProjectVersionIssueDetails.md)
 - [ProjectVersionIssueGroup](docs/ProjectVersionIssueGroup.md)
 - [ProjectVersionPurgeRequest](docs/ProjectVersionPurgeRequest.md)
 - [ProjectVersionRefreshRequest](docs/ProjectVersionRefreshRequest.md)
 - [ProjectVersionRefreshResponse](docs/ProjectVersionRefreshResponse.md)
 - [ProjectVersionState](docs/ProjectVersionState.md)
 - [ProjectVersionTestRequest](docs/ProjectVersionTestRequest.md)
 - [ProjectVersionTestResponse](docs/ProjectVersionTestResponse.md)
 - [ProjectVersionTrainAuditAssistantRequest](docs/ProjectVersionTrainAuditAssistantRequest.md)
 - [ReportAuthEntity](docs/ReportAuthEntity.md)
 - [ReportDefinition](docs/ReportDefinition.md)
 - [ReportLibrary](docs/ReportLibrary.md)
 - [ReportParameter](docs/ReportParameter.md)
 - [ReportParameterOption](docs/ReportParameterOption.md)
 - [ReportProject](docs/ReportProject.md)
 - [ReportProjectVersion](docs/ReportProjectVersion.md)
 - [ResponsibilityAssignment](docs/ResponsibilityAssignment.md)
 - [ResultProcessingRule](docs/ResultProcessingRule.md)
 - [Role](docs/Role.md)
 - [RulepackCore](docs/RulepackCore.md)
 - [RulepacksBatchProcessStatus](docs/RulepacksBatchProcessStatus.md)
 - [SavedReport](docs/SavedReport.md)
 - [Scan](docs/Scan.md)
 - [ScanError](docs/ScanError.md)
 - [SearchIndexStatus](docs/SearchIndexStatus.md)
 - [SelectorOption](docs/SelectorOption.md)
 - [SourceFileDto](docs/SourceFileDto.md)
 - [SystemConfiguration](docs/SystemConfiguration.md)
 - [TemplateItem](docs/TemplateItem.md)
 - [TokenDefinition](docs/TokenDefinition.md)
 - [TraceNodeDto](docs/TraceNodeDto.md)
 - [Trigger](docs/Trigger.md)
 - [UserIssueSearchOptions](docs/UserIssueSearchOptions.md)
 - [UserPhoto](docs/UserPhoto.md)
 - [UserPreferences](docs/UserPreferences.md)
 - [UserSessionInformation](docs/UserSessionInformation.md)
 - [UserSessionState](docs/UserSessionState.md)
 - [ValidationRequest](docs/ValidationRequest.md)
 - [ValidationStatus](docs/ValidationStatus.md)
 - [Variable](docs/Variable.md)
 - [VariableHistory](docs/VariableHistory.md)
 - [WIEConfiguration](docs/WIEConfiguration.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Basic

- **Type**: HTTP basic authentication

### FortifyToken

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

Fortify R&D
