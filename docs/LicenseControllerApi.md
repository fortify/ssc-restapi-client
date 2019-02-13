# LicenseControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLicense**](LicenseControllerApi.md#getLicense) | **GET** /license | get


<a name="getLicense"></a>
# **getLicense**
> ApiResultLicense getLicense()

get

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LicenseControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Basic
HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
Basic.setUsername("YOUR USERNAME");
Basic.setPassword("YOUR PASSWORD");

LicenseControllerApi apiInstance = new LicenseControllerApi();
try {
    ApiResultLicense result = apiInstance.getLicense();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseControllerApi#getLicense");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResultLicense**](ApiResultLicense.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

