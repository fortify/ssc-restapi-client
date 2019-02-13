# BugTrackerOfProjectVersionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**doActionBugTrackerOfProjectVersion**](BugTrackerOfProjectVersionControllerApi.md#doActionBugTrackerOfProjectVersion) | **POST** /projectVersions/{parentId}/bugtracker/action | doAction
[**listBugTrackerOfProjectVersion**](BugTrackerOfProjectVersionControllerApi.md#listBugTrackerOfProjectVersion) | **GET** /projectVersions/{parentId}/bugtracker | list
[**testBugTrackerOfProjectVersion**](BugTrackerOfProjectVersionControllerApi.md#testBugTrackerOfProjectVersion) | **POST** /projectVersions/{parentId}/bugtracker/action/test | test
[**updateCollectionBugTrackerOfProjectVersion**](BugTrackerOfProjectVersionControllerApi.md#updateCollectionBugTrackerOfProjectVersion) | **PUT** /projectVersions/{parentId}/bugtracker | updateCollection


<a name="doActionBugTrackerOfProjectVersion"></a>
# **doActionBugTrackerOfProjectVersion**
> ApiResultApiActionResponse doActionBugTrackerOfProjectVersion(parentId, collectionAction)

doAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.BugTrackerOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

BugTrackerOfProjectVersionControllerApi apiInstance = new BugTrackerOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
ApiCollectionActionstring collectionAction = new ApiCollectionActionstring(); // ApiCollectionActionstring | collectionAction
try {
    ApiResultApiActionResponse result = apiInstance.doActionBugTrackerOfProjectVersion(parentId, collectionAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BugTrackerOfProjectVersionControllerApi#doActionBugTrackerOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **collectionAction** | [**ApiCollectionActionstring**](ApiCollectionActionstring.md)| collectionAction |

### Return type

[**ApiResultApiActionResponse**](ApiResultApiActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listBugTrackerOfProjectVersion"></a>
# **listBugTrackerOfProjectVersion**
> ApiResultListProjectVersionBugTracker listBugTrackerOfProjectVersion(parentId, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.BugTrackerOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

BugTrackerOfProjectVersionControllerApi apiInstance = new BugTrackerOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListProjectVersionBugTracker result = apiInstance.listBugTrackerOfProjectVersion(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BugTrackerOfProjectVersionControllerApi#listBugTrackerOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListProjectVersionBugTracker**](ApiResultListProjectVersionBugTracker.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testBugTrackerOfProjectVersion"></a>
# **testBugTrackerOfProjectVersion**
> ApiResultVoid testBugTrackerOfProjectVersion(parentId, resource)

test

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.BugTrackerOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

BugTrackerOfProjectVersionControllerApi apiInstance = new BugTrackerOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
BugTrackerRequest resource = new BugTrackerRequest(); // BugTrackerRequest | resource
try {
    ApiResultVoid result = apiInstance.testBugTrackerOfProjectVersion(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BugTrackerOfProjectVersionControllerApi#testBugTrackerOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resource** | [**BugTrackerRequest**](BugTrackerRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCollectionBugTrackerOfProjectVersion"></a>
# **updateCollectionBugTrackerOfProjectVersion**
> ApiResultListProjectVersionBugTracker updateCollectionBugTrackerOfProjectVersion(parentId, data)

updateCollection

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.BugTrackerOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

BugTrackerOfProjectVersionControllerApi apiInstance = new BugTrackerOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
List<ProjectVersionBugTracker> data = Arrays.asList(new ProjectVersionBugTracker()); // List<ProjectVersionBugTracker> | data
try {
    ApiResultListProjectVersionBugTracker result = apiInstance.updateCollectionBugTrackerOfProjectVersion(parentId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BugTrackerOfProjectVersionControllerApi#updateCollectionBugTrackerOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **data** | [**List&lt;ProjectVersionBugTracker&gt;**](ProjectVersionBugTracker.md)| data |

### Return type

[**ApiResultListProjectVersionBugTracker**](ApiResultListProjectVersionBugTracker.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

