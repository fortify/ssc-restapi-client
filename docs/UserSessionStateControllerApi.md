# UserSessionStateControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUserSessionState**](UserSessionStateControllerApi.md#listUserSessionState) | **GET** /userSession/state | list
[**putUserSessionState**](UserSessionStateControllerApi.md#putUserSessionState) | **PUT** /userSession/state | put


<a name="listUserSessionState"></a>
# **listUserSessionState**
> ApiResultListUserSessionState listUserSessionState(start, limit, q)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.UserSessionStateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

UserSessionStateControllerApi apiInstance = new UserSessionStateControllerApi();
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
try {
    ApiResultListUserSessionState result = apiInstance.listUserSessionState(start, limit, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSessionStateControllerApi#listUserSessionState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search query | [optional]

### Return type

[**ApiResultListUserSessionState**](ApiResultListUserSessionState.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUserSessionState"></a>
# **putUserSessionState**
> ApiResultListUserSessionState putUserSessionState(resources)

put

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.UserSessionStateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

UserSessionStateControllerApi apiInstance = new UserSessionStateControllerApi();
List<UserSessionState> resources = Arrays.asList(new UserSessionState()); // List<UserSessionState> | resources
try {
    ApiResultListUserSessionState result = apiInstance.putUserSessionState(resources);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSessionStateControllerApi#putUserSessionState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resources** | [**List&lt;UserSessionState&gt;**](UserSessionState.md)| resources |

### Return type

[**ApiResultListUserSessionState**](ApiResultListUserSessionState.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

