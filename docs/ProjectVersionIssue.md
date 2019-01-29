
# ProjectVersionIssue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analyzer** | **String** | Analyzer | 
**audited** | **Boolean** | Flag is set for issues that has been audited and primary tag value was set for this issue. |  [optional]
**bugURL** | **String** | Bug url | 
**confidence** | **Float** | Issue confidence | 
**displayEngineType** | **String** | Display name for engine type | 
**engineCategory** | [**EngineCategoryEnum**](#EngineCategoryEnum) | Engine category | 
**engineType** | **String** | Engine type | 
**folderGuid** | **String** | Issue folder globally unique identifier | 
**folderId** | **Long** | Deprecated - Issue folder identifier.  This may be incorrect or invalid.  Please use folderGuid instead. | 
**foundDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when issue found | 
**friority** | **String** | Friority | 
**fullFileName** | **String** | Full file name where issue found | 
**hasAttachments** | **Boolean** | Set to true if issue has attachments | 
**hasCorrelatedIssues** | **Boolean** | Set to true if issue has other correlated issues | 
**hidden** | **Boolean** | Set to true if issue is hidden | 
**id** | **Long** | Project version issue identifier |  [optional]
**impact** | **Float** | Issue impact | 
**issueInstanceId** | **String** | Issue instance identifier | 
**issueName** | **String** | Issue name | 
**issueStatus** | **String** | Flag represents issue review status and can have 3 types of values: Unreviewed, Under Review, Reviewed. |  [optional]
**kingdom** | **String** | Kingdom | 
**lastScanId** | **Long** | ID of the latest scan that found the issue |  [optional]
**likelihood** | **Float** | Likelihood of issue | 
**lineNumber** | **Integer** | Line number where issue found | 
**primaryLocation** | **String** | Issue primary location | 
**primaryRuleGuid** | **String** | Primary rule global unique identifier | 
**primaryTag** | **String** | Issue primary tag | 
**primaryTagValueAutoApplied** | **Boolean** | Flag equals true if value of custom tag was applied automatically |  [optional]
**projectName** | **String** | Project name | 
**projectVersionId** | **Long** | Project version identifier | 
**projectVersionName** | **String** | Project version name | 
**removed** | **Boolean** | Set to true if issue is suppressed | 
**removedDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when issue removed | 
**reviewed** | **String** | Issue reviewer | 
**revision** | **Integer** | Project version revision | 
**scanStatus** | **String** | Scan status | 
**severity** | **Float** | Issue severity | 
**suppressed** | **Boolean** | Set to true if issue is suppressed | 


<a name="EngineCategoryEnum"></a>
## Enum: EngineCategoryEnum
Name | Value
---- | -----
STATIC | &quot;STATIC&quot;
DYNAMIC | &quot;DYNAMIC&quot;



