# EngineTypeControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listEngineType**](EngineTypeControllerApi.md#listEngineType) | **GET** /engineTypes | list


<a name="listEngineType"></a>
# **listEngineType**
> ApiResultListEngineType listEngineType(fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.EngineTypeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

EngineTypeControllerApi apiInstance = new EngineTypeControllerApi();
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListEngineType result = apiInstance.listEngineType(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EngineTypeControllerApi#listEngineType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListEngineType**](ApiResultListEngineType.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

