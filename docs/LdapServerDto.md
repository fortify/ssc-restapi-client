
# LdapServerDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeDistinguishedName** | **String** |  | 
**attributeEmail** | **String** |  | 
**attributeFirstName** | **String** |  | 
**attributeGroupname** | **String** |  | 
**attributeLastName** | **String** |  | 
**attributeMember** | **String** |  | 
**attributeMemberOf** | **String** |  | 
**attributeObjectClass** | **String** |  | 
**attributeObjectSid** | **String** |  |  [optional]
**attributeOrgunitName** | **String** |  | 
**attributePassword** | **String** |  | 
**attributeThumbnailMimeDefault** | **String** |  |  [optional]
**attributeThumbnailPhoto** | **String** |  |  [optional]
**attributeUserName** | **String** |  | 
**authenticatorType** | [**AuthenticatorTypeEnum**](#AuthenticatorTypeEnum) |  | 
**baseDn** | **String** | Distinguished name (DN) of root (base) LDAP entity SSC has access to. If value is set to not empty entity&#39;s DN, SSC has access only to this entity and all its children. If value of this attribute is an empty string, SSC has access to whole LDAP entities tree | 
**baseObjectSid** | **String** |  |  [optional]
**cacheEnabled** | **Boolean** |  | 
**cacheEvictionTime** | **Integer** |  | 
**cacheExecutorPoolSize** | **Integer** |  | 
**cacheExecutorPoolSizeMax** | **Integer** |  | 
**cacheMaxThreadsPerCache** | **Integer** |  | 
**checkSslHostname** | **Boolean** |  | 
**checkSslTrust** | **Boolean** |  | 
**classGroup** | **String** |  | 
**classOrgunit** | **String** |  | 
**classUser** | **String** |  | 
**defaultServer** | **Boolean** | Boolean flag that marks LDAP server as default. Default means the server which configuration was imported from ldap.properties legacy configuration file | 
**enabled** | **Boolean** | Flag that marks server as enabled. All enabled servers are used by SSC. Server can be temporary disabled if it is temporary down. | 
**id** | **Long** | LDAP Server id | 
**ignorePartialResultException** | **Boolean** |  | 
**nestedGroupsEnabled** | **Boolean** |  | 
**objectVersion** | **Integer** | Version of the LDAP server entity to support editing LDAP server entity by multiply administrators | 
**pageSize** | **Integer** |  | 
**pagingEnabled** | **Boolean** |  | 
**passwordEncoderType** | [**PasswordEncoderTypeEnum**](#PasswordEncoderTypeEnum) |  | 
**referralsProcessingStrategy** | [**ReferralsProcessingStrategyEnum**](#ReferralsProcessingStrategyEnum) |  | 
**saveWithoutValidation** | **Boolean** |  |  [optional]
**searchDns** | **String** |  |  [optional]
**serverName** | **String** | Name of the LDAP server to distinguish it from other servers | 
**url** | **String** |  | 
**userDn** | **String** |  | 
**userPassword** | **String** |  | 
**userPhotoEnabled** | **Boolean** |  | 
**validationIdleTime** | **Integer** |  | 
**validationTimeLimit** | **Integer** |  | 


<a name="AuthenticatorTypeEnum"></a>
## Enum: AuthenticatorTypeEnum
Name | Value
---- | -----
BIND_AUTHENTICATOR | &quot;BIND_AUTHENTICATOR&quot;
PASSWORD_COMPARISON_AUTHENTICATOR | &quot;PASSWORD_COMPARISON_AUTHENTICATOR&quot;


<a name="PasswordEncoderTypeEnum"></a>
## Enum: PasswordEncoderTypeEnum
Name | Value
---- | -----
NOT_SET | &quot;NOT_SET&quot;
LDAP_SHA_PASSWORD_ENCODER | &quot;LDAP_SHA_PASSWORD_ENCODER&quot;
MD4_PASSWORD_ENCODER | &quot;MD4_PASSWORD_ENCODER&quot;
MD5_PASSWORD_ENCODER | &quot;MD5_PASSWORD_ENCODER&quot;
SHA_PASSWORD_ENCODER | &quot;SHA_PASSWORD_ENCODER&quot;


<a name="ReferralsProcessingStrategyEnum"></a>
## Enum: ReferralsProcessingStrategyEnum
Name | Value
---- | -----
IGNORE | &quot;ignore&quot;
FOLLOW | &quot;follow&quot;



