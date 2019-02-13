# UnassignedCloudWorkerOfCloudPoolControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUnassignedCloudWorkerOfCloudPool**](UnassignedCloudWorkerOfCloudPoolControllerApi.md#listUnassignedCloudWorkerOfCloudPool) | **GET** /cloudpools/disabledWorkers | list


<a name="listUnassignedCloudWorkerOfCloudPool"></a>
# **listUnassignedCloudWorkerOfCloudPool**
> ApiResultListCloudWorker listUnassignedCloudWorkerOfCloudPool(fields, start, limit, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.UnassignedCloudWorkerOfCloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

UnassignedCloudWorkerOfCloudPoolControllerApi apiInstance = new UnassignedCloudWorkerOfCloudPoolControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListCloudWorker result = apiInstance.listUnassignedCloudWorkerOfCloudPool(fields, start, limit, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UnassignedCloudWorkerOfCloudPoolControllerApi#listUnassignedCloudWorkerOfCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

