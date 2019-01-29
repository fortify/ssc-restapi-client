# BugFilingRequirementsOfProjectVersionControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**doActionBugFilingRequirementsOfProjectVersion**](BugFilingRequirementsOfProjectVersionControllerApi.md#doActionBugFilingRequirementsOfProjectVersion) | **POST** /projectVersions/{parentId}/bugfilingrequirements/action | doAction
[**listBugFilingRequirementsOfProjectVersion**](BugFilingRequirementsOfProjectVersionControllerApi.md#listBugFilingRequirementsOfProjectVersion) | **GET** /projectVersions/{parentId}/bugfilingrequirements | list
[**loginBugFilingRequirementsOfProjectVersion**](BugFilingRequirementsOfProjectVersionControllerApi.md#loginBugFilingRequirementsOfProjectVersion) | **POST** /projectVersions/{parentId}/bugfilingrequirements/action/login | login
[**updateCollectionBugFilingRequirementsOfProjectVersion**](BugFilingRequirementsOfProjectVersionControllerApi.md#updateCollectionBugFilingRequirementsOfProjectVersion) | **PUT** /projectVersions/{parentId}/bugfilingrequirements | updateCollection


<a name="doActionBugFilingRequirementsOfProjectVersion"></a>
# **doActionBugFilingRequirementsOfProjectVersion**
> ApiResultApiActionResponse doActionBugFilingRequirementsOfProjectVersion(parentId, collectionAction)

doAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.BugFilingRequirementsOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

BugFilingRequirementsOfProjectVersionControllerApi apiInstance = new BugFilingRequirementsOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
ApiCollectionActionstring collectionAction = new ApiCollectionActionstring(); // ApiCollectionActionstring | collectionAction
try {
    ApiResultApiActionResponse result = apiInstance.doActionBugFilingRequirementsOfProjectVersion(parentId, collectionAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BugFilingRequirementsOfProjectVersionControllerApi#doActionBugFilingRequirementsOfProjectVersion");
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

<a name="listBugFilingRequirementsOfProjectVersion"></a>
# **listBugFilingRequirementsOfProjectVersion**
> ApiResultListBugFilingRequirements listBugFilingRequirementsOfProjectVersion(parentId, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.BugFilingRequirementsOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

BugFilingRequirementsOfProjectVersionControllerApi apiInstance = new BugFilingRequirementsOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListBugFilingRequirements result = apiInstance.listBugFilingRequirementsOfProjectVersion(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BugFilingRequirementsOfProjectVersionControllerApi#listBugFilingRequirementsOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListBugFilingRequirements**](ApiResultListBugFilingRequirements.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loginBugFilingRequirementsOfProjectVersion"></a>
# **loginBugFilingRequirementsOfProjectVersion**
> ApiResultBugFilingRequirementsResponse loginBugFilingRequirementsOfProjectVersion(parentId, resource)

login

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.BugFilingRequirementsOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

BugFilingRequirementsOfProjectVersionControllerApi apiInstance = new BugFilingRequirementsOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
BugFilingRequirementsRequest resource = new BugFilingRequirementsRequest(); // BugFilingRequirementsRequest | resource
try {
    ApiResultBugFilingRequirementsResponse result = apiInstance.loginBugFilingRequirementsOfProjectVersion(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BugFilingRequirementsOfProjectVersionControllerApi#loginBugFilingRequirementsOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resource** | [**BugFilingRequirementsRequest**](BugFilingRequirementsRequest.md)| resource |

### Return type

[**ApiResultBugFilingRequirementsResponse**](ApiResultBugFilingRequirementsResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCollectionBugFilingRequirementsOfProjectVersion"></a>
# **updateCollectionBugFilingRequirementsOfProjectVersion**
> ApiResultListBugFilingRequirements updateCollectionBugFilingRequirementsOfProjectVersion(parentId, data, changedParamIdentifier)

updateCollection

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.BugFilingRequirementsOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

BugFilingRequirementsOfProjectVersionControllerApi apiInstance = new BugFilingRequirementsOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
List<BugFilingRequirements> data = Arrays.asList(new BugFilingRequirements()); // List<BugFilingRequirements> | data
String changedParamIdentifier = "changedParamIdentifier_example"; // String | changedParamIdentifier
try {
    ApiResultListBugFilingRequirements result = apiInstance.updateCollectionBugFilingRequirementsOfProjectVersion(parentId, data, changedParamIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BugFilingRequirementsOfProjectVersionControllerApi#updateCollectionBugFilingRequirementsOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **data** | [**List&lt;BugFilingRequirements&gt;**](BugFilingRequirements.md)| data |
 **changedParamIdentifier** | **String**| changedParamIdentifier | [optional]

### Return type

[**ApiResultListBugFilingRequirements**](ApiResultListBugFilingRequirements.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

