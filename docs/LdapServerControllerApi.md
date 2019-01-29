# LdapServerControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLdapServer**](LdapServerControllerApi.md#createLdapServer) | **POST** /ldapServers | create
[**deleteLdapServer**](LdapServerControllerApi.md#deleteLdapServer) | **DELETE** /ldapServers/{id} | delete
[**doCollectionActionLdapServer**](LdapServerControllerApi.md#doCollectionActionLdapServer) | **POST** /ldapServers/action | doCollectionAction
[**listLdapServer**](LdapServerControllerApi.md#listLdapServer) | **GET** /ldapServers | list
[**multiDeleteLdapServer**](LdapServerControllerApi.md#multiDeleteLdapServer) | **DELETE** /ldapServers | multiDelete
[**readLdapServer**](LdapServerControllerApi.md#readLdapServer) | **GET** /ldapServers/{id} | read
[**testLdapServer**](LdapServerControllerApi.md#testLdapServer) | **POST** /ldapServers/action/test | test
[**updateLdapServer**](LdapServerControllerApi.md#updateLdapServer) | **PUT** /ldapServers/{id} | update


<a name="createLdapServer"></a>
# **createLdapServer**
> ApiResultLdapServerDto createLdapServer(resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapServerControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapServerControllerApi apiInstance = new LdapServerControllerApi();
LdapServerDto resource = new LdapServerDto(); // LdapServerDto | resource
try {
    ApiResultLdapServerDto result = apiInstance.createLdapServer(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapServerControllerApi#createLdapServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**LdapServerDto**](LdapServerDto.md)| resource |

### Return type

[**ApiResultLdapServerDto**](ApiResultLdapServerDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLdapServer"></a>
# **deleteLdapServer**
> ApiResultVoid deleteLdapServer(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapServerControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapServerControllerApi apiInstance = new LdapServerControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deleteLdapServer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapServerControllerApi#deleteLdapServer");
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

<a name="doCollectionActionLdapServer"></a>
# **doCollectionActionLdapServer**
> ApiResultApiActionResponse doCollectionActionLdapServer(collectionAction)

doCollectionAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapServerControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapServerControllerApi apiInstance = new LdapServerControllerApi();
ApiCollectionActionlong collectionAction = new ApiCollectionActionlong(); // ApiCollectionActionlong | collectionAction
try {
    ApiResultApiActionResponse result = apiInstance.doCollectionActionLdapServer(collectionAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapServerControllerApi#doCollectionActionLdapServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionAction** | [**ApiCollectionActionlong**](ApiCollectionActionlong.md)| collectionAction |

### Return type

[**ApiResultApiActionResponse**](ApiResultApiActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listLdapServer"></a>
# **listLdapServer**
> ApiResultListLdapServerDto listLdapServer(fields, start, limit)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapServerControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapServerControllerApi apiInstance = new LdapServerControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
try {
    ApiResultListLdapServerDto result = apiInstance.listLdapServer(fields, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapServerControllerApi#listLdapServer");
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

[**ApiResultListLdapServerDto**](ApiResultListLdapServerDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeleteLdapServer"></a>
# **multiDeleteLdapServer**
> ApiResultVoid multiDeleteLdapServer(ids)

multiDelete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapServerControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapServerControllerApi apiInstance = new LdapServerControllerApi();
String ids = "ids_example"; // String | A comma-separated list of resource identifiers
try {
    ApiResultVoid result = apiInstance.multiDeleteLdapServer(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapServerControllerApi#multiDeleteLdapServer");
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

<a name="readLdapServer"></a>
# **readLdapServer**
> ApiResultLdapServerDto readLdapServer(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapServerControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapServerControllerApi apiInstance = new LdapServerControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultLdapServerDto result = apiInstance.readLdapServer(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapServerControllerApi#readLdapServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultLdapServerDto**](ApiResultLdapServerDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testLdapServer"></a>
# **testLdapServer**
> ApiResultVoid testLdapServer(resource)

test

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapServerControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapServerControllerApi apiInstance = new LdapServerControllerApi();
LdapServerTestRequest resource = new LdapServerTestRequest(); // LdapServerTestRequest | resource
try {
    ApiResultVoid result = apiInstance.testLdapServer(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapServerControllerApi#testLdapServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**LdapServerTestRequest**](LdapServerTestRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLdapServer"></a>
# **updateLdapServer**
> ApiResultLdapServerDto updateLdapServer(id, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapServerControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapServerControllerApi apiInstance = new LdapServerControllerApi();
Long id = 789L; // Long | id
LdapServerDto resource = new LdapServerDto(); // LdapServerDto | resource
try {
    ApiResultLdapServerDto result = apiInstance.updateLdapServer(id, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapServerControllerApi#updateLdapServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **resource** | [**LdapServerDto**](LdapServerDto.md)| resource |

### Return type

[**ApiResultLdapServerDto**](ApiResultLdapServerDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

