# CloudJobControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCloudJob**](CloudJobControllerApi.md#cancelCloudJob) | **POST** /cloudjobs/action/cancel | cancel
[**doActionCloudJob**](CloudJobControllerApi.md#doActionCloudJob) | **POST** /cloudjobs/{jobToken}/action | doAction
[**listCloudJob**](CloudJobControllerApi.md#listCloudJob) | **GET** /cloudjobs | list
[**readCloudJob**](CloudJobControllerApi.md#readCloudJob) | **GET** /cloudjobs/{jobToken} | read


<a name="cancelCloudJob"></a>
# **cancelCloudJob**
> ApiResultVoid cancelCloudJob(resource)

cancel

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudJobControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudJobControllerApi apiInstance = new CloudJobControllerApi();
CloudJobCancelRequest resource = new CloudJobCancelRequest(); // CloudJobCancelRequest | resource
try {
    ApiResultVoid result = apiInstance.cancelCloudJob(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudJobControllerApi#cancelCloudJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**CloudJobCancelRequest**](CloudJobCancelRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="doActionCloudJob"></a>
# **doActionCloudJob**
> ApiResultApiActionResponse doActionCloudJob(jobToken, resourceAction)

doAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudJobControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudJobControllerApi apiInstance = new CloudJobControllerApi();
String jobToken = "jobToken_example"; // String | jobToken
ApiResourceAction resourceAction = new ApiResourceAction(); // ApiResourceAction | resourceAction
try {
    ApiResultApiActionResponse result = apiInstance.doActionCloudJob(jobToken, resourceAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudJobControllerApi#doActionCloudJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobToken** | **String**| jobToken |
 **resourceAction** | [**ApiResourceAction**](ApiResourceAction.md)| resourceAction |

### Return type

[**ApiResultApiActionResponse**](ApiResultApiActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCloudJob"></a>
# **listCloudJob**
> ApiResultListCloudJob listCloudJob(fields, start, limit, q, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudJobControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudJobControllerApi apiInstance = new CloudJobControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListCloudJob result = apiInstance.listCloudJob(fields, start, limit, q, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudJobControllerApi#listCloudJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search query | [optional]
 **orderby** | **String**| Fields to order by | [optional]

### Return type

[**ApiResultListCloudJob**](ApiResultListCloudJob.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readCloudJob"></a>
# **readCloudJob**
> ApiResultCloudJob readCloudJob(jobToken, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudJobControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudJobControllerApi apiInstance = new CloudJobControllerApi();
String jobToken = "jobToken_example"; // String | jobToken
String fields = "fields_example"; // String | Output fields
try {
    ApiResultCloudJob result = apiInstance.readCloudJob(jobToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudJobControllerApi#readCloudJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobToken** | **String**| jobToken |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultCloudJob**](ApiResultCloudJob.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

