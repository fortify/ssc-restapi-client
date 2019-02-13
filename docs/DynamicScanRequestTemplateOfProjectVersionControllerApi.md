# DynamicScanRequestTemplateOfProjectVersionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDynamicScanRequestTemplateOfProjectVersion**](DynamicScanRequestTemplateOfProjectVersionControllerApi.md#getDynamicScanRequestTemplateOfProjectVersion) | **GET** /projectVersions/{parentId}/dynamicScanRequestTemplate | get


<a name="getDynamicScanRequestTemplateOfProjectVersion"></a>
# **getDynamicScanRequestTemplateOfProjectVersion**
> ApiResultDynamicScanRequestTemplate getDynamicScanRequestTemplateOfProjectVersion(parentId)

get

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.DynamicScanRequestTemplateOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

DynamicScanRequestTemplateOfProjectVersionControllerApi apiInstance = new DynamicScanRequestTemplateOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
try {
    ApiResultDynamicScanRequestTemplate result = apiInstance.getDynamicScanRequestTemplateOfProjectVersion(parentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamicScanRequestTemplateOfProjectVersionControllerApi#getDynamicScanRequestTemplateOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |

### Return type

[**ApiResultDynamicScanRequestTemplate**](ApiResultDynamicScanRequestTemplate.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

