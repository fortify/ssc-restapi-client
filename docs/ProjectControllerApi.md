# ProjectControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**doCollectionActionProject**](ProjectControllerApi.md#doCollectionActionProject) | **POST** /projects/action | doCollectionAction
[**listProject**](ProjectControllerApi.md#listProject) | **GET** /projects | list
[**readProject**](ProjectControllerApi.md#readProject) | **GET** /projects/{id} | read
[**testProject**](ProjectControllerApi.md#testProject) | **POST** /projects/action/test | test
[**updateProject**](ProjectControllerApi.md#updateProject) | **PUT** /projects/{id} | update


<a name="doCollectionActionProject"></a>
# **doCollectionActionProject**
> ApiResultApiActionResponse doCollectionActionProject(apiResourceAction)

doCollectionAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectControllerApi apiInstance = new ProjectControllerApi();
ApiCollectionActionlong apiResourceAction = new ApiCollectionActionlong(); // ApiCollectionActionlong | apiResourceAction
try {
    ApiResultApiActionResponse result = apiInstance.doCollectionActionProject(apiResourceAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectControllerApi#doCollectionActionProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiResourceAction** | [**ApiCollectionActionlong**](ApiCollectionActionlong.md)| apiResourceAction |

### Return type

[**ApiResultApiActionResponse**](ApiResultApiActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProject"></a>
# **listProject**
> ApiResultListProject listProject(fields, start, limit, q, fulltextsearch, orderby)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectControllerApi apiInstance = new ProjectControllerApi();
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search-spec of full text search query (see fulltextsearch parameter)
Boolean fulltextsearch = false; // Boolean | If 'true', interpret 'q' parameter as full text search query, defaults to 'false'
String orderby = "orderby_example"; // String | Fields to order by
try {
    ApiResultListProject result = apiInstance.listProject(fields, start, limit, q, fulltextsearch, orderby);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectControllerApi#listProject");
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

[**ApiResultListProject**](ApiResultListProject.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readProject"></a>
# **readProject**
> ApiResultProject readProject(id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectControllerApi apiInstance = new ProjectControllerApi();
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultProject result = apiInstance.readProject(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectControllerApi#readProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultProject**](ApiResultProject.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testProject"></a>
# **testProject**
> ApiResultApplicationNameTestResponse testProject(resource)

test

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectControllerApi apiInstance = new ProjectControllerApi();
ApplicationNameTestRequest resource = new ApplicationNameTestRequest(); // ApplicationNameTestRequest | resource
try {
    ApiResultApplicationNameTestResponse result = apiInstance.testProject(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectControllerApi#testProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ApplicationNameTestRequest**](ApplicationNameTestRequest.md)| resource |

### Return type

[**ApiResultApplicationNameTestResponse**](ApiResultApplicationNameTestResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProject"></a>
# **updateProject**
> ApiResultProject updateProject(id, data)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectControllerApi apiInstance = new ProjectControllerApi();
Long id = 789L; // Long | id
Project data = new Project(); // Project | data
try {
    ApiResultProject result = apiInstance.updateProject(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectControllerApi#updateProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **data** | [**Project**](Project.md)| data |

### Return type

[**ApiResultProject**](ApiResultProject.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

