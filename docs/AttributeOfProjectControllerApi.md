# AttributeOfProjectControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAttributeOfProject**](AttributeOfProjectControllerApi.md#createAttributeOfProject) | **POST** /projects/{parentId}/attributes | create
[**listAttributeOfProject**](AttributeOfProjectControllerApi.md#listAttributeOfProject) | **GET** /projects/{parentId}/attributes | list
[**readAttributeOfProject**](AttributeOfProjectControllerApi.md#readAttributeOfProject) | **GET** /projects/{parentId}/attributes/{id} | read
[**updateCollectionAttributeOfProject**](AttributeOfProjectControllerApi.md#updateCollectionAttributeOfProject) | **PUT** /projects/{parentId}/attributes | updateCollection


<a name="createAttributeOfProject"></a>
# **createAttributeOfProject**
> ApiResultAttribute createAttributeOfProject(parentId, data)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AttributeOfProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AttributeOfProjectControllerApi apiInstance = new AttributeOfProjectControllerApi();
Long parentId = 789L; // Long | parentId
Attribute data = new Attribute(); // Attribute | data
try {
    ApiResultAttribute result = apiInstance.createAttributeOfProject(parentId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeOfProjectControllerApi#createAttributeOfProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **data** | [**Attribute**](Attribute.md)| data |

### Return type

[**ApiResultAttribute**](ApiResultAttribute.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAttributeOfProject"></a>
# **listAttributeOfProject**
> ApiResultListAttribute listAttributeOfProject(parentId, fields, start, limit)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AttributeOfProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AttributeOfProjectControllerApi apiInstance = new AttributeOfProjectControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
try {
    ApiResultListAttribute result = apiInstance.listAttributeOfProject(parentId, fields, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeOfProjectControllerApi#listAttributeOfProject");
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

### Return type

[**ApiResultListAttribute**](ApiResultListAttribute.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readAttributeOfProject"></a>
# **readAttributeOfProject**
> ApiResultAttribute readAttributeOfProject(parentId, id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AttributeOfProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AttributeOfProjectControllerApi apiInstance = new AttributeOfProjectControllerApi();
Long parentId = 789L; // Long | parentId
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultAttribute result = apiInstance.readAttributeOfProject(parentId, id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeOfProjectControllerApi#readAttributeOfProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultAttribute**](ApiResultAttribute.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCollectionAttributeOfProject"></a>
# **updateCollectionAttributeOfProject**
> ApiResultListAttribute updateCollectionAttributeOfProject(parentId, resources)

updateCollection

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AttributeOfProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AttributeOfProjectControllerApi apiInstance = new AttributeOfProjectControllerApi();
Long parentId = 789L; // Long | parentId
List<Attribute> resources = Arrays.asList(new Attribute()); // List<Attribute> | resources
try {
    ApiResultListAttribute result = apiInstance.updateCollectionAttributeOfProject(parentId, resources);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeOfProjectControllerApi#updateCollectionAttributeOfProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resources** | [**List&lt;Attribute&gt;**](Attribute.md)| resources |

### Return type

[**ApiResultListAttribute**](ApiResultListAttribute.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

