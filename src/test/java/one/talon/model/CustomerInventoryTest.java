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
import java.util.ArrayList;
import java.util.List;
import one.talon.model.CustomerProfile;
import one.talon.model.Giveaway;
import one.talon.model.InventoryCoupon;
import one.talon.model.Loyalty;
import one.talon.model.Referral;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for CustomerInventory
 */
public class CustomerInventoryTest {
    private final CustomerInventory model = new CustomerInventory();

    /**
     * Model tests for CustomerInventory
     */
    @Test
    public void testCustomerInventory() {
        // TODO: test CustomerInventory
    }

    /**
     * Test the property 'profile'
     */
    @Test
    public void profileTest() {
        // TODO: test profile
    }

    /**
     * Test the property 'loyalty'
     */
    @Test
    public void loyaltyTest() {
        // TODO: test loyalty
    }

    /**
     * Test the property 'referrals'
     */
    @Test
    public void referralsTest() {
        // TODO: test referrals
    }

    /**
     * Test the property 'coupons'
     */
    @Test
    public void couponsTest() {
        // TODO: test coupons
    }

    /**
     * Test the property 'giveaways'
     */
    @Test
    public void giveawaysTest() {
        // TODO: test giveaways
    }

}