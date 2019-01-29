
# Job

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artifactName** | **String** | Artifact name related to this job | 
**cancellable** | **Boolean** | Set to true if job is cancelable | 
**executionOrder** | **Double** | Job execution order | 
**finishTime** | [**OffsetDateTime**](OffsetDateTime.md) | End time of job | 
**jobClass** | **String** | Job class | 
**jobData** | **Object** | Job data | 
**jobGroup** | **String** | Job group | 
**jobName** | **String** | identifier of job |  [optional]
**priority** | **Integer** | Job priority | 
**projectName** | **String** | Project name related to this job | 
**projectVersionId** | **Long** | Project version identifier related to this job | 
**projectVersionName** | **String** | Project version name related to this job | 
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | Start time of job | 
**state** | [**StateEnum**](#StateEnum) | Job State | 
**userName** | **String** | Name of user this job was created by | 


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
PREPARED | &quot;PREPARED&quot;
FINISHED | &quot;FINISHED&quot;
RUNNING | &quot;RUNNING&quot;
WAITING_FOR_WORKER | &quot;WAITING_FOR_WORKER&quot;
FAILED | &quot;FAILED&quot;
CANCELLED | &quot;CANCELLED&quot;



