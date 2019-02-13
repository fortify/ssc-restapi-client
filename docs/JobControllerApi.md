# JobControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelJob**](JobControllerApi.md#cancelJob) | **POST** /jobs/action/cancel | cancel
[**doActionJob**](JobControllerApi.md#doActionJob) | **POST** /jobs/{jobName}/action | doAction
[**listJob**](JobControllerApi.md#listJob) | **GET** /jobs | list
[**readJob**](JobControllerApi.md#readJob) | **GET** /jobs/{jobName} | read
[**updateJob**](JobControllerApi.md#updateJob) | **PUT** /jobs/{jobName} | update


<a name="cancelJob"></a>
# **cancelJob**
> ApiResultVoid cancelJob(resource)

cancel

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.JobControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

JobControllerApi apiInstance = new JobControllerApi();
JobCancelRequest resource = new JobCancelRequest(); // JobCancelRequest | resource
try {
    ApiResultVoid result = apiInstance.cancelJob(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobControllerApi#cancelJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**JobCancelRequest**](JobCancelRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="doActionJob"></a>
# **doActionJob**
> ApiResultApiActionResponse doActionJob(jobName, resourceAction)

doAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.JobControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

JobControllerApi apiInstance = new JobControllerApi();
String jobName = "jobName_example"; // String | jobName
ApiResourceAction resourceAction = new ApiResourceAction(); // ApiResourceAction | resourceAction
try {
    ApiResultApiActionResponse result = apiInstance.doActionJob(jobName, resourceAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobControllerApi#doActionJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobName** | **String**| jobName |
 **resourceAction** | [**ApiResourceAction**](ApiResourceAction.md)| resourceAction |

### Return type

[**ApiResultApiActionResponse**](ApiResultApiActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listJob"></a>
# **listJob**
> ApiResultListJob listJob(fields, start, limit, q, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.JobControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

JobControllerApi apiInstance = new JobControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListJob result = apiInstance.listJob(fields, start, limit, q, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobControllerApi#listJob");
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

[**ApiResultListJob**](ApiResultListJob.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readJob"></a>
# **readJob**
> ApiResultJob readJob(jobName, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.JobControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

JobControllerApi apiInstance = new JobControllerApi();
String jobName = "jobName_example"; // String | jobName
String fields = "fields_example"; // String | Output fields
try {
    ApiResultJob result = apiInstance.readJob(jobName, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobControllerApi#readJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobName** | **String**| jobName |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultJob**](ApiResultJob.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateJob"></a>
# **updateJob**
> ApiResultJob updateJob(jobName, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.JobControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

JobControllerApi apiInstance = new JobControllerApi();
String jobName = "jobName_example"; // String | jobName
Job resource = new Job(); // Job | resource
try {
    ApiResultJob result = apiInstance.updateJob(jobName, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobControllerApi#updateJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobName** | **String**| jobName |
 **resource** | [**Job**](Job.md)| resource |

### Return type

[**ApiResultJob**](ApiResultJob.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

