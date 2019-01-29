
# ReportDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**crossApp** | **Boolean** | True if report applies to multiple project versions |  [optional]
**description** | **String** | Report description |  [optional]
**fileName** | **String** | The name of the report definition file |  [optional]
**guid** | **String** | Report definition GUID |  [optional]
**id** | **Long** | Report definition identifier | 
**inUse** | **Boolean** | Indicates whether the report definition is in use |  [optional]
**name** | **String** | Report name | 
**objectVersion** | **Integer** | Object version |  [optional]
**parameters** | [**List&lt;ReportParameter&gt;**](ReportParameter.md) | List of report parameters |  [optional]
**publishVersion** | **Integer** | Publish version |  [optional]
**renderingEngine** | **String** | The engine used to render the report, e.g. BIRT |  [optional]
**templateDocId** | **Long** | Template doc identifier |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of report | 
**typeDefaultText** | **String** | Report type default text |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
APPLICATION_REPORTS | &quot;Application Reports&quot;
SSA_APPLICATION_REPORTS | &quot;SSA Application Reports&quot;
SSA_PORTFOLIO_REPORTS | &quot;SSA Portfolio Reports&quot;
PORTFOLIO_REPORTS | &quot;Portfolio Reports&quot;
COMPLIANCE_REPORTS | &quot;Compliance Reports&quot;
ISSUE_REPORTS | &quot;Issue Reports&quot;
RUNTIME_APPLICATION_REPORTS | &quot;Runtime Application Reports&quot;



