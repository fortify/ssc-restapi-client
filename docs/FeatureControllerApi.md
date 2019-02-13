# FeatureControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listFeature**](FeatureControllerApi.md#listFeature) | **GET** /features | list
[**readFeature**](FeatureControllerApi.md#readFeature) | **GET** /features/{id} | read


<a name="listFeature"></a>
# **listFeature**
> ApiResultListFeature listFeature(fields, start, limit, q, orderby, useStableApi)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.FeatureControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

FeatureControllerApi apiInstance = new FeatureControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String orderby = "orderby_example"; // String | Fields to order by
Boolean useStableApi = true; // Boolean | use_stable_api
try {
    ApiResultListFeature result = apiInstance.listFeature(fields, start, limit, q, orderby, useStableApi);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureControllerApi#listFeature");
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
 **useStableApi** | **Boolean**| use_stable_api | [optional] [default to true]

### Return type

[**ApiResultListFeature**](ApiResultListFeature.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readFeature"></a>
# **readFeature**
> ApiResultFeature readFeature(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.FeatureControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

FeatureControllerApi apiInstance = new FeatureControllerApi();
String id = "id_example"; // String | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultFeature result = apiInstance.readFeature(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureControllerApi#readFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultFeature**](ApiResultFeature.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

