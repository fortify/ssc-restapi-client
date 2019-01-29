
# AlertDefinitionDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alertAllChildren** | **Boolean** |  |  [optional]
**alertStakeholders** | **Boolean** |  |  [optional]
**alertTriggers** | [**List&lt;AlertTriggerDto&gt;**](AlertTriggerDto.md) |  | 
**createdBy** | **String** |  |  [optional]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**customMessage** | **String** | Required field for Scheduled alerts, Optional for other types | 
**description** | **String** |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**monitorAllApps** | **Boolean** |  |  [optional]
**monitoredEntityName** | **String** |  |  [optional]
**monitoredEntityType** | [**MonitoredEntityTypeEnum**](#MonitoredEntityTypeEnum) |  | 
**monitoredInstanceId** | **Long** |  |  [optional]
**monitorsProjectVersions** | **Boolean** |  |  [optional]
**monitorsRuntimeApp** | **Boolean** |  |  [optional]
**name** | **String** |  | 
**projectVersionIds** | **List&lt;Long&gt;** |  |  [optional]
**recipientType** | [**RecipientTypeEnum**](#RecipientTypeEnum) |  | 
**remindPeriodically** | **Boolean** |  |  [optional]
**reminderPeriod** | **Integer** |  |  [optional]
**startAtDueDate** | **Boolean** |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**triggerDescription** | **String** |  |  [optional]
**triggerDescriptionName** | **String** |  |  [optional]
**triggerDescriptionOperation** | **String** |  |  [optional]
**triggerDescriptionValue** | **String** |  |  [optional]
**userCanModify** | **Boolean** |  |  [optional]


<a name="MonitoredEntityTypeEnum"></a>
## Enum: MonitoredEntityTypeEnum
Name | Value
---- | -----
RT_INSTANCE | &quot;RT_INSTANCE&quot;
REQ_INSTANCE | &quot;REQ_INSTANCE&quot;
ACTIVITY_INSTANCE | &quot;ACTIVITY_INSTANCE&quot;
MEASUREMENT_AGENT | &quot;MEASUREMENT_AGENT&quot;
VARIABLE | &quot;VARIABLE&quot;
RUNTIME_ALERT | &quot;RUNTIME_ALERT&quot;
EVENT | &quot;EVENT&quot;
SCHEDULED_ALERT | &quot;SCHEDULED_ALERT&quot;


<a name="RecipientTypeEnum"></a>
## Enum: RecipientTypeEnum
Name | Value
---- | -----
ME_ONLY | &quot;ME_ONLY&quot;
PROCESS_ENTITY_STAKEHOLDERS | &quot;PROCESS_ENTITY_STAKEHOLDERS&quot;
ALL_USERS | &quot;ALL_USERS&quot;
ALL_SYSTEM_USERS | &quot;ALL_SYSTEM_USERS&quot;



