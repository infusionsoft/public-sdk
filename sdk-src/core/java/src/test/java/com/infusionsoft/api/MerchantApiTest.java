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
import com.infusionsoft.model.InfusionsoftError;
import com.infusionsoft.model.InfusionsoftRestMerchantAccountResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantApi
 */
@Ignore
public class MerchantApiTest {

    private final MerchantApi api = new MerchantApi();

    
    /**
     * List Merchants
     *
     * Retrieves a list of all merchant accounts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMerchantAccountsUsingGETTest() throws ApiException {
        InfusionsoftRestMerchantAccountResponse response = api.getMerchantAccountsUsingGET();

        // TODO: test validations
    }
    
}
