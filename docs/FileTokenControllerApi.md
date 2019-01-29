# FileTokenControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFileToken**](FileTokenControllerApi.md#createFileToken) | **POST** /fileTokens | Create single-use file transfer token
[**multiDeleteFileToken**](FileTokenControllerApi.md#multiDeleteFileToken) | **DELETE** /fileTokens | Call this operation after every file upload activity


<a name="createFileToken"></a>
# **createFileToken**
> ApiResultFileToken createFileToken(resource)

Create single-use file transfer token

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.FileTokenControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

FileTokenControllerApi apiInstance = new FileTokenControllerApi();
FileToken resource = new FileToken(); // FileToken | resource
try {
    ApiResultFileToken result = apiInstance.createFileToken(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileTokenControllerApi#createFileToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**FileToken**](FileToken.md)| resource |

### Return type

[**ApiResultFileToken**](ApiResultFileToken.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="multiDeleteFileToken"></a>
# **multiDeleteFileToken**
> ApiResultVoid multiDeleteFileToken()

Call this operation after every file upload activity

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.FileTokenControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

FileTokenControllerApi apiInstance = new FileTokenControllerApi();
try {
    ApiResultVoid result = apiInstance.multiDeleteFileToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileTokenControllerApi#multiDeleteFileToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

