# IssueGroupOfProjectVersionControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listIssueGroupOfProjectVersion**](IssueGroupOfProjectVersionControllerApi.md#listIssueGroupOfProjectVersion) | **GET** /projectVersions/{parentId}/issueGroups | list


<a name="listIssueGroupOfProjectVersion"></a>
# **listIssueGroupOfProjectVersion**
> ApiResultListProjectVersionIssueGroup listIssueGroupOfProjectVersion(parentId, start, limit, q, qm, filterset, fields, showhidden, showremoved, showsuppressed, showshortfilenames, filter, groupingtype)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueGroupOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueGroupOfProjectVersionControllerApi apiInstance = new IssueGroupOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | An issue query expression, must be used together with the 'qm' parameter
String qm = "qm_example"; // String | Syntax mode for the 'q' parameter, mandatory if the 'q' parameter is used
String filterset = "filterset_example"; // String | Filter set to use
String fields = "fields_example"; // String | Output fields
Boolean showhidden = false; // Boolean | If 'true', include hidden issues in search results. If 'false', exclude hidden issues from search results. If no options are set, use application version profile settings to get value of this option.
Boolean showremoved = false; // Boolean | If 'true', include removed issues in search results. If 'false', exclude removed issues from search results. If no options are set, use application version profile settings to get value of this option.
Boolean showsuppressed = false; // Boolean | If 'true', include suppressed issues in search results. If 'false', exclude suppressed issues from search results. If no options are set, use application version profile settings to get value of this option.
Boolean showshortfilenames = false; // Boolean | If 'true', only short file names will be displayed in issues list.
String filter = "filter_example"; // String | filter
String groupingtype = "groupingtype_example"; // String | groupingtype
try {
    ApiResultListProjectVersionIssueGroup result = apiInstance.listIssueGroupOfProjectVersion(parentId, start, limit, q, qm, filterset, fields, showhidden, showremoved, showsuppressed, showshortfilenames, filter, groupingtype);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueGroupOfProjectVersionControllerApi#listIssueGroupOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| An issue query expression, must be used together with the &#39;qm&#39; parameter | [optional]
 **qm** | **String**| Syntax mode for the &#39;q&#39; parameter, mandatory if the &#39;q&#39; parameter is used | [optional] [enum: issues]
 **filterset** | **String**| Filter set to use | [optional]
 **fields** | **String**| Output fields | [optional]
 **showhidden** | **Boolean**| If &#39;true&#39;, include hidden issues in search results. If &#39;false&#39;, exclude hidden issues from search results. If no options are set, use application version profile settings to get value of this option. | [optional] [default to false]
 **showremoved** | **Boolean**| If &#39;true&#39;, include removed issues in search results. If &#39;false&#39;, exclude removed issues from search results. If no options are set, use application version profile settings to get value of this option. | [optional] [default to false]
 **showsuppressed** | **Boolean**| If &#39;true&#39;, include suppressed issues in search results. If &#39;false&#39;, exclude suppressed issues from search results. If no options are set, use application version profile settings to get value of this option. | [optional] [default to false]
 **showshortfilenames** | **Boolean**| If &#39;true&#39;, only short file names will be displayed in issues list. | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **groupingtype** | **String**| groupingtype | [optional]

### Return type

[**ApiResultListProjectVersionIssueGroup**](ApiResultListProjectVersionIssueGroup.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

