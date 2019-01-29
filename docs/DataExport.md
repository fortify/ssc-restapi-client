
# DataExport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appVersionId** | **Long** | Application version id - required if DatasetName &#x3D; \&quot;Audit\&quot; |  [optional]
**appVersionName** | **String** | Application version name |  [optional]
**datasetName** | **String** | Dataset name - e.g. \&quot;Audit\&quot;, \&quot;Issue Stats\&quot; - corresponds to page from which data is exported | 
**documentInfoId** | **Long** | Document Info id for file blob |  [optional]
**expiration** | **Integer** | Data export file expiration in days |  [optional]
**exportDate** | [**OffsetDateTime**](OffsetDateTime.md) | Export date |  [optional]
**fileName** | **String** | Name of data export file | 
**fileType** | **String** | File type, e.g. CSV |  [optional]
**id** | **Long** |  |  [optional]
**note** | **String** | Note, i.e. comments or info related to data being exported |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Data export status |  [optional]
**userName** | **String** | User name of user who initiated the data export |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
STARTED | &quot;EXPORT_PROCESS_STARTED&quot;
COMPLETED | &quot;EXPORT_PROCESS_COMPLETED&quot;
FAILED | &quot;EXPORT_PROCESS_FAILED&quot;



