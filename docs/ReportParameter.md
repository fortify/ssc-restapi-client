
# ReportParameter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**identifier** | **String** | Report parameter identifier | 
**name** | **String** |  |  [optional]
**paramOrder** | **Integer** | Order in which the parameter should appear |  [optional]
**reportDefinitionId** | **Long** | Report definition identifier | 
**reportParameterOptions** | [**List&lt;ReportParameterOption&gt;**](ReportParameterOption.md) | Report parameter options |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Report parameter type | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SINGLE_PROJECT | &quot;SINGLE_PROJECT&quot;
SINGLE_RUNTIME_APP | &quot;SINGLE_RUNTIME_APP&quot;
SINGLE_SSA_PROJECT | &quot;SINGLE_SSA_PROJECT&quot;
MULTI_PROJECT | &quot;MULTI_PROJECT&quot;
MULTI_RUNTIME_APP | &quot;MULTI_RUNTIME_APP&quot;
MULTI_SSA_PROJECT | &quot;MULTI_SSA_PROJECT&quot;
PROJECT_ATTRIBUTE | &quot;PROJECT_ATTRIBUTE&quot;
STRING | &quot;STRING&quot;
BOOLEAN | &quot;BOOLEAN&quot;
DATE | &quot;DATE&quot;
SINGLE_SELECT_DEFAULT | &quot;SINGLE_SELECT_DEFAULT&quot;
METADEF_GUID | &quot;METADEF_GUID&quot;



