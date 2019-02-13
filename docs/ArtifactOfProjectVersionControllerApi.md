# ArtifactOfProjectVersionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listArtifactOfProjectVersion**](ArtifactOfProjectVersionControllerApi.md#listArtifactOfProjectVersion) | **GET** /projectVersions/{parentId}/artifacts | list
[**uploadArtifactOfProjectVersion**](ArtifactOfProjectVersionControllerApi.md#uploadArtifactOfProjectVersion) | **POST** /projectVersions/{parentId}/artifacts | upload


<a name="listArtifactOfProjectVersion"></a>
# **listArtifactOfProjectVersion**
> ApiResultListArtifact listArtifactOfProjectVersion(parentId, fields, start, limit, q, embed)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ArtifactOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ArtifactOfProjectVersionControllerApi apiInstance = new ArtifactOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String embed = "embed_example"; // String | Fields to embed
try {
    ApiResultListArtifact result = apiInstance.listArtifactOfProjectVersion(parentId, fields, start, limit, q, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtifactOfProjectVersionControllerApi#listArtifactOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search query | [optional]
 **embed** | **String**| Fields to embed | [optional]

### Return type

[**ApiResultListArtifact**](ApiResultListArtifact.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadArtifactOfProjectVersion"></a>
# **uploadArtifactOfProjectVersion**
> ApiResultArtifact uploadArtifactOfProjectVersion(parentId, file, engineType)

upload

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ArtifactOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ArtifactOfProjectVersionControllerApi apiInstance = new ArtifactOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
File file = new File("/path/to/file.txt"); // File | file
String engineType = "engineType_example"; // String | engineType
try {
    ApiResultArtifact result = apiInstance.uploadArtifactOfProjectVersion(parentId, file, engineType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtifactOfProjectVersionControllerApi#uploadArtifactOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **file** | **File**| file |
 **engineType** | **String**| engineType | [optional]

### Return type

[**ApiResultArtifact**](ApiResultArtifact.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

