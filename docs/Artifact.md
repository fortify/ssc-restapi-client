
# Artifact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**embed** | [**EmbeddedScans**](EmbeddedScans.md) |  |  [optional]
**allowApprove** | **Boolean** |  |  [optional]
**allowDelete** | **Boolean** |  |  [optional]
**allowPurge** | **Boolean** |  |  [optional]
**approvalComment** | **String** |  |  [optional]
**approvalDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**approvalUsername** | **String** |  |  [optional]
**artifactType** | [**ArtifactTypeEnum**](#ArtifactTypeEnum) |  |  [optional]
**auditUpdated** | **Boolean** |  |  [optional]
**fileName** | **String** |  |  [optional]
**fileSize** | **Long** |  |  [optional]
**fileURL** | **String** |  |  [optional]
**id** | **Long** | Artifact id |  [optional]
**inModifyingStatus** | **Boolean** |  |  [optional]
**indexed** | **Boolean** |  |  [optional]
**lastScanDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**messageCount** | **Long** |  |  [optional]
**messages** | **String** |  |  [optional]
**originalFileName** | **String** |  |  [optional]
**otherStatus** | [**OtherStatusEnum**](#OtherStatusEnum) |  |  [optional]
**purged** | **Boolean** |  |  [optional]
**runtimeStatus** | [**RuntimeStatusEnum**](#RuntimeStatusEnum) |  |  [optional]
**scaStatus** | [**ScaStatusEnum**](#ScaStatusEnum) |  |  [optional]
**scanErrorsCount** | **Long** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**uploadDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**uploadIP** | **String** |  |  [optional]
**userName** | **String** |  |  [optional]
**versionNumber** | **Integer** |  |  [optional]
**webInspectStatus** | [**WebInspectStatusEnum**](#WebInspectStatusEnum) |  |  [optional]


<a name="ArtifactTypeEnum"></a>
## Enum: ArtifactTypeEnum
Name | Value
---- | -----
EMPTY | &quot;&quot;
FPR | &quot;Fpr&quot;
FPRPREPROCESS | &quot;FprPreProcess&quot;
ANALYSISARTIFACT | &quot;AnalysisArtifact&quot;
SOURCEARCHIVE | &quot;SourceArchive&quot;
RUNTIMEEVENTLOG | &quot;RuntimeEventLog&quot;


<a name="OtherStatusEnum"></a>
## Enum: OtherStatusEnum
Name | Value
---- | -----
EMPTY | &quot;&quot;
NOTEXIST | &quot;NotExist&quot;
IGNORED | &quot;Ignored&quot;
PROCESSED | &quot;Processed&quot;


<a name="RuntimeStatusEnum"></a>
## Enum: RuntimeStatusEnum
Name | Value
---- | -----
EMPTY | &quot;&quot;
NOTEXIST | &quot;NotExist&quot;
IGNORED | &quot;Ignored&quot;
PROCESSED | &quot;Processed&quot;


<a name="ScaStatusEnum"></a>
## Enum: ScaStatusEnum
Name | Value
---- | -----
EMPTY | &quot;&quot;
NOTEXIST | &quot;NotExist&quot;
IGNORED | &quot;Ignored&quot;
PROCESSED | &quot;Processed&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
SCHED_PROCESSING | &quot;SCHED_PROCESSING&quot;
PROCESSING | &quot;PROCESSING&quot;
PROCESS_COMPLETE | &quot;PROCESS_COMPLETE&quot;
ERROR_PROCESSING | &quot;ERROR_PROCESSING&quot;
REQUIRE_AUTH | &quot;REQUIRE_AUTH&quot;
DELETING | &quot;DELETING&quot;
ERROR_DELETING | &quot;ERROR_DELETING&quot;
DELETED | &quot;DELETED&quot;
PURGING | &quot;PURGING&quot;
PURGED | &quot;PURGED&quot;
ERROR_PURGING | &quot;ERROR_PURGING&quot;
DISPATCH_ANALYSIS | &quot;DISPATCH_ANALYSIS&quot;
DISPATCH_REAUDIT | &quot;DISPATCH_REAUDIT&quot;
ERROR_DISPATCH | &quot;ERROR_DISPATCH&quot;
QUEUED_ANALYSIS | &quot;QUEUED_ANALYSIS&quot;
REQUEUED_ANALYSIS | &quot;REQUEUED_ANALYSIS&quot;
ANALYZING | &quot;ANALYZING&quot;
ANALYSIS_COMPLETE | &quot;ANALYSIS_COMPLETE&quot;
ERROR_ANALYZING | &quot;ERROR_ANALYZING&quot;
UNKNOWN | &quot;UNKNOWN&quot;
AUDIT_FAILED | &quot;AUDIT_FAILED&quot;


<a name="WebInspectStatusEnum"></a>
## Enum: WebInspectStatusEnum
Name | Value
---- | -----
EMPTY | &quot;&quot;
NOTEXIST | &quot;NotExist&quot;
IGNORED | &quot;Ignored&quot;
PROCESSED | &quot;Processed&quot;



