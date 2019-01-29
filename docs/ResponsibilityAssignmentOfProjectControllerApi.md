# ResponsibilityAssignmentOfProjectControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listResponsibilityAssignmentOfProject**](ResponsibilityAssignmentOfProjectControllerApi.md#listResponsibilityAssignmentOfProject) | **GET** /projects/{parentId}/responsibilities | list
[**readResponsibilityAssignmentOfProject**](ResponsibilityAssignmentOfProjectControllerApi.md#readResponsibilityAssignmentOfProject) | **GET** /projects/{parentId}/responsibilities/{guid} | read
[**updateCollectionResponsibilityAssignmentOfProject**](ResponsibilityAssignmentOfProjectControllerApi.md#updateCollectionResponsibilityAssignmentOfProject) | **PUT** /projects/{parentId}/responsibilities | updateCollection


<a name="listResponsibilityAssignmentOfProject"></a>
# **listResponsibilityAssignmentOfProject**
> ApiResultListResponsibilityAssignment listResponsibilityAssignmentOfProject(parentId, fields, start, limit, q)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ResponsibilityAssignmentOfProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ResponsibilityAssignmentOfProjectControllerApi apiInstance = new ResponsibilityAssignmentOfProjectControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
try {
    ApiResultListResponsibilityAssignment result = apiInstance.listResponsibilityAssignmentOfProject(parentId, fields, start, limit, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponsibilityAssignmentOfProjectControllerApi#listResponsibilityAssignmentOfProject");
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

<a name="readResponsibilityAssignmentOfProject"></a>
# **readResponsibilityAssignmentOfProject**
> ApiResultResponsibilityAssignment readResponsibilityAssignmentOfProject(parentId, guid, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ResponsibilityAssignmentOfProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ResponsibilityAssignmentOfProjectControllerApi apiInstance = new ResponsibilityAssignmentOfProjectControllerApi();
Long parentId = 789L; // Long | parentId
String guid = "guid_example"; // String | guid
String fields = "fields_example"; // String | Output fields
try {
    ApiResultResponsibilityAssignment result = apiInstance.readResponsibilityAssignmentOfProject(parentId, guid, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponsibilityAssignmentOfProjectControllerApi#readResponsibilityAssignmentOfProject");
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

<a name="updateCollectionResponsibilityAssignmentOfProject"></a>
# **updateCollectionResponsibilityAssignmentOfProject**
> ApiResultListResponsibilityAssignment updateCollectionResponsibilityAssignmentOfProject(parentId, data)

updateCollection

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ResponsibilityAssignmentOfProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ResponsibilityAssignmentOfProjectControllerApi apiInstance = new ResponsibilityAssignmentOfProjectControllerApi();
Long parentId = 789L; // Long | parentId
List<ResponsibilityAssignment> data = Arrays.asList(new ResponsibilityAssignment()); // List<ResponsibilityAssignment> | data
try {
    ApiResultListResponsibilityAssignment result = apiInstance.updateCollectionResponsibilityAssignmentOfProject(parentId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponsibilityAssignmentOfProjectControllerApi#updateCollectionResponsibilityAssignmentOfProject");
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

