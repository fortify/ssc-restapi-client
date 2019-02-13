# ValidateSearchStringControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**doValidateSearchString**](ValidateSearchStringControllerApi.md#doValidateSearchString) | **POST** /validateSearchString | DoValidation


<a name="doValidateSearchString"></a>
# **doValidateSearchString**
> ApiResultValidationStatus doValidateSearchString(request)

DoValidation

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ValidateSearchStringControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ValidateSearchStringControllerApi apiInstance = new ValidateSearchStringControllerApi();
ValidationRequest request = new ValidationRequest(); // ValidationRequest | request
try {
    ApiResultValidationStatus result = apiInstance.doValidateSearchString(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ValidateSearchStringControllerApi#doValidateSearchString");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ValidationRequest**](ValidationRequest.md)| request |

### Return type

[**ApiResultValidationStatus**](ApiResultValidationStatus.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

