# FolderOfProjectVersionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listFolderOfProjectVersion**](FolderOfProjectVersionControllerApi.md#listFolderOfProjectVersion) | **GET** /projectVersions/{parentId}/folders | list
[**readFolderOfProjectVersion**](FolderOfProjectVersionControllerApi.md#readFolderOfProjectVersion) | **GET** /projectVersions/{parentId}/folders/{id} | read


<a name="listFolderOfProjectVersion"></a>
# **listFolderOfProjectVersion**
> ApiResultListFolder listFolderOfProjectVersion(parentId)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.FolderOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

FolderOfProjectVersionControllerApi apiInstance = new FolderOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
try {
    ApiResultListFolder result = apiInstance.listFolderOfProjectVersion(parentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FolderOfProjectVersionControllerApi#listFolderOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |

### Return type

[**ApiResultListFolder**](ApiResultListFolder.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readFolderOfProjectVersion"></a>
# **readFolderOfProjectVersion**
> ApiResultFolder readFolderOfProjectVersion(parentId, id)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.FolderOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

FolderOfProjectVersionControllerApi apiInstance = new FolderOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
Long id = 789L; // Long | id
try {
    ApiResultFolder result = apiInstance.readFolderOfProjectVersion(parentId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FolderOfProjectVersionControllerApi#readFolderOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **id** | **Long**| id |

### Return type

[**ApiResultFolder**](ApiResultFolder.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

