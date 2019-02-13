# CloudSystemMetricsControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCloudSystemMetrics**](CloudSystemMetricsControllerApi.md#getCloudSystemMetrics) | **GET** /cloudsystem/metrics | get


<a name="getCloudSystemMetrics"></a>
# **getCloudSystemMetrics**
> ApiResultCloudSystemMetrics getCloudSystemMetrics()

get

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudSystemMetricsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudSystemMetricsControllerApi apiInstance = new CloudSystemMetricsControllerApi();
try {
    ApiResultCloudSystemMetrics result = apiInstance.getCloudSystemMetrics();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudSystemMetricsControllerApi#getCloudSystemMetrics");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResultCloudSystemMetrics**](ApiResultCloudSystemMetrics.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

