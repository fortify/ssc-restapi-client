# DashboardVersionControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDashboardVersion**](DashboardVersionControllerApi.md#listDashboardVersion) | **GET** /dashboardVersions | list


<a name="listDashboardVersion"></a>
# **listDashboardVersion**
> ApiResultListDashboardVersion listDashboardVersion(fields, orderby, groupby, start, limit, aggregateby, startdate, enddate, attributes, variables, performanceindicators, attributefilter)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.DashboardVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

DashboardVersionControllerApi apiInstance = new DashboardVersionControllerApi();
String fields = "fields_example"; // String | Output fields
String orderby = "orderby_example"; // String | Fields to order by
String groupby = "groupby_example"; // String | Fields to group by
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String aggregateby = "aggregateby_example"; // String | aggregateby
String startdate = "startdate_example"; // String | startdate
String enddate = "enddate_example"; // String | enddate
String attributes = "attributes_example"; // String | attributes
String variables = "variables_example"; // String | variables
String performanceindicators = "performanceindicators_example"; // String | performanceindicators
String attributefilter = "attributefilter_example"; // String | attributefilter
try {
    ApiResultListDashboardVersion result = apiInstance.listDashboardVersion(fields, orderby, groupby, start, limit, aggregateby, startdate, enddate, attributes, variables, performanceindicators, attributefilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardVersionControllerApi#listDashboardVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Output fields | [optional]
 **orderby** | **String**| Fields to order by | [optional]
 **groupby** | **String**| Fields to group by | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **aggregateby** | **String**| aggregateby | [optional]
 **startdate** | **String**| startdate | [optional]
 **enddate** | **String**| enddate | [optional]
 **attributes** | **String**| attributes | [optional]
 **variables** | **String**| variables | [optional]
 **performanceindicators** | **String**| performanceindicators | [optional]
 **attributefilter** | **String**| attributefilter | [optional]

### Return type

[**ApiResultListDashboardVersion**](ApiResultListDashboardVersion.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

