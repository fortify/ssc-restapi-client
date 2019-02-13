# IssueAuditCommentOfIssueControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIssueAuditCommentOfIssue**](IssueAuditCommentOfIssueControllerApi.md#createIssueAuditCommentOfIssue) | **POST** /issues/{parentId}/comments | create
[**listIssueAuditCommentOfIssue**](IssueAuditCommentOfIssueControllerApi.md#listIssueAuditCommentOfIssue) | **GET** /issues/{parentId}/comments | list


<a name="createIssueAuditCommentOfIssue"></a>
# **createIssueAuditCommentOfIssue**
> ApiResultIssueAuditComment createIssueAuditCommentOfIssue(parentId, resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueAuditCommentOfIssueControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueAuditCommentOfIssueControllerApi apiInstance = new IssueAuditCommentOfIssueControllerApi();
Long parentId = 789L; // Long | parentId
IssueAuditComment resource = new IssueAuditComment(); // IssueAuditComment | resource
try {
    ApiResultIssueAuditComment result = apiInstance.createIssueAuditCommentOfIssue(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAuditCommentOfIssueControllerApi#createIssueAuditCommentOfIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resource** | [**IssueAuditComment**](IssueAuditComment.md)| resource |

### Return type

[**ApiResultIssueAuditComment**](ApiResultIssueAuditComment.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listIssueAuditCommentOfIssue"></a>
# **listIssueAuditCommentOfIssue**
> ApiResultListIssueAuditComment listIssueAuditCommentOfIssue(parentId, start, limit)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueAuditCommentOfIssueControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueAuditCommentOfIssueControllerApi apiInstance = new IssueAuditCommentOfIssueControllerApi();
Long parentId = 789L; // Long | parentId
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
try {
    ApiResultListIssueAuditComment result = apiInstance.listIssueAuditCommentOfIssue(parentId, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAuditCommentOfIssueControllerApi#listIssueAuditCommentOfIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]

### Return type

[**ApiResultListIssueAuditComment**](ApiResultListIssueAuditComment.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

