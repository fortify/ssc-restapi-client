# ArtifactControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**approveArtifact**](ArtifactControllerApi.md#approveArtifact) | **POST** /artifacts/action/approve | approve
[**deleteArtifact**](ArtifactControllerApi.md#deleteArtifact) | **DELETE** /artifacts/{id} | delete
[**doActionArtifact**](ArtifactControllerApi.md#doActionArtifact) | **POST** /artifacts/{id}/action | doAction
[**purgeArtifact**](ArtifactControllerApi.md#purgeArtifact) | **POST** /artifacts/action/purge | purge
[**readArtifact**](ArtifactControllerApi.md#readArtifact) | **GET** /artifacts/{id} | read


<a name="approveArtifact"></a>
# **approveArtifact**
> ApiResultVoid approveArtifact(resource)

approve

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ArtifactControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ArtifactControllerApi apiInstance = new ArtifactControllerApi();
ArtifactApproveRequest resource = new ArtifactApproveRequest(); // ArtifactApproveRequest | resource
try {
    ApiResultVoid result = apiInstance.approveArtifact(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtifactControllerApi#approveArtifact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ArtifactApproveRequest**](ArtifactApproveRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteArtifact"></a>
# **deleteArtifact**
> ApiResultVoid deleteArtifact(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ArtifactControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ArtifactControllerApi apiInstance = new ArtifactControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deleteArtifact(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtifactControllerApi#deleteArtifact");
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

<a name="doActionArtifact"></a>
# **doActionArtifact**
> ApiResultApiActionResponse doActionArtifact(id, resourceAction)

doAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ArtifactControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ArtifactControllerApi apiInstance = new ArtifactControllerApi();
Long id = 789L; // Long | id
ApiResourceAction resourceAction = new ApiResourceAction(); // ApiResourceAction | resourceAction
try {
    ApiResultApiActionResponse result = apiInstance.doActionArtifact(id, resourceAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtifactControllerApi#doActionArtifact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **resourceAction** | [**ApiResourceAction**](ApiResourceAction.md)| resourceAction |

### Return type

[**ApiResultApiActionResponse**](ApiResultApiActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purgeArtifact"></a>
# **purgeArtifact**
> ApiResultVoid purgeArtifact(resource)

purge

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ArtifactControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ArtifactControllerApi apiInstance = new ArtifactControllerApi();
ArtifactPurgeRequest resource = new ArtifactPurgeRequest(); // ArtifactPurgeRequest | resource
try {
    ApiResultVoid result = apiInstance.purgeArtifact(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtifactControllerApi#purgeArtifact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ArtifactPurgeRequest**](ArtifactPurgeRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readArtifact"></a>
# **readArtifact**
> ApiResultArtifact readArtifact(id, fields, embed)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ArtifactControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ArtifactControllerApi apiInstance = new ArtifactControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
String embed = "embed_example"; // String | Fields to embed
try {
    ApiResultArtifact result = apiInstance.readArtifact(id, fields, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtifactControllerApi#readArtifact");
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

[**ApiResultArtifact**](ApiResultArtifact.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

