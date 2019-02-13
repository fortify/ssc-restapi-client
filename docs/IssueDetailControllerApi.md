# IssueDetailControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listIssueDetail**](IssueDetailControllerApi.md#listIssueDetail) | **GET** /issueDetails | list
[**readIssueDetail**](IssueDetailControllerApi.md#readIssueDetail) | **GET** /issueDetails/{id} | read


<a name="listIssueDetail"></a>
# **listIssueDetail**
> ApiResultListProjectVersionIssueDetails listIssueDetail(projectName, projectVersionName, instanceId)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueDetailControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueDetailControllerApi apiInstance = new IssueDetailControllerApi();
String projectName = "projectName_example"; // String | projectName
String projectVersionName = "projectVersionName_example"; // String | projectVersionName
String instanceId = "instanceId_example"; // String | instanceId
try {
    ApiResultListProjectVersionIssueDetails result = apiInstance.listIssueDetail(projectName, projectVersionName, instanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueDetailControllerApi#listIssueDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectName** | **String**| projectName |
 **projectVersionName** | **String**| projectVersionName |
 **instanceId** | **String**| instanceId |

### Return type

[**ApiResultListProjectVersionIssueDetails**](ApiResultListProjectVersionIssueDetails.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readIssueDetail"></a>
# **readIssueDetail**
> ApiResultProjectVersionIssueDetails readIssueDetail(id, filterset)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueDetailControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueDetailControllerApi apiInstance = new IssueDetailControllerApi();
Long id = 789L; // Long | id
String filterset = "filterset_example"; // String | Filter set to use
try {
    ApiResultProjectVersionIssueDetails result = apiInstance.readIssueDetail(id, filterset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueDetailControllerApi#readIssueDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **filterset** | **String**| Filter set to use | [optional]

### Return type

[**ApiResultProjectVersionIssueDetails**](ApiResultProjectVersionIssueDetails.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

