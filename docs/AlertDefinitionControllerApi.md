# AlertDefinitionControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAlertDefinition**](AlertDefinitionControllerApi.md#createAlertDefinition) | **POST** /alertDefinitions | create
[**deleteAlertDefinition**](AlertDefinitionControllerApi.md#deleteAlertDefinition) | **DELETE** /alertDefinitions/{id} | delete
[**listAlertDefinition**](AlertDefinitionControllerApi.md#listAlertDefinition) | **GET** /alertDefinitions | list
[**multiDeleteAlertDefinition**](AlertDefinitionControllerApi.md#multiDeleteAlertDefinition) | **DELETE** /alertDefinitions | multiDelete
[**readAlertDefinition**](AlertDefinitionControllerApi.md#readAlertDefinition) | **GET** /alertDefinitions/{id} | read
[**updateAlertDefinition**](AlertDefinitionControllerApi.md#updateAlertDefinition) | **PUT** /alertDefinitions/{id} | update


<a name="createAlertDefinition"></a>
# **createAlertDefinition**
> ApiResultAlertDefinitionDto createAlertDefinition(resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AlertDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AlertDefinitionControllerApi apiInstance = new AlertDefinitionControllerApi();
AlertDefinitionDto resource = new AlertDefinitionDto(); // AlertDefinitionDto | resource
try {
    ApiResultAlertDefinitionDto result = apiInstance.createAlertDefinition(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertDefinitionControllerApi#createAlertDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**AlertDefinitionDto**](AlertDefinitionDto.md)| resource |

### Return type

[**ApiResultAlertDefinitionDto**](ApiResultAlertDefinitionDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAlertDefinition"></a>
# **deleteAlertDefinition**
> ApiResultVoid deleteAlertDefinition(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AlertDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AlertDefinitionControllerApi apiInstance = new AlertDefinitionControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deleteAlertDefinition(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertDefinitionControllerApi#deleteAlertDefinition");
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

<a name="listAlertDefinition"></a>
# **listAlertDefinition**
> ApiResultListAlertDefinitionDto listAlertDefinition(fields, start, limit, q, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AlertDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AlertDefinitionControllerApi apiInstance = new AlertDefinitionControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListAlertDefinitionDto result = apiInstance.listAlertDefinition(fields, start, limit, q, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertDefinitionControllerApi#listAlertDefinition");
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

[**ApiResultListAlertDefinitionDto**](ApiResultListAlertDefinitionDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeleteAlertDefinition"></a>
# **multiDeleteAlertDefinition**
> ApiResultVoid multiDeleteAlertDefinition(ids)

multiDelete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AlertDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AlertDefinitionControllerApi apiInstance = new AlertDefinitionControllerApi();
String ids = "ids_example"; // String | A comma-separated list of resource identifiers
try {
    ApiResultVoid result = apiInstance.multiDeleteAlertDefinition(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertDefinitionControllerApi#multiDeleteAlertDefinition");
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

<a name="readAlertDefinition"></a>
# **readAlertDefinition**
> ApiResultAlertDefinitionDto readAlertDefinition(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AlertDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AlertDefinitionControllerApi apiInstance = new AlertDefinitionControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultAlertDefinitionDto result = apiInstance.readAlertDefinition(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertDefinitionControllerApi#readAlertDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultAlertDefinitionDto**](ApiResultAlertDefinitionDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAlertDefinition"></a>
# **updateAlertDefinition**
> ApiResultAlertDefinitionDto updateAlertDefinition(id, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AlertDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AlertDefinitionControllerApi apiInstance = new AlertDefinitionControllerApi();
Long id = 789L; // Long | id
AlertDefinitionDto resource = new AlertDefinitionDto(); // AlertDefinitionDto | resource
try {
    ApiResultAlertDefinitionDto result = apiInstance.updateAlertDefinition(id, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertDefinitionControllerApi#updateAlertDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **resource** | [**AlertDefinitionDto**](AlertDefinitionDto.md)| resource |

### Return type

[**ApiResultAlertDefinitionDto**](ApiResultAlertDefinitionDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

