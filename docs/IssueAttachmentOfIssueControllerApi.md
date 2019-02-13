# IssueAttachmentOfIssueControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIssueAttachmentOfIssue**](IssueAttachmentOfIssueControllerApi.md#createIssueAttachmentOfIssue) | **POST** /issues/{parentId}/attachments | create
[**deleteIssueAttachmentOfIssue**](IssueAttachmentOfIssueControllerApi.md#deleteIssueAttachmentOfIssue) | **DELETE** /issues/{parentId}/attachments/{id} | delete
[**listIssueAttachmentOfIssue**](IssueAttachmentOfIssueControllerApi.md#listIssueAttachmentOfIssue) | **GET** /issues/{parentId}/attachments | list
[**multiDeleteIssueAttachmentOfIssue**](IssueAttachmentOfIssueControllerApi.md#multiDeleteIssueAttachmentOfIssue) | **DELETE** /issues/{parentId}/attachments | multiDelete
[**readIssueAttachmentOfIssue**](IssueAttachmentOfIssueControllerApi.md#readIssueAttachmentOfIssue) | **GET** /issues/{parentId}/attachments/{id} | read
[**updateIssueAttachmentOfIssue**](IssueAttachmentOfIssueControllerApi.md#updateIssueAttachmentOfIssue) | **PUT** /issues/{parentId}/attachments/{id} | update


<a name="createIssueAttachmentOfIssue"></a>
# **createIssueAttachmentOfIssue**
> ApiResultIssueAttachment createIssueAttachmentOfIssue(parentId, resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueAttachmentOfIssueControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueAttachmentOfIssueControllerApi apiInstance = new IssueAttachmentOfIssueControllerApi();
Long parentId = 789L; // Long | parentId
IssueAttachment resource = new IssueAttachment(); // IssueAttachment | resource
try {
    ApiResultIssueAttachment result = apiInstance.createIssueAttachmentOfIssue(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAttachmentOfIssueControllerApi#createIssueAttachmentOfIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resource** | [**IssueAttachment**](IssueAttachment.md)| resource |

### Return type

[**ApiResultIssueAttachment**](ApiResultIssueAttachment.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIssueAttachmentOfIssue"></a>
# **deleteIssueAttachmentOfIssue**
> ApiResultVoid deleteIssueAttachmentOfIssue(parentId, id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueAttachmentOfIssueControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueAttachmentOfIssueControllerApi apiInstance = new IssueAttachmentOfIssueControllerApi();
Long parentId = 789L; // Long | parentId
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deleteIssueAttachmentOfIssue(parentId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAttachmentOfIssueControllerApi#deleteIssueAttachmentOfIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **id** | **Long**| id |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listIssueAttachmentOfIssue"></a>
# **listIssueAttachmentOfIssue**
> ApiResultListIssueAttachment listIssueAttachmentOfIssue(parentId, start, limit)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueAttachmentOfIssueControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueAttachmentOfIssueControllerApi apiInstance = new IssueAttachmentOfIssueControllerApi();
Long parentId = 789L; // Long | parentId
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
try {
    ApiResultListIssueAttachment result = apiInstance.listIssueAttachmentOfIssue(parentId, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAttachmentOfIssueControllerApi#listIssueAttachmentOfIssue");
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

[**ApiResultListIssueAttachment**](ApiResultListIssueAttachment.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeleteIssueAttachmentOfIssue"></a>
# **multiDeleteIssueAttachmentOfIssue**
> ApiResultVoid multiDeleteIssueAttachmentOfIssue(parentId, ids)

multiDelete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueAttachmentOfIssueControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueAttachmentOfIssueControllerApi apiInstance = new IssueAttachmentOfIssueControllerApi();
Long parentId = 789L; // Long | parentId
String ids = "ids_example"; // String | A comma-separated list of resource identifiers
try {
    ApiResultVoid result = apiInstance.multiDeleteIssueAttachmentOfIssue(parentId, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAttachmentOfIssueControllerApi#multiDeleteIssueAttachmentOfIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **ids** | **String**| A comma-separated list of resource identifiers |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readIssueAttachmentOfIssue"></a>
# **readIssueAttachmentOfIssue**
> ApiResultIssueAttachment readIssueAttachmentOfIssue(parentId, id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueAttachmentOfIssueControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueAttachmentOfIssueControllerApi apiInstance = new IssueAttachmentOfIssueControllerApi();
Long parentId = 789L; // Long | parentId
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultIssueAttachment result = apiInstance.readIssueAttachmentOfIssue(parentId, id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAttachmentOfIssueControllerApi#readIssueAttachmentOfIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultIssueAttachment**](ApiResultIssueAttachment.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIssueAttachmentOfIssue"></a>
# **updateIssueAttachmentOfIssue**
> ApiResultIssueAttachment updateIssueAttachmentOfIssue(parentId, id, data)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueAttachmentOfIssueControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueAttachmentOfIssueControllerApi apiInstance = new IssueAttachmentOfIssueControllerApi();
Long parentId = 789L; // Long | parentId
Long id = 789L; // Long | id
IssueAttachment data = new IssueAttachment(); // IssueAttachment | data
try {
    ApiResultIssueAttachment result = apiInstance.updateIssueAttachmentOfIssue(parentId, id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAttachmentOfIssueControllerApi#updateIssueAttachmentOfIssue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **id** | **Long**| id |
 **data** | [**IssueAttachment**](IssueAttachment.md)| data |

### Return type

[**ApiResultIssueAttachment**](ApiResultIssueAttachment.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

