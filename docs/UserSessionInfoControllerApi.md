# UserSessionInfoControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postUserSessionInfo**](UserSessionInfoControllerApi.md#postUserSessionInfo) | **POST** /userSession/info | post


<a name="postUserSessionInfo"></a>
# **postUserSessionInfo**
> ApiResultUserSessionInformation postUserSessionInfo(username)

post

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.UserSessionInfoControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

UserSessionInfoControllerApi apiInstance = new UserSessionInfoControllerApi();
String username = "username_example"; // String | username
try {
    ApiResultUserSessionInformation result = apiInstance.postUserSessionInfo(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSessionInfoControllerApi#postUserSessionInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username |

### Return type

[**ApiResultUserSessionInformation**](ApiResultUserSessionInformation.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

