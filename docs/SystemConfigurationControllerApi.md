# SystemConfigurationControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listSystemConfiguration**](SystemConfigurationControllerApi.md#listSystemConfiguration) | **GET** /systemConfiguration | list
[**readSystemConfiguration**](SystemConfigurationControllerApi.md#readSystemConfiguration) | **GET** /systemConfiguration/{name} | read


<a name="listSystemConfiguration"></a>
# **listSystemConfiguration**
> ApiResultListSystemConfiguration listSystemConfiguration(fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.SystemConfigurationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

SystemConfigurationControllerApi apiInstance = new SystemConfigurationControllerApi();
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListSystemConfiguration result = apiInstance.listSystemConfiguration(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemConfigurationControllerApi#listSystemConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListSystemConfiguration**](ApiResultListSystemConfiguration.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readSystemConfiguration"></a>
# **readSystemConfiguration**
> ApiResultSystemConfiguration readSystemConfiguration(name, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.SystemConfigurationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

SystemConfigurationControllerApi apiInstance = new SystemConfigurationControllerApi();
String name = "name_example"; // String | name
String fields = "fields_example"; // String | Output fields
try {
    ApiResultSystemConfiguration result = apiInstance.readSystemConfiguration(name, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemConfigurationControllerApi#readSystemConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultSystemConfiguration**](ApiResultSystemConfiguration.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

