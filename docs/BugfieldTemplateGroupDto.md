
# BugfieldTemplateGroupDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bugTrackerPluginId** | **String** | Identifier of the bug tracker plugin associated with this template group. | 
**deletable** | **Boolean** | Flag that says if bugfield template group can be deleted. | 
**description** | **String** | description for bugfield template group. |  [optional]
**id** | **Long** | unique identifier of bugfield template group. |  [optional]
**name** | **String** | short name of associated bug tracker plugin. (May be null if plugin is not currently enabled.) | 
**objectVersion** | **Integer** | version of bugfield template group stored on the server. This value is used for optimistic locking to prevent concurrent modification by different users at the same time. | 
**valueList** | [**List&lt;BugfieldTemplateDto&gt;**](BugfieldTemplateDto.md) | Collection of all templates belonging to this bugfield template group. | 



