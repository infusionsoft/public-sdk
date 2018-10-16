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
import com.infusionsoft.model.InfusionsoftAffiliateCommissionList;
import com.infusionsoft.model.InfusionsoftError;
import com.infusionsoft.model.InfusionsoftObjectModel;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AffiliateApi
 */
@Ignore
public class AffiliateApiTest {

    private final AffiliateApi api = new AffiliateApi();

    
    /**
     * Retrieve Affiliate Model
     *
     * Get the custom fields for the Affiliate object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAffiliateModelUsingGETTest() throws ApiException {
        InfusionsoftObjectModel response = api.retrieveAffiliateModelUsingGET();

        // TODO: test validations
    }
    
    /**
     * Retrieve Commissions
     *
     * Retrieve a list of Commissions based on Affiliate or Date Range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchCommissionsUsingGETTest() throws ApiException {
        String since = null;
        String until = null;
        Integer limit = null;
        Integer offset = null;
        Long affiliateId = null;
        InfusionsoftAffiliateCommissionList response = api.searchCommissionsUsingGET(since, until, limit, offset, affiliateId);

        // TODO: test validations
    }
    
}
