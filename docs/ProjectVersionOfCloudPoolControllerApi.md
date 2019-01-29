# ProjectVersionOfCloudPoolControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignProjectVersionOfCloudPool**](ProjectVersionOfCloudPoolControllerApi.md#assignProjectVersionOfCloudPool) | **POST** /cloudpools/{parentId}/versions/action/assign | assign
[**doActionProjectVersionOfCloudPool**](ProjectVersionOfCloudPoolControllerApi.md#doActionProjectVersionOfCloudPool) | **POST** /cloudpools/{parentId}/versions/action | doAction
[**listProjectVersionOfCloudPool**](ProjectVersionOfCloudPoolControllerApi.md#listProjectVersionOfCloudPool) | **GET** /cloudpools/{parentId}/versions | list
[**replaceProjectVersionOfCloudPool**](ProjectVersionOfCloudPoolControllerApi.md#replaceProjectVersionOfCloudPool) | **POST** /cloudpools/{parentId}/versions/action/replace | replace


<a name="assignProjectVersionOfCloudPool"></a>
# **assignProjectVersionOfCloudPool**
> ApiResultCloudPoolProjectVersionActionResponse assignProjectVersionOfCloudPool(parentId, resource)

assign

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionOfCloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionOfCloudPoolControllerApi apiInstance = new ProjectVersionOfCloudPoolControllerApi();
String parentId = "parentId_example"; // String | parentId
CloudPoolProjectVersionAssignRequest resource = new CloudPoolProjectVersionAssignRequest(); // CloudPoolProjectVersionAssignRequest | resource
try {
    ApiResultCloudPoolProjectVersionActionResponse result = apiInstance.assignProjectVersionOfCloudPool(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionOfCloudPoolControllerApi#assignProjectVersionOfCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **String**| parentId |
 **resource** | [**CloudPoolProjectVersionAssignRequest**](CloudPoolProjectVersionAssignRequest.md)| resource |

### Return type

[**ApiResultCloudPoolProjectVersionActionResponse**](ApiResultCloudPoolProjectVersionActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="doActionProjectVersionOfCloudPool"></a>
# **doActionProjectVersionOfCloudPool**
> ApiResultApiActionResponse doActionProjectVersionOfCloudPool(parentId, collectionAction)

doAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionOfCloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionOfCloudPoolControllerApi apiInstance = new ProjectVersionOfCloudPoolControllerApi();
String parentId = "parentId_example"; // String | parentId
ApiCollectionActionlong collectionAction = new ApiCollectionActionlong(); // ApiCollectionActionlong | collectionAction
try {
    ApiResultApiActionResponse result = apiInstance.doActionProjectVersionOfCloudPool(parentId, collectionAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionOfCloudPoolControllerApi#doActionProjectVersionOfCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **String**| parentId |
 **collectionAction** | [**ApiCollectionActionlong**](ApiCollectionActionlong.md)| collectionAction |

### Return type

[**ApiResultApiActionResponse**](ApiResultApiActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProjectVersionOfCloudPool"></a>
# **listProjectVersionOfCloudPool**
> ApiResultListProjectVersion listProjectVersionOfCloudPool(parentId, fields, start, limit, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionOfCloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionOfCloudPoolControllerApi apiInstance = new ProjectVersionOfCloudPoolControllerApi();
String parentId = "parentId_example"; // String | parentId
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListProjectVersion result = apiInstance.listProjectVersionOfCloudPool(parentId, fields, start, limit, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionOfCloudPoolControllerApi#listProjectVersionOfCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **String**| parentId |
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **orderby** | **String**| Fields to order by | [optional]

### Return type

[**ApiResultListProjectVersion**](ApiResultListProjectVersion.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceProjectVersionOfCloudPool"></a>
# **replaceProjectVersionOfCloudPool**
> ApiResultCloudPoolProjectVersionActionResponse replaceProjectVersionOfCloudPool(parentId, resource)

replace

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionOfCloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionOfCloudPoolControllerApi apiInstance = new ProjectVersionOfCloudPoolControllerApi();
String parentId = "parentId_example"; // String | parentId
CloudPoolProjectVersionReplaceRequest resource = new CloudPoolProjectVersionReplaceRequest(); // CloudPoolProjectVersionReplaceRequest | resource
try {
    ApiResultCloudPoolProjectVersionActionResponse result = apiInstance.replaceProjectVersionOfCloudPool(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionOfCloudPoolControllerApi#replaceProjectVersionOfCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **String**| parentId |
 **resource** | [**CloudPoolProjectVersionReplaceRequest**](CloudPoolProjectVersionReplaceRequest.md)| resource |

### Return type

[**ApiResultCloudPoolProjectVersionActionResponse**](ApiResultCloudPoolProjectVersionActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

