# SavedReportControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSavedReport**](SavedReportControllerApi.md#createSavedReport) | **POST** /reports | create
[**deleteSavedReport**](SavedReportControllerApi.md#deleteSavedReport) | **DELETE** /reports/{id} | delete
[**listSavedReport**](SavedReportControllerApi.md#listSavedReport) | **GET** /reports | list
[**readSavedReport**](SavedReportControllerApi.md#readSavedReport) | **GET** /reports/{id} | read


<a name="createSavedReport"></a>
# **createSavedReport**
> ApiResultSavedReport createSavedReport(resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.SavedReportControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

SavedReportControllerApi apiInstance = new SavedReportControllerApi();
SavedReport resource = new SavedReport(); // SavedReport | resource
try {
    ApiResultSavedReport result = apiInstance.createSavedReport(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedReportControllerApi#createSavedReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**SavedReport**](SavedReport.md)| resource |

### Return type

[**ApiResultSavedReport**](ApiResultSavedReport.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSavedReport"></a>
# **deleteSavedReport**
> ApiResultVoid deleteSavedReport(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.SavedReportControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

SavedReportControllerApi apiInstance = new SavedReportControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deleteSavedReport(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedReportControllerApi#deleteSavedReport");
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

<a name="listSavedReport"></a>
# **listSavedReport**
> ApiResultListSavedReport listSavedReport(fields, start, limit, q, fulltextsearch, embed, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.SavedReportControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

SavedReportControllerApi apiInstance = new SavedReportControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search-spec of full text search query (see fulltextsearch parameter)
Boolean fulltextsearch = false; // Boolean | If 'true', interpret 'q' parameter as full text search query, defaults to 'false'
String embed = "embed_example"; // String | Fields to embed
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListSavedReport result = apiInstance.listSavedReport(fields, start, limit, q, fulltextsearch, embed, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedReportControllerApi#listSavedReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search-spec of full text search query (see fulltextsearch parameter) | [optional]
 **fulltextsearch** | **Boolean**| If &#39;true&#39;, interpret &#39;q&#39; parameter as full text search query, defaults to &#39;false&#39; | [optional] [default to false]
 **embed** | **String**| Fields to embed | [optional]
 **orderby** | **String**| Fields to order by | [optional]

### Return type

[**ApiResultListSavedReport**](ApiResultListSavedReport.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readSavedReport"></a>
# **readSavedReport**
> ApiResultSavedReport readSavedReport(id, fields, embed)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.SavedReportControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

SavedReportControllerApi apiInstance = new SavedReportControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
String embed = "embed_example"; // String | Fields to embed
try {
    ApiResultSavedReport result = apiInstance.readSavedReport(id, fields, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedReportControllerApi#readSavedReport");
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

[**ApiResultSavedReport**](ApiResultSavedReport.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

