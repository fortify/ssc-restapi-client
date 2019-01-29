# IssueAssignmentOfProjectVersionControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listIssueAssignmentOfProjectVersion**](IssueAssignmentOfProjectVersionControllerApi.md#listIssueAssignmentOfProjectVersion) | **GET** /projectVersions/{parentId}/issueAssignment | list
[**readIssueAssignmentOfProjectVersion**](IssueAssignmentOfProjectVersionControllerApi.md#readIssueAssignmentOfProjectVersion) | **GET** /projectVersions/{parentId}/issueAssignment/{id} | read


<a name="listIssueAssignmentOfProjectVersion"></a>
# **listIssueAssignmentOfProjectVersion**
> ApiResultListIssueAssignment listIssueAssignmentOfProjectVersion(parentId, fields, start, limit, entityname)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueAssignmentOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueAssignmentOfProjectVersionControllerApi apiInstance = new IssueAssignmentOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String entityname = "entityname_example"; // String | entityname
try {
    ApiResultListIssueAssignment result = apiInstance.listIssueAssignmentOfProjectVersion(parentId, fields, start, limit, entityname);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAssignmentOfProjectVersionControllerApi#listIssueAssignmentOfProjectVersion");
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
 **entityname** | **String**| entityname | [optional]

### Return type

[**ApiResultListIssueAssignment**](ApiResultListIssueAssignment.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readIssueAssignmentOfProjectVersion"></a>
# **readIssueAssignmentOfProjectVersion**
> ApiResultIssueAssignment readIssueAssignmentOfProjectVersion(parentId, id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueAssignmentOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueAssignmentOfProjectVersionControllerApi apiInstance = new IssueAssignmentOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String id = "id_example"; // String | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultIssueAssignment result = apiInstance.readIssueAssignmentOfProjectVersion(parentId, id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAssignmentOfProjectVersionControllerApi#readIssueAssignmentOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **id** | **String**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultIssueAssignment**](ApiResultIssueAssignment.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

