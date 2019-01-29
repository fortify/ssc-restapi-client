# IssueAgingGroupControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listIssueAgingGroup**](IssueAgingGroupControllerApi.md#listIssueAgingGroup) | **GET** /issueaginggroup | list


<a name="listIssueAgingGroup"></a>
# **listIssueAgingGroup**
> ApiResultListIssueAgingGroupDto listIssueAgingGroup(groupby, fields, start, limit, filterby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueAgingGroupControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueAgingGroupControllerApi apiInstance = new IssueAgingGroupControllerApi();
String groupby = "groupby_example"; // String | Fields to group by
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String filterby = "filterby_example"; // String | filterby
try {
    ApiResultListIssueAgingGroupDto result = apiInstance.listIssueAgingGroup(groupby, fields, start, limit, filterby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAgingGroupControllerApi#listIssueAgingGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupby** | **String**| Fields to group by | [optional]
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **filterby** | **String**| filterby | [optional]

### Return type

[**ApiResultListIssueAgingGroupDto**](ApiResultListIssueAgingGroupDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

