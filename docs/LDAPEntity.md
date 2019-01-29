
# LDAPEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**distinguishedName** | **String** | Distinguished name of LDAP entity | 
**email** | **String** | Email of LDAP entity | 
**firstName** | **String** | First name of LDAP entity | 
**id** | **Long** | LDAP entity identifier |  [optional]
**lastName** | **String** | Last name of LDAP entity | 
**ldapType** | [**LdapTypeEnum**](#LdapTypeEnum) | Type of LDAP entity. | 
**name** | **String** | LDAP entity name | 
**roles** | [**List&lt;Role&gt;**](Role.md) | List of roles pertaining to this LDAP entity | 
**userPhoto** | [**UserPhoto**](UserPhoto.md) | Photo object if LDAP entity is user |  [optional]


<a name="LdapTypeEnum"></a>
## Enum: LdapTypeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
GROUP | &quot;GROUP&quot;
USER | &quot;USER&quot;
ORG_UNIT | &quot;ORG_UNIT&quot;



