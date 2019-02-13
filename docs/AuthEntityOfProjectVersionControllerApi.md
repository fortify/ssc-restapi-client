# AuthEntityOfProjectVersionControllerApi

All URIs are relative to *https://SSC:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAuthEntityOfProjectVersion**](AuthEntityOfProjectVersionControllerApi.md#listAuthEntityOfProjectVersion) | **GET** /projectVersions/{parentId}/authEntities | list
[**readAuthEntityOfProjectVersion**](AuthEntityOfProjectVersionControllerApi.md#readAuthEntityOfProjectVersion) | **GET** /projectVersions/{parentId}/authEntities/{id} | read
[**updateCollectionAuthEntityOfProjectVersion**](AuthEntityOfProjectVersionControllerApi.md#updateCollectionAuthEntityOfProjectVersion) | **PUT** /projectVersions/{parentId}/authEntities | updateCollection


<a name="listAuthEntityOfProjectVersion"></a>
# **listAuthEntityOfProjectVersion**
> ApiResultListAuthenticationEntity listAuthEntityOfProjectVersion(parentId, fields, embed, extractusersfromgroups, includeuniversalaccessentities, entityname)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuthEntityOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AuthEntityOfProjectVersionControllerApi apiInstance = new AuthEntityOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
String embed = "embed_example"; // String | Fields to embed
Boolean extractusersfromgroups = true; // Boolean | extractusersfromgroups
Boolean includeuniversalaccessentities = true; // Boolean | includeuniversalaccessentities
String entityname = "entityname_example"; // String | entityname
try {
    ApiResultListAuthenticationEntity result = apiInstance.listAuthEntityOfProjectVersion(parentId, fields, embed, extractusersfromgroups, includeuniversalaccessentities, entityname);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthEntityOfProjectVersionControllerApi#listAuthEntityOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **fields** | **String**| Output fields | [optional]
 **embed** | **String**| Fields to embed | [optional]
 **extractusersfromgroups** | **Boolean**| extractusersfromgroups | [optional]
 **includeuniversalaccessentities** | **Boolean**| includeuniversalaccessentities | [optional]
 **entityname** | **String**| entityname | [optional]

### Return type

[**ApiResultListAuthenticationEntity**](ApiResultListAuthenticationEntity.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readAuthEntityOfProjectVersion"></a>
# **readAuthEntityOfProjectVersion**
> ApiResultAuthenticationEntity readAuthEntityOfProjectVersion(parentId, id, fields, embed)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuthEntityOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AuthEntityOfProjectVersionControllerApi apiInstance = new AuthEntityOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
String embed = "embed_example"; // String | Fields to embed
try {
    ApiResultAuthenticationEntity result = apiInstance.readAuthEntityOfProjectVersion(parentId, id, fields, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthEntityOfProjectVersionControllerApi#readAuthEntityOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **id** | **Long**| id |
 **fields** | **String**| Output fields | [optional]
 **embed** | **String**| Fields to embed | [optional]

### Return type

[**ApiResultAuthenticationEntity**](ApiResultAuthenticationEntity.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCollectionAuthEntityOfProjectVersion"></a>
# **updateCollectionAuthEntityOfProjectVersion**
> ApiResultListAuthenticationEntity updateCollectionAuthEntityOfProjectVersion(parentId, data)

updateCollection

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.AuthEntityOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

AuthEntityOfProjectVersionControllerApi apiInstance = new AuthEntityOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
List<AuthenticationEntity> data = Arrays.asList(new AuthenticationEntity()); // List<AuthenticationEntity> | data
try {
    ApiResultListAuthenticationEntity result = apiInstance.updateCollectionAuthEntityOfProjectVersion(parentId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthEntityOfProjectVersionControllerApi#updateCollectionAuthEntityOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **data** | [**List&lt;AuthenticationEntity&gt;**](AuthenticationEntity.md)| data |

### Return type

[**ApiResultListAuthenticationEntity**](ApiResultListAuthenticationEntity.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

