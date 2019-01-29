# ProjectVersionOfProjectControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProjectVersionOfProject**](ProjectVersionOfProjectControllerApi.md#createProjectVersionOfProject) | **POST** /projects/{parentId}/versions | create
[**listProjectVersionOfProject**](ProjectVersionOfProjectControllerApi.md#listProjectVersionOfProject) | **GET** /projects/{parentId}/versions | list


<a name="createProjectVersionOfProject"></a>
# **createProjectVersionOfProject**
> ApiResultProjectVersion createProjectVersionOfProject(parentId, resource)

create

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionOfProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionOfProjectControllerApi apiInstance = new ProjectVersionOfProjectControllerApi();
Long parentId = 789L; // Long | parentId
ProjectVersion resource = new ProjectVersion(); // ProjectVersion | resource
try {
    ApiResultProjectVersion result = apiInstance.createProjectVersionOfProject(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionOfProjectControllerApi#createProjectVersionOfProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resource** | [**ProjectVersion**](ProjectVersion.md)| resource |

### Return type

[**ApiResultProjectVersion**](ApiResultProjectVersion.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProjectVersionOfProject"></a>
# **listProjectVersionOfProject**
> ApiResultListProjectVersion listProjectVersionOfProject(parentId, fields, start, limit, q, fulltextsearch, orderby, includeInactive, myAssignedIssues)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ProjectVersionOfProjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ProjectVersionOfProjectControllerApi apiInstance = new ProjectVersionOfProjectControllerApi();
Long parentId = 789L; // Long | parentId
String fields = "fields_example"; // String | Output fields
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | A search-spec of full text search query (see fulltextsearch parameter)
Boolean fulltextsearch = false; // Boolean | If 'true', interpret 'q' parameter as full text search query, defaults to 'false'
String orderby = "orderby_example"; // String | Fields to order by
Boolean includeInactive = false; // Boolean | includeInactive
Boolean myAssignedIssues = false; // Boolean | myAssignedIssues
try {
    ApiResultListProjectVersion result = apiInstance.listProjectVersionOfProject(parentId, fields, start, limit, q, fulltextsearch, orderby, includeInactive, myAssignedIssues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectVersionOfProjectControllerApi#listProjectVersionOfProject");
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
 **q** | **String**| A search-spec of full text search query (see fulltextsearch parameter) | [optional]
 **fulltextsearch** | **Boolean**| If &#39;true&#39;, interpret &#39;q&#39; parameter as full text search query, defaults to &#39;false&#39; | [optional] [default to false]
 **orderby** | **String**| Fields to order by | [optional]
 **includeInactive** | **Boolean**| includeInactive | [optional] [default to false]
 **myAssignedIssues** | **Boolean**| myAssignedIssues | [optional] [default to false]

### Return type

[**ApiResultListProjectVersion**](ApiResultListProjectVersion.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

