# IssueAuditCommentControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listIssueAuditComment**](IssueAuditCommentControllerApi.md#listIssueAuditComment) | **GET** /comments | list


<a name="listIssueAuditComment"></a>
# **listIssueAuditComment**
> ApiResultListIssueAuditComment listIssueAuditComment(q, fulltextsearch, fields, start, limit)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueAuditCommentControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueAuditCommentControllerApi apiInstance = new IssueAuditCommentControllerApi();
String q = "q_example"; // String | A full text search query
String fulltextsearch = "true"; // String | Only 'true' is supported
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
try {
    ApiResultListIssueAuditComment result = apiInstance.listIssueAuditComment(q, fulltextsearch, fields, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAuditCommentControllerApi#listIssueAuditComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| A full text search query |
 **fulltextsearch** | **String**| Only &#39;true&#39; is supported | [default to true] [enum: true]
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]

### Return type

[**ApiResultListIssueAuditComment**](ApiResultListIssueAuditComment.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

