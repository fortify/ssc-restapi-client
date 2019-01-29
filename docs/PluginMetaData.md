
# PluginMetaData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | Version string of the SSC plugin api used to develop the plugin | 
**dataVersion** | **Integer** | An integer used to tag the set of issue attributes provided by this plugin. | 
**description** | **String** | Plugin description |  [optional]
**engineType** | **String** | Name of the scan engine supported by the plugin. Value is defined for parser plugins only |  [optional]
**id** | **Long** | Plugin unique identifier |  [optional]
**lastUsedOfKind** | **Boolean** | Tracks whether this plugin instance was the most recently used of its kind | 
**pluginConfiguration** | [**List&lt;PluginConfiguration&gt;**](PluginConfiguration.md) | Additional configuration properties used by the plugin | 
**pluginId** | **String** | Identifier of the plugin, usually a fully-qualified classname. Non-unique when multiple versions of same plugin exist | 
**pluginName** | **String** | A string name for the plugin | 
**pluginState** | [**PluginStateEnum**](#PluginStateEnum) | State of the plugin instance | 
**pluginType** | [**PluginTypeEnum**](#PluginTypeEnum) | Denotes functionality of the plugin instance, such as scan parsing, bugtracker integration. | 
**pluginVersion** | **String** | A version string of the implementation code of the plugin | 
**supportedEngineVersions** | **String** | Versions of the scan engine results supported by the plugin. Value is defined for parser plugins only |  [optional]
**systemInstalled** | **Boolean** | whether the plugin instance was installed by adding the jar to a special system folder | 
**vendorName** | **String** | Name of the company / organization that developed the plugin |  [optional]
**vendorUrl** | **String** | Plugin vendor&#39;s web site URL |  [optional]


<a name="PluginStateEnum"></a>
## Enum: PluginStateEnum
Name | Value
---- | -----
STOPPED | &quot;STOPPED&quot;
STARTING | &quot;STARTING&quot;
STARTED | &quot;STARTED&quot;
STOPPING | &quot;STOPPING&quot;
FAILED_TO_START | &quot;FAILED_TO_START&quot;
FAILED_TO_STOP | &quot;FAILED_TO_STOP&quot;
UNKNOWN | &quot;UNKNOWN&quot;


<a name="PluginTypeEnum"></a>
## Enum: PluginTypeEnum
Name | Value
---- | -----
SCAN_PARSER | &quot;SCAN_PARSER&quot;
BUG_TRACKER | &quot;BUG_TRACKER&quot;
LEGACY_BUG_TRACKER | &quot;LEGACY_BUG_TRACKER&quot;



