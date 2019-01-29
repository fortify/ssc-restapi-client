
# DynamicScanRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique identifier of dynamic scan request | 
**lastUpdateDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date that the dynamic scan request was updated |  [optional]
**objectVersion** | **Integer** | The object version of the dynamic scan request |  [optional]
**parameters** | [**List&lt;DynamicScanRequestParameter&gt;**](DynamicScanRequestParameter.md) | Parameters that are needed for dynamic scan request | 
**requestedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date that the dynamic scan request was submitted |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the dynamic scan request |  [optional]
**submitter** | **String** | The id of the user who submitted the dynamic scan request |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUBMITTED | &quot;SUBMITTED&quot;
PICKED_UP | &quot;PICKED_UP&quot;
CANCELED | &quot;CANCELED&quot;
COMPLETED | &quot;COMPLETED&quot;



