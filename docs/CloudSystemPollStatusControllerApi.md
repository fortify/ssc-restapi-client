# CloudSystemPollStatusControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCloudSystemPollStatus**](CloudSystemPollStatusControllerApi.md#getCloudSystemPollStatus) | **GET** /cloudsystem/pollstatus | get


<a name="getCloudSystemPollStatus"></a>
# **getCloudSystemPollStatus**
> ApiResultCloudSystemPollStatus getCloudSystemPollStatus()

get

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudSystemPollStatusControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudSystemPollStatusControllerApi apiInstance = new CloudSystemPollStatusControllerApi();
try {
    ApiResultCloudSystemPollStatus result = apiInstance.getCloudSystemPollStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudSystemPollStatusControllerApi#getCloudSystemPollStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResultCloudSystemPollStatus**](ApiResultCloudSystemPollStatus.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

