# TagsApi

All URIs are relative to *https://hy526.infusionsoft.com/app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyTagToContactIdsUsingPOST**](TagsApi.md#applyTagToContactIdsUsingPOST) | **POST** /tags/{tagId}/contacts | Apply Tag to Contacts
[**createTagCategoryUsingPOST**](TagsApi.md#createTagCategoryUsingPOST) | **POST** /tags/categories | Create Tag Category
[**createTagUsingPOST**](TagsApi.md#createTagUsingPOST) | **POST** /tags | Create Tag
[**getTagUsingGET**](TagsApi.md#getTagUsingGET) | **GET** /tags/{id} | Retrieve a Tag
[**listCompaniesForTagIdUsingGET**](TagsApi.md#listCompaniesForTagIdUsingGET) | **GET** /tags/{tagId}/companies | List Tagged Companies
[**listContactsForTagIdUsingGET**](TagsApi.md#listContactsForTagIdUsingGET) | **GET** /tags/{tagId}/contacts | List Tagged Contacts
[**listTagsUsingGET**](TagsApi.md#listTagsUsingGET) | **GET** /tags | List Tags
[**removeTagFromContactIdUsingDELETE**](TagsApi.md#removeTagFromContactIdUsingDELETE) | **DELETE** /tags/{tagId}/contacts/{contactId} | Remove Tag from Contact
[**removeTagFromContactIdsUsingDELETE**](TagsApi.md#removeTagFromContactIdsUsingDELETE) | **DELETE** /tags/{tagId}/contacts | Remove Tag from Contacts


<a name="applyTagToContactIdsUsingPOST"></a>
# **applyTagToContactIdsUsingPOST**
> List&lt;InfusionsoftEntrylongstring&gt; applyTagToContactIdsUsingPOST(tagId, ids)

Apply Tag to Contacts

Apply a tag to a list of contacts

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TagsApi;


TagsApi apiInstance = new TagsApi();
Long tagId = 789L; // Long | tagId
InfusionsoftSetOfIds ids = new InfusionsoftSetOfIds(); // InfusionsoftSetOfIds | ids
try {
    List<InfusionsoftEntrylongstring> result = apiInstance.applyTagToContactIdsUsingPOST(tagId, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#applyTagToContactIdsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **Long**| tagId |
 **ids** | [**InfusionsoftSetOfIds**](InfusionsoftSetOfIds.md)| ids |

### Return type

[**List&lt;InfusionsoftEntrylongstring&gt;**](InfusionsoftEntrylongstring.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTagCategoryUsingPOST"></a>
# **createTagCategoryUsingPOST**
> InfusionsoftTagCategory createTagCategoryUsingPOST(tagCategory)

Create Tag Category

Create a new tag category

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TagsApi;


TagsApi apiInstance = new TagsApi();
InfusionsoftCreateTagCategory tagCategory = new InfusionsoftCreateTagCategory(); // InfusionsoftCreateTagCategory | tagCategory
try {
    InfusionsoftTagCategory result = apiInstance.createTagCategoryUsingPOST(tagCategory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#createTagCategoryUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagCategory** | [**InfusionsoftCreateTagCategory**](InfusionsoftCreateTagCategory.md)| tagCategory |

### Return type

[**InfusionsoftTagCategory**](InfusionsoftTagCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTagUsingPOST"></a>
# **createTagUsingPOST**
> InfusionsoftTag createTagUsingPOST(tag)

Create Tag

Create a new tag

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TagsApi;


TagsApi apiInstance = new TagsApi();
InfusionsoftCreateTag tag = new InfusionsoftCreateTag(); // InfusionsoftCreateTag | tag
try {
    InfusionsoftTag result = apiInstance.createTagUsingPOST(tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#createTagUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | [**InfusionsoftCreateTag**](InfusionsoftCreateTag.md)| tag |

### Return type

[**InfusionsoftTag**](InfusionsoftTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTagUsingGET"></a>
# **getTagUsingGET**
> InfusionsoftTag getTagUsingGET(id)

Retrieve a Tag

Retrieves a single tag

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TagsApi;


TagsApi apiInstance = new TagsApi();
Long id = 789L; // Long | id
try {
    InfusionsoftTag result = apiInstance.getTagUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**InfusionsoftTag**](InfusionsoftTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCompaniesForTagIdUsingGET"></a>
# **listCompaniesForTagIdUsingGET**
> InfusionsoftTaggedCompanyList listCompaniesForTagIdUsingGET(tagId, limit, offset)

List Tagged Companies

Retrieves a list of companies that have the given tag applied

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TagsApi;


TagsApi apiInstance = new TagsApi();
Long tagId = 789L; // Long | tagId
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
try {
    InfusionsoftTaggedCompanyList result = apiInstance.listCompaniesForTagIdUsingGET(tagId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#listCompaniesForTagIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **Long**| tagId |
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]

### Return type

[**InfusionsoftTaggedCompanyList**](InfusionsoftTaggedCompanyList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listContactsForTagIdUsingGET"></a>
# **listContactsForTagIdUsingGET**
> InfusionsoftTaggedContactList listContactsForTagIdUsingGET(tagId, limit, offset)

List Tagged Contacts

Retrieves a list of contacts that have the given tag applied

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TagsApi;


TagsApi apiInstance = new TagsApi();
Long tagId = 789L; // Long | tagId
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
try {
    InfusionsoftTaggedContactList result = apiInstance.listContactsForTagIdUsingGET(tagId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#listContactsForTagIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **Long**| tagId |
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]

### Return type

[**InfusionsoftTaggedContactList**](InfusionsoftTaggedContactList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTagsUsingGET"></a>
# **listTagsUsingGET**
> InfusionsoftTags listTagsUsingGET(limit, offset, category, name)

List Tags

Retrieve a list of tags defined in the application

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TagsApi;


TagsApi apiInstance = new TagsApi();
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
Long category = 789L; // Long | Category Id of tags to filter by
String name = "name_example"; // String | Filter for tags with a specific name
try {
    InfusionsoftTags result = apiInstance.listTagsUsingGET(limit, offset, category, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#listTagsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **category** | **Long**| Category Id of tags to filter by | [optional]
 **name** | **String**| Filter for tags with a specific name | [optional]

### Return type

[**InfusionsoftTags**](InfusionsoftTags.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeTagFromContactIdUsingDELETE"></a>
# **removeTagFromContactIdUsingDELETE**
> removeTagFromContactIdUsingDELETE(tagId, contactId)

Remove Tag from Contact

Remove a tag from a Contact

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TagsApi;


TagsApi apiInstance = new TagsApi();
Long tagId = 789L; // Long | tagId
Long contactId = 789L; // Long | contactId
try {
    apiInstance.removeTagFromContactIdUsingDELETE(tagId, contactId);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#removeTagFromContactIdUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **Long**| tagId |
 **contactId** | **Long**| contactId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeTagFromContactIdsUsingDELETE"></a>
# **removeTagFromContactIdsUsingDELETE**
> removeTagFromContactIdsUsingDELETE(tagId, ids)

Remove Tag from Contacts

Remove a tag from a list of contacts

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TagsApi;


TagsApi apiInstance = new TagsApi();
Long tagId = 789L; // Long | tagId
List<Long> ids = Arrays.asList(56L); // List<Long> | ids
try {
    apiInstance.removeTagFromContactIdsUsingDELETE(tagId, ids);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#removeTagFromContactIdsUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **Long**| tagId |
 **ids** | [**List&lt;Long&gt;**](Long.md)| ids |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

