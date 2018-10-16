
# InfusionsoftFullContact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | [**List&lt;InfusionsoftAddress&gt;**](InfusionsoftAddress.md) |  |  [optional]
**anniversary** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**birthday** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**company** | [**InfusionsoftCompanyReference**](InfusionsoftCompanyReference.md) |  |  [optional]
**contactType** | **String** |  |  [optional]
**customFields** | [**List&lt;InfusionsoftCustomFieldValue&gt;**](InfusionsoftCustomFieldValue.md) |  |  [optional]
**dateCreated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**emailAddresses** | [**List&lt;InfusionsoftEmailAddress&gt;**](InfusionsoftEmailAddress.md) |  |  [optional]
**emailOptedIn** | **Boolean** |  |  [optional]
**emailStatus** | [**EmailStatusEnum**](#EmailStatusEnum) |  |  [optional]
**familyName** | **String** |  |  [optional]
**faxNumbers** | [**List&lt;InfusionsoftFaxNumber&gt;**](InfusionsoftFaxNumber.md) |  |  [optional]
**givenName** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**jobTitle** | **String** |  |  [optional]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**leadSourceId** | **Long** |  |  [optional]
**middleName** | **String** |  |  [optional]
**notes** | **String** |  |  [optional]
**optInReason** | **String** |  |  [optional]
**origin** | [**InfusionsoftContactOrigin**](InfusionsoftContactOrigin.md) |  |  [optional]
**ownerId** | **Long** |  |  [optional]
**phoneNumbers** | [**List&lt;InfusionsoftPhoneNumber&gt;**](InfusionsoftPhoneNumber.md) |  |  [optional]
**preferredLocale** | **String** |  |  [optional]
**preferredName** | **String** |  |  [optional]
**prefix** | **String** |  |  [optional]
**relationships** | [**List&lt;InfusionsoftRelationship&gt;**](InfusionsoftRelationship.md) |  |  [optional]
**socialAccounts** | [**List&lt;InfusionsoftSocialAccount&gt;**](InfusionsoftSocialAccount.md) |  |  [optional]
**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  |  [optional]
**spouseName** | **String** |  |  [optional]
**suffix** | **String** |  |  [optional]
**tagIds** | **List&lt;Long&gt;** |  |  [optional]
**timeZone** | **String** |  |  [optional]
**website** | **String** |  |  [optional]


<a name="EmailStatusEnum"></a>
## Enum: EmailStatusEnum
Name | Value
---- | -----
UNENGAGED_MARKETABLE | &quot;Unengaged Marketable&quot;
UNCONFIRMED | &quot;Unconfirmed&quot;
CONFIRMED_LEGACY_ | &quot;Confirmed (Legacy)&quot;
CONFIRMED | &quot;Confirmed&quot;
UNENGAGED_NONMARKETABLE | &quot;Unengaged NonMarketable&quot;
NON_MARKETABLE | &quot;Non-marketable&quot;
LOCKDOWN | &quot;Lockdown&quot;
SOFT_BOUNCE | &quot;Soft Bounce&quot;
HARD_BOUNCE | &quot;Hard Bounce&quot;
OPT_OUT | &quot;Opt-Out&quot;
OPT_OUT_ADMIN | &quot;Opt-Out: Admin&quot;
OPT_OUT_SYSTEM | &quot;Opt-Out: System&quot;
LIST_UNSUBSCRIBE | &quot;List Unsubscribe&quot;
PROVIDED_FEEDBACK | &quot;Provided Feedback&quot;
REPORTED_SPAM | &quot;Reported Spam&quot;
INVALID_EMAIL | &quot;Invalid Email&quot;


<a name="SourceTypeEnum"></a>
## Enum: SourceTypeEnum
Name | Value
---- | -----
WEBFORM | &quot;WEBFORM&quot;
LANDINGPAGE | &quot;LANDINGPAGE&quot;
IMPORT | &quot;IMPORT&quot;
MANUAL | &quot;MANUAL&quot;
API | &quot;API&quot;
OTHER | &quot;OTHER&quot;
UNKNOWN | &quot;UNKNOWN&quot;



