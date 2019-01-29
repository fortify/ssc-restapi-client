
# AuthenticationToken

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time the token was created (in ISO 8601 format) |  [optional]
**description** | **String** | Purpose for which the token was requested. |  [optional]
**id** | **Long** | Unique identifier of token |  [optional]
**remainingUsages** | **Integer** | The remaining number of api calls that can be made using this token. A value of -1 denotes unlimited number of calls. |  [optional]
**terminalDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time the token expires (in ISO 8601 format). If not specified, it will default to the maximum lifetime for this token type. |  [optional]
**token** | **String** | String that represents the authentication token. (For security reasons, this value is null except for a successful token creation response.) |  [optional]
**type** | **String** | Token type | 
**username** | **String** | Username of token owner |  [optional]



