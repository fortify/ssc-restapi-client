# DataExportControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDataExport**](DataExportControllerApi.md#deleteDataExport) | **DELETE** /dataExports/{id} | delete
[**doActionDataExport**](DataExportControllerApi.md#doActionDataExport) | **POST** /dataExports/action | doAction
[**exportAuditToCSVForDataExport**](DataExportControllerApi.md#exportAuditToCSVForDataExport) | **POST** /dataExports/action/exportAuditToCsv | exportAuditToCSVFor
[**exportIssuesStatsToCSVForDataExport**](DataExportControllerApi.md#exportIssuesStatsToCSVForDataExport) | **POST** /dataExports/action/exportIssueStatsToCsv | exportIssuesStatsToCSVFor
[**listDataExport**](DataExportControllerApi.md#listDataExport) | **GET** /dataExports | list


<a name="deleteDataExport"></a>
# **deleteDataExport**
> ApiResultVoid deleteDataExport(id)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.DataExportControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

DataExportControllerApi apiInstance = new DataExportControllerApi();
Long id = 789L; // Long | id
try {
    ApiResultVoid result = apiInstance.deleteDataExport(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExportControllerApi#deleteDataExport");
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

<a name="doActionDataExport"></a>
# **doActionDataExport**
> ApiResultApiActionResponse doActionDataExport(collectionAction, appversionid, datasetname)

doAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.DataExportControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

DataExportControllerApi apiInstance = new DataExportControllerApi();
ApiCollectionActionlong collectionAction = new ApiCollectionActionlong(); // ApiCollectionActionlong | collectionAction
String appversionid = "appversionid_example"; // String | appversionid
String datasetname = "datasetname_example"; // String | datasetname
try {
    ApiResultApiActionResponse result = apiInstance.doActionDataExport(collectionAction, appversionid, datasetname);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExportControllerApi#doActionDataExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionAction** | [**ApiCollectionActionlong**](ApiCollectionActionlong.md)| collectionAction |
 **appversionid** | **String**| appversionid | [optional]
 **datasetname** | **String**| datasetname | [optional]

### Return type

[**ApiResultApiActionResponse**](ApiResultApiActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportAuditToCSVForDataExport"></a>
# **exportAuditToCSVForDataExport**
> ApiResultVoid exportAuditToCSVForDataExport(resource)

exportAuditToCSVFor

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.DataExportControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

DataExportControllerApi apiInstance = new DataExportControllerApi();
ExportAuditToCSVRequest resource = new ExportAuditToCSVRequest(); // ExportAuditToCSVRequest | resource
try {
    ApiResultVoid result = apiInstance.exportAuditToCSVForDataExport(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExportControllerApi#exportAuditToCSVForDataExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ExportAuditToCSVRequest**](ExportAuditToCSVRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportIssuesStatsToCSVForDataExport"></a>
# **exportIssuesStatsToCSVForDataExport**
> ApiResultVoid exportIssuesStatsToCSVForDataExport(resource)

exportIssuesStatsToCSVFor

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.DataExportControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

DataExportControllerApi apiInstance = new DataExportControllerApi();
ExportIssueStatsToCSVRequest resource = new ExportIssueStatsToCSVRequest(); // ExportIssueStatsToCSVRequest | resource
try {
    ApiResultVoid result = apiInstance.exportIssuesStatsToCSVForDataExport(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExportControllerApi#exportIssuesStatsToCSVForDataExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ExportIssueStatsToCSVRequest**](ExportIssueStatsToCSVRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listDataExport"></a>
# **listDataExport**
> ApiResultListDataExport listDataExport(fields, start, limit, q, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.DataExportControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

DataExportControllerApi apiInstance = new DataExportControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListDataExport result = apiInstance.listDataExport(fields, start, limit, q, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExportControllerApi#listDataExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search query | [optional]
 **orderby** | **String**| Fields to order by | [optional]

### Return type

[**ApiResultListDataExport**](ApiResultListDataExport.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

