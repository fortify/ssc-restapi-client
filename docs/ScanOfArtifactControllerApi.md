# ScanOfArtifactControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listScanOfArtifact**](ScanOfArtifactControllerApi.md#listScanOfArtifact) | **GET** /artifacts/{parentId}/scans | list


<a name="listScanOfArtifact"></a>
# **listScanOfArtifact**
> ApiResultListScan listScanOfArtifact(parentId, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ScanOfArtifactControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ScanOfArtifactControllerApi apiInstance = new ScanOfArtifactControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListScan result = apiInstance.listScanOfArtifact(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanOfArtifactControllerApi#listScanOfArtifact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListScan**](ApiResultListScan.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

