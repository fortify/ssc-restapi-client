# IssueAgingControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listIssueAging**](IssueAgingControllerApi.md#listIssueAging) | **GET** /issueaging | list


<a name="listIssueAging"></a>
# **listIssueAging**
> ApiResultListIssueAgingDto listIssueAging(orderby, fields, start, limit, filterby, aggregateby, groupguid, groupvalue, name, numberOfApplicationVersions, linesOfCode, issuesPendingReview, openIssues, filesScanned, bugDensity, averageDaysToReview, averageDaysToRemediate)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueAgingControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueAgingControllerApi apiInstance = new IssueAgingControllerApi();
String orderby = "orderby_example"; // String | Fields to order by
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String filterby = "filterby_example"; // String | filterby
String aggregateby = "aggregateby_example"; // String | aggregateby
String groupguid = "groupguid_example"; // String | groupguid
String groupvalue = "groupvalue_example"; // String | groupvalue
String name = "name_example"; // String | name
String numberOfApplicationVersions = "numberOfApplicationVersions_example"; // String | numberOfApplicationVersions
String linesOfCode = "linesOfCode_example"; // String | linesOfCode
String issuesPendingReview = "issuesPendingReview_example"; // String | issuesPendingReview
String openIssues = "openIssues_example"; // String | openIssues
String filesScanned = "filesScanned_example"; // String | filesScanned
String bugDensity = "bugDensity_example"; // String | bugDensity
String averageDaysToReview = "averageDaysToReview_example"; // String | averageDaysToReview
String averageDaysToRemediate = "averageDaysToRemediate_example"; // String | averageDaysToRemediate
try {
    ApiResultListIssueAgingDto result = apiInstance.listIssueAging(orderby, fields, start, limit, filterby, aggregateby, groupguid, groupvalue, name, numberOfApplicationVersions, linesOfCode, issuesPendingReview, openIssues, filesScanned, bugDensity, averageDaysToReview, averageDaysToRemediate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAgingControllerApi#listIssueAging");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderby** | **String**| Fields to order by | [optional]
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **filterby** | **String**| filterby | [optional]
 **aggregateby** | **String**| aggregateby | [optional]
 **groupguid** | **String**| groupguid | [optional]
 **groupvalue** | **String**| groupvalue | [optional]
 **name** | **String**| name | [optional]
 **numberOfApplicationVersions** | **String**| numberOfApplicationVersions | [optional]
 **linesOfCode** | **String**| linesOfCode | [optional]
 **issuesPendingReview** | **String**| issuesPendingReview | [optional]
 **openIssues** | **String**| openIssues | [optional]
 **filesScanned** | **String**| filesScanned | [optional]
 **bugDensity** | **String**| bugDensity | [optional]
 **averageDaysToReview** | **String**| averageDaysToReview | [optional]
 **averageDaysToRemediate** | **String**| averageDaysToRemediate | [optional]

### Return type

[**ApiResultListIssueAgingDto**](ApiResultListIssueAgingDto.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

