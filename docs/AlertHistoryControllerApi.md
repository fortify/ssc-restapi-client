# AlertHistoryControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**doActionAlertHistory**](AlertHistoryControllerApi.md#doActionAlertHistory) | **POST** /alerts/action | doAction
[**listAlertHistory**](AlertHistoryControllerApi.md#listAlertHistory) | **GET** /alerts | list
[**setStatusForAlertHistory**](AlertHistoryControllerApi.md#setStatusForAlertHistory) | **POST** /alerts/action/setStatus | setStatusFor


<a name="doActionAlertHistory"></a>
# **doActionAlertHistory**
> ApiResultApiActionResponse doActionAlertHistory(collectionAction)

doAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AlertHistoryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AlertHistoryControllerApi apiInstance = new AlertHistoryControllerApi();
ApiCollectionActionlong collectionAction = new ApiCollectionActionlong(); // ApiCollectionActionlong | collectionAction
try {
    ApiResultApiActionResponse result = apiInstance.doActionAlertHistory(collectionAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertHistoryControllerApi#doActionAlertHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionAction** | [**ApiCollectionActionlong**](ApiCollectionActionlong.md)| collectionAction |

### Return type

[**ApiResultApiActionResponse**](ApiResultApiActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAlertHistory"></a>
# **listAlertHistory**
> ApiResultListAlertHistoryEntry listAlertHistory(start, limit, q, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AlertHistoryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AlertHistoryControllerApi apiInstance = new AlertHistoryControllerApi();
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListAlertHistoryEntry result = apiInstance.listAlertHistory(start, limit, q, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertHistoryControllerApi#listAlertHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search query | [optional]
 **orderby** | **String**| Fields to order by | [optional]

### Return type

[**ApiResultListAlertHistoryEntry**](ApiResultListAlertHistoryEntry.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setStatusForAlertHistory"></a>
# **setStatusForAlertHistory**
> ApiResultVoid setStatusForAlertHistory(resource)

setStatusFor

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AlertHistoryControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AlertHistoryControllerApi apiInstance = new AlertHistoryControllerApi();
AlertSetStatusRequest resource = new AlertSetStatusRequest(); // AlertSetStatusRequest | resource
try {
    ApiResultVoid result = apiInstance.setStatusForAlertHistory(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertHistoryControllerApi#setStatusForAlertHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**AlertSetStatusRequest**](AlertSetStatusRequest.md)| resource |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

