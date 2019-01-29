
# ProjectVersionIssueDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accuracy** | **Float** | Vulnerability accuracy |  [optional]
**analyzer** | **String** | Analyzer | 
**assignedUser** | [**AssignedUser**](AssignedUser.md) | User assigned to issue | 
**attackPayload** | **String** | Attack payload | 
**attackType** | [**AttackTypeEnum**](#AttackTypeEnum) | Attack type | 
**audited** | **Boolean** | Attribute is set to true if issue is audited (primary tag values is set for this issue) | 
**brief** | **String** | Issue brief | 
**className** | **String** | Name of class where the vulnerability has been found |  [optional]
**confidence** | **Float** | Issue confidence | 
**cookie** | **String** | Cookie | 
**customAttributes** | **Object** | All the additional custom attributes defined for the issue by parser plugin |  [optional]
**customTagValues** | [**List&lt;CustomTag&gt;**](CustomTag.md) | Custom tag values | 
**dataVersion** | **Integer** | Version of the issue data. This attribute is initialized only for issues parsed by 3rd party parsers and is not set for the issues parsed by standard parsers included in SSC installation. |  [optional]
**detail** | **String** | Issue detail | 
**displayEngineType** | **String** | Display engine type | 
**downloadRequest** | **Boolean** | Request contains binary or large data | 
**downloadResponse** | **Boolean** | Response contains binary or large data\&quot; | 
**engineCategory** | [**EngineCategoryEnum**](#EngineCategoryEnum) | Engine category | 
**engineType** | **String** | Engine type | 
**foundDate** | [**OffsetDateTime**](OffsetDateTime.md) | Issue found date | 
**friority** | **String** | Fortify priority order (Friority) | 
**fullFileName** | **String** | Full file name where issue found | 
**functionName** | **String** | Name of function located in the file where the vulnerability has been found |  [optional]
**hasViewTemplate** | **Boolean** | Flag that indicates if there is a view template that should be used to display issue details on UI. |  [optional]
**hidden** | **Boolean** | Set to true if issue is hidden | 
**id** | **Long** | Identifier |  [optional]
**impact** | **Float** | Issue impact | 
**issueInstanceId** | **String** | Issue instance identifier | 
**issueName** | **String** | Name of the issue category | 
**issueState** | **String** | Flag represents issue state and says if issue is not an issue or open issue. Rule to calculate value of thi flag is defined in issue template. | 
**issueStatus** | [**IssueStatusEnum**](#IssueStatusEnum) | Flag represents issue review status |  [optional]
**kingdom** | **String** | Issue kingdom | 
**lastScanId** | **Long** | ID of the latest scan that found the issue |  [optional]
**likelihood** | **Float** | Issue likelihood | 
**lineNumber** | **Integer** | Line number in the file where the vulnerability has been found |  [optional]
**mappedCategory** | **String** | Name of the Fortify category of the vulnerability |  [optional]
**method** | **String** | Method where issue found | 
**minVirtualCallConfidence** | **Float** | Confidence level which estimates that vulnerability found in virtual (overridden) function will be executed by tainted source |  [optional]
**packageName** | **String** | Name of package where the vulnerability has been found |  [optional]
**primaryRuleGuid** | **String** | Primary rule global unique identifier | 
**primaryTag** | [**IssuePrimaryTag**](IssuePrimaryTag.md) | Identifier, name and value of the custom tag that is selected as a primary tag for the project version the issue belongs to. |  [optional]
**probability** | **Float** | Vulnerability probability |  [optional]
**projectVersionId** | **Long** | Project version identifier | 
**recommendation** | **String** | Issue recommendation | 
**references** | **String** | References | 
**remediationConstant** | **Float** | Level of complexity to fix this vulnerability |  [optional]
**removedDate** | [**OffsetDateTime**](OffsetDateTime.md) | Issue removed date | 
**requestBody** | **String** | Request body | 
**requestHeader** | **String** | Request header | 
**requestParameter** | **String** | Request parameter | 
**requestTriggers** | [**List&lt;Trigger&gt;**](Trigger.md) | Triggers in the request |  [optional]
**response** | **String** | Response | 
**responseHeader** | **String** | Response header | 
**responseTriggers** | [**List&lt;Trigger&gt;**](Trigger.md) | Triggers in the response |  [optional]
**revision** | **Integer** | Revision number | 
**scanStatus** | **String** | Scan status | 
**severity** | **Float** | Issue severity | 
**shortFileName** | **String** | Short file name where issue found | 
**sink** | **String** | Taint sink name |  [optional]
**sinkContext** | **String** | Name of the context that contains vulnerability sink |  [optional]
**source** | **String** | Name of the a program point where tainted data enter the program |  [optional]
**sourceContext** | **String** | Name of the context that contains vulnerability sources |  [optional]
**sourceFile** | **String** | File name where vulnerability source is located. |  [optional]
**sourceLine** | **Integer** | Line number in the source file where vulnerability source is located |  [optional]
**suppressed** | **Boolean** | Set to true if issue is suppressed | 
**taintFlag** | **String** | An attribute of tainted data that enables the data flow analyzer to discriminate between different types of taint |  [optional]
**tips** | **String** | Issue tips | 
**traceNodes** | [**List&lt;List&lt;TraceNodeDto&gt;&gt;**](List.md) | Issue trace nodes | 
**triggerString** | **String** | Trigger string | 
**url** | **String** | Issue url | 
**vulnerableParameter** | **String** | Vulnerable parameter | 


<a name="AttackTypeEnum"></a>
## Enum: AttackTypeEnum
Name | Value
---- | -----
URL | &quot;URL&quot;
REQUEST_HEADER | &quot;REQUEST_HEADER&quot;
REQUEST_COOKIE | &quot;REQUEST_COOKIE&quot;
PARAMETER | &quot;PARAMETER&quot;
MULTIPLE | &quot;MULTIPLE&quot;


<a name="EngineCategoryEnum"></a>
## Enum: EngineCategoryEnum
Name | Value
---- | -----
STATIC | &quot;STATIC&quot;
DYNAMIC | &quot;DYNAMIC&quot;


<a name="IssueStatusEnum"></a>
## Enum: IssueStatusEnum
Name | Value
---- | -----
UNREVIEWED | &quot;Unreviewed&quot;
UNDER_REVIEW | &quot;Under Review&quot;
REVIEWED | &quot;Reviewed&quot;



