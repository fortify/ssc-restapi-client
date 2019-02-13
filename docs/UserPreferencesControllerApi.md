# UserPreferencesControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postUserPreferences**](UserPreferencesControllerApi.md#postUserPreferences) | **POST** /userSession/prefs | post
[**updateUserPreferences**](UserPreferencesControllerApi.md#updateUserPreferences) | **PUT** /userSession/prefs | update


<a name="postUserPreferences"></a>
# **postUserPreferences**
> ApiResultUserPreferences postUserPreferences(username)

post

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.UserPreferencesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

UserPreferencesControllerApi apiInstance = new UserPreferencesControllerApi();
String username = "username_example"; // String | username
try {
    ApiResultUserPreferences result = apiInstance.postUserPreferences(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserPreferencesControllerApi#postUserPreferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username |

### Return type

[**ApiResultUserPreferences**](ApiResultUserPreferences.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserPreferences"></a>
# **updateUserPreferences**
> ApiResultUserPreferences updateUserPreferences(resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.UserPreferencesControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

UserPreferencesControllerApi apiInstance = new UserPreferencesControllerApi();
UserPreferences resource = new UserPreferences(); // UserPreferences | resource
try {
    ApiResultUserPreferences result = apiInstance.updateUserPreferences(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserPreferencesControllerApi#updateUserPreferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**UserPreferences**](UserPreferences.md)| resource |

### Return type

[**ApiResultUserPreferences**](ApiResultUserPreferences.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

