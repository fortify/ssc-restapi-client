
# AttributeDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appEntityType** | [**AppEntityTypeEnum**](#AppEntityTypeEnum) | Application Entity Type | 
**category** | [**CategoryEnum**](#CategoryEnum) | Attribute Definition Category | 
**description** | **String** |  |  [optional]
**guid** | **String** | Unique string identifier for this Attribute Definition | 
**hasDefault** | **Boolean** | Set to true if this Attribute Definition should be the default | 
**hidden** | **Boolean** | Set to true if this Attribute Definition is hidden |  [optional]
**id** | **Long** | ID required when referencing an existing Attribute Definition |  [optional]
**name** | **String** |  | 
**objectVersion** | **Integer** |  |  [optional]
**options** | [**List&lt;AttributeOption&gt;**](AttributeOption.md) | List of options (i.e. values) associated with this Attribute Definition |  [optional]
**publishVersion** | **Integer** |  |  [optional]
**required** | **Boolean** | Set to true if this Attribute Definition is required | 
**sequenceNumber** | **Long** |  |  [optional]
**systemUsage** | [**SystemUsageEnum**](#SystemUsageEnum) | System Usage Type | 
**type** | [**TypeEnum**](#TypeEnum) | Attribute Definition Type | 


<a name="AppEntityTypeEnum"></a>
## Enum: AppEntityTypeEnum
Name | Value
---- | -----
PROJECT_VERSION | &quot;PROJECT_VERSION&quot;
RUNTIME_APP | &quot;RUNTIME_APP&quot;
NONE | &quot;NONE&quot;
ALL | &quot;ALL&quot;


<a name="CategoryEnum"></a>
## Enum: CategoryEnum
Name | Value
---- | -----
TECHNICAL | &quot;TECHNICAL&quot;
BUSINESS | &quot;BUSINESS&quot;
DYNAMIC_SCAN_REQUEST | &quot;DYNAMIC_SCAN_REQUEST&quot;
ORGANIZATION | &quot;ORGANIZATION&quot;


<a name="SystemUsageEnum"></a>
## Enum: SystemUsageEnum
Name | Value
---- | -----
HP_DEFINED_DELETABLE | &quot;HP_DEFINED_DELETABLE&quot;
HP_DEFINED_NON_DELETABLE | &quot;HP_DEFINED_NON_DELETABLE&quot;
USER_DEFINED_DELETABLE | &quot;USER_DEFINED_DELETABLE&quot;
USER_DEFINED_NON_DELETABLE | &quot;USER_DEFINED_NON_DELETABLE&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TEXT | &quot;TEXT&quot;
SINGLE | &quot;SINGLE&quot;
MULTIPLE | &quot;MULTIPLE&quot;
LONG_TEXT | &quot;LONG_TEXT&quot;
SENSITIVE_TEXT | &quot;SENSITIVE_TEXT&quot;
BOOLEAN | &quot;BOOLEAN&quot;
INTEGER | &quot;INTEGER&quot;
DATE | &quot;DATE&quot;
FILE | &quot;FILE&quot;



