# IssueViewTemplateControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listIssueViewTemplate**](IssueViewTemplateControllerApi.md#listIssueViewTemplate) | **GET** /issueViewTemplates | list
[**readIssueViewTemplate**](IssueViewTemplateControllerApi.md#readIssueViewTemplate) | **GET** /issueViewTemplates/{id} | read


<a name="listIssueViewTemplate"></a>
# **listIssueViewTemplate**
> ApiResultListIssueViewTemplate listIssueViewTemplate(fields, start, limit, q, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueViewTemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueViewTemplateControllerApi apiInstance = new IssueViewTemplateControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListIssueViewTemplate result = apiInstance.listIssueViewTemplate(fields, start, limit, q, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueViewTemplateControllerApi#listIssueViewTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search query | [optional]
 **orderby** | **String**| Fields to order by | [optional]

### Return type

[**ApiResultListIssueViewTemplate**](ApiResultListIssueViewTemplate.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readIssueViewTemplate"></a>
# **readIssueViewTemplate**
> ApiResultIssueViewTemplate readIssueViewTemplate(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueViewTemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueViewTemplateControllerApi apiInstance = new IssueViewTemplateControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultIssueViewTemplate result = apiInstance.readIssueViewTemplate(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueViewTemplateControllerApi#readIssueViewTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultIssueViewTemplate**](ApiResultIssueViewTemplate.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

