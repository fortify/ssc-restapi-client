# IssueStatisticsOfProjectVersionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listIssueStatisticsOfProjectVersion**](IssueStatisticsOfProjectVersionControllerApi.md#listIssueStatisticsOfProjectVersion) | **GET** /projectVersions/{parentId}/issueStatistics | list


<a name="listIssueStatisticsOfProjectVersion"></a>
# **listIssueStatisticsOfProjectVersion**
> ApiResultListIssueStatistics listIssueStatisticsOfProjectVersion(parentId, filterset)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueStatisticsOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueStatisticsOfProjectVersionControllerApi apiInstance = new IssueStatisticsOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String filterset = "filterset_example"; // String | Filter set to use
try {
    ApiResultListIssueStatistics result = apiInstance.listIssueStatisticsOfProjectVersion(parentId, filterset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueStatisticsOfProjectVersionControllerApi#listIssueStatisticsOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **filterset** | **String**| Filter set to use | [optional]

### Return type

[**ApiResultListIssueStatistics**](ApiResultListIssueStatistics.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

