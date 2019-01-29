# IssueOfProjectVersionControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignUserForIssueOfProjectVersion**](IssueOfProjectVersionControllerApi.md#assignUserForIssueOfProjectVersion) | **POST** /projectVersions/{parentId}/issues/action/assignUser | assignUserFor
[**auditIssueOfProjectVersion**](IssueOfProjectVersionControllerApi.md#auditIssueOfProjectVersion) | **POST** /projectVersions/{parentId}/issues/action/audit | audit
[**doActionIssueOfProjectVersion**](IssueOfProjectVersionControllerApi.md#doActionIssueOfProjectVersion) | **POST** /projectVersions/{parentId}/issues/action | doAction
[**fileBugForIssueOfProjectVersion**](IssueOfProjectVersionControllerApi.md#fileBugForIssueOfProjectVersion) | **POST** /projectVersions/{parentId}/issues/action/fileBug | fileBugFor
[**listIssueOfProjectVersion**](IssueOfProjectVersionControllerApi.md#listIssueOfProjectVersion) | **GET** /projectVersions/{parentId}/issues | list
[**readIssueOfProjectVersion**](IssueOfProjectVersionControllerApi.md#readIssueOfProjectVersion) | **GET** /projectVersions/{parentId}/issues/{id} | read
[**suppressIssueOfProjectVersion**](IssueOfProjectVersionControllerApi.md#suppressIssueOfProjectVersion) | **POST** /projectVersions/{parentId}/issues/action/suppress | suppress
[**updateTagForIssueOfProjectVersion**](IssueOfProjectVersionControllerApi.md#updateTagForIssueOfProjectVersion) | **POST** /projectVersions/{parentId}/issues/action/updateTag | updateTagFor


<a name="assignUserForIssueOfProjectVersion"></a>
# **assignUserForIssueOfProjectVersion**
> ApiResultIssueActionResponse assignUserForIssueOfProjectVersion(parentId, resource)

assignUserFor

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueOfProjectVersionControllerApi apiInstance = new IssueOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
IssueAssignUserRequest resource = new IssueAssignUserRequest(); // IssueAssignUserRequest | resource
try {
    ApiResultIssueActionResponse result = apiInstance.assignUserForIssueOfProjectVersion(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueOfProjectVersionControllerApi#assignUserForIssueOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resource** | [**IssueAssignUserRequest**](IssueAssignUserRequest.md)| resource |

### Return type

[**ApiResultIssueActionResponse**](ApiResultIssueActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="auditIssueOfProjectVersion"></a>
# **auditIssueOfProjectVersion**
> ApiResultIssueActionResponse auditIssueOfProjectVersion(parentId, resource)

audit

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueOfProjectVersionControllerApi apiInstance = new IssueOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
IssueAuditRequest resource = new IssueAuditRequest(); // IssueAuditRequest | resource
try {
    ApiResultIssueActionResponse result = apiInstance.auditIssueOfProjectVersion(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueOfProjectVersionControllerApi#auditIssueOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resource** | [**IssueAuditRequest**](IssueAuditRequest.md)| resource |

### Return type

[**ApiResultIssueActionResponse**](ApiResultIssueActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="doActionIssueOfProjectVersion"></a>
# **doActionIssueOfProjectVersion**
> ApiResultApiActionResponse doActionIssueOfProjectVersion(parentId, collectionAction)

doAction

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueOfProjectVersionControllerApi apiInstance = new IssueOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
ApiCollectionActionlong collectionAction = new ApiCollectionActionlong(); // ApiCollectionActionlong | collectionAction
try {
    ApiResultApiActionResponse result = apiInstance.doActionIssueOfProjectVersion(parentId, collectionAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueOfProjectVersionControllerApi#doActionIssueOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **collectionAction** | [**ApiCollectionActionlong**](ApiCollectionActionlong.md)| collectionAction |

### Return type

[**ApiResultApiActionResponse**](ApiResultApiActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fileBugForIssueOfProjectVersion"></a>
# **fileBugForIssueOfProjectVersion**
> ApiResultIssueFileBugResponse fileBugForIssueOfProjectVersion(parentId, resource)

fileBugFor

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueOfProjectVersionControllerApi apiInstance = new IssueOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
IssueFileBugRequest resource = new IssueFileBugRequest(); // IssueFileBugRequest | resource
try {
    ApiResultIssueFileBugResponse result = apiInstance.fileBugForIssueOfProjectVersion(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueOfProjectVersionControllerApi#fileBugForIssueOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resource** | [**IssueFileBugRequest**](IssueFileBugRequest.md)| resource |

### Return type

[**ApiResultIssueFileBugResponse**](ApiResultIssueFileBugResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listIssueOfProjectVersion"></a>
# **listIssueOfProjectVersion**
> ApiResultListProjectVersionIssue listIssueOfProjectVersion(parentId, start, limit, q, qm, orderby, filterset, fields, showhidden, showremoved, showsuppressed, showshortfilenames, filter, groupid, groupingtype)

list

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueOfProjectVersionControllerApi apiInstance = new IssueOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
Integer start = 0; // Integer | A start offset in object listing
Integer limit = 200; // Integer | A maximum number of returned objects in listing, if '-1' or '0' no limit is applied
String q = "q_example"; // String | An issue query expression, must be used together with the 'qm' parameter
String qm = "qm_example"; // String | Syntax mode for the 'q' parameter, mandatory if the 'q' parameter is used
String orderby = "orderby_example"; // String | Fields to order by
String filterset = "filterset_example"; // String | Filter set to use
String fields = "fields_example"; // String | Output fields
Boolean showhidden = false; // Boolean | If 'true', include hidden issues in search results. If 'false', exclude hidden issues from search results. If no options are set, use application version profile settings to get value of this option.
Boolean showremoved = false; // Boolean | If 'true', include removed issues in search results. If 'false', exclude removed issues from search results. If no options are set, use application version profile settings to get value of this option.
Boolean showsuppressed = false; // Boolean | If 'true', include suppressed issues in search results. If 'false', exclude suppressed issues from search results. If no options are set, use application version profile settings to get value of this option.
Boolean showshortfilenames = false; // Boolean | If 'true', only short file names will be displayed in issues list.
String filter = "filter_example"; // String | filter
String groupid = "groupid_example"; // String | groupid
String groupingtype = "groupingtype_example"; // String | groupingtype
try {
    ApiResultListProjectVersionIssue result = apiInstance.listIssueOfProjectVersion(parentId, start, limit, q, qm, orderby, filterset, fields, showhidden, showremoved, showsuppressed, showshortfilenames, filter, groupid, groupingtype);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueOfProjectVersionControllerApi#listIssueOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **start** | **Integer**| A start offset in object listing | [optional] [default to 0]
 **limit** | **Integer**| A maximum number of returned objects in listing, if &#39;-1&#39; or &#39;0&#39; no limit is applied | [optional] [default to 200]
 **q** | **String**| An issue query expression, must be used together with the &#39;qm&#39; parameter | [optional]
 **qm** | **String**| Syntax mode for the &#39;q&#39; parameter, mandatory if the &#39;q&#39; parameter is used | [optional] [enum: issues]
 **orderby** | **String**| Fields to order by | [optional]
 **filterset** | **String**| Filter set to use | [optional]
 **fields** | **String**| Output fields | [optional]
 **showhidden** | **Boolean**| If &#39;true&#39;, include hidden issues in search results. If &#39;false&#39;, exclude hidden issues from search results. If no options are set, use application version profile settings to get value of this option. | [optional] [default to false]
 **showremoved** | **Boolean**| If &#39;true&#39;, include removed issues in search results. If &#39;false&#39;, exclude removed issues from search results. If no options are set, use application version profile settings to get value of this option. | [optional] [default to false]
 **showsuppressed** | **Boolean**| If &#39;true&#39;, include suppressed issues in search results. If &#39;false&#39;, exclude suppressed issues from search results. If no options are set, use application version profile settings to get value of this option. | [optional] [default to false]
 **showshortfilenames** | **Boolean**| If &#39;true&#39;, only short file names will be displayed in issues list. | [optional] [default to false]
 **filter** | **String**| filter | [optional]
 **groupid** | **String**| groupid | [optional]
 **groupingtype** | **String**| groupingtype | [optional]

### Return type

[**ApiResultListProjectVersionIssue**](ApiResultListProjectVersionIssue.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readIssueOfProjectVersion"></a>
# **readIssueOfProjectVersion**
> ApiResultProjectVersionIssue readIssueOfProjectVersion(parentId, id, fields)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueOfProjectVersionControllerApi apiInstance = new IssueOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
Long id = 789L; // Long | id
String fields = "fields_example"; // String | Output fields
try {
    ApiResultProjectVersionIssue result = apiInstance.readIssueOfProjectVersion(parentId, id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueOfProjectVersionControllerApi#readIssueOfProjectVersion");
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

[**ApiResultProjectVersionIssue**](ApiResultProjectVersionIssue.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="suppressIssueOfProjectVersion"></a>
# **suppressIssueOfProjectVersion**
> ApiResultIssueActionResponse suppressIssueOfProjectVersion(parentId, resource)

suppress

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueOfProjectVersionControllerApi apiInstance = new IssueOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
IssueSuppressRequest resource = new IssueSuppressRequest(); // IssueSuppressRequest | resource
try {
    ApiResultIssueActionResponse result = apiInstance.suppressIssueOfProjectVersion(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueOfProjectVersionControllerApi#suppressIssueOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resource** | [**IssueSuppressRequest**](IssueSuppressRequest.md)| resource |

### Return type

[**ApiResultIssueActionResponse**](ApiResultIssueActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTagForIssueOfProjectVersion"></a>
# **updateTagForIssueOfProjectVersion**
> ApiResultIssueActionResponse updateTagForIssueOfProjectVersion(parentId, resource)

updateTagFor

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.IssueOfProjectVersionControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

IssueOfProjectVersionControllerApi apiInstance = new IssueOfProjectVersionControllerApi();
Long parentId = 789L; // Long | parentId
IssueUpdateTagRequest resource = new IssueUpdateTagRequest(); // IssueUpdateTagRequest | resource
try {
    ApiResultIssueActionResponse result = apiInstance.updateTagForIssueOfProjectVersion(parentId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IssueOfProjectVersionControllerApi#updateTagForIssueOfProjectVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Long**| parentId |
 **resource** | [**IssueUpdateTagRequest**](IssueUpdateTagRequest.md)| resource |

### Return type

[**ApiResultIssueActionResponse**](ApiResultIssueActionResponse.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

