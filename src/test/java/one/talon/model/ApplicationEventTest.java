/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerSession](https://docs.talon.one/integration-api/#operation/updateCustomerSessionV2) endpoint is `https://mycompany.talon.one/v2/customer_sessions/{Id}` 
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
import java.util.ArrayList;
import java.util.List;
import one.talon.model.RuleFailureReason;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for ApplicationEvent
 */
public class ApplicationEventTest {
    private final ApplicationEvent model = new ApplicationEvent();

    /**
     * Model tests for ApplicationEvent
     */
    @Test
    public void testApplicationEvent() {
        // TODO: test ApplicationEvent
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'created'
     */
    @Test
    public void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'applicationId'
     */
    @Test
    public void applicationIdTest() {
        // TODO: test applicationId
    }

    /**
     * Test the property 'profileId'
     */
    @Test
    public void profileIdTest() {
        // TODO: test profileId
    }

    /**
     * Test the property 'sessionId'
     */
    @Test
    public void sessionIdTest() {
        // TODO: test sessionId
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'attributes'
     */
    @Test
    public void attributesTest() {
        // TODO: test attributes
    }

    /**
     * Test the property 'effects'
     */
    @Test
    public void effectsTest() {
        // TODO: test effects
    }

    /**
     * Test the property 'ruleFailureReasons'
     */
    @Test
    public void ruleFailureReasonsTest() {
        // TODO: test ruleFailureReasons
    }

}
