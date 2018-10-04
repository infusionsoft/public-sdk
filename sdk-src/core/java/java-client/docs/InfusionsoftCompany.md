
# InfusionsoftCompany

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**InfusionsoftCompanyAddress**](InfusionsoftCompanyAddress.md) |  |  [optional]
**companyName** | **String** |  |  [optional]
**customFields** | [**List&lt;InfusionsoftCustomFieldValue&gt;**](InfusionsoftCustomFieldValue.md) |  |  [optional]
**emailAddress** | **String** |  |  [optional]
**emailOptedIn** | **Boolean** |  |  [optional]
**emailStatus** | [**EmailStatusEnum**](#EmailStatusEnum) |  |  [optional]
**faxNumber** | [**InfusionsoftCompanyFaxNumber**](InfusionsoftCompanyFaxNumber.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**notes** | **String** |  |  [optional]
**phoneNumber** | [**InfusionsoftCompanyPhoneNumber**](InfusionsoftCompanyPhoneNumber.md) |  |  [optional]
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



