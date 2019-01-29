
# ConfigProperty

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appliedAfterRestarting** | **Boolean** | Should the SSC server be restarted after changing value of the property to apply the changes. |  [optional]
**configPropertyValueValidation** | [**ConfigPropertyValueValidation**](ConfigPropertyValueValidation.md) | Meta information about how the property&#39;s value should be validated on the client side. |  [optional]
**description** | **String** | Property description. |  [optional]
**group** | **String** | Parent group name the property belongs to. |  [optional]
**groupSwitchEnabled** | **Boolean** | Flag is set to TRUE if property is allowed to be edited on UI. |  [optional]
**name** | **String** | Configuration property unique name. | 
**propertyType** | [**PropertyTypeEnum**](#PropertyTypeEnum) | Property value type. |  [optional]
**protectedOption** | **Boolean** | If special permission is required to get value of this property. |  [optional]
**required** | **Boolean** | Flag is set to TRUE if this property is required and always must have non empty value. |  [optional]
**subGroup** | **String** | Parent subgroup name the property belongs to. |  [optional]
**value** | [**ValueEnum**](#ValueEnum) | Configuration property value. | 
**valuesList** | [**List&lt;ConfigPropertyValueItem&gt;**](ConfigPropertyValueItem.md) | List of allowed property values if property type is OPTIONLIST or DYNAMIC_OPTIONLIST. |  [optional]
**version** | **Integer** | Configuration property version stored on the server. This value is used for optimistic locking of the property object to prevent concurrent changes of the property value by different users at the same time. | 


<a name="PropertyTypeEnum"></a>
## Enum: PropertyTypeEnum
Name | Value
---- | -----
BOOLEAN | &quot;BOOLEAN&quot;
INTEGER | &quot;INTEGER&quot;
STRING | &quot;STRING&quot;
STRINGMULTILINE | &quot;STRINGMULTILINE&quot;
OPTIONLIST | &quot;OPTIONLIST&quot;
DYNAMIC_OPTIONLIST | &quot;DYNAMIC_OPTIONLIST&quot;
ENCODED | &quot;ENCODED&quot;
ENCODEDHIDDEN | &quot;ENCODEDHIDDEN&quot;
EMAIL | &quot;EMAIL&quot;
URL | &quot;URL&quot;
HOSTNAME | &quot;HOSTNAME&quot;
MULTI_EMAIL | &quot;MULTI_EMAIL&quot;
DISTINGUISHED_NAME | &quot;DISTINGUISHED_NAME&quot;
ENCODED_DISTINGUISHED_NAME | &quot;ENCODED_DISTINGUISHED_NAME&quot;
DISTINGUISHED_NAMES_ | &quot;DISTINGUISHED_NAMES;&quot;


<a name="ValueEnum"></a>
## Enum: ValueEnum
Name | Value
---- | -----
DEPENDS_ON_PROPERTY_TYPE_IT_CAN_BE_NUMBER | &quot;Depends on property type. It can be number&quot;
STRING | &quot;string&quot;
URL | &quot;URL&quot;
EMAIL_OR_VALUE_FROM_VALUES_LIST_ | &quot;email or value from values list.&quot;



