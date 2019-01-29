
# CustomTagLookup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consideredIssue** | **Boolean** | Flag that should be used to mark values that mean \&quot;not an issue\&quot; or \&quot;false positive\&quot;. |  [optional]
**customTagGuid** | **String** | GUID of the parent custom tag this value belongs to. |  [optional]
**defaultValue** | **Boolean** | Flag that says if this value is default custom tag value and should be selected automatically in the values list on issue audit screen. |  [optional]
**deletable** | **Boolean** | Flag that says if this value can be removed from custom tag. Value cannot be removed if it is selected for some issue in the system. |  [optional]
**description** | **String** | Custom tag value description. |  [optional]
**hidden** | **Boolean** | Flag that says that this value is hidden and cannot be selected in issue audit mode. |  [optional]
**lookupIndex** | **Integer** | Current value index in values list. | 
**lookupValue** | **String** | Plain text custom tag value. | 
**relyingCustomTags** | [**List&lt;CustomTagInfo&gt;**](CustomTagInfo.md) | List of relying custom tags and their values this value depends on. This list should be set to automatically reflect relying custom tags values changes to this custom tag value |  [optional]
**seqNumber** | **Integer** | Custom tag value sequence number. | 



