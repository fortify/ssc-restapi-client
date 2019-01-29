
# SavedReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**embed** | [**EmbeddedReportDefinition**](EmbeddedReportDefinition.md) |  |  [optional]
**authEntity** | [**ReportAuthEntity**](ReportAuthEntity.md) | The Fortify User or Ldap User associated with the report |  [optional]
**format** | [**FormatEnum**](#FormatEnum) | Saved report output format | 
**formatDefaultText** | **String** | Saved report output format default text |  [optional]
**generationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Generation date |  [optional]
**id** | **Long** |  |  [optional]
**inputReportParameters** | [**List&lt;InputReportParameter&gt;**](InputReportParameter.md) | List of report parameters |  [optional]
**isPublished** | **Boolean** | Indicates whether saved report is published |  [optional]
**name** | **String** |  |  [optional]
**note** | **String** | Saved report notes |  [optional]
**projects** | [**List&lt;ReportProject&gt;**](ReportProject.md) | List of project versions | 
**published** | **Boolean** |  |  [optional]
**reportDefinitionId** | **Long** | Report definition identifier | 
**reportProjectsCount** | **Integer** | Count of report projects |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Saved report status |  [optional]
**statusDefaultText** | **String** | Saved report status default text |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Saved report type | 
**typeDefaultText** | **String** | Saved report type default text |  [optional]


<a name="FormatEnum"></a>
## Enum: FormatEnum
Name | Value
---- | -----
PDF | &quot;PDF&quot;
DOC | &quot;DOC&quot;
XLS | &quot;XLS&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SCHEDULED_FOR_PROCESSING | &quot;Scheduled for Processing&quot;
PROCESSING | &quot;Processing&quot;
PROCESSING_COMPLETE | &quot;Processing Complete&quot;
ERROR_PROCESSING | &quot;Error Processing&quot;


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



