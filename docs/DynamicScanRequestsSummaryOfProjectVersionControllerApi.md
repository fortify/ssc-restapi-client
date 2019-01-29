# DynamicScanRequestsSummaryOfProjectVersionControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDynamicScanRequestsSummaryOfProjectVersion**](DynamicScanRequestsSummaryOfProjectVersionControllerApi.md#getDynamicScanRequestsSummaryOfProjectVersion) | **GET** /projectVersions/{parentId}/dynamicScanRequestsSummary | get


<a name="getDynamicScanRequestsSummaryOfProjectVersion"></a>
# **getDynamicScanRequestsSummaryOfProjectVersion**
> ApiResultDynamicScanRequestsSummary getDynamicScanRequestsSummaryOfProjectVersion(parentId)

get

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.DynamicScanRequestsSummaryOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

DynamicScanRequestsSummaryOfProjectVersionControllerApi apiInstance = new DynamicScanRequestsSummaryOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
try {
    ApiResultDynamicScanRequestsSummary result = apiInstance.getDynamicScanRequestsSummaryOfProjectVersion(parentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamicScanRequestsSummaryOfProjectVersionControllerApi#getDynamicScanRequestsSummaryOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |

### Return type

[**ApiResultDynamicScanRequestsSummary**](ApiResultDynamicScanRequestsSummary.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

