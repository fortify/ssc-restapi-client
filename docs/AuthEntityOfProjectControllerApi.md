# AuthEntityOfProjectControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAuthEntityOfProject**](AuthEntityOfProjectControllerApi.md#listAuthEntityOfProject) | **GET** /projects/{parentId}/authEntities | list
[**readAuthEntityOfProject**](AuthEntityOfProjectControllerApi.md#readAuthEntityOfProject) | **GET** /projects/{parentId}/authEntities/{id} | read
[**updateCollectionAuthEntityOfProject**](AuthEntityOfProjectControllerApi.md#updateCollectionAuthEntityOfProject) | **PUT** /projects/{parentId}/authEntities | updateCollection


<a name="listAuthEntityOfProject"></a>
# **listAuthEntityOfProject**
> ApiResultListAuthenticationEntity listAuthEntityOfProject(parentId, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuthEntityOfProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AuthEntityOfProjectControllerApi apiInstance = new AuthEntityOfProjectControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListAuthenticationEntity result = apiInstance.listAuthEntityOfProject(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthEntityOfProjectControllerApi#listAuthEntityOfProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListAuthenticationEntity**](ApiResultListAuthenticationEntity.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readAuthEntityOfProject"></a>
# **readAuthEntityOfProject**
> ApiResultAuthenticationEntity readAuthEntityOfProject(parentId, id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuthEntityOfProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AuthEntityOfProjectControllerApi apiInstance = new AuthEntityOfProjectControllerApi();
Long parentId = 789L; // Long | parentId
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultAuthenticationEntity result = apiInstance.readAuthEntityOfProject(parentId, id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthEntityOfProjectControllerApi#readAuthEntityOfProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultAuthenticationEntity**](ApiResultAuthenticationEntity.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCollectionAuthEntityOfProject"></a>
# **updateCollectionAuthEntityOfProject**
> ApiResultListAuthenticationEntity updateCollectionAuthEntityOfProject(parentId, resources)

updateCollection

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuthEntityOfProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AuthEntityOfProjectControllerApi apiInstance = new AuthEntityOfProjectControllerApi();
Long parentId = 789L; // Long | parentId
List<AuthenticationEntity> resources = Arrays.asList(new AuthenticationEntity()); // List<AuthenticationEntity> | resources
try {
    ApiResultListAuthenticationEntity result = apiInstance.updateCollectionAuthEntityOfProject(parentId, resources);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthEntityOfProjectControllerApi#updateCollectionAuthEntityOfProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resources** | [**List&lt;AuthenticationEntity&gt;**](AuthenticationEntity.md)| resources |

### Return type

[**ApiResultListAuthenticationEntity**](ApiResultListAuthenticationEntity.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

