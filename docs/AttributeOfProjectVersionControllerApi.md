# AttributeOfProjectVersionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAttributeOfProjectVersion**](AttributeOfProjectVersionControllerApi.md#createAttributeOfProjectVersion) | **POST** /projectVersions/{parentId}/attributes | create
[**listAttributeOfProjectVersion**](AttributeOfProjectVersionControllerApi.md#listAttributeOfProjectVersion) | **GET** /projectVersions/{parentId}/attributes | list
[**readAttributeOfProjectVersion**](AttributeOfProjectVersionControllerApi.md#readAttributeOfProjectVersion) | **GET** /projectVersions/{parentId}/attributes/{id} | read
[**updateCollectionAttributeOfProjectVersion**](AttributeOfProjectVersionControllerApi.md#updateCollectionAttributeOfProjectVersion) | **PUT** /projectVersions/{parentId}/attributes | updateCollection


<a name="createAttributeOfProjectVersion"></a>
# **createAttributeOfProjectVersion**
> ApiResultAttribute createAttributeOfProjectVersion(parentId, resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AttributeOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AttributeOfProjectVersionControllerApi apiInstance = new AttributeOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
Attribute resource = new Attribute(); // Attribute | resource
try {
    ApiResultAttribute result = apiInstance.createAttributeOfProjectVersion(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeOfProjectVersionControllerApi#createAttributeOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resource** | [**Attribute**](Attribute.md)| resource |

### Return type

[**ApiResultAttribute**](ApiResultAttribute.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAttributeOfProjectVersion"></a>
# **listAttributeOfProjectVersion**
> ApiResultListAttribute listAttributeOfProjectVersion(parentId, fields)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AttributeOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AttributeOfProjectVersionControllerApi apiInstance = new AttributeOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
try {
    ApiResultListAttribute result = apiInstance.listAttributeOfProjectVersion(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeOfProjectVersionControllerApi#listAttributeOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]

### Return type

[**ApiResultListAttribute**](ApiResultListAttribute.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readAttributeOfProjectVersion"></a>
# **readAttributeOfProjectVersion**
> ApiResultAttribute readAttributeOfProjectVersion(parentId, id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AttributeOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AttributeOfProjectVersionControllerApi apiInstance = new AttributeOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultAttribute result = apiInstance.readAttributeOfProjectVersion(parentId, id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeOfProjectVersionControllerApi#readAttributeOfProjectVersion");
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

<a name="updateCollectionAttributeOfProjectVersion"></a>
# **updateCollectionAttributeOfProjectVersion**
> ApiResultListAttribute updateCollectionAttributeOfProjectVersion(parentId, data)

updateCollection

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AttributeOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AttributeOfProjectVersionControllerApi apiInstance = new AttributeOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
List<Attribute> data = Arrays.asList(new Attribute()); // List<Attribute> | data
try {
    ApiResultListAttribute result = apiInstance.updateCollectionAttributeOfProjectVersion(parentId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeOfProjectVersionControllerApi#updateCollectionAttributeOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **data** | [**List&lt;Attribute&gt;**](Attribute.md)| data |

### Return type

[**ApiResultListAttribute**](ApiResultListAttribute.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

