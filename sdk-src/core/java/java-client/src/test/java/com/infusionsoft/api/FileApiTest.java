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
import com.infusionsoft.model.InfusionsoftFileInformation;
import com.infusionsoft.model.InfusionsoftFileList;
import com.infusionsoft.model.InfusionsoftFileUpload;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FileApi
 */
@Ignore
public class FileApiTest {

    private final FileApi api = new FileApi();

    
    /**
     * Upload File
     *
     * Upload a base64 encoded file. &#x60;contact_id&#x60; is required only when &#x60;file_association&#x60; is &#x60;CONTACT&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFileUsingPOSTTest() throws ApiException {
        InfusionsoftFileUpload fileUpload = null;
        InfusionsoftFileInformation response = api.createFileUsingPOST(fileUpload);

        // TODO: test validations
    }
    
    /**
     * Delete File
     *
     * Deletes the specified file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFileUsingDELETETest() throws ApiException {
        Long fileId = null;
        api.deleteFileUsingDELETE(fileId);

        // TODO: test validations
    }
    
    /**
     * Retrieve File
     *
     * Retrieves metadata about a specific file. Optionally returns the base64 encoded file data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileUsingGETTest() throws ApiException {
        Long fileId = null;
        List<String> optionalProperties = null;
        InfusionsoftFileInformation response = api.getFileUsingGET(fileId, optionalProperties);

        // TODO: test validations
    }
    
    /**
     * List Files
     *
     * Retrieves a list of all files
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFilesUsingGETTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String viewable = null;
        String permission = null;
        String type = null;
        String name = null;
        Long contactId = null;
        InfusionsoftFileList response = api.listFilesUsingGET(limit, offset, viewable, permission, type, name, contactId);

        // TODO: test validations
    }
    
    /**
     * Replace File
     *
     * Upload a base64 encoded file to replace an existing one. &#x60;contact_id&#x60; is required only when &#x60;file_association&#x60; is &#x60;CONTACT&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFileUsingPUTTest() throws ApiException {
        Long fileId = null;
        InfusionsoftFileUpload fileUpload = null;
        InfusionsoftFileInformation response = api.updateFileUsingPUT(fileId, fileUpload);

        // TODO: test validations
    }
    
}
