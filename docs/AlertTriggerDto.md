
# AlertTriggerDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alertDefinitionId** | **Long** |  |  [optional]
**monitoredAttribute** | [**MonitoredAttributeEnum**](#MonitoredAttributeEnum) |  |  [optional]
**resetAfterTriggering** | **Boolean** |  |  [optional]
**triggeredValue** | **String** |  |  [optional]


<a name="MonitoredAttributeEnum"></a>
## Enum: MonitoredAttributeEnum
Name | Value
---- | -----
SIGN_OFF_STATE | &quot;SIGN_OFF_STATE&quot;
VALUE_GT | &quot;VALUE_GT&quot;
VALUE_LT | &quot;VALUE_LT&quot;
VALUE_EQ | &quot;VALUE_EQ&quot;
VALUE_GTE | &quot;VALUE_GTE&quot;
VALUE_LTE | &quot;VALUE_LTE&quot;
EVENT_TYPE | &quot;EVENT_TYPE&quot;
SCHEDULED_ALERT_TIME | &quot;SCHEDULED_ALERT_TIME&quot;



