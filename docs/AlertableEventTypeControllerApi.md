# AlertableEventTypeControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAlertableEventType**](AlertableEventTypeControllerApi.md#listAlertableEventType) | **GET** /alertableEventTypes | list


<a name="listAlertableEventType"></a>
# **listAlertableEventType**
> ApiResultListAlertableEventType listAlertableEventType(fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AlertableEventTypeControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AlertableEventTypeControllerApi apiInstance = new AlertableEventTypeControllerApi();
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListAlertableEventType result = apiInstance.listAlertableEventType(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertableEventTypeControllerApi#listAlertableEventType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListAlertableEventType**](ApiResultListAlertableEventType.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

