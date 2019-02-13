# UserIssueSearchOptionsControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserIssueSearchOptions**](UserIssueSearchOptionsControllerApi.md#getUserIssueSearchOptions) | **GET** /userIssueSearchOptions | get
[**updateUserIssueSearchOptions**](UserIssueSearchOptionsControllerApi.md#updateUserIssueSearchOptions) | **PUT** /userIssueSearchOptions | update


<a name="getUserIssueSearchOptions"></a>
# **getUserIssueSearchOptions**
> ApiResultUserIssueSearchOptions getUserIssueSearchOptions()

get

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.UserIssueSearchOptionsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

UserIssueSearchOptionsControllerApi apiInstance = new UserIssueSearchOptionsControllerApi();
try {
    ApiResultUserIssueSearchOptions result = apiInstance.getUserIssueSearchOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserIssueSearchOptionsControllerApi#getUserIssueSearchOptions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResultUserIssueSearchOptions**](ApiResultUserIssueSearchOptions.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserIssueSearchOptions"></a>
# **updateUserIssueSearchOptions**
> ApiResultUserIssueSearchOptions updateUserIssueSearchOptions(resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.UserIssueSearchOptionsControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

UserIssueSearchOptionsControllerApi apiInstance = new UserIssueSearchOptionsControllerApi();
UserIssueSearchOptions resource = new UserIssueSearchOptions(); // UserIssueSearchOptions | resource
try {
    ApiResultUserIssueSearchOptions result = apiInstance.updateUserIssueSearchOptions(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserIssueSearchOptionsControllerApi#updateUserIssueSearchOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**UserIssueSearchOptions**](UserIssueSearchOptions.md)| resource |

### Return type

[**ApiResultUserIssueSearchOptions**](ApiResultUserIssueSearchOptions.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

