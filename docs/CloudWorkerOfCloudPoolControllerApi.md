# CloudWorkerOfCloudPoolControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignCloudWorkerOfCloudPool**](CloudWorkerOfCloudPoolControllerApi.md#assignCloudWorkerOfCloudPool) | **POST** /cloudpools/{parentId}/workers/action/assign | assign
[**disableCloudWorkerOfCloudPool**](CloudWorkerOfCloudPoolControllerApi.md#disableCloudWorkerOfCloudPool) | **POST** /cloudpools/{parentId}/workers/action/disable | disable
[**doActionCloudWorkerOfCloudPool**](CloudWorkerOfCloudPoolControllerApi.md#doActionCloudWorkerOfCloudPool) | **POST** /cloudpools/{parentId}/workers/action | doAction
[**listCloudWorkerOfCloudPool**](CloudWorkerOfCloudPoolControllerApi.md#listCloudWorkerOfCloudPool) | **GET** /cloudpools/{parentId}/workers | list
[**replaceCloudWorkerOfCloudPool**](CloudWorkerOfCloudPoolControllerApi.md#replaceCloudWorkerOfCloudPool) | **POST** /cloudpools/{parentId}/workers/action/replace | replace


<a name="assignCloudWorkerOfCloudPool"></a>
# **assignCloudWorkerOfCloudPool**
> ApiResultCloudPoolWorkerActionResponse assignCloudWorkerOfCloudPool(parentId, resource)

assign

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudWorkerOfCloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudWorkerOfCloudPoolControllerApi apiInstance = new CloudWorkerOfCloudPoolControllerApi();
String parentId = "parentId_example"; // String | parentId
CloudPoolWorkerAssignRequest resource = new CloudPoolWorkerAssignRequest(); // CloudPoolWorkerAssignRequest | resource
try {
    ApiResultCloudPoolWorkerActionResponse result = apiInstance.assignCloudWorkerOfCloudPool(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudWorkerOfCloudPoolControllerApi#assignCloudWorkerOfCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **String**| parentId |
 **resource** | [**CloudPoolWorkerAssignRequest**](CloudPoolWorkerAssignRequest.md)| resource |

### Return type

[**ApiResultCloudPoolWorkerActionResponse**](ApiResultCloudPoolWorkerActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disableCloudWorkerOfCloudPool"></a>
# **disableCloudWorkerOfCloudPool**
> ApiResultCloudPoolWorkerActionResponse disableCloudWorkerOfCloudPool(parentId, resource)

disable

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudWorkerOfCloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudWorkerOfCloudPoolControllerApi apiInstance = new CloudWorkerOfCloudPoolControllerApi();
String parentId = "parentId_example"; // String | parentId
CloudPoolWorkerDisableRequest resource = new CloudPoolWorkerDisableRequest(); // CloudPoolWorkerDisableRequest | resource
try {
    ApiResultCloudPoolWorkerActionResponse result = apiInstance.disableCloudWorkerOfCloudPool(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudWorkerOfCloudPoolControllerApi#disableCloudWorkerOfCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **String**| parentId |
 **resource** | [**CloudPoolWorkerDisableRequest**](CloudPoolWorkerDisableRequest.md)| resource |

### Return type

[**ApiResultCloudPoolWorkerActionResponse**](ApiResultCloudPoolWorkerActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="doActionCloudWorkerOfCloudPool"></a>
# **doActionCloudWorkerOfCloudPool**
> ApiResultApiActionResponse doActionCloudWorkerOfCloudPool(parentId, collectionAction)

doAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudWorkerOfCloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudWorkerOfCloudPoolControllerApi apiInstance = new CloudWorkerOfCloudPoolControllerApi();
String parentId = "parentId_example"; // String | parentId
ApiCollectionActionstring collectionAction = new ApiCollectionActionstring(); // ApiCollectionActionstring | collectionAction
try {
    ApiResultApiActionResponse result = apiInstance.doActionCloudWorkerOfCloudPool(parentId, collectionAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudWorkerOfCloudPoolControllerApi#doActionCloudWorkerOfCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **String**| parentId |
 **collectionAction** | [**ApiCollectionActionstring**](ApiCollectionActionstring.md)| collectionAction |

### Return type

[**ApiResultApiActionResponse**](ApiResultApiActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCloudWorkerOfCloudPool"></a>
# **listCloudWorkerOfCloudPool**
> ApiResultListCloudWorker listCloudWorkerOfCloudPool(parentId, fields, start, limit, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudWorkerOfCloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudWorkerOfCloudPoolControllerApi apiInstance = new CloudWorkerOfCloudPoolControllerApi();
String parentId = "parentId_example"; // String | parentId
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListCloudWorker result = apiInstance.listCloudWorkerOfCloudPool(parentId, fields, start, limit, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudWorkerOfCloudPoolControllerApi#listCloudWorkerOfCloudPool");
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

[**ApiResultListCloudWorker**](ApiResultListCloudWorker.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceCloudWorkerOfCloudPool"></a>
# **replaceCloudWorkerOfCloudPool**
> ApiResultCloudPoolWorkerActionResponse replaceCloudWorkerOfCloudPool(parentId, resource)

replace

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudWorkerOfCloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudWorkerOfCloudPoolControllerApi apiInstance = new CloudWorkerOfCloudPoolControllerApi();
String parentId = "parentId_example"; // String | parentId
CloudPoolWorkerReplaceRequest resource = new CloudPoolWorkerReplaceRequest(); // CloudPoolWorkerReplaceRequest | resource
try {
    ApiResultCloudPoolWorkerActionResponse result = apiInstance.replaceCloudWorkerOfCloudPool(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudWorkerOfCloudPoolControllerApi#replaceCloudWorkerOfCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **String**| parentId |
 **resource** | [**CloudPoolWorkerReplaceRequest**](CloudPoolWorkerReplaceRequest.md)| resource |

### Return type

[**ApiResultCloudPoolWorkerActionResponse**](ApiResultCloudPoolWorkerActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

