/*
 * Infusionsoft REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: V1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infusionsoft.api;

import com.infusionsoft.ApiException;
import com.infusionsoft.model.InfusionsoftCompany;
import com.infusionsoft.model.InfusionsoftCompanyList;
import com.infusionsoft.model.InfusionsoftCreateOrPatchCompany;
import com.infusionsoft.model.InfusionsoftError;
import com.infusionsoft.model.InfusionsoftObjectModel;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CompanyApi
 */
@Ignore
public class CompanyApiTest {

    private final CompanyApi api = new CompanyApi();

    
    /**
     * Create a Company
     *
     * Creates a new company as the authenticated user. NB: Company must contain at least the company name. The &#x60;country_code&#x60; is required if &#x60;region&#x60; is specified.  You may opt-in or mark a Company as _Marketable_ by including the following field in the request JSON with an opt-in reason. (This field is also shown in the complete request body sample.) The reason you provide here will help with compliance. Example reasons: \&quot;Customer opted-in through webform\&quot;, \&quot;Company gave explicit permission.\&quot;  &#x60;&#x60;&#x60;json \&quot;opt_in_reason\&quot;: \&quot;your reason for opt-in\&quot; &#x60;&#x60;&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCompanyUsingPOSTTest() throws ApiException {
        InfusionsoftCreateOrPatchCompany company = null;
        InfusionsoftCompany response = api.createCompanyUsingPOST(company);

        // TODO: test validations
    }
    
    /**
     * List Companies
     *
     * Retrieves a list of all companies
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCompaniesUsingGETTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String companyName = null;
        String order = null;
        String orderDirection = null;
        List<String> optionalProperties = null;
        InfusionsoftCompanyList response = api.listCompaniesUsingGET(limit, offset, companyName, order, orderDirection, optionalProperties);

        // TODO: test validations
    }
    
    /**
     * Retrieve Company Model
     *
     * Get the custom fields and optional properties for the Company object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveCompanyModelUsingGETTest() throws ApiException {
        InfusionsoftObjectModel response = api.retrieveCompanyModelUsingGET();

        // TODO: test validations
    }
    
    /**
     * Update a Company
     *
     * Updates a company with only the values provided in the request.  You may opt-in or mark a Company as _Marketable_ by including the following field in the request JSON with an opt-in reason. (This field is also shown in the complete request body sample.) The reason you provide here will help with compliance. Example reasons: \&quot;Customer opted-in through webform\&quot;, \&quot;Company gave explicit permission.\&quot;  &#x60;&#x60;&#x60;json \&quot;opt_in_reason\&quot;: \&quot;your reason for opt-in\&quot; &#x60;&#x60;&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePropertiesOnContactUsingPATCHTest() throws ApiException {
        Long companyId = null;
        InfusionsoftCreateOrPatchCompany company = null;
        InfusionsoftCompany response = api.updatePropertiesOnContactUsingPATCH(companyId, company);

        // TODO: test validations
    }
    
}