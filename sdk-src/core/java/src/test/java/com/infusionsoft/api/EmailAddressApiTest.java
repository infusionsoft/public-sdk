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
import com.infusionsoft.model.InfusionsoftRestEmailAddress;
import com.infusionsoft.model.InfusionsoftUpdateEmailAddress;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmailAddressApi
 */
@Ignore
public class EmailAddressApiTest {

    private final EmailAddressApi api = new EmailAddressApi();

    
    /**
     * Replace an Email Address
     *
     * Replaces all of the values of a given email address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceEmailAddressUsingPUTTest() throws ApiException {
        String email = null;
        InfusionsoftUpdateEmailAddress update = null;
        InfusionsoftRestEmailAddress response = api.replaceEmailAddressUsingPUT(email, update);

        // TODO: test validations
    }
    
}
