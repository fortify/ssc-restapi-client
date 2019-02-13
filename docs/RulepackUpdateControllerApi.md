# RulepackUpdateControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listRulepackUpdate**](RulepackUpdateControllerApi.md#listRulepackUpdate) | **GET** /updateRulepacks | list


<a name="listRulepackUpdate"></a>
# **listRulepackUpdate**
> ApiResultListRulepacksBatchProcessStatus listRulepackUpdate()

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.RulepackUpdateControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

RulepackUpdateControllerApi apiInstance = new RulepackUpdateControllerApi();
try {
    ApiResultListRulepacksBatchProcessStatus result = apiInstance.listRulepackUpdate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RulepackUpdateControllerApi#listRulepackUpdate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResultListRulepacksBatchProcessStatus**](ApiResultListRulepacksBatchProcessStatus.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

