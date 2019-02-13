# ReportDefinitionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReportDefinition**](ReportDefinitionControllerApi.md#createReportDefinition) | **POST** /reportDefinitions | create
[**deleteReportDefinition**](ReportDefinitionControllerApi.md#deleteReportDefinition) | **DELETE** /reportDefinitions/{id} | delete
[**listReportDefinition**](ReportDefinitionControllerApi.md#listReportDefinition) | **GET** /reportDefinitions | list
[**multiDeleteReportDefinition**](ReportDefinitionControllerApi.md#multiDeleteReportDefinition) | **DELETE** /reportDefinitions | multiDelete
[**readReportDefinition**](ReportDefinitionControllerApi.md#readReportDefinition) | **GET** /reportDefinitions/{id} | read
[**updateReportDefinition**](ReportDefinitionControllerApi.md#updateReportDefinition) | **PUT** /reportDefinitions/{id} | update


<a name="createReportDefinition"></a>
# **createReportDefinition**
> ApiResultReportDefinition createReportDefinition(resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ReportDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ReportDefinitionControllerApi apiInstance = new ReportDefinitionControllerApi();
ReportDefinition resource = new ReportDefinition(); // ReportDefinition | resource
try {
    ApiResultReportDefinition result = apiInstance.createReportDefinition(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportDefinitionControllerApi#createReportDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ReportDefinition**](ReportDefinition.md)| resource |

### Return type

[**ApiResultReportDefinition**](ApiResultReportDefinition.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReportDefinition"></a>
# **deleteReportDefinition**
> ApiResultVoid deleteReportDefinition(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ReportDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ReportDefinitionControllerApi apiInstance = new ReportDefinitionControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deleteReportDefinition(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportDefinitionControllerApi#deleteReportDefinition");
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

<a name="listReportDefinition"></a>
# **listReportDefinition**
> ApiResultListReportDefinition listReportDefinition(fields, start, limit, q, groupby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ReportDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ReportDefinitionControllerApi apiInstance = new ReportDefinitionControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String groupby = "groupby_example"; // String | Fields to group by
try {
    ApiResultListReportDefinition result = apiInstance.listReportDefinition(fields, start, limit, q, groupby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportDefinitionControllerApi#listReportDefinition");
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
 **groupby** | **String**| Fields to group by | [optional]

### Return type

[**ApiResultListReportDefinition**](ApiResultListReportDefinition.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeleteReportDefinition"></a>
# **multiDeleteReportDefinition**
> ApiResultVoid multiDeleteReportDefinition(ids)

multiDelete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ReportDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ReportDefinitionControllerApi apiInstance = new ReportDefinitionControllerApi();
String ids = "ids_example"; // String | A comma-separated list of resource identifiers
try {
    ApiResultVoid result = apiInstance.multiDeleteReportDefinition(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportDefinitionControllerApi#multiDeleteReportDefinition");
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

<a name="readReportDefinition"></a>
# **readReportDefinition**
> ApiResultReportDefinition readReportDefinition(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ReportDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ReportDefinitionControllerApi apiInstance = new ReportDefinitionControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultReportDefinition result = apiInstance.readReportDefinition(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportDefinitionControllerApi#readReportDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultReportDefinition**](ApiResultReportDefinition.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReportDefinition"></a>
# **updateReportDefinition**
> ApiResultReportDefinition updateReportDefinition(id, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ReportDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ReportDefinitionControllerApi apiInstance = new ReportDefinitionControllerApi();
Long id = 789L; // Long | id
ReportDefinition resource = new ReportDefinition(); // ReportDefinition | resource
try {
    ApiResultReportDefinition result = apiInstance.updateReportDefinition(id, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportDefinitionControllerApi#updateReportDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **resource** | [**ReportDefinition**](ReportDefinition.md)| resource |

### Return type

[**ApiResultReportDefinition**](ApiResultReportDefinition.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

