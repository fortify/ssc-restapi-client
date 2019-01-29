# BugfieldTemplateGroupControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBugfieldTemplateGroup**](BugfieldTemplateGroupControllerApi.md#createBugfieldTemplateGroup) | **POST** /bugfieldTemplateGroups | create
[**deleteBugfieldTemplateGroup**](BugfieldTemplateGroupControllerApi.md#deleteBugfieldTemplateGroup) | **DELETE** /bugfieldTemplateGroups/{id} | delete
[**listBugfieldTemplateGroup**](BugfieldTemplateGroupControllerApi.md#listBugfieldTemplateGroup) | **GET** /bugfieldTemplateGroups | list
[**multiDeleteBugfieldTemplateGroup**](BugfieldTemplateGroupControllerApi.md#multiDeleteBugfieldTemplateGroup) | **DELETE** /bugfieldTemplateGroups | multiDelete
[**readBugfieldTemplateGroup**](BugfieldTemplateGroupControllerApi.md#readBugfieldTemplateGroup) | **GET** /bugfieldTemplateGroups/{id} | read
[**updateBugfieldTemplateGroup**](BugfieldTemplateGroupControllerApi.md#updateBugfieldTemplateGroup) | **PUT** /bugfieldTemplateGroups/{id} | update


<a name="createBugfieldTemplateGroup"></a>
# **createBugfieldTemplateGroup**
> ApiResultBugfieldTemplateGroupDto createBugfieldTemplateGroup(data)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.BugfieldTemplateGroupControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

BugfieldTemplateGroupControllerApi apiInstance = new BugfieldTemplateGroupControllerApi();
BugfieldTemplateGroupDto data = new BugfieldTemplateGroupDto(); // BugfieldTemplateGroupDto | data
try {
    ApiResultBugfieldTemplateGroupDto result = apiInstance.createBugfieldTemplateGroup(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BugfieldTemplateGroupControllerApi#createBugfieldTemplateGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**BugfieldTemplateGroupDto**](BugfieldTemplateGroupDto.md)| data |

### Return type

[**ApiResultBugfieldTemplateGroupDto**](ApiResultBugfieldTemplateGroupDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBugfieldTemplateGroup"></a>
# **deleteBugfieldTemplateGroup**
> ApiResultVoid deleteBugfieldTemplateGroup(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.BugfieldTemplateGroupControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

BugfieldTemplateGroupControllerApi apiInstance = new BugfieldTemplateGroupControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deleteBugfieldTemplateGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BugfieldTemplateGroupControllerApi#deleteBugfieldTemplateGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listBugfieldTemplateGroup"></a>
# **listBugfieldTemplateGroup**
> ApiResultListBugfieldTemplateGroupDto listBugfieldTemplateGroup(fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.BugfieldTemplateGroupControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

BugfieldTemplateGroupControllerApi apiInstance = new BugfieldTemplateGroupControllerApi();
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListBugfieldTemplateGroupDto result = apiInstance.listBugfieldTemplateGroup(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BugfieldTemplateGroupControllerApi#listBugfieldTemplateGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListBugfieldTemplateGroupDto**](ApiResultListBugfieldTemplateGroupDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeleteBugfieldTemplateGroup"></a>
# **multiDeleteBugfieldTemplateGroup**
> ApiResultVoid multiDeleteBugfieldTemplateGroup(ids)

multiDelete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.BugfieldTemplateGroupControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

BugfieldTemplateGroupControllerApi apiInstance = new BugfieldTemplateGroupControllerApi();
String ids = "ids_example"; // String | A comma-separated list of resource identifiers
try {
    ApiResultVoid result = apiInstance.multiDeleteBugfieldTemplateGroup(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BugfieldTemplateGroupControllerApi#multiDeleteBugfieldTemplateGroup");
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

<a name="readBugfieldTemplateGroup"></a>
# **readBugfieldTemplateGroup**
> ApiResultBugfieldTemplateGroupDto readBugfieldTemplateGroup(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.BugfieldTemplateGroupControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

BugfieldTemplateGroupControllerApi apiInstance = new BugfieldTemplateGroupControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultBugfieldTemplateGroupDto result = apiInstance.readBugfieldTemplateGroup(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BugfieldTemplateGroupControllerApi#readBugfieldTemplateGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultBugfieldTemplateGroupDto**](ApiResultBugfieldTemplateGroupDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBugfieldTemplateGroup"></a>
# **updateBugfieldTemplateGroup**
> ApiResultBugfieldTemplateGroupDto updateBugfieldTemplateGroup(id, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.BugfieldTemplateGroupControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

BugfieldTemplateGroupControllerApi apiInstance = new BugfieldTemplateGroupControllerApi();
Long id = 789L; // Long | id
BugfieldTemplateGroupDto resource = new BugfieldTemplateGroupDto(); // BugfieldTemplateGroupDto | resource
try {
    ApiResultBugfieldTemplateGroupDto result = apiInstance.updateBugfieldTemplateGroup(id, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BugfieldTemplateGroupControllerApi#updateBugfieldTemplateGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **resource** | [**BugfieldTemplateGroupDto**](BugfieldTemplateGroupDto.md)| resource |

### Return type

[**ApiResultBugfieldTemplateGroupDto**](ApiResultBugfieldTemplateGroupDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

