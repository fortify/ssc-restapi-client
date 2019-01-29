# BulkControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postBulk**](BulkControllerApi.md#postBulk) | **POST** /bulk | post


<a name="postBulk"></a>
# **postBulk**
> ApiResultListBulkResponseItem postBulk(apiBulkRequestData)

post

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.BulkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

BulkControllerApi apiInstance = new BulkControllerApi();
BulkRequestData apiBulkRequestData = new BulkRequestData(); // BulkRequestData | apiBulkRequestData
try {
    ApiResultListBulkResponseItem result = apiInstance.postBulk(apiBulkRequestData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkControllerApi#postBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiBulkRequestData** | [**BulkRequestData**](BulkRequestData.md)| apiBulkRequestData |

### Return type

[**ApiResultListBulkResponseItem**](ApiResultListBulkResponseItem.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

