# PersonaControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPersona**](PersonaControllerApi.md#createPersona) | **POST** /personas | create
[**deletePersona**](PersonaControllerApi.md#deletePersona) | **DELETE** /personas/{id} | delete
[**listPersona**](PersonaControllerApi.md#listPersona) | **GET** /personas | list
[**readPersona**](PersonaControllerApi.md#readPersona) | **GET** /personas/{id} | read
[**updatePersona**](PersonaControllerApi.md#updatePersona) | **PUT** /personas/{id} | update


<a name="createPersona"></a>
# **createPersona**
> ApiResultPersona createPersona(resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.PersonaControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

PersonaControllerApi apiInstance = new PersonaControllerApi();
Persona resource = new Persona(); // Persona | resource
try {
    ApiResultPersona result = apiInstance.createPersona(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonaControllerApi#createPersona");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**Persona**](Persona.md)| resource |

### Return type

[**ApiResultPersona**](ApiResultPersona.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePersona"></a>
# **deletePersona**
> ApiResultVoid deletePersona(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.PersonaControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

PersonaControllerApi apiInstance = new PersonaControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deletePersona(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonaControllerApi#deletePersona");
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

<a name="listPersona"></a>
# **listPersona**
> ApiResultListPersona listPersona(start, limit, q, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.PersonaControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

PersonaControllerApi apiInstance = new PersonaControllerApi();
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListPersona result = apiInstance.listPersona(start, limit, q, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonaControllerApi#listPersona");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search query | [optional]
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListPersona**](ApiResultListPersona.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readPersona"></a>
# **readPersona**
> ApiResultPersona readPersona(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.PersonaControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

PersonaControllerApi apiInstance = new PersonaControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultPersona result = apiInstance.readPersona(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonaControllerApi#readPersona");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultPersona**](ApiResultPersona.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePersona"></a>
# **updatePersona**
> ApiResultPersona updatePersona(id, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.PersonaControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

PersonaControllerApi apiInstance = new PersonaControllerApi();
Long id = 789L; // Long | id
Persona resource = new Persona(); // Persona | resource
try {
    ApiResultPersona result = apiInstance.updatePersona(id, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonaControllerApi#updatePersona");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **resource** | [**Persona**](Persona.md)| resource |

### Return type

[**ApiResultPersona**](ApiResultPersona.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

