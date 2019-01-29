
# IssueAuditHistoryDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeName** | **String** | Changed attribute name. | 
**auditDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time when audit was performed. | 
**conflict** | **Boolean** | Flag that indicates if there were any conflicts when audit information was merged. | 
**issueId** | **Long** | ID of the issue the history record belongs to | 
**newValue** | **String** | Attribute value after audit. | 
**oldValue** | **String** | Attribute value before audit. | 
**sequenceNumber** | **Integer** | Sequence number of the history record in the list of all audit history records for the issue. | 
**userName** | **String** | Name of the user who performed the audit. | 



