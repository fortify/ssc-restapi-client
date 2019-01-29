
# ProjectVersion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | True if this version is active | 
**assignedIssuesCount** | **Long** |  |  [optional]
**attachmentsOutOfDate** | **Boolean** |  |  [optional]
**autoPredict** | **Boolean** | true if auto-prediction is enabled for this project version; false otherwise. This property modification is protected by AUDITASSISTANT_MANAGE permission. |  [optional]
**bugTrackerEnabled** | **Boolean** | true if the bug tracker plugin assigned to the application version is currently enabled in the system | 
**bugTrackerPluginId** | **String** | identifier of the bug tracker plugin (if any) assigned to this application version | 
**committed** | **Boolean** | True if this version is committed and ready to be used | 
**createdBy** | **String** | User that created this version | 
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date this version was created | 
**currentState** | [**ProjectVersionState**](ProjectVersionState.md) |  |  [optional]
**customTagValuesAutoApply** | **Boolean** | true if custom tag values auto-apply is enabled for this project version; false otherwise. This property modification is protected by AUDITASSISTANT_MANAGE permission. |  [optional]
**description** | **String** | Description | 
**id** | **Long** | Id |  [optional]
**issueTemplateId** | **String** | Id of the Issue Template used by this version | 
**issueTemplateModifiedTime** | **Long** | Last time the Issue Template was modified | 
**issueTemplateName** | **String** | Name of the Issue Template used by this version | 
**latestScanId** | **Long** | id of the latest scan uploaded to application version | 
**loadProperties** | **String** |  |  [optional]
**masterAttrGuid** | **String** | Guid of the primary custom tag for this version | 
**migrationVersion** | **Float** |  |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) |  |  [optional]
**name** | **String** | Name | 
**obfuscatedId** | **String** |  |  [optional]
**owner** | **String** | Owner of this version | 
**project** | [**Project**](Project.md) |  |  [optional]
**refreshRequired** | **Boolean** |  |  [optional]
**securityGroup** | **String** |  |  [optional]
**serverVersion** | **Float** | Server version this version&#39;s data supports | 
**siteId** | **String** |  |  [optional]
**snapshotOutOfDate** | **Boolean** | True if the most recent snapshot is not accurate | 
**sourceBasePath** | **String** |  |  [optional]
**staleIssueTemplate** | **Boolean** | True if this version&#39;s Issue Template has changed or been modified | 
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**tracesOutOfDate** | **Boolean** |  |  [optional]


<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
ASSESSMENT | &quot;ASSESSMENT&quot;
BASIC | &quot;BASIC&quot;
FULL | &quot;FULL&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
DELETING | &quot;DELETING&quot;
ARCHIVED | &quot;ARCHIVED&quot;
COPYING_ISSUES | &quot;COPYING_ISSUES&quot;



