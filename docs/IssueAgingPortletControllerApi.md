# IssueAgingPortletControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIssueAgingPortlet**](IssueAgingPortletControllerApi.md#getIssueAgingPortlet) | **GET** /portlets/issueaging | get


<a name="getIssueAgingPortlet"></a>
# **getIssueAgingPortlet**
> ApiResultIssueAgingPortlet getIssueAgingPortlet()

get

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueAgingPortletControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueAgingPortletControllerApi apiInstance = new IssueAgingPortletControllerApi();
try {
    ApiResultIssueAgingPortlet result = apiInstance.getIssueAgingPortlet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueAgingPortletControllerApi#getIssueAgingPortlet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResultIssueAgingPortlet**](ApiResultIssueAgingPortlet.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

