# IssueTemplateControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteIssueTemplate**](IssueTemplateControllerApi.md#deleteIssueTemplate) | **DELETE** /issueTemplates/{id} | delete
[**listIssueTemplate**](IssueTemplateControllerApi.md#listIssueTemplate) | **GET** /issueTemplates | list
[**multiDeleteIssueTemplate**](IssueTemplateControllerApi.md#multiDeleteIssueTemplate) | **DELETE** /issueTemplates | multiDelete
[**readIssueTemplate**](IssueTemplateControllerApi.md#readIssueTemplate) | **GET** /issueTemplates/{id} | read
[**updateIssueTemplate**](IssueTemplateControllerApi.md#updateIssueTemplate) | **PUT** /issueTemplates/{id} | update


<a name="deleteIssueTemplate"></a>
# **deleteIssueTemplate**
> ApiResultVoid deleteIssueTemplate(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueTemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueTemplateControllerApi apiInstance = new IssueTemplateControllerApi();
String id = "id_example"; // String | id
try {
    ApiResultVoid result = apiInstance.deleteIssueTemplate(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueTemplateControllerApi#deleteIssueTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listIssueTemplate"></a>
# **listIssueTemplate**
> ApiResultListIssueTemplate listIssueTemplate(fields, start, limit, q, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueTemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueTemplateControllerApi apiInstance = new IssueTemplateControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListIssueTemplate result = apiInstance.listIssueTemplate(fields, start, limit, q, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueTemplateControllerApi#listIssueTemplate");
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

[**ApiResultListIssueTemplate**](ApiResultListIssueTemplate.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeleteIssueTemplate"></a>
# **multiDeleteIssueTemplate**
> ApiResultVoid multiDeleteIssueTemplate(ids)

multiDelete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueTemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueTemplateControllerApi apiInstance = new IssueTemplateControllerApi();
String ids = "ids_example"; // String | A comma-separated list of resource identifiers
try {
    ApiResultVoid result = apiInstance.multiDeleteIssueTemplate(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueTemplateControllerApi#multiDeleteIssueTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**| A comma-separated list of resource identifiers |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readIssueTemplate"></a>
# **readIssueTemplate**
> ApiResultIssueTemplate readIssueTemplate(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueTemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueTemplateControllerApi apiInstance = new IssueTemplateControllerApi();
String id = "id_example"; // String | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultIssueTemplate result = apiInstance.readIssueTemplate(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueTemplateControllerApi#readIssueTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultIssueTemplate**](ApiResultIssueTemplate.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIssueTemplate"></a>
# **updateIssueTemplate**
> ApiResultIssueTemplate updateIssueTemplate(id, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueTemplateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueTemplateControllerApi apiInstance = new IssueTemplateControllerApi();
String id = "id_example"; // String | id
IssueTemplate resource = new IssueTemplate(); // IssueTemplate | resource
try {
    ApiResultIssueTemplate result = apiInstance.updateIssueTemplate(id, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueTemplateControllerApi#updateIssueTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **resource** | [**IssueTemplate**](IssueTemplate.md)| resource |

### Return type

[**ApiResultIssueTemplate**](ApiResultIssueTemplate.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

