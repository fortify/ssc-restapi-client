
# ProjectVersionBugTracker

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignedBugtrackerShortNameIfKnown** | **String** | the short display name of the bug tracker. (will be null if no bugtracker is assigned or if there is no currently installed plugin matching the assigned pluginId.) | 
**assignedPluginId** | **String** | identifier of the bug tracker plugin assigned to the application version. (Bug tracker integration will be active only if the plugin is also enabled in the system.) | 
**bugStateManagementConfig** | [**BugStateManagementCfg**](BugStateManagementCfg.md) | Bug state management configuration | 
**bugTracker** | [**BugTracker**](BugTracker.md) | Bug tracker (note that this field will be null if the assigned bug tracker is not enabled in the SSC plugin framework.) | 
**bugtrackerIsAssigned** | **Boolean** | indicates whether a bug tracker is assigned to the application version | 
**clearAppVersionBugs** | **Boolean** |  |  [optional]



