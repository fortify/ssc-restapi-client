# ConfigurationControllerApi

All URIs are relative to *https://16.40.6.107:8080/ssc/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConfiguration**](ConfigurationControllerApi.md#getConfiguration) | **GET** /configuration | get
[**getFullTextIndexStatusConfiguration**](ConfigurationControllerApi.md#getFullTextIndexStatusConfiguration) | **GET** /configuration/searchIndex | getFullTextIndexStatus
[**readConfiguration**](ConfigurationControllerApi.md#readConfiguration) | **GET** /configuration/{id} | read
[**updateConfiguration**](ConfigurationControllerApi.md#updateConfiguration) | **PUT** /configuration | update
[**validateAuditAssistantConnectionConfiguration**](ConfigurationControllerApi.md#validateAuditAssistantConnectionConfiguration) | **POST** /configuration/validateAuditAssistantConnection | validateAuditAssistantConnection
[**validateReportConnectionConfiguration**](ConfigurationControllerApi.md#validateReportConnectionConfiguration) | **POST** /configuration/validateReportConnection | validateReportConnection


<a name="getConfiguration"></a>
# **getConfiguration**
> ApiResultConfigProperties getConfiguration(group)

get

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ConfigurationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ConfigurationControllerApi apiInstance = new ConfigurationControllerApi();
String group = "group_example"; // String | group
try {
    ApiResultConfigProperties result = apiInstance.getConfiguration(group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationControllerApi#getConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| group | [optional]

### Return type

[**ApiResultConfigProperties**](ApiResultConfigProperties.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFullTextIndexStatusConfiguration"></a>
# **getFullTextIndexStatusConfiguration**
> ApiResultSearchIndexStatus getFullTextIndexStatusConfiguration()

getFullTextIndexStatus

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ConfigurationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ConfigurationControllerApi apiInstance = new ConfigurationControllerApi();
try {
    ApiResultSearchIndexStatus result = apiInstance.getFullTextIndexStatusConfiguration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationControllerApi#getFullTextIndexStatusConfiguration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResultSearchIndexStatus**](ApiResultSearchIndexStatus.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readConfiguration"></a>
# **readConfiguration**
> ApiResultConfigProperty readConfiguration(id)

read

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ConfigurationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ConfigurationControllerApi apiInstance = new ConfigurationControllerApi();
String id = "id_example"; // String | id
try {
    ApiResultConfigProperty result = apiInstance.readConfiguration(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationControllerApi#readConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**ApiResultConfigProperty**](ApiResultConfigProperty.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateConfiguration"></a>
# **updateConfiguration**
> ApiResultConfigProperties updateConfiguration(resource)

update

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ConfigurationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ConfigurationControllerApi apiInstance = new ConfigurationControllerApi();
ConfigProperties resource = new ConfigProperties(); // ConfigProperties | resource
try {
    ApiResultConfigProperties result = apiInstance.updateConfiguration(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationControllerApi#updateConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ConfigProperties**](ConfigProperties.md)| resource |

### Return type

[**ApiResultConfigProperties**](ApiResultConfigProperties.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateAuditAssistantConnectionConfiguration"></a>
# **validateAuditAssistantConnectionConfiguration**
> ApiResultConfigProperties validateAuditAssistantConnectionConfiguration(resource)

validateAuditAssistantConnection

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ConfigurationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ConfigurationControllerApi apiInstance = new ConfigurationControllerApi();
ConfigProperties resource = new ConfigProperties(); // ConfigProperties | resource
try {
    ApiResultConfigProperties result = apiInstance.validateAuditAssistantConnectionConfiguration(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationControllerApi#validateAuditAssistantConnectionConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ConfigProperties**](ConfigProperties.md)| resource |

### Return type

[**ApiResultConfigProperties**](ApiResultConfigProperties.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateReportConnectionConfiguration"></a>
# **validateReportConnectionConfiguration**
> ApiResultConfigProperties validateReportConnectionConfiguration(resource)

validateReportConnection

### Example
```java
// Import classes:
//import com.fortify.ssc.restclient.ApiClient;
//import com.fortify.ssc.restclient.ApiException;
//import com.fortify.ssc.restclient.Configuration;
//import com.fortify.ssc.restclient.auth.*;
//import com.fortify.ssc.restclient.api.ConfigurationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: FortifyToken
ApiKeyAuth FortifyToken = (ApiKeyAuth) defaultClient.getAuthentication("FortifyToken");
FortifyToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//FortifyToken.setApiKeyPrefix("Token");

ConfigurationControllerApi apiInstance = new ConfigurationControllerApi();
ConfigProperties resource = new ConfigProperties(); // ConfigProperties | resource
try {
    ApiResultConfigProperties result = apiInstance.validateReportConnectionConfiguration(resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationControllerApi#validateReportConnectionConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | [**ConfigProperties**](ConfigProperties.md)| resource |

### Return type

[**ApiResultConfigProperties**](ApiResultConfigProperties.md)

### Authorization

[FortifyToken](../README.md#FortifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

