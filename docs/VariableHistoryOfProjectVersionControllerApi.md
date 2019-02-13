# VariableHistoryOfProjectVersionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listVariableHistoryOfProjectVersion**](VariableHistoryOfProjectVersionControllerApi.md#listVariableHistoryOfProjectVersion) | **GET** /projectVersions/{parentId}/variableHistories | list
[**readVariableHistoryOfProjectVersion**](VariableHistoryOfProjectVersionControllerApi.md#readVariableHistoryOfProjectVersion) | **GET** /projectVersions/{parentId}/variableHistories/{id} | read


<a name="listVariableHistoryOfProjectVersion"></a>
# **listVariableHistoryOfProjectVersion**
> ApiResultListVariableHistory listVariableHistoryOfProjectVersion(parentId, fields, start, limit, q)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.VariableHistoryOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

VariableHistoryOfProjectVersionControllerApi apiInstance = new VariableHistoryOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
try {
    ApiResultListVariableHistory result = apiInstance.listVariableHistoryOfProjectVersion(parentId, fields, start, limit, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariableHistoryOfProjectVersionControllerApi#listVariableHistoryOfProjectVersion");
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

### Return type

[**ApiResultListVariableHistory**](ApiResultListVariableHistory.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readVariableHistoryOfProjectVersion"></a>
# **readVariableHistoryOfProjectVersion**
> ApiResultVariableHistory readVariableHistoryOfProjectVersion(parentId, id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.VariableHistoryOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

VariableHistoryOfProjectVersionControllerApi apiInstance = new VariableHistoryOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String id = "id_example"; // String | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultVariableHistory result = apiInstance.readVariableHistoryOfProjectVersion(parentId, id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariableHistoryOfProjectVersionControllerApi#readVariableHistoryOfProjectVersion");
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

[**ApiResultVariableHistory**](ApiResultVariableHistory.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

