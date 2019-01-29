# ApplicationStateControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApplicationState**](ApplicationStateControllerApi.md#getApplicationState) | **GET** /applicationState | get
[**putApplicationState**](ApplicationStateControllerApi.md#putApplicationState) | **PUT** /applicationState | put


<a name="getApplicationState"></a>
# **getApplicationState**
> ApiResultApplicationState getApplicationState()

get

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ApplicationStateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ApplicationStateControllerApi apiInstance = new ApplicationStateControllerApi();
try {
    ApiResultApplicationState result = apiInstance.getApplicationState();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationStateControllerApi#getApplicationState");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResultApplicationState**](ApiResultApplicationState.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putApplicationState"></a>
# **putApplicationState**
> ApiResultApplicationState putApplicationState(applicationState)

put

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ApplicationStateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ApplicationStateControllerApi apiInstance = new ApplicationStateControllerApi();
ApplicationState applicationState = new ApplicationState(); // ApplicationState | applicationState
try {
    ApiResultApplicationState result = apiInstance.putApplicationState(applicationState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationStateControllerApi#putApplicationState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationState** | [**ApplicationState**](ApplicationState.md)| applicationState |

### Return type

[**ApiResultApplicationState**](ApiResultApplicationState.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

