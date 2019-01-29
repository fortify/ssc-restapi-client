# IssueSelectorSetOfProjectVersionControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIssueSelectorSetOfProjectVersion**](IssueSelectorSetOfProjectVersionControllerApi.md#getIssueSelectorSetOfProjectVersion) | **GET** /projectVersions/{parentId}/issueSelectorSet | get


<a name="getIssueSelectorSetOfProjectVersion"></a>
# **getIssueSelectorSetOfProjectVersion**
> ApiResultIssueFilterSelectorSet getIssueSelectorSetOfProjectVersion(parentId, fields)

get

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueSelectorSetOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueSelectorSetOfProjectVersionControllerApi apiInstance = new IssueSelectorSetOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
try {
    ApiResultIssueFilterSelectorSet result = apiInstance.getIssueSelectorSetOfProjectVersion(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueSelectorSetOfProjectVersionControllerApi#getIssueSelectorSetOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultIssueFilterSelectorSet**](ApiResultIssueFilterSelectorSet.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

