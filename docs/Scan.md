
# Scan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artifactId** | **Long** | identifier of parent artifact object which contains this scan object | 
**buildLabel** | **String** | optional string identifier provided by the user when scanning | 
**certification** | **String** | indicates whether the checksum on the analysis result is valid | 
**elapsedTime** | **String** | analysis duration | 
**engineVersion** | **String** | version of analysis engine | 
**execLOC** | **Integer** | total executable lines of code included in sources (excluding comments etc.) | 
**fortifyAnnotationsLOC** | **Integer** | lines of code with annotations | 
**guid** | **String** | globally unique id of scan object | 
**hostname** | **String** |  | 
**id** | **Long** |  |  [optional]
**noOfFiles** | **Integer** | number of source files included in scan | 
**totalLOC** | **Integer** | total lines of code included in sources (includes comments etc.) | 
**type** | **String** | indicates the type of analyzer that produced it, such as SCA or WEBINSPECT | 
**uploadDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 



