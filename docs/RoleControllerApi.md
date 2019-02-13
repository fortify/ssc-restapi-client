# RoleControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRole**](RoleControllerApi.md#createRole) | **POST** /roles | create
[**deleteRole**](RoleControllerApi.md#deleteRole) | **DELETE** /roles/{id} | delete
[**listRole**](RoleControllerApi.md#listRole) | **GET** /roles | list
[**multiDeleteRole**](RoleControllerApi.md#multiDeleteRole) | **DELETE** /roles | multiDelete
[**readRole**](RoleControllerApi.md#readRole) | **GET** /roles/{id} | read
[**updateRole**](RoleControllerApi.md#updateRole) | **PUT** /roles/{id} | update


<a name="createRole"></a>
# **createRole**
> ApiResultRole createRole(resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.RoleControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

RoleControllerApi apiInstance = new RoleControllerApi();
Role resource = new Role(); // Role | resource
try {
    ApiResultRole result = apiInstance.createRole(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#createRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**Role**](Role.md)| resource |

### Return type

[**ApiResultRole**](ApiResultRole.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRole"></a>
# **deleteRole**
> ApiResultVoid deleteRole(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.RoleControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

RoleControllerApi apiInstance = new RoleControllerApi();
String id = "id_example"; // String | id
try {
    ApiResultVoid result = apiInstance.deleteRole(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#deleteRole");
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

<a name="listRole"></a>
# **listRole**
> ApiResultListRole listRole(start, limit, q, orderby, fields, excludeuseronly)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.RoleControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

RoleControllerApi apiInstance = new RoleControllerApi();
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String orderby = "orderby_example"; // String | Fields to order by
String fields = "fields_example"; // String | Output fields
Boolean excludeuseronly = false; // Boolean | excludeuseronly
try {
    ApiResultListRole result = apiInstance.listRole(start, limit, q, orderby, fields, excludeuseronly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#listRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search query | [optional]
 **orderby** | **String**| Fields to order by | [optional]
 **fields** | **String**| Output fields | [optional]
 **excludeuseronly** | **Boolean**| excludeuseronly | [optional] [default to false]

### Return type

[**ApiResultListRole**](ApiResultListRole.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeleteRole"></a>
# **multiDeleteRole**
> ApiResultVoid multiDeleteRole(ids)

multiDelete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.RoleControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

RoleControllerApi apiInstance = new RoleControllerApi();
String ids = "ids_example"; // String | A comma-separated list of resource identifiers
try {
    ApiResultVoid result = apiInstance.multiDeleteRole(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#multiDeleteRole");
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

<a name="readRole"></a>
# **readRole**
> ApiResultRole readRole(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.RoleControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

RoleControllerApi apiInstance = new RoleControllerApi();
String id = "id_example"; // String | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultRole result = apiInstance.readRole(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#readRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultRole**](ApiResultRole.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRole"></a>
# **updateRole**
> ApiResultRole updateRole(id, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.RoleControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

RoleControllerApi apiInstance = new RoleControllerApi();
String id = "id_example"; // String | id
Role resource = new Role(); // Role | resource
try {
    ApiResultRole result = apiInstance.updateRole(id, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleControllerApi#updateRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **resource** | [**Role**](Role.md)| resource |

### Return type

[**ApiResultRole**](ApiResultRole.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

