# talon-one-client

Talon.One API
- API version: 1.0.0

The Talon.One API is used to manage applications and campaigns, as well as to
integrate with your application. The operations in the _Integration API_ section
are used to integrate with our platform, while the other operations are
used to manage applications and campaigns.

### Where is the API?

The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`

[updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>one.talon</groupId>
  <artifactId>talon-one-client</artifactId>
  <version>4.2.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "one.talon:talon-one-client:4.2.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/talon-one-client-4.2.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

### Integration API

#### V2

```java
package com.example.consumer;

import com.google.gson.Gson;

import one.talon.ApiClient;
import one.talon.api.IntegrationApi;
import one.talon.api.ManagementApi;
import one.talon.model.*;

public class TalonApiTest {
    public static void main(String[] args) {
        Gson gson = new Gson();
        IntegrationApi iApi = new IntegrationApi(new ApiClient("api_key_v1"));
        
        // Setup: basePath
        iApi.getApiClient().setBasePath("https://mycompany.talon.one");
        // Setup: when using 'api_key_v1', set apiKey & apiKeyPrefix must be provided
        iApi.getApiClient().setApiKeyPrefix("ApiKey-v1");
        iApi.getApiClient().setApiKey("dbc644d33aa74d582bd9479c59e16f970fe13bf34a208c39d6c7fa7586968468");

        try {
          // Creating a cart item object
            CartItem cartItem = new CartItem();
            cartItem.setName("Hawaiian Pizza");
            cartItem.setSku("pizza-x");
            cartItem.setQuantity(1);
            cartItem.setPrice(new java.math.BigDecimal("5.5"));

            // Creating a customer session of V2
            NewCustomerSessionV2 customerSession = new NewCustomerSessionV2();
            customerSession.setProfileId("Cool_Dude");
            customerSession.addCouponCodesItem("Cool-Summer!");
            customerSession.addCartItemsItem(cartItem);

            // Initiating integration request wrapping the customer session update
            IntegrationRequest request = new IntegrationRequest()
                .customerSession(customerSession)
                // Optional parameter of requested information to be present on the response related to the customer session update
                .responseContent(Arrays.asList(
                    IntegrationRequest.ResponseContentEnum.CUSTOMERSESSION,
                    IntegrationRequest.ResponseContentEnum.CUSTOMERPROFILE
                ));

            // Flag to communicate whether the request is a "dry run"
            Boolean dryRun = false;

            // Create/update a customer session using `updateCustomerSessionV2` function
            IntegrationStateV2 is = iApi.updateCustomerSessionV2("deetdoot", request, dryRun);
            System.out.println(is.toString());

            // Parsing the returned effects list, please consult https://developers.talon.one/Integration-API/handling-effects-v2 for the full list of effects and their corresponding properties
            for (Effect eff : is.getEffects()) {
                if (eff.getEffectType().equals("addLoyaltyPoints")) {
                    // Typecasting according to the specific effect type
                    AddLoyaltyPointsEffectProps props = gson.fromJson(
                        gson.toJson(eff.getProps()),
                        AddLoyaltyPointsEffectProps.class
                    );
                    // Access the specific effect's properties
                    System.out.println(props.getName());
                    System.out.println(props.getProgramId());
                    System.out.println(props.getValue());
                }
                if (eff.getEffectType().equals("acceptCoupon")) {
                    // Typecasting according to the specific effect type
                    AcceptCouponEffectProps props = gson.fromJson(
                      gson.toJson(eff.getProps()),
                      AcceptCouponEffectProps.class
                    );
                    // work with AcceptCouponEffectProps' properties
                    // ...
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

#### V1

```java
package com.example.consumer;

import one.talon.ApiClient;
import one.talon.api.IntegrationApi;
import one.talon.api.ManagementApi;
import one.talon.model.*;

public class TalonApiTest {
    public static void main(String[] args) {
        IntegrationApi iApi = new IntegrationApi(new ApiClient("integration_auth"));
        
        // Setup: basePath
        iApi.getApiClient().setBasePath("https://mycompany.talon.one");
        // Setup: When using 'integration_auth', applicationId & applicationKey must be provided
        iApi.getApiClient().setApplicationId("1");
        iApi.getApiClient().setApplicationKey("fee29ed73f67db39");

        try {
            // Integration API example to send a session update
            NewCustomerSession customerSession = new NewCustomerSession();
            customerSession.setProfileId("Cool_Dude");
            customerSession.setState(NewCustomerSession.StateEnum.OPEN);
            customerSession.setTotal(new java.math.BigDecimal("42.0"));

            // Flag to communicate whether the request is a "dry run"
            Boolean dryRun = false;

            // Create/update a customer session using `updateCustomerSession` function
            IntegrationState ie = iApi.updateCustomerSession("deetdoot", customerSession, dryRun);
            System.out.println(ie.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

### Management API

```java
package com.example.consumer;

import one.talon.ApiClient;
import one.talon.api.IntegrationApi;
import one.talon.api.ManagementApi;
import one.talon.model.*;

public class TalonApiTest {
    public static void main(String[] args) {
        // Management API example to load application with id 7
        ManagementApi mApi = new ManagementApi(new ApiClient("manager_auth"));

        // Setup: basePath and bearer prefix
        mApi.getApiClient().setBasePath("https://mycompany.talon.one");
        mApi.getApiClient().setApiKeyPrefix("Bearer");
        
        LoginParams lp = new LoginParams();
        lp.setEmail("admin@talon.one");
        lp.setPassword("yourpassword");

        try {
            // Acquire session token
            Session s = mApi.createSession(lp);
            mApi.getApiClient().setApiKey(s.getToken());

            // Calling `getApplication` function with the desired id (7)
            Application application = mApi.getApplication(7);
            System.out.println(application.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*IntegrationApi* | [**createCouponReservation**](docs/IntegrationApi.md#createCouponReservation) | **POST** /v1/coupon_reservations/{couponValue} | Create a new coupon reservation
*IntegrationApi* | [**createReferral**](docs/IntegrationApi.md#createReferral) | **POST** /v1/referrals | Create a referral code for an advocate
*IntegrationApi* | [**deleteCouponReservation**](docs/IntegrationApi.md#deleteCouponReservation) | **DELETE** /v1/coupon_reservations/{couponValue} | Delete coupon reservations
*IntegrationApi* | [**deleteCustomerData**](docs/IntegrationApi.md#deleteCustomerData) | **DELETE** /v1/customer_data/{integrationId} | Delete the personal data of a customer.
*IntegrationApi* | [**getCustomerInventory**](docs/IntegrationApi.md#getCustomerInventory) | **GET** /v1/customer_profiles/{integrationId}/inventory | Get an inventory of all data associated with a specific customer profile.
*IntegrationApi* | [**getReservedCustomers**](docs/IntegrationApi.md#getReservedCustomers) | **GET** /v1/coupon_reservations/customerprofiles/{couponValue} | Get the users that have this coupon reserved
*IntegrationApi* | [**trackEvent**](docs/IntegrationApi.md#trackEvent) | **POST** /v1/events | Track an Event
*IntegrationApi* | [**updateCustomerProfile**](docs/IntegrationApi.md#updateCustomerProfile) | **PUT** /v1/customer_profiles/{integrationId} | Update a Customer Profile V1
*IntegrationApi* | [**updateCustomerProfileAudiences**](docs/IntegrationApi.md#updateCustomerProfileAudiences) | **POST** /v2/customer_audiences | Update a Customer Profile Audiences
*IntegrationApi* | [**updateCustomerProfileV2**](docs/IntegrationApi.md#updateCustomerProfileV2) | **PUT** /v2/customer_profiles/{integrationId} | Update a Customer Profile
*IntegrationApi* | [**updateCustomerProfilesV2**](docs/IntegrationApi.md#updateCustomerProfilesV2) | **PUT** /v2/customer_profiles | Update multiple Customer Profiles
*IntegrationApi* | [**updateCustomerSession**](docs/IntegrationApi.md#updateCustomerSession) | **PUT** /v1/customer_sessions/{customerSessionId} | Update a Customer Session V1
*IntegrationApi* | [**updateCustomerSessionV2**](docs/IntegrationApi.md#updateCustomerSessionV2) | **PUT** /v2/customer_sessions/{customerSessionId} | Update a Customer Session
*ManagementApi* | [**addLoyaltyPoints**](docs/ManagementApi.md#addLoyaltyPoints) | **PUT** /v1/loyalty_programs/{programID}/profile/{integrationID}/add_points | Add points in a certain loyalty program for the specified customer
*ManagementApi* | [**copyCampaignToApplications**](docs/ManagementApi.md#copyCampaignToApplications) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/copy | Copy the campaign into every specified application
*ManagementApi* | [**createAdditionalCost**](docs/ManagementApi.md#createAdditionalCost) | **POST** /v1/additional_costs | Define a new additional cost
*ManagementApi* | [**createAttribute**](docs/ManagementApi.md#createAttribute) | **POST** /v1/attributes | Define a new custom attribute
*ManagementApi* | [**createCampaign**](docs/ManagementApi.md#createCampaign) | **POST** /v1/applications/{applicationId}/campaigns | Create a Campaign
*ManagementApi* | [**createCoupons**](docs/ManagementApi.md#createCoupons) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | Create Coupons
*ManagementApi* | [**createPasswordRecoveryEmail**](docs/ManagementApi.md#createPasswordRecoveryEmail) | **POST** /v1/password_recovery_emails | Request a password reset
*ManagementApi* | [**createRuleset**](docs/ManagementApi.md#createRuleset) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets | Create a Ruleset
*ManagementApi* | [**createSession**](docs/ManagementApi.md#createSession) | **POST** /v1/sessions | Create a Session
*ManagementApi* | [**deleteCampaign**](docs/ManagementApi.md#deleteCampaign) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId} | Delete a Campaign
*ManagementApi* | [**deleteCoupon**](docs/ManagementApi.md#deleteCoupon) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons/{couponId} | Delete one Coupon
*ManagementApi* | [**deleteCoupons**](docs/ManagementApi.md#deleteCoupons) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | Delete Coupons
*ManagementApi* | [**deleteReferral**](docs/ManagementApi.md#deleteReferral) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/referrals/{referralId} | Delete one Referral
*ManagementApi* | [**deleteRuleset**](docs/ManagementApi.md#deleteRuleset) | **DELETE** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets/{rulesetId} | Delete a Ruleset
*ManagementApi* | [**getAccessLogs**](docs/ManagementApi.md#getAccessLogs) | **GET** /v1/applications/{applicationId}/access_logs | Get access logs for application (with total count)
*ManagementApi* | [**getAccessLogsWithoutTotalCount**](docs/ManagementApi.md#getAccessLogsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/access_logs/no_total | Get access logs for application
*ManagementApi* | [**getAccount**](docs/ManagementApi.md#getAccount) | **GET** /v1/accounts/{accountId} | Get Account Details
*ManagementApi* | [**getAccountAnalytics**](docs/ManagementApi.md#getAccountAnalytics) | **GET** /v1/accounts/{accountId}/analytics | Get Account Analytics
*ManagementApi* | [**getAdditionalCost**](docs/ManagementApi.md#getAdditionalCost) | **GET** /v1/additional_costs/{additionalCostId} | Get an additional cost
*ManagementApi* | [**getAdditionalCosts**](docs/ManagementApi.md#getAdditionalCosts) | **GET** /v1/additional_costs | List additional costs
*ManagementApi* | [**getAllAccessLogs**](docs/ManagementApi.md#getAllAccessLogs) | **GET** /v1/access_logs | Get all access logs
*ManagementApi* | [**getAllRoles**](docs/ManagementApi.md#getAllRoles) | **GET** /v1/roles | Get all roles.
*ManagementApi* | [**getApplication**](docs/ManagementApi.md#getApplication) | **GET** /v1/applications/{applicationId} | Get Application
*ManagementApi* | [**getApplicationApiHealth**](docs/ManagementApi.md#getApplicationApiHealth) | **GET** /v1/applications/{applicationId}/health_report | Get report of health of application API
*ManagementApi* | [**getApplicationCustomer**](docs/ManagementApi.md#getApplicationCustomer) | **GET** /v1/applications/{applicationId}/customers/{customerId} | Get Application Customer
*ManagementApi* | [**getApplicationCustomers**](docs/ManagementApi.md#getApplicationCustomers) | **GET** /v1/applications/{applicationId}/customers | List Application Customers
*ManagementApi* | [**getApplicationCustomersByAttributes**](docs/ManagementApi.md#getApplicationCustomersByAttributes) | **POST** /v1/application_customer_search | Get a list of the customer profiles that match the given attributes (with total count)
*ManagementApi* | [**getApplicationEventTypes**](docs/ManagementApi.md#getApplicationEventTypes) | **GET** /v1/applications/{applicationId}/event_types | List Applications Event Types
*ManagementApi* | [**getApplicationEvents**](docs/ManagementApi.md#getApplicationEvents) | **GET** /v1/applications/{applicationId}/events | List Applications Events (with total count)
*ManagementApi* | [**getApplicationEventsWithoutTotalCount**](docs/ManagementApi.md#getApplicationEventsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/events/no_total | List Applications Events
*ManagementApi* | [**getApplicationSession**](docs/ManagementApi.md#getApplicationSession) | **GET** /v1/applications/{applicationId}/sessions/{sessionId} | Get Application Session
*ManagementApi* | [**getApplicationSessions**](docs/ManagementApi.md#getApplicationSessions) | **GET** /v1/applications/{applicationId}/sessions | List Application Sessions
*ManagementApi* | [**getApplications**](docs/ManagementApi.md#getApplications) | **GET** /v1/applications | List Applications
*ManagementApi* | [**getAttribute**](docs/ManagementApi.md#getAttribute) | **GET** /v1/attributes/{attributeId} | Get a custom attribute
*ManagementApi* | [**getAttributes**](docs/ManagementApi.md#getAttributes) | **GET** /v1/attributes | List custom attributes
*ManagementApi* | [**getCampaign**](docs/ManagementApi.md#getCampaign) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId} | Get a Campaign
*ManagementApi* | [**getCampaignAnalytics**](docs/ManagementApi.md#getCampaignAnalytics) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/analytics | Get analytics of campaigns
*ManagementApi* | [**getCampaignByAttributes**](docs/ManagementApi.md#getCampaignByAttributes) | **POST** /v1/applications/{applicationId}/campaigns_search | Get a list of all campaigns that match the given attributes
*ManagementApi* | [**getCampaigns**](docs/ManagementApi.md#getCampaigns) | **GET** /v1/applications/{applicationId}/campaigns | List your Campaigns
*ManagementApi* | [**getChanges**](docs/ManagementApi.md#getChanges) | **GET** /v1/changes | Get audit log for an account
*ManagementApi* | [**getCoupons**](docs/ManagementApi.md#getCoupons) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | List Coupons (with total count)
*ManagementApi* | [**getCouponsByAttributes**](docs/ManagementApi.md#getCouponsByAttributes) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_search | Get a list of the coupons that match the given attributes
*ManagementApi* | [**getCouponsByAttributesApplicationWide**](docs/ManagementApi.md#getCouponsByAttributesApplicationWide) | **POST** /v1/applications/{applicationId}/coupons_search | Get a list of the coupons that match the given attributes in all active campaigns of an application (with total count)
*ManagementApi* | [**getCouponsWithoutTotalCount**](docs/ManagementApi.md#getCouponsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons/no_total | List Coupons
*ManagementApi* | [**getCustomerActivityReport**](docs/ManagementApi.md#getCustomerActivityReport) | **GET** /v1/applications/{applicationId}/customer_activity_reports/{customerId} | Get Activity Report for Single Customer
*ManagementApi* | [**getCustomerActivityReports**](docs/ManagementApi.md#getCustomerActivityReports) | **GET** /v1/applications/{applicationId}/customer_activity_reports | Get Activity Reports for Application Customers (with total count)
*ManagementApi* | [**getCustomerActivityReportsWithoutTotalCount**](docs/ManagementApi.md#getCustomerActivityReportsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/customer_activity_reports/no_total | Get Activity Reports for Application Customers
*ManagementApi* | [**getCustomerAnalytics**](docs/ManagementApi.md#getCustomerAnalytics) | **GET** /v1/applications/{applicationId}/customers/{customerId}/analytics | Get Analytics Report for a Customer
*ManagementApi* | [**getCustomerProfile**](docs/ManagementApi.md#getCustomerProfile) | **GET** /v1/customers/{customerId} | Get Customer Profile
*ManagementApi* | [**getCustomerProfiles**](docs/ManagementApi.md#getCustomerProfiles) | **GET** /v1/customers/no_total | List Customer Profiles
*ManagementApi* | [**getCustomersByAttributes**](docs/ManagementApi.md#getCustomersByAttributes) | **POST** /v1/customer_search/no_total | Get a list of the customer profiles that match the given attributes
*ManagementApi* | [**getEventTypes**](docs/ManagementApi.md#getEventTypes) | **GET** /v1/event_types | List Event Types
*ManagementApi* | [**getExports**](docs/ManagementApi.md#getExports) | **GET** /v1/exports | Get Exports
*ManagementApi* | [**getImports**](docs/ManagementApi.md#getImports) | **GET** /v1/imports | Get Imports
*ManagementApi* | [**getLoyaltyPoints**](docs/ManagementApi.md#getLoyaltyPoints) | **GET** /v1/loyalty_programs/{programID}/profile/{integrationID} | get the Loyalty Ledger for this integrationID
*ManagementApi* | [**getLoyaltyProgram**](docs/ManagementApi.md#getLoyaltyProgram) | **GET** /v1/loyalty_programs/{programID} | Get a loyalty program
*ManagementApi* | [**getLoyaltyPrograms**](docs/ManagementApi.md#getLoyaltyPrograms) | **GET** /v1/loyalty_programs | List all loyalty Programs
*ManagementApi* | [**getLoyaltyStatistics**](docs/ManagementApi.md#getLoyaltyStatistics) | **GET** /v1/loyalty_programs/{programID}/statistics | Get loyalty program statistics by loyalty program ID
*ManagementApi* | [**getReferrals**](docs/ManagementApi.md#getReferrals) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/referrals | List Referrals (with total count)
*ManagementApi* | [**getReferralsWithoutTotalCount**](docs/ManagementApi.md#getReferralsWithoutTotalCount) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/referrals/no_total | List Referrals
*ManagementApi* | [**getRole**](docs/ManagementApi.md#getRole) | **GET** /v1/roles/{roleId} | Get information for the specified role.
*ManagementApi* | [**getRuleset**](docs/ManagementApi.md#getRuleset) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets/{rulesetId} | Get a Ruleset
*ManagementApi* | [**getRulesets**](docs/ManagementApi.md#getRulesets) | **GET** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets | List Campaign Rulesets
*ManagementApi* | [**getUser**](docs/ManagementApi.md#getUser) | **GET** /v1/users/{userId} | Get a single User
*ManagementApi* | [**getUsers**](docs/ManagementApi.md#getUsers) | **GET** /v1/users | List Users in your account
*ManagementApi* | [**getWebhook**](docs/ManagementApi.md#getWebhook) | **GET** /v1/webhooks/{webhookId} | Get Webhook
*ManagementApi* | [**getWebhookActivationLogs**](docs/ManagementApi.md#getWebhookActivationLogs) | **GET** /v1/webhook_activation_logs | List Webhook activation Log Entries
*ManagementApi* | [**getWebhookLogs**](docs/ManagementApi.md#getWebhookLogs) | **GET** /v1/webhook_logs | List Webhook Log Entries
*ManagementApi* | [**getWebhooks**](docs/ManagementApi.md#getWebhooks) | **GET** /v1/webhooks | List Webhooks
*ManagementApi* | [**removeLoyaltyPoints**](docs/ManagementApi.md#removeLoyaltyPoints) | **PUT** /v1/loyalty_programs/{programID}/profile/{integrationID}/deduct_points | Deduct points in a certain loyalty program for the specified customer
*ManagementApi* | [**resetPassword**](docs/ManagementApi.md#resetPassword) | **POST** /v1/reset_password | Reset password
*ManagementApi* | [**searchCouponsAdvanced**](docs/ManagementApi.md#searchCouponsAdvanced) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_search_advanced | Get a list of the coupons that match the given attributes (with total count)
*ManagementApi* | [**searchCouponsAdvancedApplicationWide**](docs/ManagementApi.md#searchCouponsAdvancedApplicationWide) | **POST** /v1/applications/{applicationId}/coupons_search_advanced | Get a list of the coupons that match the given attributes in all active campaigns of an application (with total count)
*ManagementApi* | [**searchCouponsAdvancedApplicationWideWithoutTotalCount**](docs/ManagementApi.md#searchCouponsAdvancedApplicationWideWithoutTotalCount) | **POST** /v1/applications/{applicationId}/coupons_search_advanced/no_total | Get a list of the coupons that match the given attributes in all active campaigns of an application
*ManagementApi* | [**searchCouponsAdvancedWithoutTotalCount**](docs/ManagementApi.md#searchCouponsAdvancedWithoutTotalCount) | **POST** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons_search_advanced/no_total | Get a list of the coupons that match the given attributes
*ManagementApi* | [**updateAdditionalCost**](docs/ManagementApi.md#updateAdditionalCost) | **PUT** /v1/additional_costs/{additionalCostId} | Update an additional cost
*ManagementApi* | [**updateAttribute**](docs/ManagementApi.md#updateAttribute) | **PUT** /v1/attributes/{attributeId} | Update a custom attribute
*ManagementApi* | [**updateCampaign**](docs/ManagementApi.md#updateCampaign) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId} | Update a Campaign
*ManagementApi* | [**updateCoupon**](docs/ManagementApi.md#updateCoupon) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons/{couponId} | Update a Coupon
*ManagementApi* | [**updateCouponBatch**](docs/ManagementApi.md#updateCouponBatch) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/coupons | Update a Batch of Coupons
*ManagementApi* | [**updateRuleset**](docs/ManagementApi.md#updateRuleset) | **PUT** /v1/applications/{applicationId}/campaigns/{campaignId}/rulesets/{rulesetId} | Update a Ruleset


## Documentation for Models

 - [APIError](docs/APIError.md)
 - [AcceptCouponEffectProps](docs/AcceptCouponEffectProps.md)
 - [AcceptReferralEffectProps](docs/AcceptReferralEffectProps.md)
 - [AccessLogEntry](docs/AccessLogEntry.md)
 - [Account](docs/Account.md)
 - [AccountAdditionalCost](docs/AccountAdditionalCost.md)
 - [AccountAnalytics](docs/AccountAnalytics.md)
 - [AccountEntity](docs/AccountEntity.md)
 - [AccountLimits](docs/AccountLimits.md)
 - [AddFreeItemEffectProps](docs/AddFreeItemEffectProps.md)
 - [AddLoyaltyPointsEffectProps](docs/AddLoyaltyPointsEffectProps.md)
 - [AdditionalCost](docs/AdditionalCost.md)
 - [Application](docs/Application.md)
 - [ApplicationAPIKey](docs/ApplicationAPIKey.md)
 - [ApplicationApiHealth](docs/ApplicationApiHealth.md)
 - [ApplicationCustomer](docs/ApplicationCustomer.md)
 - [ApplicationCustomerEntity](docs/ApplicationCustomerEntity.md)
 - [ApplicationCustomerSearch](docs/ApplicationCustomerSearch.md)
 - [ApplicationEntity](docs/ApplicationEntity.md)
 - [ApplicationEvent](docs/ApplicationEvent.md)
 - [ApplicationSession](docs/ApplicationSession.md)
 - [ApplicationSessionEntity](docs/ApplicationSessionEntity.md)
 - [Attribute](docs/Attribute.md)
 - [AttributesMandatory](docs/AttributesMandatory.md)
 - [AttributesSettings](docs/AttributesSettings.md)
 - [Audience](docs/Audience.md)
 - [AudienceMembership](docs/AudienceMembership.md)
 - [BaseSamlConnection](docs/BaseSamlConnection.md)
 - [Binding](docs/Binding.md)
 - [Campaign](docs/Campaign.md)
 - [CampaignAnalytics](docs/CampaignAnalytics.md)
 - [CampaignCopy](docs/CampaignCopy.md)
 - [CampaignEntity](docs/CampaignEntity.md)
 - [CampaignGroup](docs/CampaignGroup.md)
 - [CampaignGroupEntity](docs/CampaignGroupEntity.md)
 - [CampaignSearch](docs/CampaignSearch.md)
 - [CampaignSet](docs/CampaignSet.md)
 - [CampaignSetBranchNode](docs/CampaignSetBranchNode.md)
 - [CampaignSetLeafNode](docs/CampaignSetLeafNode.md)
 - [CampaignSetNode](docs/CampaignSetNode.md)
 - [CartItem](docs/CartItem.md)
 - [CartItemAdjustment](docs/CartItemAdjustment.md)
 - [Change](docs/Change.md)
 - [ChangeProfilePassword](docs/ChangeProfilePassword.md)
 - [CodeGeneratorSettings](docs/CodeGeneratorSettings.md)
 - [Coupon](docs/Coupon.md)
 - [CouponConstraints](docs/CouponConstraints.md)
 - [CouponCreatedEffectProps](docs/CouponCreatedEffectProps.md)
 - [CouponRejectionReason](docs/CouponRejectionReason.md)
 - [CouponReservations](docs/CouponReservations.md)
 - [CouponSearch](docs/CouponSearch.md)
 - [CouponValue](docs/CouponValue.md)
 - [CreateApplicationAPIKey](docs/CreateApplicationAPIKey.md)
 - [CustomerActivityReport](docs/CustomerActivityReport.md)
 - [CustomerAnalytics](docs/CustomerAnalytics.md)
 - [CustomerInventory](docs/CustomerInventory.md)
 - [CustomerProfile](docs/CustomerProfile.md)
 - [CustomerProfileAudienceRequest](docs/CustomerProfileAudienceRequest.md)
 - [CustomerProfileAudienceRequestItem](docs/CustomerProfileAudienceRequestItem.md)
 - [CustomerProfileIntegrationRequestV2](docs/CustomerProfileIntegrationRequestV2.md)
 - [CustomerProfileSearchQuery](docs/CustomerProfileSearchQuery.md)
 - [CustomerSession](docs/CustomerSession.md)
 - [CustomerSessionV2](docs/CustomerSessionV2.md)
 - [DeductLoyaltyPointsEffectProps](docs/DeductLoyaltyPointsEffectProps.md)
 - [Effect](docs/Effect.md)
 - [EffectEntity](docs/EffectEntity.md)
 - [EmailEntity](docs/EmailEntity.md)
 - [Entity](docs/Entity.md)
 - [EntityWithTalangVisibleID](docs/EntityWithTalangVisibleID.md)
 - [Environment](docs/Environment.md)
 - [ErrorEffectProps](docs/ErrorEffectProps.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ErrorSource](docs/ErrorSource.md)
 - [Event](docs/Event.md)
 - [EventType](docs/EventType.md)
 - [Export](docs/Export.md)
 - [FeatureFlag](docs/FeatureFlag.md)
 - [FeatureFlags](docs/FeatureFlags.md)
 - [FeaturesFeed](docs/FeaturesFeed.md)
 - [FeedNotification](docs/FeedNotification.md)
 - [FuncArgDef](docs/FuncArgDef.md)
 - [FunctionDef](docs/FunctionDef.md)
 - [ImportCoupons](docs/ImportCoupons.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse20010](docs/InlineResponse20010.md)
 - [InlineResponse20011](docs/InlineResponse20011.md)
 - [InlineResponse20012](docs/InlineResponse20012.md)
 - [InlineResponse20013](docs/InlineResponse20013.md)
 - [InlineResponse20014](docs/InlineResponse20014.md)
 - [InlineResponse20015](docs/InlineResponse20015.md)
 - [InlineResponse20016](docs/InlineResponse20016.md)
 - [InlineResponse20017](docs/InlineResponse20017.md)
 - [InlineResponse20018](docs/InlineResponse20018.md)
 - [InlineResponse20019](docs/InlineResponse20019.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse20020](docs/InlineResponse20020.md)
 - [InlineResponse20021](docs/InlineResponse20021.md)
 - [InlineResponse20022](docs/InlineResponse20022.md)
 - [InlineResponse20023](docs/InlineResponse20023.md)
 - [InlineResponse20024](docs/InlineResponse20024.md)
 - [InlineResponse20025](docs/InlineResponse20025.md)
 - [InlineResponse20026](docs/InlineResponse20026.md)
 - [InlineResponse20027](docs/InlineResponse20027.md)
 - [InlineResponse20028](docs/InlineResponse20028.md)
 - [InlineResponse20029](docs/InlineResponse20029.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse20030](docs/InlineResponse20030.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [IntegrationEntity](docs/IntegrationEntity.md)
 - [IntegrationEvent](docs/IntegrationEvent.md)
 - [IntegrationProfileEntity](docs/IntegrationProfileEntity.md)
 - [IntegrationRequest](docs/IntegrationRequest.md)
 - [IntegrationState](docs/IntegrationState.md)
 - [IntegrationStateV2](docs/IntegrationStateV2.md)
 - [LedgerEntry](docs/LedgerEntry.md)
 - [LibraryAttribute](docs/LibraryAttribute.md)
 - [LimitConfig](docs/LimitConfig.md)
 - [LoginParams](docs/LoginParams.md)
 - [Loyalty](docs/Loyalty.md)
 - [LoyaltyLedger](docs/LoyaltyLedger.md)
 - [LoyaltyLedgerEntry](docs/LoyaltyLedgerEntry.md)
 - [LoyaltyMembership](docs/LoyaltyMembership.md)
 - [LoyaltyPoints](docs/LoyaltyPoints.md)
 - [LoyaltyProgram](docs/LoyaltyProgram.md)
 - [LoyaltyProgramBalance](docs/LoyaltyProgramBalance.md)
 - [LoyaltyProgramLedgers](docs/LoyaltyProgramLedgers.md)
 - [LoyaltyStatistics](docs/LoyaltyStatistics.md)
 - [LoyaltySubLedger](docs/LoyaltySubLedger.md)
 - [ManagerConfig](docs/ManagerConfig.md)
 - [Meta](docs/Meta.md)
 - [ModelImport](docs/ModelImport.md)
 - [MultiApplicationEntity](docs/MultiApplicationEntity.md)
 - [MultipleCustomerProfileIntegrationRequest](docs/MultipleCustomerProfileIntegrationRequest.md)
 - [MultipleCustomerProfileIntegrationRequestItem](docs/MultipleCustomerProfileIntegrationRequestItem.md)
 - [MultipleCustomerProfileIntegrationResponseV2](docs/MultipleCustomerProfileIntegrationResponseV2.md)
 - [MutableEntity](docs/MutableEntity.md)
 - [NewAccount](docs/NewAccount.md)
 - [NewAccountSignUp](docs/NewAccountSignUp.md)
 - [NewAdditionalCost](docs/NewAdditionalCost.md)
 - [NewApplication](docs/NewApplication.md)
 - [NewApplicationAPIKey](docs/NewApplicationAPIKey.md)
 - [NewAttribute](docs/NewAttribute.md)
 - [NewAudience](docs/NewAudience.md)
 - [NewCampaign](docs/NewCampaign.md)
 - [NewCampaignGroup](docs/NewCampaignGroup.md)
 - [NewCampaignSet](docs/NewCampaignSet.md)
 - [NewCoupons](docs/NewCoupons.md)
 - [NewCustomerProfile](docs/NewCustomerProfile.md)
 - [NewCustomerSession](docs/NewCustomerSession.md)
 - [NewCustomerSessionV2](docs/NewCustomerSessionV2.md)
 - [NewEvent](docs/NewEvent.md)
 - [NewEventType](docs/NewEventType.md)
 - [NewFeatureFlags](docs/NewFeatureFlags.md)
 - [NewImport](docs/NewImport.md)
 - [NewInvitation](docs/NewInvitation.md)
 - [NewInviteEmail](docs/NewInviteEmail.md)
 - [NewLoyaltyProgram](docs/NewLoyaltyProgram.md)
 - [NewPassword](docs/NewPassword.md)
 - [NewPasswordEmail](docs/NewPasswordEmail.md)
 - [NewReferral](docs/NewReferral.md)
 - [NewRole](docs/NewRole.md)
 - [NewRuleset](docs/NewRuleset.md)
 - [NewSamlConnection](docs/NewSamlConnection.md)
 - [NewTemplateDef](docs/NewTemplateDef.md)
 - [NewUser](docs/NewUser.md)
 - [NewWebhook](docs/NewWebhook.md)
 - [Notification](docs/Notification.md)
 - [RedeemReferralEffectProps](docs/RedeemReferralEffectProps.md)
 - [Referral](docs/Referral.md)
 - [ReferralCreatedEffectProps](docs/ReferralCreatedEffectProps.md)
 - [ReferralRejectionReason](docs/ReferralRejectionReason.md)
 - [RejectCouponEffectProps](docs/RejectCouponEffectProps.md)
 - [RejectReferralEffectProps](docs/RejectReferralEffectProps.md)
 - [Role](docs/Role.md)
 - [RoleAssign](docs/RoleAssign.md)
 - [RoleMembership](docs/RoleMembership.md)
 - [RollbackCouponEffectProps](docs/RollbackCouponEffectProps.md)
 - [RollbackDiscountEffectProps](docs/RollbackDiscountEffectProps.md)
 - [Rule](docs/Rule.md)
 - [Ruleset](docs/Ruleset.md)
 - [SamlConnection](docs/SamlConnection.md)
 - [SamlConnectionMetadata](docs/SamlConnectionMetadata.md)
 - [SamlLoginEndpoint](docs/SamlLoginEndpoint.md)
 - [Session](docs/Session.md)
 - [SetDiscountEffectProps](docs/SetDiscountEffectProps.md)
 - [SetDiscountPerItemEffectProps](docs/SetDiscountPerItemEffectProps.md)
 - [ShowBundleMetadataEffectProps](docs/ShowBundleMetadataEffectProps.md)
 - [ShowNotificationEffectProps](docs/ShowNotificationEffectProps.md)
 - [SlotDef](docs/SlotDef.md)
 - [TemplateArgDef](docs/TemplateArgDef.md)
 - [TemplateDef](docs/TemplateDef.md)
 - [TriggerWebhookEffectProps](docs/TriggerWebhookEffectProps.md)
 - [UpdateAccount](docs/UpdateAccount.md)
 - [UpdateApplication](docs/UpdateApplication.md)
 - [UpdateAttributeEffectProps](docs/UpdateAttributeEffectProps.md)
 - [UpdateAudience](docs/UpdateAudience.md)
 - [UpdateCampaign](docs/UpdateCampaign.md)
 - [UpdateCampaignGroup](docs/UpdateCampaignGroup.md)
 - [UpdateCoupon](docs/UpdateCoupon.md)
 - [UpdateCouponBatch](docs/UpdateCouponBatch.md)
 - [UpdateLoyaltyProgram](docs/UpdateLoyaltyProgram.md)
 - [UpdateRole](docs/UpdateRole.md)
 - [UpdateUser](docs/UpdateUser.md)
 - [UpdateUserLatestFeedTimestamp](docs/UpdateUserLatestFeedTimestamp.md)
 - [User](docs/User.md)
 - [UserEntity](docs/UserEntity.md)
 - [UserFeedNotifications](docs/UserFeedNotifications.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookActivationLogEntry](docs/WebhookActivationLogEntry.md)
 - [WebhookLogEntry](docs/WebhookLogEntry.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key_v1

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

### integration_auth

- **Type**: API key
- **API key parameter name**: Content-Signature
- **Location**: HTTP header

### manager_auth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



