# DynamicScanRequestOfProjectVersionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelDynamicScanRequestOfProjectVersion**](DynamicScanRequestOfProjectVersionControllerApi.md#cancelDynamicScanRequestOfProjectVersion) | **POST** /projectVersions/{parentId}/dynamicScanRequests/{id}/action | Cancel a Dynamic Scan Request
[**createDynamicScanRequestOfProjectVersion**](DynamicScanRequestOfProjectVersionControllerApi.md#createDynamicScanRequestOfProjectVersion) | **POST** /projectVersions/{parentId}/dynamicScanRequests | create
[**listDynamicScanRequestOfProjectVersion**](DynamicScanRequestOfProjectVersionControllerApi.md#listDynamicScanRequestOfProjectVersion) | **GET** /projectVersions/{parentId}/dynamicScanRequests | list
[**readDynamicScanRequestOfProjectVersion**](DynamicScanRequestOfProjectVersionControllerApi.md#readDynamicScanRequestOfProjectVersion) | **GET** /projectVersions/{parentId}/dynamicScanRequests/{id} | read
[**updateDynamicScanRequestOfProjectVersion**](DynamicScanRequestOfProjectVersionControllerApi.md#updateDynamicScanRequestOfProjectVersion) | **PUT** /projectVersions/{parentId}/dynamicScanRequests/{id} | update


<a name="cancelDynamicScanRequestOfProjectVersion"></a>
# **cancelDynamicScanRequestOfProjectVersion**
> ApiResultVoid cancelDynamicScanRequestOfProjectVersion(id)

Cancel a Dynamic Scan Request

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.DynamicScanRequestOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

DynamicScanRequestOfProjectVersionControllerApi apiInstance = new DynamicScanRequestOfProjectVersionControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.cancelDynamicScanRequestOfProjectVersion(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamicScanRequestOfProjectVersionControllerApi#cancelDynamicScanRequestOfProjectVersion");
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

<a name="createDynamicScanRequestOfProjectVersion"></a>
# **createDynamicScanRequestOfProjectVersion**
> ApiResultDynamicScanRequest createDynamicScanRequestOfProjectVersion(parentId, resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.DynamicScanRequestOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

DynamicScanRequestOfProjectVersionControllerApi apiInstance = new DynamicScanRequestOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
DynamicScanRequest resource = new DynamicScanRequest(); // DynamicScanRequest | resource
try {
    ApiResultDynamicScanRequest result = apiInstance.createDynamicScanRequestOfProjectVersion(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamicScanRequestOfProjectVersionControllerApi#createDynamicScanRequestOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resource** | [**DynamicScanRequest**](DynamicScanRequest.md)| resource |

### Return type

[**ApiResultDynamicScanRequest**](ApiResultDynamicScanRequest.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listDynamicScanRequestOfProjectVersion"></a>
# **listDynamicScanRequestOfProjectVersion**
> ApiResultListDynamicScanRequest listDynamicScanRequestOfProjectVersion(parentId, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.DynamicScanRequestOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

DynamicScanRequestOfProjectVersionControllerApi apiInstance = new DynamicScanRequestOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListDynamicScanRequest result = apiInstance.listDynamicScanRequestOfProjectVersion(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamicScanRequestOfProjectVersionControllerApi#listDynamicScanRequestOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListDynamicScanRequest**](ApiResultListDynamicScanRequest.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readDynamicScanRequestOfProjectVersion"></a>
# **readDynamicScanRequestOfProjectVersion**
> ApiResultDynamicScanRequest readDynamicScanRequestOfProjectVersion(parentId, id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.DynamicScanRequestOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

DynamicScanRequestOfProjectVersionControllerApi apiInstance = new DynamicScanRequestOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultDynamicScanRequest result = apiInstance.readDynamicScanRequestOfProjectVersion(parentId, id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamicScanRequestOfProjectVersionControllerApi#readDynamicScanRequestOfProjectVersion");
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

[**ApiResultDynamicScanRequest**](ApiResultDynamicScanRequest.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDynamicScanRequestOfProjectVersion"></a>
# **updateDynamicScanRequestOfProjectVersion**
> ApiResultDynamicScanRequest updateDynamicScanRequestOfProjectVersion(parentId, id, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.DynamicScanRequestOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

DynamicScanRequestOfProjectVersionControllerApi apiInstance = new DynamicScanRequestOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
Long id = 789L; // Long | id
DynamicScanRequest resource = new DynamicScanRequest(); // DynamicScanRequest | resource
try {
    ApiResultDynamicScanRequest result = apiInstance.updateDynamicScanRequestOfProjectVersion(parentId, id, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamicScanRequestOfProjectVersionControllerApi#updateDynamicScanRequestOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **id** | **Long**| id |
 **resource** | [**DynamicScanRequest**](DynamicScanRequest.md)| resource |

### Return type

[**ApiResultDynamicScanRequest**](ApiResultDynamicScanRequest.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

