
# IssueFilterSelector

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Selector set&#39;s description. | 
**displayName** | **String** | Selector set&#39;s display name. | 
**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | Type of the issue attriute that can be used for ordering or filtering. | 
**filterSelectorType** | [**FilterSelectorTypeEnum**](#FilterSelectorTypeEnum) | If value of the selector can be chose from the list of predefined values, or if it can contain any value defined by user. | 
**guid** | **String** | Selector set&#39;s GUID. | 
**selectorOptions** | [**List&lt;SelectorOption&gt;**](SelectorOption.md) | Selector set&#39;s options. | 
**value** | **String** | Selector set&#39;s value that must be sent to backend when this option is selected. | 


<a name="EntityTypeEnum"></a>
## Enum: EntityTypeEnum
Name | Value
---- | -----
UNDEFINED | &quot;UNDEFINED&quot;
ISSUE | &quot;ISSUE&quot;
EXTERNALLIST | &quot;EXTERNALLIST&quot;
CUSTOMTAG | &quot;CUSTOMTAG&quot;
HYBRIDTAG | &quot;HYBRIDTAG&quot;
FOLDER | &quot;FOLDER&quot;


<a name="FilterSelectorTypeEnum"></a>
## Enum: FilterSelectorTypeEnum
Name | Value
---- | -----
LIST | &quot;LIST&quot;
DECIMAL | &quot;DECIMAL&quot;
DATE | &quot;DATE&quot;
TEXT | &quot;TEXT&quot;



