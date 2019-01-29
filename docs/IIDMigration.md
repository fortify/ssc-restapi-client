
# IIDMigration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artifactId** | **Long** |  |  [optional]
**id** | **Long** | IID migration id |  [optional]
**mappings** | [**List&lt;IidMapping&gt;**](IidMapping.md) |  |  [optional]
**processingDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**projectVersionId** | **Long** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]


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



