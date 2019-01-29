# PermissionOfRoleControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPermissionOfRole**](PermissionOfRoleControllerApi.md#listPermissionOfRole) | **GET** /roles/{parentId}/permissions | list


<a name="listPermissionOfRole"></a>
# **listPermissionOfRole**
> ApiResultListPermission listPermissionOfRole(parentId, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.PermissionOfRoleControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

PermissionOfRoleControllerApi apiInstance = new PermissionOfRoleControllerApi();
String parentId = "parentId_example"; // String | parentId
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListPermission result = apiInstance.listPermissionOfRole(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionOfRoleControllerApi#listPermissionOfRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **String**| parentId |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListPermission**](ApiResultListPermission.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

