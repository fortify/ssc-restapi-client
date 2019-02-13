# ReportLibraryControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReportLibrary**](ReportLibraryControllerApi.md#createReportLibrary) | **POST** /reportLibraries | create
[**deleteReportLibrary**](ReportLibraryControllerApi.md#deleteReportLibrary) | **DELETE** /reportLibraries/{id} | delete
[**listReportLibrary**](ReportLibraryControllerApi.md#listReportLibrary) | **GET** /reportLibraries | list
[**multiDeleteReportLibrary**](ReportLibraryControllerApi.md#multiDeleteReportLibrary) | **DELETE** /reportLibraries | multiDelete
[**readReportLibrary**](ReportLibraryControllerApi.md#readReportLibrary) | **GET** /reportLibraries/{id} | read
[**updateReportLibrary**](ReportLibraryControllerApi.md#updateReportLibrary) | **PUT** /reportLibraries/{id} | update


<a name="createReportLibrary"></a>
# **createReportLibrary**
> ApiResultReportLibrary createReportLibrary(resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ReportLibraryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ReportLibraryControllerApi apiInstance = new ReportLibraryControllerApi();
ReportLibrary resource = new ReportLibrary(); // ReportLibrary | resource
try {
    ApiResultReportLibrary result = apiInstance.createReportLibrary(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportLibraryControllerApi#createReportLibrary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ReportLibrary**](ReportLibrary.md)| resource |

### Return type

[**ApiResultReportLibrary**](ApiResultReportLibrary.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReportLibrary"></a>
# **deleteReportLibrary**
> ApiResultVoid deleteReportLibrary(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ReportLibraryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ReportLibraryControllerApi apiInstance = new ReportLibraryControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deleteReportLibrary(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportLibraryControllerApi#deleteReportLibrary");
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

<a name="listReportLibrary"></a>
# **listReportLibrary**
> ApiResultListReportLibrary listReportLibrary(fields, start, limit)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ReportLibraryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ReportLibraryControllerApi apiInstance = new ReportLibraryControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
try {
    ApiResultListReportLibrary result = apiInstance.listReportLibrary(fields, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportLibraryControllerApi#listReportLibrary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]

### Return type

[**ApiResultListReportLibrary**](ApiResultListReportLibrary.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeleteReportLibrary"></a>
# **multiDeleteReportLibrary**
> ApiResultVoid multiDeleteReportLibrary(ids)

multiDelete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ReportLibraryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ReportLibraryControllerApi apiInstance = new ReportLibraryControllerApi();
String ids = "ids_example"; // String | A comma-separated list of resource identifiers
try {
    ApiResultVoid result = apiInstance.multiDeleteReportLibrary(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportLibraryControllerApi#multiDeleteReportLibrary");
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

<a name="readReportLibrary"></a>
# **readReportLibrary**
> ApiResultReportLibrary readReportLibrary(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ReportLibraryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ReportLibraryControllerApi apiInstance = new ReportLibraryControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultReportLibrary result = apiInstance.readReportLibrary(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportLibraryControllerApi#readReportLibrary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultReportLibrary**](ApiResultReportLibrary.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReportLibrary"></a>
# **updateReportLibrary**
> ApiResultReportLibrary updateReportLibrary(id, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ReportLibraryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ReportLibraryControllerApi apiInstance = new ReportLibraryControllerApi();
Long id = 789L; // Long | id
ReportLibrary resource = new ReportLibrary(); // ReportLibrary | resource
try {
    ApiResultReportLibrary result = apiInstance.updateReportLibrary(id, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportLibraryControllerApi#updateReportLibrary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **resource** | [**ReportLibrary**](ReportLibrary.md)| resource |

### Return type

[**ApiResultReportLibrary**](ApiResultReportLibrary.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

