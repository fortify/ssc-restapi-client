# CloudJobOfCloudPoolControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCloudJobOfCloudPool**](CloudJobOfCloudPoolControllerApi.md#listCloudJobOfCloudPool) | **GET** /cloudpools/{parentId}/jobs | list


<a name="listCloudJobOfCloudPool"></a>
# **listCloudJobOfCloudPool**
> ApiResultListCloudJob listCloudJobOfCloudPool(parentId, fields, start, limit, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudJobOfCloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudJobOfCloudPoolControllerApi apiInstance = new CloudJobOfCloudPoolControllerApi();
String parentId = "parentId_example"; // String | parentId
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListCloudJob result = apiInstance.listCloudJobOfCloudPool(parentId, fields, start, limit, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudJobOfCloudPoolControllerApi#listCloudJobOfCloudPool");
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

[**ApiResultListCloudJob**](ApiResultListCloudJob.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

