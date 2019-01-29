# AuthTokenControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthToken**](AuthTokenControllerApi.md#createAuthToken) | **POST** /tokens | create
[**deleteAuthToken**](AuthTokenControllerApi.md#deleteAuthToken) | **DELETE** /tokens/{id} | delete
[**listAuthToken**](AuthTokenControllerApi.md#listAuthToken) | **GET** /tokens | list
[**multiDeleteAuthToken**](AuthTokenControllerApi.md#multiDeleteAuthToken) | **DELETE** /tokens | Revoke authentication tokens using ONE of two choices: (1) all tokens owned by the requesting user, OR (2) list of token ids.
[**revokeAuthToken**](AuthTokenControllerApi.md#revokeAuthToken) | **POST** /tokens/action/revoke | Revoke authentication tokens by value
[**updateAuthToken**](AuthTokenControllerApi.md#updateAuthToken) | **PUT** /tokens/{id} | update


<a name="createAuthToken"></a>
# **createAuthToken**
> ApiResultAuthenticationToken createAuthToken(authToken)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuthTokenControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Basic
HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
Basic.setUsername("YOUR USERNAME");
Basic.setPassword("YOUR PASSWORD");

AuthTokenControllerApi apiInstance = new AuthTokenControllerApi();
AuthenticationToken authToken = new AuthenticationToken(); // AuthenticationToken | authToken
try {
    ApiResultAuthenticationToken result = apiInstance.createAuthToken(authToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTokenControllerApi#createAuthToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | [**AuthenticationToken**](AuthenticationToken.md)| authToken |

### Return type

[**ApiResultAuthenticationToken**](ApiResultAuthenticationToken.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAuthToken"></a>
# **deleteAuthToken**
> ApiResultVoid deleteAuthToken(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuthTokenControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Basic
HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
Basic.setUsername("YOUR USERNAME");
Basic.setPassword("YOUR PASSWORD");

AuthTokenControllerApi apiInstance = new AuthTokenControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deleteAuthToken(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTokenControllerApi#deleteAuthToken");
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

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAuthToken"></a>
# **listAuthToken**
> ApiResultListAuthenticationToken listAuthToken(fields, start, limit, q, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuthTokenControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Basic
HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
Basic.setUsername("YOUR USERNAME");
Basic.setPassword("YOUR PASSWORD");

AuthTokenControllerApi apiInstance = new AuthTokenControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListAuthenticationToken result = apiInstance.listAuthToken(fields, start, limit, q, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTokenControllerApi#listAuthToken");
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

[**ApiResultListAuthenticationToken**](ApiResultListAuthenticationToken.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeleteAuthToken"></a>
# **multiDeleteAuthToken**
> ApiResultVoid multiDeleteAuthToken(all, ids)

Revoke authentication tokens using ONE of two choices: (1) all tokens owned by the requesting user, OR (2) list of token ids.

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuthTokenControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Basic
HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
Basic.setUsername("YOUR USERNAME");
Basic.setPassword("YOUR PASSWORD");

AuthTokenControllerApi apiInstance = new AuthTokenControllerApi();
Boolean all = false; // Boolean | Specify value 'true' to revoke all authentication tokens of current logged-in user. This parameter can only be used if the 'ids' parameter is not being used.
String ids = "ids_example"; // String | A comma-separated list of resource identifiers
try {
    ApiResultVoid result = apiInstance.multiDeleteAuthToken(all, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTokenControllerApi#multiDeleteAuthToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **all** | **Boolean**| Specify value &#39;true&#39; to revoke all authentication tokens of current logged-in user. This parameter can only be used if the &#39;ids&#39; parameter is not being used. | [optional] [default to false]
 **ids** | **String**| A comma-separated list of resource identifiers | [optional]

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="revokeAuthToken"></a>
# **revokeAuthToken**
> ApiResultVoid revokeAuthToken(resource)

Revoke authentication tokens by value

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuthTokenControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Basic
HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
Basic.setUsername("YOUR USERNAME");
Basic.setPassword("YOUR PASSWORD");

AuthTokenControllerApi apiInstance = new AuthTokenControllerApi();
AuthTokenRevokeRequest resource = new AuthTokenRevokeRequest(); // AuthTokenRevokeRequest | resource
try {
    ApiResultVoid result = apiInstance.revokeAuthToken(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTokenControllerApi#revokeAuthToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**AuthTokenRevokeRequest**](AuthTokenRevokeRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAuthToken"></a>
# **updateAuthToken**
> ApiResultAuthenticationToken updateAuthToken(id, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuthTokenControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Basic
HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
Basic.setUsername("YOUR USERNAME");
Basic.setPassword("YOUR PASSWORD");

AuthTokenControllerApi apiInstance = new AuthTokenControllerApi();
Long id = 789L; // Long | id
AuthenticationToken resource = new AuthenticationToken(); // AuthenticationToken | resource
try {
    ApiResultAuthenticationToken result = apiInstance.updateAuthToken(id, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTokenControllerApi#updateAuthToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **resource** | [**AuthenticationToken**](AuthenticationToken.md)| resource |

### Return type

[**ApiResultAuthenticationToken**](ApiResultAuthenticationToken.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

