
# Variable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeForOperation** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**folderName** | **String** | Select a folder from the default filter set to associate with the variable. | 
**guid** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**inUse** | **Boolean** |  |  [optional]
**name** | **String** |  | 
**objectVersion** | **Integer** |  |  [optional]
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**publishVersion** | **Integer** |  |  [optional]
**searchString** | **String** |  | 
**variableType** | [**VariableTypeEnum**](#VariableTypeEnum) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
COUNT | &quot;COUNT&quot;
SUM | &quot;SUM&quot;


<a name="VariableTypeEnum"></a>
## Enum: VariableTypeEnum
Name | Value
---- | -----
SYSTEM_DEFINED | &quot;SYSTEM_DEFINED&quot;
USER_DEFINED | &quot;USER_DEFINED&quot;



