# ProjectVersionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auditByAuditAssistantProjectVersion**](ProjectVersionControllerApi.md#auditByAuditAssistantProjectVersion) | **POST** /projectVersions/action/auditByAuditAssistant | auditByAuditAssistant
[**copyCurrentStateForProjectVersion**](ProjectVersionControllerApi.md#copyCurrentStateForProjectVersion) | **POST** /projectVersions/action/copyCurrentState | copyCurrentStateFor
[**copyProjectVersion**](ProjectVersionControllerApi.md#copyProjectVersion) | **POST** /projectVersions/action/copyFromPartial | copy
[**createProjectVersion**](ProjectVersionControllerApi.md#createProjectVersion) | **POST** /projectVersions | create
[**deleteProjectVersion**](ProjectVersionControllerApi.md#deleteProjectVersion) | **DELETE** /projectVersions/{id} | delete
[**doActionProjectVersion**](ProjectVersionControllerApi.md#doActionProjectVersion) | **POST** /projectVersions/{id}/action | doAction
[**doCollectionActionProjectVersion**](ProjectVersionControllerApi.md#doCollectionActionProjectVersion) | **POST** /projectVersions/action | doCollectionAction
[**listProjectVersion**](ProjectVersionControllerApi.md#listProjectVersion) | **GET** /projectVersions | list
[**purgeProjectVersion**](ProjectVersionControllerApi.md#purgeProjectVersion) | **POST** /projectVersions/action/purge | purge
[**readProjectVersion**](ProjectVersionControllerApi.md#readProjectVersion) | **GET** /projectVersions/{id} | read
[**refreshProjectVersion**](ProjectVersionControllerApi.md#refreshProjectVersion) | **POST** /projectVersions/action/refresh | refresh
[**testProjectVersion**](ProjectVersionControllerApi.md#testProjectVersion) | **POST** /projectVersions/action/test | test
[**trainAuditAssistantProjectVersion**](ProjectVersionControllerApi.md#trainAuditAssistantProjectVersion) | **POST** /projectVersions/action/trainAuditAssistant | trainAuditAssistant
[**updateProjectVersion**](ProjectVersionControllerApi.md#updateProjectVersion) | **PUT** /projectVersions/{id} | update


<a name="auditByAuditAssistantProjectVersion"></a>
# **auditByAuditAssistantProjectVersion**
> ApiResultVoid auditByAuditAssistantProjectVersion(resource)

auditByAuditAssistant

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionControllerApi apiInstance = new ProjectVersionControllerApi();
ProjectVersionAuditByAssistantRequest resource = new ProjectVersionAuditByAssistantRequest(); // ProjectVersionAuditByAssistantRequest | resource
try {
    ApiResultVoid result = apiInstance.auditByAuditAssistantProjectVersion(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionControllerApi#auditByAuditAssistantProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ProjectVersionAuditByAssistantRequest**](ProjectVersionAuditByAssistantRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="copyCurrentStateForProjectVersion"></a>
# **copyCurrentStateForProjectVersion**
> ApiResultVoid copyCurrentStateForProjectVersion(resource)

copyCurrentStateFor

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionControllerApi apiInstance = new ProjectVersionControllerApi();
ProjectVersionCopyCurrentStateRequest resource = new ProjectVersionCopyCurrentStateRequest(); // ProjectVersionCopyCurrentStateRequest | resource
try {
    ApiResultVoid result = apiInstance.copyCurrentStateForProjectVersion(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionControllerApi#copyCurrentStateForProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ProjectVersionCopyCurrentStateRequest**](ProjectVersionCopyCurrentStateRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="copyProjectVersion"></a>
# **copyProjectVersion**
> ApiResultVoid copyProjectVersion(resource)

copy

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionControllerApi apiInstance = new ProjectVersionControllerApi();
ProjectVersionCopyPartialRequest resource = new ProjectVersionCopyPartialRequest(); // ProjectVersionCopyPartialRequest | resource
try {
    ApiResultVoid result = apiInstance.copyProjectVersion(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionControllerApi#copyProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ProjectVersionCopyPartialRequest**](ProjectVersionCopyPartialRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProjectVersion"></a>
# **createProjectVersion**
> ApiResultProjectVersion createProjectVersion(resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionControllerApi apiInstance = new ProjectVersionControllerApi();
ProjectVersion resource = new ProjectVersion(); // ProjectVersion | resource
try {
    ApiResultProjectVersion result = apiInstance.createProjectVersion(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionControllerApi#createProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ProjectVersion**](ProjectVersion.md)| resource |

### Return type

[**ApiResultProjectVersion**](ApiResultProjectVersion.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProjectVersion"></a>
# **deleteProjectVersion**
> ApiResultVoid deleteProjectVersion(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionControllerApi apiInstance = new ProjectVersionControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deleteProjectVersion(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionControllerApi#deleteProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="doActionProjectVersion"></a>
# **doActionProjectVersion**
> ApiResultApiActionResponse doActionProjectVersion(id, resourceAction)

doAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionControllerApi apiInstance = new ProjectVersionControllerApi();
Long id = 789L; // Long | id
ApiResourceAction resourceAction = new ApiResourceAction(); // ApiResourceAction | resourceAction
try {
    ApiResultApiActionResponse result = apiInstance.doActionProjectVersion(id, resourceAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionControllerApi#doActionProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **resourceAction** | [**ApiResourceAction**](ApiResourceAction.md)| resourceAction |

### Return type

[**ApiResultApiActionResponse**](ApiResultApiActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="doCollectionActionProjectVersion"></a>
# **doCollectionActionProjectVersion**
> ApiResultApiActionResponse doCollectionActionProjectVersion(collectionAction)

doCollectionAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionControllerApi apiInstance = new ProjectVersionControllerApi();
ApiCollectionActionlong collectionAction = new ApiCollectionActionlong(); // ApiCollectionActionlong | collectionAction
try {
    ApiResultApiActionResponse result = apiInstance.doCollectionActionProjectVersion(collectionAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionControllerApi#doCollectionActionProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionAction** | [**ApiCollectionActionlong**](ApiCollectionActionlong.md)| collectionAction |

### Return type

[**ApiResultApiActionResponse**](ApiResultApiActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProjectVersion"></a>
# **listProjectVersion**
> ApiResultListProjectVersion listProjectVersion(fields, start, limit, q, fulltextsearch, orderby, includeInactive, myAssignedIssues, onlyIfHasIssues)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionControllerApi apiInstance = new ProjectVersionControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search-spec of full text search query (see fulltextsearch parameter)
Boolean fulltextsearch = false; // Boolean | If 'true', interpret 'q' parameter as full text search query, defaults to 'false'
String orderby = "orderby_example"; // String | Fields to order by
Boolean includeInactive = false; // Boolean | includeInactive
Boolean myAssignedIssues = false; // Boolean | myAssignedIssues
Boolean onlyIfHasIssues = false; // Boolean | onlyIfHasIssues
try {
    ApiResultListProjectVersion result = apiInstance.listProjectVersion(fields, start, limit, q, fulltextsearch, orderby, includeInactive, myAssignedIssues, onlyIfHasIssues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionControllerApi#listProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search-spec of full text search query (see fulltextsearch parameter) | [optional]
 **fulltextsearch** | **Boolean**| If &#39;true&#39;, interpret &#39;q&#39; parameter as full text search query, defaults to &#39;false&#39; | [optional] [default to false]
 **orderby** | **String**| Fields to order by | [optional]
 **includeInactive** | **Boolean**| includeInactive | [optional] [default to false]
 **myAssignedIssues** | **Boolean**| myAssignedIssues | [optional] [default to false]
 **onlyIfHasIssues** | **Boolean**| onlyIfHasIssues | [optional] [default to false]

### Return type

[**ApiResultListProjectVersion**](ApiResultListProjectVersion.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purgeProjectVersion"></a>
# **purgeProjectVersion**
> ApiResultVoid purgeProjectVersion(resource)

purge

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionControllerApi apiInstance = new ProjectVersionControllerApi();
ProjectVersionPurgeRequest resource = new ProjectVersionPurgeRequest(); // ProjectVersionPurgeRequest | resource
try {
    ApiResultVoid result = apiInstance.purgeProjectVersion(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionControllerApi#purgeProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ProjectVersionPurgeRequest**](ProjectVersionPurgeRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readProjectVersion"></a>
# **readProjectVersion**
> ApiResultProjectVersion readProjectVersion(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionControllerApi apiInstance = new ProjectVersionControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultProjectVersion result = apiInstance.readProjectVersion(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionControllerApi#readProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultProjectVersion**](ApiResultProjectVersion.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="refreshProjectVersion"></a>
# **refreshProjectVersion**
> ApiResultProjectVersionRefreshResponse refreshProjectVersion(resource)

refresh

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionControllerApi apiInstance = new ProjectVersionControllerApi();
ProjectVersionRefreshRequest resource = new ProjectVersionRefreshRequest(); // ProjectVersionRefreshRequest | resource
try {
    ApiResultProjectVersionRefreshResponse result = apiInstance.refreshProjectVersion(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionControllerApi#refreshProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ProjectVersionRefreshRequest**](ProjectVersionRefreshRequest.md)| resource |

### Return type

[**ApiResultProjectVersionRefreshResponse**](ApiResultProjectVersionRefreshResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testProjectVersion"></a>
# **testProjectVersion**
> ApiResultProjectVersionTestResponse testProjectVersion(projectVersionTestRequest)

test

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionControllerApi apiInstance = new ProjectVersionControllerApi();
ProjectVersionTestRequest projectVersionTestRequest = new ProjectVersionTestRequest(); // ProjectVersionTestRequest | projectVersionTestRequest
try {
    ApiResultProjectVersionTestResponse result = apiInstance.testProjectVersion(projectVersionTestRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionControllerApi#testProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectVersionTestRequest** | [**ProjectVersionTestRequest**](ProjectVersionTestRequest.md)| projectVersionTestRequest |

### Return type

[**ApiResultProjectVersionTestResponse**](ApiResultProjectVersionTestResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="trainAuditAssistantProjectVersion"></a>
# **trainAuditAssistantProjectVersion**
> ApiResultVoid trainAuditAssistantProjectVersion(resource)

trainAuditAssistant

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionControllerApi apiInstance = new ProjectVersionControllerApi();
ProjectVersionTrainAuditAssistantRequest resource = new ProjectVersionTrainAuditAssistantRequest(); // ProjectVersionTrainAuditAssistantRequest | resource
try {
    ApiResultVoid result = apiInstance.trainAuditAssistantProjectVersion(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionControllerApi#trainAuditAssistantProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ProjectVersionTrainAuditAssistantRequest**](ProjectVersionTrainAuditAssistantRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProjectVersion"></a>
# **updateProjectVersion**
> ApiResultProjectVersion updateProjectVersion(id, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionControllerApi apiInstance = new ProjectVersionControllerApi();
Long id = 789L; // Long | id
ProjectVersion resource = new ProjectVersion(); // ProjectVersion | resource
try {
    ApiResultProjectVersion result = apiInstance.updateProjectVersion(id, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionControllerApi#updateProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **resource** | [**ProjectVersion**](ProjectVersion.md)| resource |

### Return type

[**ApiResultProjectVersion**](ApiResultProjectVersion.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

