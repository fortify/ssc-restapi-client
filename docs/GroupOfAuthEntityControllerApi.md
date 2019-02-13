# GroupOfAuthEntityControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listGroupOfAuthEntity**](GroupOfAuthEntityControllerApi.md#listGroupOfAuthEntity) | **GET** /authEntities/{parentId}/groups | list


<a name="listGroupOfAuthEntity"></a>
# **listGroupOfAuthEntity**
> ApiResultListAuthenticationEntity listGroupOfAuthEntity(parentId, fields, start, limit, q, embed)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.GroupOfAuthEntityControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

GroupOfAuthEntityControllerApi apiInstance = new GroupOfAuthEntityControllerApi();
String parentId = "parentId_example"; // String | parentId
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String embed = "embed_example"; // String | Fields to embed
try {
    ApiResultListAuthenticationEntity result = apiInstance.listGroupOfAuthEntity(parentId, fields, start, limit, q, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupOfAuthEntityControllerApi#listGroupOfAuthEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **String**| parentId |
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search query | [optional]
 **embed** | **String**| Fields to embed | [optional]

### Return type

[**ApiResultListAuthenticationEntity**](ApiResultListAuthenticationEntity.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

