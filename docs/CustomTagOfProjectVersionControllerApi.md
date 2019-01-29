# CustomTagOfProjectVersionControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomTagOfProjectVersion**](CustomTagOfProjectVersionControllerApi.md#createCustomTagOfProjectVersion) | **POST** /projectVersions/{parentId}/customTags | create
[**listCustomTagOfProjectVersion**](CustomTagOfProjectVersionControllerApi.md#listCustomTagOfProjectVersion) | **GET** /projectVersions/{parentId}/customTags | list
[**updateCollectionCustomTagOfProjectVersion**](CustomTagOfProjectVersionControllerApi.md#updateCollectionCustomTagOfProjectVersion) | **PUT** /projectVersions/{parentId}/customTags | updateCollection
[**updateCustomTagOfProjectVersion**](CustomTagOfProjectVersionControllerApi.md#updateCustomTagOfProjectVersion) | **PUT** /projectVersions/{parentId}/customTags/{id} | update


<a name="createCustomTagOfProjectVersion"></a>
# **createCustomTagOfProjectVersion**
> ApiResultCustomTag createCustomTagOfProjectVersion(parentId, resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CustomTagOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CustomTagOfProjectVersionControllerApi apiInstance = new CustomTagOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
CustomTag resource = new CustomTag(); // CustomTag | resource
try {
    ApiResultCustomTag result = apiInstance.createCustomTagOfProjectVersion(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomTagOfProjectVersionControllerApi#createCustomTagOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resource** | [**CustomTag**](CustomTag.md)| resource |

### Return type

[**ApiResultCustomTag**](ApiResultCustomTag.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCustomTagOfProjectVersion"></a>
# **listCustomTagOfProjectVersion**
> ApiResultListCustomTag listCustomTagOfProjectVersion(parentId, fields, start, limit, q, orderby, includeall)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CustomTagOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CustomTagOfProjectVersionControllerApi apiInstance = new CustomTagOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search query
String orderby = "orderby_example"; // String | Fields to order by
Boolean includeall = false; // Boolean | includeall
try {
    ApiResultListCustomTag result = apiInstance.listCustomTagOfProjectVersion(parentId, fields, start, limit, q, orderby, includeall);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomTagOfProjectVersionControllerApi#listCustomTagOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search query | [optional]
 **orderby** | **String**| Fields to order by | [optional]
 **includeall** | **Boolean**| includeall | [optional] [default to false]

### Return type

[**ApiResultListCustomTag**](ApiResultListCustomTag.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCollectionCustomTagOfProjectVersion"></a>
# **updateCollectionCustomTagOfProjectVersion**
> ApiResultListCustomTag updateCollectionCustomTagOfProjectVersion(parentId, data)

updateCollection

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CustomTagOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CustomTagOfProjectVersionControllerApi apiInstance = new CustomTagOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
List<CustomTag> data = Arrays.asList(new CustomTag()); // List<CustomTag> | data
try {
    ApiResultListCustomTag result = apiInstance.updateCollectionCustomTagOfProjectVersion(parentId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomTagOfProjectVersionControllerApi#updateCollectionCustomTagOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **data** | [**List&lt;CustomTag&gt;**](CustomTag.md)| data |

### Return type

[**ApiResultListCustomTag**](ApiResultListCustomTag.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomTagOfProjectVersion"></a>
# **updateCustomTagOfProjectVersion**
> ApiResultCustomTag updateCustomTagOfProjectVersion(parentId, id, data)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CustomTagOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CustomTagOfProjectVersionControllerApi apiInstance = new CustomTagOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
Long id = 789L; // Long | id
CustomTag data = new CustomTag(); // CustomTag | data
try {
    ApiResultCustomTag result = apiInstance.updateCustomTagOfProjectVersion(parentId, id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomTagOfProjectVersionControllerApi#updateCustomTagOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **id** | **Long**| id |
 **data** | [**CustomTag**](CustomTag.md)| data |

### Return type

[**ApiResultCustomTag**](ApiResultCustomTag.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

