# AuthEntityControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAuthEntity**](AuthEntityControllerApi.md#listAuthEntity) | **GET** /authEntities | list
[**multiDeleteAuthEntity**](AuthEntityControllerApi.md#multiDeleteAuthEntity) | **DELETE** /authEntities | multiDelete
[**readAuthEntity**](AuthEntityControllerApi.md#readAuthEntity) | **GET** /authEntities/{id} | read


<a name="listAuthEntity"></a>
# **listAuthEntity**
> ApiResultListAuthenticationEntity listAuthEntity(fields, start, limit, q, fulltextsearch, orderby, embed, entityname, ldaptype)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuthEntityControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AuthEntityControllerApi apiInstance = new AuthEntityControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search-spec of full text search query (see fulltextsearch parameter)
Boolean fulltextsearch = false; // Boolean | If 'true', interpret 'q' parameter as full text search query, defaults to 'false'
String orderby = "orderby_example"; // String | Fields to order by
String embed = "embed_example"; // String | Fields to embed
String entityname = "entityname_example"; // String | entityname
String ldaptype = "ldaptype_example"; // String | ldaptype
try {
    ApiResultListAuthenticationEntity result = apiInstance.listAuthEntity(fields, start, limit, q, fulltextsearch, orderby, embed, entityname, ldaptype);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthEntityControllerApi#listAuthEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search-spec of full text search query (see fulltextsearch parameter) | [optional]
 **fulltextsearch** | **Boolean**| If &#39;true&#39;, interpret &#39;q&#39; parameter as full text search query, defaults to &#39;false&#39; | [optional] [default to false]
 **orderby** | **String**| Fields to order by | [optional]
 **embed** | **String**| Fields to embed | [optional]
 **entityname** | **String**| entityname | [optional]
 **ldaptype** | **String**| ldaptype | [optional]

### Return type

[**ApiResultListAuthenticationEntity**](ApiResultListAuthenticationEntity.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeleteAuthEntity"></a>
# **multiDeleteAuthEntity**
> ApiResultVoid multiDeleteAuthEntity(ids)

multiDelete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuthEntityControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AuthEntityControllerApi apiInstance = new AuthEntityControllerApi();
String ids = "ids_example"; // String | A comma-separated list of resource identifiers
try {
    ApiResultVoid result = apiInstance.multiDeleteAuthEntity(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthEntityControllerApi#multiDeleteAuthEntity");
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

<a name="readAuthEntity"></a>
# **readAuthEntity**
> ApiResultAuthenticationEntity readAuthEntity(id, fields, embed)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuthEntityControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AuthEntityControllerApi apiInstance = new AuthEntityControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
String embed = "embed_example"; // String | Fields to embed
try {
    ApiResultAuthenticationEntity result = apiInstance.readAuthEntity(id, fields, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthEntityControllerApi#readAuthEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]
 **embed** | **String**| Fields to embed | [optional]

### Return type

[**ApiResultAuthenticationEntity**](ApiResultAuthenticationEntity.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

