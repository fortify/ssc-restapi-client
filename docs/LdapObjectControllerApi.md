# LdapObjectControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLdapObject**](LdapObjectControllerApi.md#createLdapObject) | **POST** /ldapObjects | create
[**deleteLdapObject**](LdapObjectControllerApi.md#deleteLdapObject) | **DELETE** /ldapObjects/{id} | delete
[**doCollectionActionLdapObject**](LdapObjectControllerApi.md#doCollectionActionLdapObject) | **POST** /ldapObjects/action | doCollectionAction
[**listLdapObject**](LdapObjectControllerApi.md#listLdapObject) | **GET** /ldapObjects | list
[**multiDeleteLdapObject**](LdapObjectControllerApi.md#multiDeleteLdapObject) | **DELETE** /ldapObjects | multiDelete
[**readLdapObject**](LdapObjectControllerApi.md#readLdapObject) | **GET** /ldapObjects/{id} | read
[**refreshLdapObject**](LdapObjectControllerApi.md#refreshLdapObject) | **POST** /ldapObjects/action/refresh | refresh
[**updateLdapObject**](LdapObjectControllerApi.md#updateLdapObject) | **PUT** /ldapObjects/{id} | update


<a name="createLdapObject"></a>
# **createLdapObject**
> ApiResultLDAPEntity createLdapObject(resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapObjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapObjectControllerApi apiInstance = new LdapObjectControllerApi();
LDAPEntity resource = new LDAPEntity(); // LDAPEntity | resource
try {
    ApiResultLDAPEntity result = apiInstance.createLdapObject(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapObjectControllerApi#createLdapObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**LDAPEntity**](LDAPEntity.md)| resource |

### Return type

[**ApiResultLDAPEntity**](ApiResultLDAPEntity.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLdapObject"></a>
# **deleteLdapObject**
> ApiResultVoid deleteLdapObject(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapObjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapObjectControllerApi apiInstance = new LdapObjectControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deleteLdapObject(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapObjectControllerApi#deleteLdapObject");
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

<a name="doCollectionActionLdapObject"></a>
# **doCollectionActionLdapObject**
> ApiResultApiActionResponse doCollectionActionLdapObject(collectionAction)

doCollectionAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapObjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapObjectControllerApi apiInstance = new LdapObjectControllerApi();
ApiCollectionActionlong collectionAction = new ApiCollectionActionlong(); // ApiCollectionActionlong | collectionAction
try {
    ApiResultApiActionResponse result = apiInstance.doCollectionActionLdapObject(collectionAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapObjectControllerApi#doCollectionActionLdapObject");
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

<a name="listLdapObject"></a>
# **listLdapObject**
> ApiResultListLDAPEntity listLdapObject(fields, start, limit, q, orderby, ldaptype, viewby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapObjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapObjectControllerApi apiInstance = new LdapObjectControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String orderby = "orderby_example"; // String | Fields to order by
String ldaptype = "ldaptype_example"; // String | ldaptype
String viewby = "viewby_example"; // String | viewby
try {
    ApiResultListLDAPEntity result = apiInstance.listLdapObject(fields, start, limit, q, orderby, ldaptype, viewby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapObjectControllerApi#listLdapObject");
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
 **ldaptype** | **String**| ldaptype | [optional]
 **viewby** | **String**| viewby | [optional]

### Return type

[**ApiResultListLDAPEntity**](ApiResultListLDAPEntity.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeleteLdapObject"></a>
# **multiDeleteLdapObject**
> ApiResultVoid multiDeleteLdapObject(ids)

multiDelete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapObjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapObjectControllerApi apiInstance = new LdapObjectControllerApi();
String ids = "ids_example"; // String | A comma-separated list of resource identifiers
try {
    ApiResultVoid result = apiInstance.multiDeleteLdapObject(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapObjectControllerApi#multiDeleteLdapObject");
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

<a name="readLdapObject"></a>
# **readLdapObject**
> ApiResultLDAPEntity readLdapObject(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapObjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapObjectControllerApi apiInstance = new LdapObjectControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultLDAPEntity result = apiInstance.readLdapObject(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapObjectControllerApi#readLdapObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultLDAPEntity**](ApiResultLDAPEntity.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="refreshLdapObject"></a>
# **refreshLdapObject**
> ApiResultLdapRefreshResponse refreshLdapObject()

refresh

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapObjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapObjectControllerApi apiInstance = new LdapObjectControllerApi();
try {
    ApiResultLdapRefreshResponse result = apiInstance.refreshLdapObject();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapObjectControllerApi#refreshLdapObject");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResultLdapRefreshResponse**](ApiResultLdapRefreshResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLdapObject"></a>
# **updateLdapObject**
> ApiResultLDAPEntity updateLdapObject(id, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LdapObjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LdapObjectControllerApi apiInstance = new LdapObjectControllerApi();
Long id = 789L; // Long | id
LDAPEntity resource = new LDAPEntity(); // LDAPEntity | resource
try {
    ApiResultLDAPEntity result = apiInstance.updateLdapObject(id, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LdapObjectControllerApi#updateLdapObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **resource** | [**LDAPEntity**](LDAPEntity.md)| resource |

### Return type

[**ApiResultLDAPEntity**](ApiResultLDAPEntity.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

