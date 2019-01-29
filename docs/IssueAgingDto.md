
# IssueAgingDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**averageDaysToRemediate** | **Integer** | Average number of days to fix issues in application versions. |  [optional]
**averageDaysToReview** | **Integer** | Average number of days to review issues in application versions. |  [optional]
**bugDensity** | **Double** | Bug density per 10 000 of scanned lines of code. |  [optional]
**filesScanned** | **Long** | Number of files that were scanned in all application versions. |  [optional]
**id** | **String** | This is dynamic attribute which value depend of the aggregation attribute. It can be application ID, application version ID or application version attribute GUID. |  [optional]
**issuesPendingReview** | **Long** | Number of issues that are pending review in all application versions. |  [optional]
**linesOfCode** | **Long** | Number of lines of code that were scanned by scans which results are stored in the application versions. |  [optional]
**name** | **String** | This is dynamic attribute which value depend of the aggregation attribute. It can be application name, application version name or application version attribute name. |  [optional]
**numberOfApplicationVersions** | **Integer** | Number of application versions in the application. |  [optional]
**oldestScanDate** | [**OffsetDateTime**](OffsetDateTime.md) | Issue audites that have been done after this date have been taken into account for average days to review calculation. |  [optional]
**openIssues** | **Long** | Number of not remediated issues in all application versions. |  [optional]
**snapshotOutOfDate** | **Boolean** | Flag that indicates that application metrics state was changed and it metrics are going to be recalculated. |  [optional]



