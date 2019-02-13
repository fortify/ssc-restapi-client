# ParserPluginImageControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getParserPluginImage**](ParserPluginImageControllerApi.md#getParserPluginImage) | **GET** /pluginimage/parser | get


<a name="getParserPluginImage"></a>
# **getParserPluginImage**
> byte[] getParserPluginImage(imageType, engineType, dataVersion)

get

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ParserPluginImageControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ParserPluginImageControllerApi apiInstance = new ParserPluginImageControllerApi();
String imageType = "imageType_example"; // String | imageType
String engineType = "engineType_example"; // String | engineType
Long dataVersion = 789L; // Long | dataVersion
try {
    byte[] result = apiInstance.getParserPluginImage(imageType, engineType, dataVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParserPluginImageControllerApi#getParserPluginImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageType** | **String**| imageType |
 **engineType** | **String**| engineType |
 **dataVersion** | **Long**| dataVersion |

### Return type

**byte[]**

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/png

