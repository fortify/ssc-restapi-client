# ProjectVersionOfAuthEntityControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignProjectVersionOfAuthEntity**](ProjectVersionOfAuthEntityControllerApi.md#assignProjectVersionOfAuthEntity) | **POST** /authEntities/{parentId}/projectVersions/action/assign | assign
[**doActionProjectVersionOfAuthEntity**](ProjectVersionOfAuthEntityControllerApi.md#doActionProjectVersionOfAuthEntity) | **POST** /authEntities/{parentId}/projectVersions/action | doAction
[**listProjectVersionOfAuthEntity**](ProjectVersionOfAuthEntityControllerApi.md#listProjectVersionOfAuthEntity) | **GET** /authEntities/{parentId}/projectVersions | list
[**multiDeleteProjectVersionOfAuthEntity**](ProjectVersionOfAuthEntityControllerApi.md#multiDeleteProjectVersionOfAuthEntity) | **DELETE** /authEntities/{parentId}/projectVersions | multiDelete
[**updateProjectVersionOfAuthEntity**](ProjectVersionOfAuthEntityControllerApi.md#updateProjectVersionOfAuthEntity) | **PUT** /authEntities/{parentId}/projectVersions | update


<a name="assignProjectVersionOfAuthEntity"></a>
# **assignProjectVersionOfAuthEntity**
> ApiResultVoid assignProjectVersionOfAuthEntity(parentId, resource)

assign

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionOfAuthEntityControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionOfAuthEntityControllerApi apiInstance = new ProjectVersionOfAuthEntityControllerApi();
Long parentId = 789L; // Long | parentId
ProjectVersionAuthEntityAssignRequest resource = new ProjectVersionAuthEntityAssignRequest(); // ProjectVersionAuthEntityAssignRequest | resource
try {
    ApiResultVoid result = apiInstance.assignProjectVersionOfAuthEntity(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionOfAuthEntityControllerApi#assignProjectVersionOfAuthEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resource** | [**ProjectVersionAuthEntityAssignRequest**](ProjectVersionAuthEntityAssignRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="doActionProjectVersionOfAuthEntity"></a>
# **doActionProjectVersionOfAuthEntity**
> ApiResultApiActionResponse doActionProjectVersionOfAuthEntity(parentId, collectionAction)

doAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionOfAuthEntityControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionOfAuthEntityControllerApi apiInstance = new ProjectVersionOfAuthEntityControllerApi();
Long parentId = 789L; // Long | parentId
ApiCollectionActionlong collectionAction = new ApiCollectionActionlong(); // ApiCollectionActionlong | collectionAction
try {
    ApiResultApiActionResponse result = apiInstance.doActionProjectVersionOfAuthEntity(parentId, collectionAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionOfAuthEntityControllerApi#doActionProjectVersionOfAuthEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **collectionAction** | [**ApiCollectionActionlong**](ApiCollectionActionlong.md)| collectionAction |

### Return type

[**ApiResultApiActionResponse**](ApiResultApiActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProjectVersionOfAuthEntity"></a>
# **listProjectVersionOfAuthEntity**
> ApiResultListProjectVersion listProjectVersionOfAuthEntity(parentId, start, limit, q, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionOfAuthEntityControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionOfAuthEntityControllerApi apiInstance = new ProjectVersionOfAuthEntityControllerApi();
Long parentId = 789L; // Long | parentId
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListProjectVersion result = apiInstance.listProjectVersionOfAuthEntity(parentId, start, limit, q, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionOfAuthEntityControllerApi#listProjectVersionOfAuthEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search query | [optional]
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListProjectVersion**](ApiResultListProjectVersion.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeleteProjectVersionOfAuthEntity"></a>
# **multiDeleteProjectVersionOfAuthEntity**
> ApiResultVoid multiDeleteProjectVersionOfAuthEntity(parentId, ids)

multiDelete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionOfAuthEntityControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionOfAuthEntityControllerApi apiInstance = new ProjectVersionOfAuthEntityControllerApi();
Long parentId = 789L; // Long | parentId
String ids = "ids_example"; // String | A comma-separated list of resource identifiers
try {
    ApiResultVoid result = apiInstance.multiDeleteProjectVersionOfAuthEntity(parentId, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionOfAuthEntityControllerApi#multiDeleteProjectVersionOfAuthEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **ids** | **String**| A comma-separated list of resource identifiers | [optional]

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProjectVersionOfAuthEntity"></a>
# **updateProjectVersionOfAuthEntity**
> ApiResultListProjectVersion updateProjectVersionOfAuthEntity(parentId, resources)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionOfAuthEntityControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionOfAuthEntityControllerApi apiInstance = new ProjectVersionOfAuthEntityControllerApi();
Long parentId = 789L; // Long | parentId
List<Long> resources = Arrays.asList(new List<Long>()); // List<Long> | resources
try {
    ApiResultListProjectVersion result = apiInstance.updateProjectVersionOfAuthEntity(parentId, resources);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionOfAuthEntityControllerApi#updateProjectVersionOfAuthEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resources** | **List&lt;Long&gt;**| resources |

### Return type

[**ApiResultListProjectVersion**](ApiResultListProjectVersion.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

