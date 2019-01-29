# CloudPoolControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCloudPool**](CloudPoolControllerApi.md#createCloudPool) | **POST** /cloudpools | create
[**deleteCloudPool**](CloudPoolControllerApi.md#deleteCloudPool) | **DELETE** /cloudpools/{uuid} | delete
[**listCloudPool**](CloudPoolControllerApi.md#listCloudPool) | **GET** /cloudpools | list
[**readCloudPool**](CloudPoolControllerApi.md#readCloudPool) | **GET** /cloudpools/{uuid} | read
[**updateCloudPool**](CloudPoolControllerApi.md#updateCloudPool) | **PUT** /cloudpools/{uuid} | update


<a name="createCloudPool"></a>
# **createCloudPool**
> ApiResultCloudPool createCloudPool(resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudPoolControllerApi apiInstance = new CloudPoolControllerApi();
CloudPool resource = new CloudPool(); // CloudPool | resource
try {
    ApiResultCloudPool result = apiInstance.createCloudPool(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudPoolControllerApi#createCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**CloudPool**](CloudPool.md)| resource |

### Return type

[**ApiResultCloudPool**](ApiResultCloudPool.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCloudPool"></a>
# **deleteCloudPool**
> ApiResultVoid deleteCloudPool(uuid)

delete

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudPoolControllerApi apiInstance = new CloudPoolControllerApi();
String uuid = "uuid_example"; // String | uuid
try {
    ApiResultVoid result = apiInstance.deleteCloudPool(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudPoolControllerApi#deleteCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| uuid |

### Return type

[**ApiResultVoid**](ApiResultVoid.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCloudPool"></a>
# **listCloudPool**
> ApiResultListCloudPool listCloudPool(fields, start, limit, q, fulltextsearch, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudPoolControllerApi apiInstance = new CloudPoolControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search-spec of full text search query (see fulltextsearch parameter)
Boolean fulltextsearch = false; // Boolean | If 'true', interpret 'q' parameter as full text search query, defaults to 'false'
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListCloudPool result = apiInstance.listCloudPool(fields, start, limit, q, fulltextsearch, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudPoolControllerApi#listCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Output fields | [optional]
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| A search-spec of full text search query (see fulltextsearch parameter) | [optional]
 **fulltextsearch** | **Boolean**| If &#39;true&#39;, interpret &#39;q&#39; parameter as full text search query, defaults to &#39;false&#39; | [optional] [default to false]
 **orderby** | **String**| Fields to order by | [optional]

### Return type

[**ApiResultListCloudPool**](ApiResultListCloudPool.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readCloudPool"></a>
# **readCloudPool**
> ApiResultCloudPool readCloudPool(uuid, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudPoolControllerApi apiInstance = new CloudPoolControllerApi();
String uuid = "uuid_example"; // String | uuid
String fields = "fields_example"; // String | Output fields
try {
    ApiResultCloudPool result = apiInstance.readCloudPool(uuid, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudPoolControllerApi#readCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| uuid |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultCloudPool**](ApiResultCloudPool.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCloudPool"></a>
# **updateCloudPool**
> ApiResultCloudPool updateCloudPool(uuid, resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.CloudPoolControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

CloudPoolControllerApi apiInstance = new CloudPoolControllerApi();
String uuid = "uuid_example"; // String | uuid
CloudPool resource = new CloudPool(); // CloudPool | resource
try {
    ApiResultCloudPool result = apiInstance.updateCloudPool(uuid, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudPoolControllerApi#updateCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| uuid |
 **resource** | [**CloudPool**](CloudPool.md)| resource |

### Return type

[**ApiResultCloudPool**](ApiResultCloudPool.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

