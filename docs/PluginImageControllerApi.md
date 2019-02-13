# PluginImageControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPluginImage**](PluginImageControllerApi.md#getPluginImage) | **GET** /pluginimage | get


<a name="getPluginImage"></a>
# **getPluginImage**
> byte[] getPluginImage(imageType, metadataId)

get

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.PluginImageControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

PluginImageControllerApi apiInstance = new PluginImageControllerApi();
String imageType = "imageType_example"; // String | imageType
Long metadataId = 789L; // Long | metadataId
try {
    byte[] result = apiInstance.getPluginImage(imageType, metadataId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PluginImageControllerApi#getPluginImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageType** | **String**| imageType |
 **metadataId** | **Long**| metadataId |

### Return type

**byte[]**

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/png

