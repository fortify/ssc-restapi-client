# CloudPoolMappingControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mapByVersionIdCloudPoolMapping**](CloudPoolMappingControllerApi.md#mapByVersionIdCloudPoolMapping) | **GET** /cloudmappings/mapByVersionId | mapByVersionId
[**mapByVersionIdsCloudPoolMapping**](CloudPoolMappingControllerApi.md#mapByVersionIdsCloudPoolMapping) | **POST** /cloudmappings/mapByVersionIds | mapByVersionIds
[**mapByVersionNameCloudPoolMapping**](CloudPoolMappingControllerApi.md#mapByVersionNameCloudPoolMapping) | **GET** /cloudmappings/mapByVersionName | mapByVersionName


<a name="mapByVersionIdCloudPoolMapping"></a>
# **mapByVersionIdCloudPoolMapping**
> ApiResultCloudPoolMapping mapByVersionIdCloudPoolMapping(projectVersionId)

mapByVersionId

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudPoolMappingControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudPoolMappingControllerApi apiInstance = new CloudPoolMappingControllerApi();
Long projectVersionId = 789L; // Long | projectVersionId
try {
    ApiResultCloudPoolMapping result = apiInstance.mapByVersionIdCloudPoolMapping(projectVersionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudPoolMappingControllerApi#mapByVersionIdCloudPoolMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectVersionId** | **Long**| projectVersionId |

### Return type

[**ApiResultCloudPoolMapping**](ApiResultCloudPoolMapping.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mapByVersionIdsCloudPoolMapping"></a>
# **mapByVersionIdsCloudPoolMapping**
> ApiResultListCloudPoolMapping mapByVersionIdsCloudPoolMapping(projectVersionIds)

mapByVersionIds

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudPoolMappingControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudPoolMappingControllerApi apiInstance = new CloudPoolMappingControllerApi();
List<Long> projectVersionIds = Arrays.asList(new List<Long>()); // List<Long> | projectVersionIds
try {
    ApiResultListCloudPoolMapping result = apiInstance.mapByVersionIdsCloudPoolMapping(projectVersionIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudPoolMappingControllerApi#mapByVersionIdsCloudPoolMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectVersionIds** | **List&lt;Long&gt;**| projectVersionIds |

### Return type

[**ApiResultListCloudPoolMapping**](ApiResultListCloudPoolMapping.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mapByVersionNameCloudPoolMapping"></a>
# **mapByVersionNameCloudPoolMapping**
> ApiResultCloudPoolMapping mapByVersionNameCloudPoolMapping(projectName, projectVersionName)

mapByVersionName

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudPoolMappingControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudPoolMappingControllerApi apiInstance = new CloudPoolMappingControllerApi();
String projectName = "projectName_example"; // String | projectName
String projectVersionName = "projectVersionName_example"; // String | projectVersionName
try {
    ApiResultCloudPoolMapping result = apiInstance.mapByVersionNameCloudPoolMapping(projectName, projectVersionName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudPoolMappingControllerApi#mapByVersionNameCloudPoolMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectName** | **String**| projectName |
 **projectVersionName** | **String**| projectVersionName |

### Return type

[**ApiResultCloudPoolMapping**](ApiResultCloudPoolMapping.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

