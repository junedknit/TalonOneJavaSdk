/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package one.talon.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for AccessLogEntry
 */
public class AccessLogEntryTest {
    private final AccessLogEntry model = new AccessLogEntry();

    /**
     * Model tests for AccessLogEntry
     */
    @Test
    public void testAccessLogEntry() {
        // TODO: test AccessLogEntry
    }

    /**
     * Test the property 'uuid'
     */
    @Test
    public void uuidTest() {
        // TODO: test uuid
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'method'
     */
    @Test
    public void methodTest() {
        // TODO: test method
    }

    /**
     * Test the property 'requestUri'
     */
    @Test
    public void requestUriTest() {
        // TODO: test requestUri
    }

    /**
     * Test the property 'time'
     */
    @Test
    public void timeTest() {
        // TODO: test time
    }

    /**
     * Test the property 'requestPayload'
     */
    @Test
    public void requestPayloadTest() {
        // TODO: test requestPayload
    }

    /**
     * Test the property 'responsePayload'
     */
    @Test
    public void responsePayloadTest() {
        // TODO: test responsePayload
    }

}