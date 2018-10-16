# infusionsoft-api

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.infusionsoft</groupId>
    <artifactId>infusionsoft-api</artifactId>
    <version>V1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.infusionsoft:infusionsoft-api:V1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/infusionsoft-api-V1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.infusionsoft.*;
import com.infusionsoft.auth.*;
import com.infusionsoft.model.*;
import com.infusionsoft.api.AccountInfoApi;

import java.io.File;
import java.util.*;

public class AccountInfoApiExample {

    public static void main(String[] args) {
        
        AccountInfoApi apiInstance = new AccountInfoApi();
        try {
            InfusionsoftAccountProfile result = apiInstance.getAccountProfileUsingGET();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountInfoApi#getAccountProfileUsingGET");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.infusionsoft.comapi.infusionsoft.com/crm/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountInfoApi* | [**getAccountProfileUsingGET**](docs/AccountInfoApi.md#getAccountProfileUsingGET) | **GET** /account/profile | Retrieve account profile
*AccountInfoApi* | [**updateAccountInfoUsingPUT**](docs/AccountInfoApi.md#updateAccountInfoUsingPUT) | **PUT** /account/profile | Updates an account profile
*AffiliateApi* | [**retrieveAffiliateModelUsingGET**](docs/AffiliateApi.md#retrieveAffiliateModelUsingGET) | **GET** /affiliates/model | Retrieve Affiliate Model
*AffiliateApi* | [**searchCommissionsUsingGET**](docs/AffiliateApi.md#searchCommissionsUsingGET) | **GET** /affiliates/commissions | Retrieve Commissions
*AppointmentApi* | [**createAppointmentUsingPOST**](docs/AppointmentApi.md#createAppointmentUsingPOST) | **POST** /appointments | Create an Appointment
*AppointmentApi* | [**deleteAppointmentUsingDELETE**](docs/AppointmentApi.md#deleteAppointmentUsingDELETE) | **DELETE** /appointments/{appointmentId} | Delete an Appointment
*AppointmentApi* | [**getAppointmentUsingGET**](docs/AppointmentApi.md#getAppointmentUsingGET) | **GET** /appointments/{appointmentId} | Retrieve an Appointment
*AppointmentApi* | [**listAppointmentsUsingGET**](docs/AppointmentApi.md#listAppointmentsUsingGET) | **GET** /appointments | List Appointments
*AppointmentApi* | [**retrieveAppointmentModelUsingGET**](docs/AppointmentApi.md#retrieveAppointmentModelUsingGET) | **GET** /appointments/model | Retrieve Appointment Model
*AppointmentApi* | [**updateAppointmentUsingPUT**](docs/AppointmentApi.md#updateAppointmentUsingPUT) | **PUT** /appointments/{appointmentId} | Replace an Appointment
*AppointmentApi* | [**updatePropertiesOnAppointmentUsingPATCH**](docs/AppointmentApi.md#updatePropertiesOnAppointmentUsingPATCH) | **PATCH** /appointments/{appointmentId} | Update an Appointment
*CampaignApi* | [**addContactToCampaignSequenceUsingPOST**](docs/CampaignApi.md#addContactToCampaignSequenceUsingPOST) | **POST** /campaigns/{campaignId}/sequences/{sequenceId}/contacts/{contactId} | Add to Campaign Sequence
*CampaignApi* | [**addContactsToCampaignSequenceUsingPOST**](docs/CampaignApi.md#addContactsToCampaignSequenceUsingPOST) | **POST** /campaigns/{campaignId}/sequences/{sequenceId}/contacts | Add Multiple to Campaign Sequence
*CampaignApi* | [**getCampaignUsingGET**](docs/CampaignApi.md#getCampaignUsingGET) | **GET** /campaigns/{campaignId} | Retrieve a Campaign
*CampaignApi* | [**listCampaignsUsingGET**](docs/CampaignApi.md#listCampaignsUsingGET) | **GET** /campaigns | List Campaigns
*CampaignApi* | [**removeContactFromCampaignSequenceUsingDELETE**](docs/CampaignApi.md#removeContactFromCampaignSequenceUsingDELETE) | **DELETE** /campaigns/{campaignId}/sequences/{sequenceId}/contacts/{contactId} | Remove from Campaign Sequence
*CampaignApi* | [**removeContactsFromCampaignSequenceUsingDELETE**](docs/CampaignApi.md#removeContactsFromCampaignSequenceUsingDELETE) | **DELETE** /campaigns/{campaignId}/sequences/{sequenceId}/contacts | Remove Multiple from Campaign Sequence
*CompanyApi* | [**createCompanyUsingPOST**](docs/CompanyApi.md#createCompanyUsingPOST) | **POST** /companies | Create a Company
*CompanyApi* | [**listCompaniesUsingGET**](docs/CompanyApi.md#listCompaniesUsingGET) | **GET** /companies | List Companies
*CompanyApi* | [**retrieveCompanyModelUsingGET**](docs/CompanyApi.md#retrieveCompanyModelUsingGET) | **GET** /companies/model | Retrieve Company Model
*CompanyApi* | [**updatePropertiesOnContactUsingPATCH**](docs/CompanyApi.md#updatePropertiesOnContactUsingPATCH) | **PATCH** /company/{companyId} | Update a Company
*ContactApi* | [**applyTagsToContactIdUsingPOST**](docs/ContactApi.md#applyTagsToContactIdUsingPOST) | **POST** /contacts/{contactId}/tags | Apply Tags
*ContactApi* | [**createContactUsingPOST**](docs/ContactApi.md#createContactUsingPOST) | **POST** /contacts | Create a Contact
*ContactApi* | [**createCreditCardUsingPOST**](docs/ContactApi.md#createCreditCardUsingPOST) | **POST** /contacts/{contactId}/creditCards | Create a Credit Card
*ContactApi* | [**createCustomFieldUsingPOST**](docs/ContactApi.md#createCustomFieldUsingPOST) | **POST** /contacts/model/customFields | Create a Custom Field
*ContactApi* | [**createEmailForContactUsingPOST**](docs/ContactApi.md#createEmailForContactUsingPOST) | **POST** /contacts/{contactId}/emails | Create an Email Record
*ContactApi* | [**createOrUpdateContactUsingPUT**](docs/ContactApi.md#createOrUpdateContactUsingPUT) | **PUT** /contacts | Create or Update a Contact
*ContactApi* | [**deleteContactUsingDELETE**](docs/ContactApi.md#deleteContactUsingDELETE) | **DELETE** /contacts/{contactId} | Delete a Contact
*ContactApi* | [**getContactUsingGET**](docs/ContactApi.md#getContactUsingGET) | **GET** /contacts/{id} | Retrieve a Contact
*ContactApi* | [**listAppliedTagsUsingGET**](docs/ContactApi.md#listAppliedTagsUsingGET) | **GET** /contacts/{contactId}/tags | List Applied Tags
*ContactApi* | [**listContactsUsingGET**](docs/ContactApi.md#listContactsUsingGET) | **GET** /contacts | List Contacts
*ContactApi* | [**listCreditCardsUsingGET**](docs/ContactApi.md#listCreditCardsUsingGET) | **GET** /contacts/{contactId}/creditCards | Retrieve Credit Cards
*ContactApi* | [**listEmailsForContactUsingGET**](docs/ContactApi.md#listEmailsForContactUsingGET) | **GET** /contacts/{contactId}/emails | List Emails
*ContactApi* | [**removeTagsFromContactUsingDELETE**](docs/ContactApi.md#removeTagsFromContactUsingDELETE) | **DELETE** /contacts/{contactId}/tags | Remove Applied Tags
*ContactApi* | [**removeTagsFromContactUsingDELETE1**](docs/ContactApi.md#removeTagsFromContactUsingDELETE1) | **DELETE** /contacts/{contactId}/tags/{tagId} | Remove Applied Tag
*ContactApi* | [**retrieveContactModelUsingGET**](docs/ContactApi.md#retrieveContactModelUsingGET) | **GET** /contacts/model | Retrieve Contact Model
*ContactApi* | [**updatePropertiesOnContactUsingPATCH1**](docs/ContactApi.md#updatePropertiesOnContactUsingPATCH1) | **PATCH** /contacts/{contactId} | Update a Contact
*ECommerceApi* | [**createOrderItemsOnOrderUsingPOST**](docs/ECommerceApi.md#createOrderItemsOnOrderUsingPOST) | **POST** /orders/{orderId}/items | Create an Order Item
*ECommerceApi* | [**createOrderUsingPOST**](docs/ECommerceApi.md#createOrderUsingPOST) | **POST** /orders | Create an Order
*ECommerceApi* | [**createPaymentOnOrderUsingPOST**](docs/ECommerceApi.md#createPaymentOnOrderUsingPOST) | **POST** /orders/{orderId}/payments | Create a Payment
*ECommerceApi* | [**deleteOrderOrderItemUsingDELETE**](docs/ECommerceApi.md#deleteOrderOrderItemUsingDELETE) | **DELETE** /orders/{orderId}/items/{orderItemId} | Delete an Order Item
*ECommerceApi* | [**deleteOrderUsingDELETE**](docs/ECommerceApi.md#deleteOrderUsingDELETE) | **DELETE** /orders/{orderId} | Delete an Order
*ECommerceApi* | [**getOrderUsingGET**](docs/ECommerceApi.md#getOrderUsingGET) | **GET** /orders/{orderId} | Retrieve an Order
*ECommerceApi* | [**getTransactionUsingGET**](docs/ECommerceApi.md#getTransactionUsingGET) | **GET** /transactions/{transactionId} | Retrieve a Transaction
*ECommerceApi* | [**listOrdersUsingGET**](docs/ECommerceApi.md#listOrdersUsingGET) | **GET** /orders | List Orders
*ECommerceApi* | [**listTransactionsForOrderUsingGET**](docs/ECommerceApi.md#listTransactionsForOrderUsingGET) | **GET** /orders/{orderId}/transactions | Retrieve Order Transactions
*ECommerceApi* | [**listTransactionsUsingGET**](docs/ECommerceApi.md#listTransactionsUsingGET) | **GET** /transactions | List Transactions
*ECommerceApi* | [**replacePaymentPlanUsingPUT**](docs/ECommerceApi.md#replacePaymentPlanUsingPUT) | **PUT** /orders/{orderId}/paymentPlan | Replace an Order Pay Plan
*ECommerceApi* | [**retrieveOrderModelUsingGET**](docs/ECommerceApi.md#retrieveOrderModelUsingGET) | **GET** /orders/model | Retrieve Custom Order Model
*ECommerceApi* | [**retrieveSubscriptionModelUsingGET**](docs/ECommerceApi.md#retrieveSubscriptionModelUsingGET) | **GET** /subscriptions/model | Retrieve Subscription Model
*EmailApi* | [**createEmailUsingPOST**](docs/EmailApi.md#createEmailUsingPOST) | **POST** /emails | Create an Email Record
*EmailApi* | [**createEmailsUsingPOST**](docs/EmailApi.md#createEmailsUsingPOST) | **POST** /emails/sync | Create a set of Email Records
*EmailApi* | [**deleteEmailUsingDELETE**](docs/EmailApi.md#deleteEmailUsingDELETE) | **DELETE** /emails/{id} | Delete an Email Record
*EmailApi* | [**deleteEmailsUsingPOST**](docs/EmailApi.md#deleteEmailsUsingPOST) | **POST** /emails/unsync | Un-sync a batch of Email Records
*EmailApi* | [**getEmailUsingGET**](docs/EmailApi.md#getEmailUsingGET) | **GET** /emails/{id} | Retrieve an Email
*EmailApi* | [**listEmailsUsingGET**](docs/EmailApi.md#listEmailsUsingGET) | **GET** /emails | List Emails
*EmailApi* | [**sendEmailUsingPOST**](docs/EmailApi.md#sendEmailUsingPOST) | **POST** /emails/queue | Send an Email
*EmailApi* | [**updateEmailUsingPUT**](docs/EmailApi.md#updateEmailUsingPUT) | **PUT** /emails/{id} | Update an Email Record
*EmailAddressApi* | [**replaceEmailAddressUsingPUT**](docs/EmailAddressApi.md#replaceEmailAddressUsingPUT) | **PUT** /emailAddresses/{email} | Replace an Email Address
*FileApi* | [**createFileUsingPOST**](docs/FileApi.md#createFileUsingPOST) | **POST** /files | Upload File
*FileApi* | [**deleteFileUsingDELETE**](docs/FileApi.md#deleteFileUsingDELETE) | **DELETE** /files/{fileId} | Delete File
*FileApi* | [**getFileUsingGET**](docs/FileApi.md#getFileUsingGET) | **GET** /files/{fileId} | Retrieve File
*FileApi* | [**listFilesUsingGET**](docs/FileApi.md#listFilesUsingGET) | **GET** /files | List Files
*FileApi* | [**updateFileUsingPUT**](docs/FileApi.md#updateFileUsingPUT) | **PUT** /files/{fileId} | Replace File
*LocaleApi* | [**listCountriesUsingGET**](docs/LocaleApi.md#listCountriesUsingGET) | **GET** /locales/countries | List Countries
*LocaleApi* | [**listCountriesUsingGET1**](docs/LocaleApi.md#listCountriesUsingGET1) | **GET** /locales/countries/{countryCode}/provinces | List a Country&#39;s Provinces
*MerchantApi* | [**getMerchantAccountsUsingGET**](docs/MerchantApi.md#getMerchantAccountsUsingGET) | **GET** /merchants | List Merchants
*NoteApi* | [**createNoteUsingPOST**](docs/NoteApi.md#createNoteUsingPOST) | **POST** /notes | Create a Note
*NoteApi* | [**deleteNoteUsingDELETE**](docs/NoteApi.md#deleteNoteUsingDELETE) | **DELETE** /notes/{noteId} | Delete a Note
*NoteApi* | [**getNoteUsingGET**](docs/NoteApi.md#getNoteUsingGET) | **GET** /notes/{noteId} | Retrieve a Note
*NoteApi* | [**listNotesUsingGET**](docs/NoteApi.md#listNotesUsingGET) | **GET** /notes | List Notes
*NoteApi* | [**updateNoteUsingPUT**](docs/NoteApi.md#updateNoteUsingPUT) | **PUT** /notes/{noteId} | Replace a Note
*NoteApi* | [**updatePropertiesOnNoteUsingPATCH**](docs/NoteApi.md#updatePropertiesOnNoteUsingPATCH) | **PATCH** /notes/{noteId} | Update a Note
*OpportunityApi* | [**createOpportunityUsingPOST**](docs/OpportunityApi.md#createOpportunityUsingPOST) | **POST** /opportunities | Create an Opportunity
*OpportunityApi* | [**getOpportunityUsingGET**](docs/OpportunityApi.md#getOpportunityUsingGET) | **GET** /opportunities/{opportunityId} | Retrieve an Opportunity
*OpportunityApi* | [**listOpportunitiesUsingGET**](docs/OpportunityApi.md#listOpportunitiesUsingGET) | **GET** /opportunities | List Opportunities
*OpportunityApi* | [**listOpportunityStagePipelinesUsingGET**](docs/OpportunityApi.md#listOpportunityStagePipelinesUsingGET) | **GET** /opportunity/stage_pipeline | List Opportunity Stage Pipeline
*OpportunityApi* | [**retrieveOpportunityModelUsingGET**](docs/OpportunityApi.md#retrieveOpportunityModelUsingGET) | **GET** /opportunities/model | Retrieve Opportunity Model
*OpportunityApi* | [**updateOpportunityUsingPUT**](docs/OpportunityApi.md#updateOpportunityUsingPUT) | **PUT** /opportunities | Replace an Opportunity
*OpportunityApi* | [**updatePropertiesOnOpportunityUsingPATCH**](docs/OpportunityApi.md#updatePropertiesOnOpportunityUsingPATCH) | **PATCH** /opportunities/{opportunityId} | Update an Opportunity
*ProductApi* | [**createProductImageUsingPOST**](docs/ProductApi.md#createProductImageUsingPOST) | **POST** /products/{productId}/image | Upload a product image
*ProductApi* | [**createProductSubscriptionUsingPOST**](docs/ProductApi.md#createProductSubscriptionUsingPOST) | **POST** /products/{productId}/subscriptions | Create a Product Subscription
*ProductApi* | [**createProductUsingPOST**](docs/ProductApi.md#createProductUsingPOST) | **POST** /products | Create a Product
*ProductApi* | [**deleteProductImageUsingDELETE**](docs/ProductApi.md#deleteProductImageUsingDELETE) | **DELETE** /products/{productId}/image | Delete a product image
*ProductApi* | [**deleteProductSubscriptionUsingDELETE**](docs/ProductApi.md#deleteProductSubscriptionUsingDELETE) | **DELETE** /products/{productId}/subscriptions/{subscriptionId} | Delete a Product Subscription
*ProductApi* | [**deleteProductUsingDELETE**](docs/ProductApi.md#deleteProductUsingDELETE) | **DELETE** /products/{productId} | Delete a Product
*ProductApi* | [**listProductsFromSyncTokenUsingGET**](docs/ProductApi.md#listProductsFromSyncTokenUsingGET) | **GET** /products/sync | Retrieve Synced Products
*ProductApi* | [**listProductsUsingGET**](docs/ProductApi.md#listProductsUsingGET) | **GET** /products | List Products
*ProductApi* | [**retrieveProductSubscriptionUsingGET**](docs/ProductApi.md#retrieveProductSubscriptionUsingGET) | **GET** /products/{productId}/subscriptions/{subscriptionId} | Retrieve a Product Subscription
*ProductApi* | [**retrieveProductUsingGET**](docs/ProductApi.md#retrieveProductUsingGET) | **GET** /products/{productId} | Retrieve a Product
*RestHooksApi* | [**createAHookSubscription**](docs/RestHooksApi.md#createAHookSubscription) | **POST** /hooks | Create a Hook Subscription
*RestHooksApi* | [**deleteAHookSubscription**](docs/RestHooksApi.md#deleteAHookSubscription) | **DELETE** /hooks/{key} | Delete a Hook Subscription
*RestHooksApi* | [**listHookEventTypes**](docs/RestHooksApi.md#listHookEventTypes) | **GET** /hooks/event_keys | List Hook Event Types
*RestHooksApi* | [**listStoredHookSubscriptions**](docs/RestHooksApi.md#listStoredHookSubscriptions) | **GET** /hooks | List Stored Hook Subscriptions
*RestHooksApi* | [**retrieveAHookSubscription**](docs/RestHooksApi.md#retrieveAHookSubscription) | **GET** /hooks/{key} | Retrieve a Hook Subscription
*RestHooksApi* | [**updateAHookSubscription**](docs/RestHooksApi.md#updateAHookSubscription) | **PUT** /hooks/{key} | Update a Hook Subscription
*RestHooksApi* | [**verifyAHookSubscription**](docs/RestHooksApi.md#verifyAHookSubscription) | **POST** /hooks/{key}/verify | Verify a Hook Subscription
*RestHooksApi* | [**verifyAHookSubscriptionDelayed**](docs/RestHooksApi.md#verifyAHookSubscriptionDelayed) | **POST** /hooks/{key}/delayedVerify | Verify a Hook Subscription, Delayed
*SettingApi* | [**getApplicationEnabledUsingGET**](docs/SettingApi.md#getApplicationEnabledUsingGET) | **GET** /setting/application/enabled | Retrieve application status
*SettingApi* | [**getContactOptionTypesUsingGET**](docs/SettingApi.md#getContactOptionTypesUsingGET) | **GET** /setting/contact/optionTypes | List Contact types
*TagsApi* | [**applyTagToContactIdsUsingPOST**](docs/TagsApi.md#applyTagToContactIdsUsingPOST) | **POST** /tags/{tagId}/contacts | Apply Tag to Contacts
*TagsApi* | [**createTagCategoryUsingPOST**](docs/TagsApi.md#createTagCategoryUsingPOST) | **POST** /tags/categories | Create Tag Category
*TagsApi* | [**createTagUsingPOST**](docs/TagsApi.md#createTagUsingPOST) | **POST** /tags | Create Tag
*TagsApi* | [**getTagUsingGET**](docs/TagsApi.md#getTagUsingGET) | **GET** /tags/{id} | Retrieve a Tag
*TagsApi* | [**listCompaniesForTagIdUsingGET**](docs/TagsApi.md#listCompaniesForTagIdUsingGET) | **GET** /tags/{tagId}/companies | List Tagged Companies
*TagsApi* | [**listContactsForTagIdUsingGET**](docs/TagsApi.md#listContactsForTagIdUsingGET) | **GET** /tags/{tagId}/contacts | List Tagged Contacts
*TagsApi* | [**listTagsUsingGET**](docs/TagsApi.md#listTagsUsingGET) | **GET** /tags | List Tags
*TagsApi* | [**removeTagFromContactIdUsingDELETE**](docs/TagsApi.md#removeTagFromContactIdUsingDELETE) | **DELETE** /tags/{tagId}/contacts/{contactId} | Remove Tag from Contact
*TagsApi* | [**removeTagFromContactIdsUsingDELETE**](docs/TagsApi.md#removeTagFromContactIdsUsingDELETE) | **DELETE** /tags/{tagId}/contacts | Remove Tag from Contacts
*TaskApi* | [**createTaskUsingPOST**](docs/TaskApi.md#createTaskUsingPOST) | **POST** /tasks | Create a Task
*TaskApi* | [**deleteTaskUsingDELETE**](docs/TaskApi.md#deleteTaskUsingDELETE) | **DELETE** /tasks/{taskId} | Delete a Task
*TaskApi* | [**getTaskUsingGET**](docs/TaskApi.md#getTaskUsingGET) | **GET** /tasks/{taskId} | Retrieve a Task
*TaskApi* | [**listTasksForCurrentUserUsingGET**](docs/TaskApi.md#listTasksForCurrentUserUsingGET) | **GET** /tasks/search | Search Tasks
*TaskApi* | [**listTasksUsingGET**](docs/TaskApi.md#listTasksUsingGET) | **GET** /tasks | List Tasks
*TaskApi* | [**retrieveTaskModelUsingGET**](docs/TaskApi.md#retrieveTaskModelUsingGET) | **GET** /tasks/model | Retrieve Task Model
*TaskApi* | [**updatePropertiesOnTaskUsingPATCH**](docs/TaskApi.md#updatePropertiesOnTaskUsingPATCH) | **PATCH** /tasks/{taskId} | Update a Task
*TaskApi* | [**updateTaskUsingPUT**](docs/TaskApi.md#updateTaskUsingPUT) | **PUT** /tasks/{taskId} | Replace a Task
*UserInfoApi* | [**getUserInfoUsingGET**](docs/UserInfoApi.md#getUserInfoUsingGET) | **GET** /oauth/connect/userinfo | Retrieve User Info
*UsersApi* | [**createUserUsingPOST**](docs/UsersApi.md#createUserUsingPOST) | **POST** /users | Create a User
*UsersApi* | [**listUsersUsingGET**](docs/UsersApi.md#listUsersUsingGET) | **GET** /users | List Users


## Documentation for Models

 - [InfusionsoftAccountProfile](docs/InfusionsoftAccountProfile.md)
 - [InfusionsoftAddress](docs/InfusionsoftAddress.md)
 - [InfusionsoftAddressInformation](docs/InfusionsoftAddressInformation.md)
 - [InfusionsoftAffiliateCommission](docs/InfusionsoftAffiliateCommission.md)
 - [InfusionsoftAffiliateCommissionList](docs/InfusionsoftAffiliateCommissionList.md)
 - [InfusionsoftAppointment](docs/InfusionsoftAppointment.md)
 - [InfusionsoftAppointmentList](docs/InfusionsoftAppointmentList.md)
 - [InfusionsoftBasicCompany](docs/InfusionsoftBasicCompany.md)
 - [InfusionsoftBasicContact](docs/InfusionsoftBasicContact.md)
 - [InfusionsoftCampaign](docs/InfusionsoftCampaign.md)
 - [InfusionsoftCampaignLandingPageNodeDTO](docs/InfusionsoftCampaignLandingPageNodeDTO.md)
 - [InfusionsoftCampaignList](docs/InfusionsoftCampaignList.md)
 - [InfusionsoftCampaignNodeDTO](docs/InfusionsoftCampaignNodeDTO.md)
 - [InfusionsoftCategoryReference](docs/InfusionsoftCategoryReference.md)
 - [InfusionsoftCheckListItemDetails](docs/InfusionsoftCheckListItemDetails.md)
 - [InfusionsoftCompany](docs/InfusionsoftCompany.md)
 - [InfusionsoftCompanyAddress](docs/InfusionsoftCompanyAddress.md)
 - [InfusionsoftCompanyFaxNumber](docs/InfusionsoftCompanyFaxNumber.md)
 - [InfusionsoftCompanyList](docs/InfusionsoftCompanyList.md)
 - [InfusionsoftCompanyPhoneNumber](docs/InfusionsoftCompanyPhoneNumber.md)
 - [InfusionsoftCompanyReference](docs/InfusionsoftCompanyReference.md)
 - [InfusionsoftContactCreditCard](docs/InfusionsoftContactCreditCard.md)
 - [InfusionsoftContactList](docs/InfusionsoftContactList.md)
 - [InfusionsoftContactOrigin](docs/InfusionsoftContactOrigin.md)
 - [InfusionsoftContactTag](docs/InfusionsoftContactTag.md)
 - [InfusionsoftContactTagList](docs/InfusionsoftContactTagList.md)
 - [InfusionsoftCountriesByCode](docs/InfusionsoftCountriesByCode.md)
 - [InfusionsoftCreateContactOrigin](docs/InfusionsoftCreateContactOrigin.md)
 - [InfusionsoftCreateOrPatchCompany](docs/InfusionsoftCreateOrPatchCompany.md)
 - [InfusionsoftCreateOrPatchContact](docs/InfusionsoftCreateOrPatchContact.md)
 - [InfusionsoftCreateOrder](docs/InfusionsoftCreateOrder.md)
 - [InfusionsoftCreateOrderItem](docs/InfusionsoftCreateOrderItem.md)
 - [InfusionsoftCreatePayment](docs/InfusionsoftCreatePayment.md)
 - [InfusionsoftCreateProduct](docs/InfusionsoftCreateProduct.md)
 - [InfusionsoftCreateProductImage](docs/InfusionsoftCreateProductImage.md)
 - [InfusionsoftCreateProductSubscription](docs/InfusionsoftCreateProductSubscription.md)
 - [InfusionsoftCreateRestCustomField](docs/InfusionsoftCreateRestCustomField.md)
 - [InfusionsoftCreateRestCustomFieldOption](docs/InfusionsoftCreateRestCustomFieldOption.md)
 - [InfusionsoftCreateTag](docs/InfusionsoftCreateTag.md)
 - [InfusionsoftCreateTagCategory](docs/InfusionsoftCreateTagCategory.md)
 - [InfusionsoftCreateUser](docs/InfusionsoftCreateUser.md)
 - [InfusionsoftCreditCard](docs/InfusionsoftCreditCard.md)
 - [InfusionsoftCreditCardAdded](docs/InfusionsoftCreditCardAdded.md)
 - [InfusionsoftCustomFieldMetaData](docs/InfusionsoftCustomFieldMetaData.md)
 - [InfusionsoftCustomFieldOption](docs/InfusionsoftCustomFieldOption.md)
 - [InfusionsoftCustomFieldValue](docs/InfusionsoftCustomFieldValue.md)
 - [InfusionsoftEmailAddress](docs/InfusionsoftEmailAddress.md)
 - [InfusionsoftEmailSendRequest](docs/InfusionsoftEmailSendRequest.md)
 - [InfusionsoftEmailSendRequestAttachment](docs/InfusionsoftEmailSendRequestAttachment.md)
 - [InfusionsoftEmailSentCreate](docs/InfusionsoftEmailSentCreate.md)
 - [InfusionsoftEmailSentCreateList](docs/InfusionsoftEmailSentCreateList.md)
 - [InfusionsoftEmailSentQueryResult](docs/InfusionsoftEmailSentQueryResult.md)
 - [InfusionsoftEmailSentQueryResultList](docs/InfusionsoftEmailSentQueryResultList.md)
 - [InfusionsoftEmailSentQueryResultWithContent](docs/InfusionsoftEmailSentQueryResultWithContent.md)
 - [InfusionsoftEntrylongstring](docs/InfusionsoftEntrylongstring.md)
 - [InfusionsoftError](docs/InfusionsoftError.md)
 - [InfusionsoftFaxNumber](docs/InfusionsoftFaxNumber.md)
 - [InfusionsoftFileDescriptor](docs/InfusionsoftFileDescriptor.md)
 - [InfusionsoftFileInformation](docs/InfusionsoftFileInformation.md)
 - [InfusionsoftFileList](docs/InfusionsoftFileList.md)
 - [InfusionsoftFileUpload](docs/InfusionsoftFileUpload.md)
 - [InfusionsoftFullContact](docs/InfusionsoftFullContact.md)
 - [InfusionsoftGoal](docs/InfusionsoftGoal.md)
 - [InfusionsoftHistoricalCounts](docs/InfusionsoftHistoricalCounts.md)
 - [InfusionsoftItem](docs/InfusionsoftItem.md)
 - [InfusionsoftMerchant](docs/InfusionsoftMerchant.md)
 - [InfusionsoftNote](docs/InfusionsoftNote.md)
 - [InfusionsoftNoteList](docs/InfusionsoftNoteList.md)
 - [InfusionsoftNoteUser](docs/InfusionsoftNoteUser.md)
 - [InfusionsoftObjectModel](docs/InfusionsoftObjectModel.md)
 - [InfusionsoftOpportunity](docs/InfusionsoftOpportunity.md)
 - [InfusionsoftOpportunityContact](docs/InfusionsoftOpportunityContact.md)
 - [InfusionsoftOpportunityList](docs/InfusionsoftOpportunityList.md)
 - [InfusionsoftOrder](docs/InfusionsoftOrder.md)
 - [InfusionsoftOrderContactDetails](docs/InfusionsoftOrderContactDetails.md)
 - [InfusionsoftOrderItem](docs/InfusionsoftOrderItem.md)
 - [InfusionsoftOrderList](docs/InfusionsoftOrderList.md)
 - [InfusionsoftPaymentGateway](docs/InfusionsoftPaymentGateway.md)
 - [InfusionsoftPaymentPlan](docs/InfusionsoftPaymentPlan.md)
 - [InfusionsoftPaymentResult](docs/InfusionsoftPaymentResult.md)
 - [InfusionsoftPhoneNumber](docs/InfusionsoftPhoneNumber.md)
 - [InfusionsoftProduct](docs/InfusionsoftProduct.md)
 - [InfusionsoftProductList](docs/InfusionsoftProductList.md)
 - [InfusionsoftProductOption](docs/InfusionsoftProductOption.md)
 - [InfusionsoftProductOptionValue](docs/InfusionsoftProductOptionValue.md)
 - [InfusionsoftProductStatus](docs/InfusionsoftProductStatus.md)
 - [InfusionsoftProductStatusList](docs/InfusionsoftProductStatusList.md)
 - [InfusionsoftProductSubscription](docs/InfusionsoftProductSubscription.md)
 - [InfusionsoftProduct_](docs/InfusionsoftProduct_.md)
 - [InfusionsoftProvincesByCode](docs/InfusionsoftProvincesByCode.md)
 - [InfusionsoftRelationship](docs/InfusionsoftRelationship.md)
 - [InfusionsoftRequestCompanyReference](docs/InfusionsoftRequestCompanyReference.md)
 - [InfusionsoftRequestNote](docs/InfusionsoftRequestNote.md)
 - [InfusionsoftRestEmailAddress](docs/InfusionsoftRestEmailAddress.md)
 - [InfusionsoftRestHook](docs/InfusionsoftRestHook.md)
 - [InfusionsoftRestHookRequest](docs/InfusionsoftRestHookRequest.md)
 - [InfusionsoftRestMerchantAccountResponse](docs/InfusionsoftRestMerchantAccountResponse.md)
 - [InfusionsoftRestPartialContact](docs/InfusionsoftRestPartialContact.md)
 - [InfusionsoftRestUser](docs/InfusionsoftRestUser.md)
 - [InfusionsoftSalesPipeline](docs/InfusionsoftSalesPipeline.md)
 - [InfusionsoftSequence](docs/InfusionsoftSequence.md)
 - [InfusionsoftSequencePath](docs/InfusionsoftSequencePath.md)
 - [InfusionsoftSetOfIds](docs/InfusionsoftSetOfIds.md)
 - [InfusionsoftSetting](docs/InfusionsoftSetting.md)
 - [InfusionsoftShippingInformation](docs/InfusionsoftShippingInformation.md)
 - [InfusionsoftSimpleOpportunityStage](docs/InfusionsoftSimpleOpportunityStage.md)
 - [InfusionsoftSimpleProduct](docs/InfusionsoftSimpleProduct.md)
 - [InfusionsoftSimpleTag](docs/InfusionsoftSimpleTag.md)
 - [InfusionsoftSimpleUser](docs/InfusionsoftSimpleUser.md)
 - [InfusionsoftSocialAccount](docs/InfusionsoftSocialAccount.md)
 - [InfusionsoftStackTraceElement](docs/InfusionsoftStackTraceElement.md)
 - [InfusionsoftStageDetails](docs/InfusionsoftStageDetails.md)
 - [InfusionsoftSubscriptionPlan_](docs/InfusionsoftSubscriptionPlan_.md)
 - [InfusionsoftTag](docs/InfusionsoftTag.md)
 - [InfusionsoftTagCategory](docs/InfusionsoftTagCategory.md)
 - [InfusionsoftTagId](docs/InfusionsoftTagId.md)
 - [InfusionsoftTaggedCompany](docs/InfusionsoftTaggedCompany.md)
 - [InfusionsoftTaggedCompanyList](docs/InfusionsoftTaggedCompanyList.md)
 - [InfusionsoftTaggedContact](docs/InfusionsoftTaggedContact.md)
 - [InfusionsoftTaggedContactList](docs/InfusionsoftTaggedContactList.md)
 - [InfusionsoftTags](docs/InfusionsoftTags.md)
 - [InfusionsoftTask](docs/InfusionsoftTask.md)
 - [InfusionsoftTaskList](docs/InfusionsoftTaskList.md)
 - [InfusionsoftThrowable](docs/InfusionsoftThrowable.md)
 - [InfusionsoftTransaction](docs/InfusionsoftTransaction.md)
 - [InfusionsoftTransactionList](docs/InfusionsoftTransactionList.md)
 - [InfusionsoftUpdateEmailAddress](docs/InfusionsoftUpdateEmailAddress.md)
 - [InfusionsoftUpdateNote](docs/InfusionsoftUpdateNote.md)
 - [InfusionsoftUpsertContact](docs/InfusionsoftUpsertContact.md)
 - [InfusionsoftUserInfoDTO](docs/InfusionsoftUserInfoDTO.md)
 - [InfusionsoftUsers](docs/InfusionsoftUsers.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://accounts.infusionsoft.com/app/oauth/authorize
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



