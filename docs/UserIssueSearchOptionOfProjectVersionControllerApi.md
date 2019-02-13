# UserIssueSearchOptionOfProjectVersionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUserIssueSearchOptionOfProjectVersion**](UserIssueSearchOptionOfProjectVersionControllerApi.md#listUserIssueSearchOptionOfProjectVersion) | **GET** /projectVersions/{parentId}/issueSearchOptions | list
[**readUserIssueSearchOptionOfProjectVersion**](UserIssueSearchOptionOfProjectVersionControllerApi.md#readUserIssueSearchOptionOfProjectVersion) | **GET** /projectVersions/{parentId}/issueSearchOptions/{optionType} | read
[**updateUserIssueSearchOptionOfProjectVersion**](UserIssueSearchOptionOfProjectVersionControllerApi.md#updateUserIssueSearchOptionOfProjectVersion) | **PUT** /projectVersions/{parentId}/issueSearchOptions | update


<a name="listUserIssueSearchOptionOfProjectVersion"></a>
# **listUserIssueSearchOptionOfProjectVersion**
> ApiResultListIssueSearchOption listUserIssueSearchOptionOfProjectVersion(parentId, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.UserIssueSearchOptionOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

UserIssueSearchOptionOfProjectVersionControllerApi apiInstance = new UserIssueSearchOptionOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListIssueSearchOption result = apiInstance.listUserIssueSearchOptionOfProjectVersion(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserIssueSearchOptionOfProjectVersionControllerApi#listUserIssueSearchOptionOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListIssueSearchOption**](ApiResultListIssueSearchOption.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readUserIssueSearchOptionOfProjectVersion"></a>
# **readUserIssueSearchOptionOfProjectVersion**
> ApiResultIssueSearchOption readUserIssueSearchOptionOfProjectVersion(parentId, optionType, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.UserIssueSearchOptionOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

UserIssueSearchOptionOfProjectVersionControllerApi apiInstance = new UserIssueSearchOptionOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String optionType = "optionType_example"; // String | optionType
String fields = "fields_example"; // String | Output fields
try {
    ApiResultIssueSearchOption result = apiInstance.readUserIssueSearchOptionOfProjectVersion(parentId, optionType, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserIssueSearchOptionOfProjectVersionControllerApi#readUserIssueSearchOptionOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **optionType** | **String**| optionType | [enum: INCLUDE_COMMENTS_IN_HISTORY, HIDDEN, REMOVED, SUPPRESSED, SHORT_FILE_NAMES]
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultIssueSearchOption**](ApiResultIssueSearchOption.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserIssueSearchOptionOfProjectVersion"></a>
# **updateUserIssueSearchOptionOfProjectVersion**
> ApiResultListIssueSearchOption updateUserIssueSearchOptionOfProjectVersion(parentId, resources)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.UserIssueSearchOptionOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

UserIssueSearchOptionOfProjectVersionControllerApi apiInstance = new UserIssueSearchOptionOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
List<IssueSearchOption> resources = Arrays.asList(new IssueSearchOption()); // List<IssueSearchOption> | resources
try {
    ApiResultListIssueSearchOption result = apiInstance.updateUserIssueSearchOptionOfProjectVersion(parentId, resources);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserIssueSearchOptionOfProjectVersionControllerApi#updateUserIssueSearchOptionOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resources** | [**List&lt;IssueSearchOption&gt;**](IssueSearchOption.md)| resources |

### Return type

[**ApiResultListIssueSearchOption**](ApiResultListIssueSearchOption.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

