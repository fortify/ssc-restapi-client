# ResultProcessingRuleOfProjectVersionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listResultProcessingRuleOfProjectVersion**](ResultProcessingRuleOfProjectVersionControllerApi.md#listResultProcessingRuleOfProjectVersion) | **GET** /projectVersions/{parentId}/resultProcessingRules | list
[**updateCollectionResultProcessingRuleOfProjectVersion**](ResultProcessingRuleOfProjectVersionControllerApi.md#updateCollectionResultProcessingRuleOfProjectVersion) | **PUT** /projectVersions/{parentId}/resultProcessingRules | updateCollection


<a name="listResultProcessingRuleOfProjectVersion"></a>
# **listResultProcessingRuleOfProjectVersion**
> ApiResultListResultProcessingRule listResultProcessingRuleOfProjectVersion(parentId, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ResultProcessingRuleOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ResultProcessingRuleOfProjectVersionControllerApi apiInstance = new ResultProcessingRuleOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListResultProcessingRule result = apiInstance.listResultProcessingRuleOfProjectVersion(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultProcessingRuleOfProjectVersionControllerApi#listResultProcessingRuleOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListResultProcessingRule**](ApiResultListResultProcessingRule.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCollectionResultProcessingRuleOfProjectVersion"></a>
# **updateCollectionResultProcessingRuleOfProjectVersion**
> ApiResultListResultProcessingRule updateCollectionResultProcessingRuleOfProjectVersion(parentId, data)

updateCollection

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ResultProcessingRuleOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ResultProcessingRuleOfProjectVersionControllerApi apiInstance = new ResultProcessingRuleOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
List<ResultProcessingRule> data = Arrays.asList(new ResultProcessingRule()); // List<ResultProcessingRule> | data
try {
    ApiResultListResultProcessingRule result = apiInstance.updateCollectionResultProcessingRuleOfProjectVersion(parentId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultProcessingRuleOfProjectVersionControllerApi#updateCollectionResultProcessingRuleOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **data** | [**List&lt;ResultProcessingRule&gt;**](ResultProcessingRule.md)| data |

### Return type

[**ApiResultListResultProcessingRule**](ApiResultListResultProcessingRule.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

