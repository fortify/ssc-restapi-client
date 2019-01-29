# UserIssueSearchOptionsOfProjectVersionControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserIssueSearchOptionsOfProjectVersion**](UserIssueSearchOptionsOfProjectVersionControllerApi.md#getUserIssueSearchOptionsOfProjectVersion) | **GET** /projectVersions/{parentId}/userIssueSearchOptions | get
[**updateUserIssueSearchOptionsOfProjectVersion**](UserIssueSearchOptionsOfProjectVersionControllerApi.md#updateUserIssueSearchOptionsOfProjectVersion) | **PUT** /projectVersions/{parentId}/userIssueSearchOptions | update


<a name="getUserIssueSearchOptionsOfProjectVersion"></a>
# **getUserIssueSearchOptionsOfProjectVersion**
> ApiResultUserIssueSearchOptions getUserIssueSearchOptionsOfProjectVersion(parentId, fields)

get

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.UserIssueSearchOptionsOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

UserIssueSearchOptionsOfProjectVersionControllerApi apiInstance = new UserIssueSearchOptionsOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
try {
    ApiResultUserIssueSearchOptions result = apiInstance.getUserIssueSearchOptionsOfProjectVersion(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserIssueSearchOptionsOfProjectVersionControllerApi#getUserIssueSearchOptionsOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultUserIssueSearchOptions**](ApiResultUserIssueSearchOptions.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserIssueSearchOptionsOfProjectVersion"></a>
# **updateUserIssueSearchOptionsOfProjectVersion**
> ApiResultUserIssueSearchOptions updateUserIssueSearchOptionsOfProjectVersion(parentId, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.UserIssueSearchOptionsOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

UserIssueSearchOptionsOfProjectVersionControllerApi apiInstance = new UserIssueSearchOptionsOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
UserIssueSearchOptions resource = new UserIssueSearchOptions(); // UserIssueSearchOptions | resource
try {
    ApiResultUserIssueSearchOptions result = apiInstance.updateUserIssueSearchOptionsOfProjectVersion(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserIssueSearchOptionsOfProjectVersionControllerApi#updateUserIssueSearchOptionsOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resource** | [**UserIssueSearchOptions**](UserIssueSearchOptions.md)| resource |

### Return type

[**ApiResultUserIssueSearchOptions**](ApiResultUserIssueSearchOptions.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

