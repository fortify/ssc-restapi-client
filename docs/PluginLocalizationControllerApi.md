# PluginLocalizationControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**readPluginLocalization**](PluginLocalizationControllerApi.md#readPluginLocalization) | **GET** /pluginlocalization | read


<a name="readPluginLocalization"></a>
# **readPluginLocalization**
> ApiResultPluginLocalization readPluginLocalization(engineType, dataVersion, language)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.PluginLocalizationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

PluginLocalizationControllerApi apiInstance = new PluginLocalizationControllerApi();
String engineType = "engineType_example"; // String | engineType
Integer dataVersion = 56; // Integer | dataVersion
String language = "language_example"; // String | language
try {
    ApiResultPluginLocalization result = apiInstance.readPluginLocalization(engineType, dataVersion, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PluginLocalizationControllerApi#readPluginLocalization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineType** | **String**| engineType |
 **dataVersion** | **Integer**| dataVersion |
 **language** | **String**| language |

### Return type

[**ApiResultPluginLocalization**](ApiResultPluginLocalization.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

