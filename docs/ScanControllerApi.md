# ScanControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**readScan**](ScanControllerApi.md#readScan) | **GET** /scans/{id} | read


<a name="readScan"></a>
# **readScan**
> ApiResultScan readScan(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ScanControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ScanControllerApi apiInstance = new ScanControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultScan result = apiInstance.readScan(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanControllerApi#readScan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultScan**](ApiResultScan.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

