
# TraceNodeDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**childNodes** | [**List&lt;TraceNodeDto&gt;**](TraceNodeDto.md) | Child nodes of the current node. | 
**detail** | **Boolean** | Detail node marker. | 
**evidence** | **String** | Node evidence text. | 
**file** | **String** | Name of the file associated with this node. | 
**fullPath** | **String** | Full path to source file associated with this node. | 
**line** | **Integer** | Source file line number where issue was found. | 
**nodeType** | [**NodeTypeEnum**](#NodeTypeEnum) | Type of the trace node. | 
**primary** | **Boolean** | Primry node marker. | 
**text** | **String** | Node display text. | 
**toolTip** | **String** | Node description/tooltip. | 


<a name="NodeTypeEnum"></a>
## Enum: NodeTypeEnum
Name | Value
---- | -----
IN_CALL | &quot;IN_CALL&quot;
OUT_CALL | &quot;OUT_CALL&quot;
IN_OUT_CALL | &quot;IN_OUT_CALL&quot;
READ | &quot;READ&quot;
READ_GLOBAL | &quot;READ_GLOBAL&quot;
ASSIGN | &quot;ASSIGN&quot;
ASSIGN_GLOBAL | &quot;ASSIGN_GLOBAL&quot;
ALIAS | &quot;ALIAS&quot;
COMPARE | &quot;COMPARE&quot;
RETURN | &quot;RETURN&quot;
REF | &quot;REF&quot;
DEREF | &quot;DEREF&quot;
END_SCOPE | &quot;END_SCOPE&quot;
JUMP | &quot;JUMP&quot;
BRANCH_TAKEN | &quot;BRANCH_TAKEN&quot;
BRANCH_NOT_TAKEN | &quot;BRANCH_NOT_TAKEN&quot;
EXTERNAL_ENTRY | &quot;EXTERNAL_ENTRY&quot;
RUNTIME_SINK | &quot;RUNTIME_SINK&quot;
RUNTIME_SOURCE | &quot;RUNTIME_SOURCE&quot;
RUNTIME_VALIDATION | &quot;RUNTIME_VALIDATION&quot;
RUNTIME_TRACE | &quot;RUNTIME_TRACE&quot;
TRACE_RUNTIME_SOURCE | &quot;TRACE_RUNTIME_SOURCE&quot;
TRACE_RUNTIME_SINK | &quot;TRACE_RUNTIME_SINK&quot;
TAINT_CHANGE | &quot;TAINT_CHANGE&quot;
GENERIC | &quot;GENERIC&quot;



