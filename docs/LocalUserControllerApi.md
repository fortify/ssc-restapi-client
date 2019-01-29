# LocalUserControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkLocalUser**](LocalUserControllerApi.md#checkLocalUser) | **POST** /localUsers/action/checkPasswordStrength | check
[**createLocalUser**](LocalUserControllerApi.md#createLocalUser) | **POST** /localUsers | create
[**deleteLocalUser**](LocalUserControllerApi.md#deleteLocalUser) | **DELETE** /localUsers/{id} | delete
[**listLocalUser**](LocalUserControllerApi.md#listLocalUser) | **GET** /localUsers | list
[**multiDeleteLocalUser**](LocalUserControllerApi.md#multiDeleteLocalUser) | **DELETE** /localUsers | multiDelete
[**readLocalUser**](LocalUserControllerApi.md#readLocalUser) | **GET** /localUsers/{id} | read
[**updateLocalUser**](LocalUserControllerApi.md#updateLocalUser) | **PUT** /localUsers/{id} | update


<a name="checkLocalUser"></a>
# **checkLocalUser**
> ApiResultPasswordStrengthCheckResponse checkLocalUser(passwordStrengthCheckRequest)

check

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LocalUserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LocalUserControllerApi apiInstance = new LocalUserControllerApi();
PasswordStrengthCheckRequest passwordStrengthCheckRequest = new PasswordStrengthCheckRequest(); // PasswordStrengthCheckRequest | passwordStrengthCheckRequest
try {
    ApiResultPasswordStrengthCheckResponse result = apiInstance.checkLocalUser(passwordStrengthCheckRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalUserControllerApi#checkLocalUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **passwordStrengthCheckRequest** | [**PasswordStrengthCheckRequest**](PasswordStrengthCheckRequest.md)| passwordStrengthCheckRequest |

### Return type

[**ApiResultPasswordStrengthCheckResponse**](ApiResultPasswordStrengthCheckResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLocalUser"></a>
# **createLocalUser**
> ApiResultLocalUser createLocalUser(user)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LocalUserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LocalUserControllerApi apiInstance = new LocalUserControllerApi();
LocalUser user = new LocalUser(); // LocalUser | user
try {
    ApiResultLocalUser result = apiInstance.createLocalUser(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalUserControllerApi#createLocalUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**LocalUser**](LocalUser.md)| user |

### Return type

[**ApiResultLocalUser**](ApiResultLocalUser.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLocalUser"></a>
# **deleteLocalUser**
> ApiResultVoid deleteLocalUser(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LocalUserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LocalUserControllerApi apiInstance = new LocalUserControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deleteLocalUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalUserControllerApi#deleteLocalUser");
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

<a name="listLocalUser"></a>
# **listLocalUser**
> ApiResultListLocalUser listLocalUser(start, limit, q, orderby, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LocalUserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LocalUserControllerApi apiInstance = new LocalUserControllerApi();
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String orderby = "orderby_example"; // String | Fields to order by
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListLocalUser result = apiInstance.listLocalUser(start, limit, q, orderby, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalUserControllerApi#listLocalUser");
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

### Return type

[**ApiResultListLocalUser**](ApiResultListLocalUser.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeleteLocalUser"></a>
# **multiDeleteLocalUser**
> ApiResultVoid multiDeleteLocalUser(ids)

multiDelete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LocalUserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LocalUserControllerApi apiInstance = new LocalUserControllerApi();
String ids = "ids_example"; // String | A comma-separated list of resource identifiers
try {
    ApiResultVoid result = apiInstance.multiDeleteLocalUser(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalUserControllerApi#multiDeleteLocalUser");
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

<a name="readLocalUser"></a>
# **readLocalUser**
> ApiResultLocalUser readLocalUser(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LocalUserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LocalUserControllerApi apiInstance = new LocalUserControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultLocalUser result = apiInstance.readLocalUser(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalUserControllerApi#readLocalUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultLocalUser**](ApiResultLocalUser.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLocalUser"></a>
# **updateLocalUser**
> ApiResultLocalUser updateLocalUser(id, user)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.LocalUserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

LocalUserControllerApi apiInstance = new LocalUserControllerApi();
Long id = 789L; // Long | id
LocalUser user = new LocalUser(); // LocalUser | user
try {
    ApiResultLocalUser result = apiInstance.updateLocalUser(id, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalUserControllerApi#updateLocalUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **user** | [**LocalUser**](LocalUser.md)| user |

### Return type

[**ApiResultLocalUser**](ApiResultLocalUser.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

