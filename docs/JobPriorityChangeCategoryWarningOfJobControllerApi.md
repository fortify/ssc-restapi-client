# JobPriorityChangeCategoryWarningOfJobControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listJobPriorityChangeCategoryWarningOfJob**](JobPriorityChangeCategoryWarningOfJobControllerApi.md#listJobPriorityChangeCategoryWarningOfJob) | **GET** /jobs/{parentId}/warnings | list


<a name="listJobPriorityChangeCategoryWarningOfJob"></a>
# **listJobPriorityChangeCategoryWarningOfJob**
> ApiResultListJobPriorityChangeCategoryWarning listJobPriorityChangeCategoryWarningOfJob(parentId, priority, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.JobPriorityChangeCategoryWarningOfJobControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

JobPriorityChangeCategoryWarningOfJobControllerApi apiInstance = new JobPriorityChangeCategoryWarningOfJobControllerApi();
String parentId = "parentId_example"; // String | parentId
String priority = "priority_example"; // String | priority
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListJobPriorityChangeCategoryWarning result = apiInstance.listJobPriorityChangeCategoryWarningOfJob(parentId, priority, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobPriorityChangeCategoryWarningOfJobControllerApi#listJobPriorityChangeCategoryWarningOfJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **String**| parentId |
 **priority** | **String**| priority |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListJobPriorityChangeCategoryWarning**](ApiResultListJobPriorityChangeCategoryWarning.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

