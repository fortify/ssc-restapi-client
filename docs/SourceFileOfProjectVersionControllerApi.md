# SourceFileOfProjectVersionControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listSourceFileOfProjectVersion**](SourceFileOfProjectVersionControllerApi.md#listSourceFileOfProjectVersion) | **GET** /projectVersions/{parentId}/sourceFiles | list
[**readSourceFileOfProjectVersion**](SourceFileOfProjectVersionControllerApi.md#readSourceFileOfProjectVersion) | **GET** /projectVersions/{parentId}/sourceFiles/{id} | read


<a name="listSourceFileOfProjectVersion"></a>
# **listSourceFileOfProjectVersion**
> ApiResultListSourceFileDto listSourceFileOfProjectVersion(parentId, start, limit, q, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.SourceFileOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

SourceFileOfProjectVersionControllerApi apiInstance = new SourceFileOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListSourceFileDto result = apiInstance.listSourceFileOfProjectVersion(parentId, start, limit, q, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceFileOfProjectVersionControllerApi#listSourceFileOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search query | [optional]
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListSourceFileDto**](ApiResultListSourceFileDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readSourceFileOfProjectVersion"></a>
# **readSourceFileOfProjectVersion**
> ApiResultSourceFileDto readSourceFileOfProjectVersion(parentId, id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.SourceFileOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

SourceFileOfProjectVersionControllerApi apiInstance = new SourceFileOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String id = "id_example"; // String | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultSourceFileDto result = apiInstance.readSourceFileOfProjectVersion(parentId, id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceFileOfProjectVersionControllerApi#readSourceFileOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **id** | **String**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultSourceFileDto**](ApiResultSourceFileDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

