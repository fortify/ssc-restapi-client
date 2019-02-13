# ValidateEquationControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**doValidateEquation**](ValidateEquationControllerApi.md#doValidateEquation) | **POST** /validateEquation | DoValidation


<a name="doValidateEquation"></a>
# **doValidateEquation**
> ApiResultValidationStatus doValidateEquation(request)

DoValidation

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ValidateEquationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ValidateEquationControllerApi apiInstance = new ValidateEquationControllerApi();
ValidationRequest request = new ValidationRequest(); // ValidationRequest | request
try {
    ApiResultValidationStatus result = apiInstance.doValidateEquation(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ValidateEquationControllerApi#doValidateEquation");
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

