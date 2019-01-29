# AttributeDefinitionControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAttributeDefinition**](AttributeDefinitionControllerApi.md#createAttributeDefinition) | **POST** /attributeDefinitions | create
[**deleteAttributeDefinition**](AttributeDefinitionControllerApi.md#deleteAttributeDefinition) | **DELETE** /attributeDefinitions/{id} | delete
[**listAttributeDefinition**](AttributeDefinitionControllerApi.md#listAttributeDefinition) | **GET** /attributeDefinitions | list
[**multiDeleteAttributeDefinition**](AttributeDefinitionControllerApi.md#multiDeleteAttributeDefinition) | **DELETE** /attributeDefinitions | multiDelete
[**readAttributeDefinition**](AttributeDefinitionControllerApi.md#readAttributeDefinition) | **GET** /attributeDefinitions/{id} | read
[**updateAttributeDefinition**](AttributeDefinitionControllerApi.md#updateAttributeDefinition) | **PUT** /attributeDefinitions/{id} | update


<a name="createAttributeDefinition"></a>
# **createAttributeDefinition**
> ApiResultAttributeDefinition createAttributeDefinition(resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AttributeDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AttributeDefinitionControllerApi apiInstance = new AttributeDefinitionControllerApi();
AttributeDefinition resource = new AttributeDefinition(); // AttributeDefinition | resource
try {
    ApiResultAttributeDefinition result = apiInstance.createAttributeDefinition(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeDefinitionControllerApi#createAttributeDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**AttributeDefinition**](AttributeDefinition.md)| resource |

### Return type

[**ApiResultAttributeDefinition**](ApiResultAttributeDefinition.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAttributeDefinition"></a>
# **deleteAttributeDefinition**
> ApiResultVoid deleteAttributeDefinition(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AttributeDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AttributeDefinitionControllerApi apiInstance = new AttributeDefinitionControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deleteAttributeDefinition(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeDefinitionControllerApi#deleteAttributeDefinition");
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

<a name="listAttributeDefinition"></a>
# **listAttributeDefinition**
> ApiResultListAttributeDefinition listAttributeDefinition(fields, start, limit, q, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AttributeDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AttributeDefinitionControllerApi apiInstance = new AttributeDefinitionControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListAttributeDefinition result = apiInstance.listAttributeDefinition(fields, start, limit, q, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeDefinitionControllerApi#listAttributeDefinition");
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

[**ApiResultListAttributeDefinition**](ApiResultListAttributeDefinition.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeleteAttributeDefinition"></a>
# **multiDeleteAttributeDefinition**
> ApiResultVoid multiDeleteAttributeDefinition(ids)

multiDelete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AttributeDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AttributeDefinitionControllerApi apiInstance = new AttributeDefinitionControllerApi();
String ids = "ids_example"; // String | A comma-separated list of resource identifiers
try {
    ApiResultVoid result = apiInstance.multiDeleteAttributeDefinition(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeDefinitionControllerApi#multiDeleteAttributeDefinition");
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

<a name="readAttributeDefinition"></a>
# **readAttributeDefinition**
> ApiResultAttributeDefinition readAttributeDefinition(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AttributeDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AttributeDefinitionControllerApi apiInstance = new AttributeDefinitionControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultAttributeDefinition result = apiInstance.readAttributeDefinition(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeDefinitionControllerApi#readAttributeDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultAttributeDefinition**](ApiResultAttributeDefinition.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAttributeDefinition"></a>
# **updateAttributeDefinition**
> ApiResultAttributeDefinition updateAttributeDefinition(id, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AttributeDefinitionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AttributeDefinitionControllerApi apiInstance = new AttributeDefinitionControllerApi();
Long id = 789L; // Long | id
AttributeDefinition resource = new AttributeDefinition(); // AttributeDefinition | resource
try {
    ApiResultAttributeDefinition result = apiInstance.updateAttributeDefinition(id, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeDefinitionControllerApi#updateAttributeDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **resource** | [**AttributeDefinition**](AttributeDefinition.md)| resource |

### Return type

[**ApiResultAttributeDefinition**](ApiResultAttributeDefinition.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

