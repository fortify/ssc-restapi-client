
# LocalUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adminPassword** | **String** |  |  [optional]
**clearPassword** | **String** |  |  [optional]
**dateFrozen** | [**OffsetDateTime**](OffsetDateTime.md) | Date user&#39;s account was frozen | 
**email** | **String** |  | 
**failedLoginAttempts** | **Integer** | Number of failed login attempts | 
**firstName** | **String** |  | 
**id** | **Long** | ID required when referencing an existing Local User |  [optional]
**lastName** | **String** |  | 
**passwordNeverExpire** | **Boolean** | True if user&#39;s password never expires | 
**requirePasswordChange** | **Boolean** | Is user required to change password on first login? | 
**roles** | [**List&lt;Role&gt;**](Role.md) | List of Roles assigned to user | 
**suspended** | **Boolean** | True if user&#39;s account is locked | 
**userName** | **String** |  | 



