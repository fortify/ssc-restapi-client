
# DynamicScanRequestParameterDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** |  |  [optional]
**guid** | **String** | Unique string identifier for this parameter definition | 
**id** | **Long** | Unique id for this parameter definition |  [optional]
**name** | **String** |  | 
**required** | **Boolean** | Set to true if required | 
**sequenceNumber** | **Long** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Attribute Definition Type from which this parameter definition is based on | 


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



