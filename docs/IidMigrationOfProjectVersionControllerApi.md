# IidMigrationOfProjectVersionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIidMigrationOfProjectVersion**](IidMigrationOfProjectVersionControllerApi.md#createIidMigrationOfProjectVersion) | **POST** /projectVersions/{parentId}/iidMigrations | create
[**listIidMigrationOfProjectVersion**](IidMigrationOfProjectVersionControllerApi.md#listIidMigrationOfProjectVersion) | **GET** /projectVersions/{parentId}/iidMigrations | list


<a name="createIidMigrationOfProjectVersion"></a>
# **createIidMigrationOfProjectVersion**
> ApiResultIIDMigration createIidMigrationOfProjectVersion(parentId, data)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IidMigrationOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IidMigrationOfProjectVersionControllerApi apiInstance = new IidMigrationOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
IIDMigration data = new IIDMigration(); // IIDMigration | data
try {
    ApiResultIIDMigration result = apiInstance.createIidMigrationOfProjectVersion(parentId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IidMigrationOfProjectVersionControllerApi#createIidMigrationOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **data** | [**IIDMigration**](IIDMigration.md)| data |

### Return type

[**ApiResultIIDMigration**](ApiResultIIDMigration.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listIidMigrationOfProjectVersion"></a>
# **listIidMigrationOfProjectVersion**
> ApiResultListIIDMigration listIidMigrationOfProjectVersion(parentId, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IidMigrationOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IidMigrationOfProjectVersionControllerApi apiInstance = new IidMigrationOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListIIDMigration result = apiInstance.listIidMigrationOfProjectVersion(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IidMigrationOfProjectVersionControllerApi#listIidMigrationOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListIIDMigration**](ApiResultListIIDMigration.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

