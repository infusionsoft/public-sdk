/*
 * Infusionsoft REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.70.0.89421
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infusionsoft.api;

import com.infusionsoft.ApiException;
import com.infusionsoft.model.InfusionsoftAppointment;
import com.infusionsoft.model.InfusionsoftAppointmentList;
import com.infusionsoft.model.InfusionsoftCreateRestCustomField;
import com.infusionsoft.model.InfusionsoftCustomFieldMetaData;
import com.infusionsoft.model.InfusionsoftError;
import com.infusionsoft.model.InfusionsoftObjectModel;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppointmentApi
 */
@Ignore
public class AppointmentApiTest {

    private final AppointmentApi api = new AppointmentApi();

    
    /**
     * Create a Custom Field
     *
     * Adds a custom field of the specified type and options to the Appointment object.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAppointmentCustomFieldUsingPOSTTest() throws ApiException {
        InfusionsoftCreateRestCustomField customField = null;
        InfusionsoftCustomFieldMetaData response = api.createAppointmentCustomFieldUsingPOST(customField);

        // TODO: test validations
    }
    
    /**
     * Create an Appointment
     *
     * Creates a new appointment as the authenticated user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAppointmentUsingPOSTTest() throws ApiException {
        InfusionsoftAppointment appointment = null;
        InfusionsoftAppointment response = api.createAppointmentUsingPOST(appointment);

        // TODO: test validations
    }
    
    /**
     * Delete an Appointment
     *
     * Deletes the specified appointment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAppointmentUsingDELETETest() throws ApiException {
        Long appointmentId = null;
        api.deleteAppointmentUsingDELETE(appointmentId);

        // TODO: test validations
    }
    
    /**
     * Retrieve an Appointment
     *
     * Retrieves a specific appointment with respect to user permissions. The authenticated user will need the \&quot;can view all records\&quot; permission for Task/Appt/Notes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAppointmentUsingGETTest() throws ApiException {
        Long appointmentId = null;
        InfusionsoftAppointment response = api.getAppointmentUsingGET(appointmentId);

        // TODO: test validations
    }
    
    /**
     * List Appointments
     *
     * Retrieves all appointments for the authenticated user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAppointmentsUsingGETTest() throws ApiException {
        String since = null;
        String until = null;
        Integer limit = null;
        Integer offset = null;
        Long contactId = null;
        InfusionsoftAppointmentList response = api.listAppointmentsUsingGET(since, until, limit, offset, contactId);

        // TODO: test validations
    }
    
    /**
     * Retrieve Appointment Model
     *
     * Get the custom fields for the Appointment object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAppointmentModelUsingGETTest() throws ApiException {
        InfusionsoftObjectModel response = api.retrieveAppointmentModelUsingGET();

        // TODO: test validations
    }
    
    /**
     * Replace an Appointment
     *
     * Replaces all values of a given appointment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAppointmentUsingPUTTest() throws ApiException {
        Long appointmentId = null;
        InfusionsoftAppointment appointmentDTO = null;
        InfusionsoftAppointment response = api.updateAppointmentUsingPUT(appointmentId, appointmentDTO);

        // TODO: test validations
    }
    
    /**
     * Update an Appointment
     *
     * Updates the provided values of a given appointment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePropertiesOnAppointmentUsingPATCHTest() throws ApiException {
        Long appointmentId = null;
        InfusionsoftAppointment appointmentDTO = null;
        InfusionsoftAppointment response = api.updatePropertiesOnAppointmentUsingPATCH(appointmentId, appointmentDTO);

        // TODO: test validations
    }
    
}
