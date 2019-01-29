# PerformanceIndicatorHistoryOfProjectVersionControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPerformanceIndicatorHistoryOfProjectVersion**](PerformanceIndicatorHistoryOfProjectVersionControllerApi.md#listPerformanceIndicatorHistoryOfProjectVersion) | **GET** /projectVersions/{parentId}/performanceIndicatorHistories | list
[**readPerformanceIndicatorHistoryOfProjectVersion**](PerformanceIndicatorHistoryOfProjectVersionControllerApi.md#readPerformanceIndicatorHistoryOfProjectVersion) | **GET** /projectVersions/{parentId}/performanceIndicatorHistories/{id} | read


<a name="listPerformanceIndicatorHistoryOfProjectVersion"></a>
# **listPerformanceIndicatorHistoryOfProjectVersion**
> ApiResultListPerformanceIndicatorHistory listPerformanceIndicatorHistoryOfProjectVersion(parentId, fields, start, limit, q)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.PerformanceIndicatorHistoryOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

PerformanceIndicatorHistoryOfProjectVersionControllerApi apiInstance = new PerformanceIndicatorHistoryOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
try {
    ApiResultListPerformanceIndicatorHistory result = apiInstance.listPerformanceIndicatorHistoryOfProjectVersion(parentId, fields, start, limit, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceIndicatorHistoryOfProjectVersionControllerApi#listPerformanceIndicatorHistoryOfProjectVersion");
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

[**ApiResultListPerformanceIndicatorHistory**](ApiResultListPerformanceIndicatorHistory.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readPerformanceIndicatorHistoryOfProjectVersion"></a>
# **readPerformanceIndicatorHistoryOfProjectVersion**
> ApiResultPerformanceIndicatorHistory readPerformanceIndicatorHistoryOfProjectVersion(parentId, id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.PerformanceIndicatorHistoryOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

PerformanceIndicatorHistoryOfProjectVersionControllerApi apiInstance = new PerformanceIndicatorHistoryOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String id = "id_example"; // String | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultPerformanceIndicatorHistory result = apiInstance.readPerformanceIndicatorHistoryOfProjectVersion(parentId, id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceIndicatorHistoryOfProjectVersionControllerApi#readPerformanceIndicatorHistoryOfProjectVersion");
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

[**ApiResultPerformanceIndicatorHistory**](ApiResultPerformanceIndicatorHistory.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

