# PerformanceIndicatorControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPerformanceIndicator**](PerformanceIndicatorControllerApi.md#createPerformanceIndicator) | **POST** /performanceIndicators | create
[**deletePerformanceIndicator**](PerformanceIndicatorControllerApi.md#deletePerformanceIndicator) | **DELETE** /performanceIndicators/{id} | delete
[**listPerformanceIndicator**](PerformanceIndicatorControllerApi.md#listPerformanceIndicator) | **GET** /performanceIndicators | list
[**multiDeletePerformanceIndicator**](PerformanceIndicatorControllerApi.md#multiDeletePerformanceIndicator) | **DELETE** /performanceIndicators | multiDelete
[**updatePerformanceIndicator**](PerformanceIndicatorControllerApi.md#updatePerformanceIndicator) | **PUT** /performanceIndicators/{id} | update


<a name="createPerformanceIndicator"></a>
# **createPerformanceIndicator**
> ApiResultPerformanceIndicator createPerformanceIndicator(data)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.PerformanceIndicatorControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

PerformanceIndicatorControllerApi apiInstance = new PerformanceIndicatorControllerApi();
PerformanceIndicator data = new PerformanceIndicator(); // PerformanceIndicator | data
try {
    ApiResultPerformanceIndicator result = apiInstance.createPerformanceIndicator(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceIndicatorControllerApi#createPerformanceIndicator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**PerformanceIndicator**](PerformanceIndicator.md)| data |

### Return type

[**ApiResultPerformanceIndicator**](ApiResultPerformanceIndicator.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePerformanceIndicator"></a>
# **deletePerformanceIndicator**
> ApiResultVoid deletePerformanceIndicator(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.PerformanceIndicatorControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

PerformanceIndicatorControllerApi apiInstance = new PerformanceIndicatorControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deletePerformanceIndicator(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceIndicatorControllerApi#deletePerformanceIndicator");
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

<a name="listPerformanceIndicator"></a>
# **listPerformanceIndicator**
> ApiResultListPerformanceIndicator listPerformanceIndicator(fields, start, limit, q, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.PerformanceIndicatorControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

PerformanceIndicatorControllerApi apiInstance = new PerformanceIndicatorControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListPerformanceIndicator result = apiInstance.listPerformanceIndicator(fields, start, limit, q, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceIndicatorControllerApi#listPerformanceIndicator");
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

[**ApiResultListPerformanceIndicator**](ApiResultListPerformanceIndicator.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeletePerformanceIndicator"></a>
# **multiDeletePerformanceIndicator**
> ApiResultVoid multiDeletePerformanceIndicator(ids)

multiDelete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.PerformanceIndicatorControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

PerformanceIndicatorControllerApi apiInstance = new PerformanceIndicatorControllerApi();
String ids = "ids_example"; // String | A comma-separated list of resource identifiers
try {
    ApiResultVoid result = apiInstance.multiDeletePerformanceIndicator(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceIndicatorControllerApi#multiDeletePerformanceIndicator");
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

<a name="updatePerformanceIndicator"></a>
# **updatePerformanceIndicator**
> ApiResultPerformanceIndicator updatePerformanceIndicator(id, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.PerformanceIndicatorControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

PerformanceIndicatorControllerApi apiInstance = new PerformanceIndicatorControllerApi();
Long id = 789L; // Long | id
PerformanceIndicator resource = new PerformanceIndicator(); // PerformanceIndicator | resource
try {
    ApiResultPerformanceIndicator result = apiInstance.updatePerformanceIndicator(id, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceIndicatorControllerApi#updatePerformanceIndicator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **resource** | [**PerformanceIndicator**](PerformanceIndicator.md)| resource |

### Return type

[**ApiResultPerformanceIndicator**](ApiResultPerformanceIndicator.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

