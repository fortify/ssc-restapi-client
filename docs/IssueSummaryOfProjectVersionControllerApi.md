# IssueSummaryOfProjectVersionControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listIssueSummaryOfProjectVersion**](IssueSummaryOfProjectVersionControllerApi.md#listIssueSummaryOfProjectVersion) | **GET** /projectVersions/{parentId}/issueSummaries | list


<a name="listIssueSummaryOfProjectVersion"></a>
# **listIssueSummaryOfProjectVersion**
> ApiResultListIssueSummary listIssueSummaryOfProjectVersion(parentId, seriestype, groupaxistype, audited, filter, showhidden, showremoved, showsuppressed)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueSummaryOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueSummaryOfProjectVersionControllerApi apiInstance = new IssueSummaryOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String seriestype = "seriestype_example"; // String | seriestype
String groupaxistype = "groupaxistype_example"; // String | groupaxistype
String audited = "audited_example"; // String | audited
String filter = "filter_example"; // String | filter
Boolean showhidden = true; // Boolean | showhidden
Boolean showremoved = true; // Boolean | showremoved
Boolean showsuppressed = true; // Boolean | showsuppressed
try {
    ApiResultListIssueSummary result = apiInstance.listIssueSummaryOfProjectVersion(parentId, seriestype, groupaxistype, audited, filter, showhidden, showremoved, showsuppressed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueSummaryOfProjectVersionControllerApi#listIssueSummaryOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **seriestype** | **String**| seriestype |
 **groupaxistype** | **String**| groupaxistype |
 **audited** | **String**| audited | [optional]
 **filter** | **String**| filter | [optional]
 **showhidden** | **Boolean**| showhidden | [optional]
 **showremoved** | **Boolean**| showremoved | [optional]
 **showsuppressed** | **Boolean**| showsuppressed | [optional]

### Return type

[**ApiResultListIssueSummary**](ApiResultListIssueSummary.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

