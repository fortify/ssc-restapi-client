
# CustomTag

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customTagType** | [**CustomTagTypeEnum**](#CustomTagTypeEnum) | Custom tag type. | 
**defaultValue** | **String** | Default value of the custom tag. Actual string value is presented here. |  [optional]
**defaultValueIndex** | **Integer** | Index of default value of the custom tag. This is ordinal number of the item in CustomTagLookup collection. |  [optional]
**deletable** | **Boolean** | Flag that says if custom tag can be deleted. Custom tag which values are currently in use cannot be deleted. |  [optional]
**description** | **String** | Custom tag description. |  [optional]
**extensible** | **Boolean** | Flag that says if custom tag is extensible or not. | 
**guid** | **String** | Custom tag GUID. | 
**hidden** | **Boolean** | Is custom tag hidden or not. | 
**id** | **Long** | Custom tag id |  [optional]
**inUse** | **Boolean** | Is custom tag values are selected for any issues in the system. |  [optional]
**name** | **String** | Custom tag unique name. | 
**objectVersion** | **Integer** | Custom tag version stored on the server. This value is used for optimistic locking of the custom tag object to prevent concurrent modification of the custom tag by different users at the same time. | 
**primaryTag** | **Boolean** | If this custom tag is set as primary tag for a specific project version. This value is initialized only if custom tags for specific project version are requested. |  [optional]
**restriction** | **Boolean** | Flag is set to true if special permission is required to set values of this custom tag. |  [optional]
**restrictionType** | [**RestrictionTypeEnum**](#RestrictionTypeEnum) | Special permission type if restriction is set to TRUE. |  [optional]
**valueList** | [**List&lt;CustomTagLookup&gt;**](CustomTagLookup.md) | Collection of all possible custom tag values. |  [optional]
**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) | Custom tag value type. | 


<a name="CustomTagTypeEnum"></a>
## Enum: CustomTagTypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
CUSTOM | &quot;CUSTOM&quot;
HYBRID | &quot;HYBRID&quot;
METAGROUP | &quot;METAGROUP&quot;
SYSTEM | &quot;SYSTEM&quot;
AUDITASSISTANT | &quot;AUDITASSISTANT&quot;


<a name="RestrictionTypeEnum"></a>
## Enum: RestrictionTypeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
RESTRICTED | &quot;RESTRICTED&quot;
READONLY | &quot;READONLY&quot;


<a name="ValueTypeEnum"></a>
## Enum: ValueTypeEnum
Name | Value
---- | -----
LIST | &quot;LIST&quot;
DECIMAL | &quot;DECIMAL&quot;
DATE | &quot;DATE&quot;
TEXT | &quot;TEXT&quot;



