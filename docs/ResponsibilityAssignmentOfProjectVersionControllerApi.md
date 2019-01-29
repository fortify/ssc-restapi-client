# ResponsibilityAssignmentOfProjectVersionControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listResponsibilityAssignmentOfProjectVersion**](ResponsibilityAssignmentOfProjectVersionControllerApi.md#listResponsibilityAssignmentOfProjectVersion) | **GET** /projectVersions/{parentId}/responsibilities | list
[**readResponsibilityAssignmentOfProjectVersion**](ResponsibilityAssignmentOfProjectVersionControllerApi.md#readResponsibilityAssignmentOfProjectVersion) | **GET** /projectVersions/{parentId}/responsibilities/{guid} | read
[**updateCollectionResponsibilityAssignmentOfProjectVersion**](ResponsibilityAssignmentOfProjectVersionControllerApi.md#updateCollectionResponsibilityAssignmentOfProjectVersion) | **PUT** /projectVersions/{parentId}/responsibilities | updateCollection


<a name="listResponsibilityAssignmentOfProjectVersion"></a>
# **listResponsibilityAssignmentOfProjectVersion**
> ApiResultListResponsibilityAssignment listResponsibilityAssignmentOfProjectVersion(parentId, fields, start, limit, q)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ResponsibilityAssignmentOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ResponsibilityAssignmentOfProjectVersionControllerApi apiInstance = new ResponsibilityAssignmentOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
try {
    ApiResultListResponsibilityAssignment result = apiInstance.listResponsibilityAssignmentOfProjectVersion(parentId, fields, start, limit, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponsibilityAssignmentOfProjectVersionControllerApi#listResponsibilityAssignmentOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search query | [optional]

### Return type

[**ApiResultListResponsibilityAssignment**](ApiResultListResponsibilityAssignment.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readResponsibilityAssignmentOfProjectVersion"></a>
# **readResponsibilityAssignmentOfProjectVersion**
> ApiResultResponsibilityAssignment readResponsibilityAssignmentOfProjectVersion(parentId, guid, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ResponsibilityAssignmentOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ResponsibilityAssignmentOfProjectVersionControllerApi apiInstance = new ResponsibilityAssignmentOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String guid = "guid_example"; // String | guid
String fields = "fields_example"; // String | Output fields
try {
    ApiResultResponsibilityAssignment result = apiInstance.readResponsibilityAssignmentOfProjectVersion(parentId, guid, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponsibilityAssignmentOfProjectVersionControllerApi#readResponsibilityAssignmentOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **guid** | **String**| guid |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultResponsibilityAssignment**](ApiResultResponsibilityAssignment.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCollectionResponsibilityAssignmentOfProjectVersion"></a>
# **updateCollectionResponsibilityAssignmentOfProjectVersion**
> ApiResultListResponsibilityAssignment updateCollectionResponsibilityAssignmentOfProjectVersion(parentId, data)

updateCollection

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ResponsibilityAssignmentOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ResponsibilityAssignmentOfProjectVersionControllerApi apiInstance = new ResponsibilityAssignmentOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
List<ResponsibilityAssignment> data = Arrays.asList(new ResponsibilityAssignment()); // List<ResponsibilityAssignment> | data
try {
    ApiResultListResponsibilityAssignment result = apiInstance.updateCollectionResponsibilityAssignmentOfProjectVersion(parentId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponsibilityAssignmentOfProjectVersionControllerApi#updateCollectionResponsibilityAssignmentOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **data** | [**List&lt;ResponsibilityAssignment&gt;**](ResponsibilityAssignment.md)| data |

### Return type

[**ApiResultListResponsibilityAssignment**](ApiResultListResponsibilityAssignment.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

