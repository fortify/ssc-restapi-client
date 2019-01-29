
# AuditAssistantStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fprFilePath** | **String** |  |  [optional]
**message** | **String** |  |  [optional]
**projectVersionId** | **Long** |  |  [optional]
**serverId** | **Long** |  |  [optional]
**serverStatus** | **Integer** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**userName** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
PRE_PREDICT_FAILURE | &quot;PRE_PREDICT_FAILURE&quot;
PREDICT_QUEUED | &quot;PREDICT_QUEUED&quot;
PREDICT_PREP | &quot;PREDICT_PREP&quot;
PREDICT_SUBMITTED | &quot;PREDICT_SUBMITTED&quot;
PREDICT_COMPLETE | &quot;PREDICT_COMPLETE&quot;
PREDICT_FAILED | &quot;PREDICT_FAILED&quot;
PREDICTIONS_RETRIEVING | &quot;PREDICTIONS_RETRIEVING&quot;
PREDICTIONS_RETRIEVED | &quot;PREDICTIONS_RETRIEVED&quot;
PREDICTIONS_RETRIEVE_FAILED | &quot;PREDICTIONS_RETRIEVE_FAILED&quot;
UPLOAD_FPR_FAILED | &quot;UPLOAD_FPR_FAILED&quot;



