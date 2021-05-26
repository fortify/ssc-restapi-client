# ssc-restapi-client

# Fortify Software Security Center REST API java client
Communicate with Fortify Software Security Center through REST API in java, a swagger generated client
- API version: 1:18.20.0

## Generation:

To run swagger generator and produce the library, simply run
```shell
gradlew clean build
```

When you build this project it will use [./src/swagger/spec.json] to generate a source code 
to communicate with Fortify SSC using REST, then compile it into a jar library 
and prepare for publishing to Maven central.

You can download spec.json from your working Fortify Software Security Center on the API Reference page.

## Installation

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

At first generate the JAR by running the gradle build
Then manually install the following JARs:

* build/libs/ssc-restapi-client-2.0.jar
* build/swagger-code-ssc/build/target/lib/*.jar

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
