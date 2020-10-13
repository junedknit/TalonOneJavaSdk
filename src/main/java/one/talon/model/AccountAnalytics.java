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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AccountAnalytics
 */

public class AccountAnalytics {
  public static final String SERIALIZED_NAME_APPLICATIONS = "applications";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS)
  private Integer applications;

  public static final String SERIALIZED_NAME_LIVE_APPLICATIONS = "liveApplications";
  @SerializedName(SERIALIZED_NAME_LIVE_APPLICATIONS)
  private Integer liveApplications;

  public static final String SERIALIZED_NAME_SANDBOX_APPLICATIONS = "sandboxApplications";
  @SerializedName(SERIALIZED_NAME_SANDBOX_APPLICATIONS)
  private Integer sandboxApplications;

  public static final String SERIALIZED_NAME_CAMPAIGNS = "campaigns";
  @SerializedName(SERIALIZED_NAME_CAMPAIGNS)
  private Integer campaigns;

  public static final String SERIALIZED_NAME_ACTIVE_CAMPAIGNS = "activeCampaigns";
  @SerializedName(SERIALIZED_NAME_ACTIVE_CAMPAIGNS)
  private Integer activeCampaigns;

  public static final String SERIALIZED_NAME_LIVE_ACTIVE_CAMPAIGNS = "liveActiveCampaigns";
  @SerializedName(SERIALIZED_NAME_LIVE_ACTIVE_CAMPAIGNS)
  private Integer liveActiveCampaigns;

  public static final String SERIALIZED_NAME_COUPONS = "coupons";
  @SerializedName(SERIALIZED_NAME_COUPONS)
  private Integer coupons;

  public static final String SERIALIZED_NAME_ACTIVE_COUPONS = "activeCoupons";
  @SerializedName(SERIALIZED_NAME_ACTIVE_COUPONS)
  private Integer activeCoupons;

  public static final String SERIALIZED_NAME_EXPIRED_COUPONS = "expiredCoupons";
  @SerializedName(SERIALIZED_NAME_EXPIRED_COUPONS)
  private Integer expiredCoupons;

  public static final String SERIALIZED_NAME_REFERRAL_CODES = "referralCodes";
  @SerializedName(SERIALIZED_NAME_REFERRAL_CODES)
  private Integer referralCodes;

  public static final String SERIALIZED_NAME_ACTIVE_REFERRAL_CODES = "activeReferralCodes";
  @SerializedName(SERIALIZED_NAME_ACTIVE_REFERRAL_CODES)
  private Integer activeReferralCodes;

  public static final String SERIALIZED_NAME_EXPIRED_REFERRAL_CODES = "expiredReferralCodes";
  @SerializedName(SERIALIZED_NAME_EXPIRED_REFERRAL_CODES)
  private Integer expiredReferralCodes;

  public static final String SERIALIZED_NAME_ACTIVE_RULES = "activeRules";
  @SerializedName(SERIALIZED_NAME_ACTIVE_RULES)
  private Integer activeRules;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private Integer users;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private Integer roles;

  public static final String SERIALIZED_NAME_CUSTOM_ATTRIBUTES = "customAttributes";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ATTRIBUTES)
  private Integer customAttributes;

  public static final String SERIALIZED_NAME_WEBHOOKS = "webhooks";
  @SerializedName(SERIALIZED_NAME_WEBHOOKS)
  private Integer webhooks;

  public static final String SERIALIZED_NAME_LOYALTY_PROGRAMS = "loyaltyPrograms";
  @SerializedName(SERIALIZED_NAME_LOYALTY_PROGRAMS)
  private Integer loyaltyPrograms;


  public AccountAnalytics applications(Integer applications) {
    
    this.applications = applications;
    return this;
  }

   /**
   * Total number of applications in the account
   * @return applications
  **/
  @ApiModelProperty(required = true, value = "Total number of applications in the account")

  public Integer getApplications() {
    return applications;
  }


  public void setApplications(Integer applications) {
    this.applications = applications;
  }


  public AccountAnalytics liveApplications(Integer liveApplications) {
    
    this.liveApplications = liveApplications;
    return this;
  }

   /**
   * Total number of live applications in the account
   * @return liveApplications
  **/
  @ApiModelProperty(required = true, value = "Total number of live applications in the account")

  public Integer getLiveApplications() {
    return liveApplications;
  }


  public void setLiveApplications(Integer liveApplications) {
    this.liveApplications = liveApplications;
  }


  public AccountAnalytics sandboxApplications(Integer sandboxApplications) {
    
    this.sandboxApplications = sandboxApplications;
    return this;
  }

   /**
   * Total number of sandbox applications in the account
   * @return sandboxApplications
  **/
  @ApiModelProperty(required = true, value = "Total number of sandbox applications in the account")

  public Integer getSandboxApplications() {
    return sandboxApplications;
  }


  public void setSandboxApplications(Integer sandboxApplications) {
    this.sandboxApplications = sandboxApplications;
  }


  public AccountAnalytics campaigns(Integer campaigns) {
    
    this.campaigns = campaigns;
    return this;
  }

   /**
   * Total number of campaigns in the account
   * @return campaigns
  **/
  @ApiModelProperty(required = true, value = "Total number of campaigns in the account")

  public Integer getCampaigns() {
    return campaigns;
  }


  public void setCampaigns(Integer campaigns) {
    this.campaigns = campaigns;
  }


  public AccountAnalytics activeCampaigns(Integer activeCampaigns) {
    
    this.activeCampaigns = activeCampaigns;
    return this;
  }

   /**
   * Total number of active campaigns in the account
   * @return activeCampaigns
  **/
  @ApiModelProperty(required = true, value = "Total number of active campaigns in the account")

  public Integer getActiveCampaigns() {
    return activeCampaigns;
  }


  public void setActiveCampaigns(Integer activeCampaigns) {
    this.activeCampaigns = activeCampaigns;
  }


  public AccountAnalytics liveActiveCampaigns(Integer liveActiveCampaigns) {
    
    this.liveActiveCampaigns = liveActiveCampaigns;
    return this;
  }

   /**
   * Total number of active campaigns in live applications in the account
   * @return liveActiveCampaigns
  **/
  @ApiModelProperty(required = true, value = "Total number of active campaigns in live applications in the account")

  public Integer getLiveActiveCampaigns() {
    return liveActiveCampaigns;
  }


  public void setLiveActiveCampaigns(Integer liveActiveCampaigns) {
    this.liveActiveCampaigns = liveActiveCampaigns;
  }


  public AccountAnalytics coupons(Integer coupons) {
    
    this.coupons = coupons;
    return this;
  }

   /**
   * Total number of coupons in the account
   * @return coupons
  **/
  @ApiModelProperty(required = true, value = "Total number of coupons in the account")

  public Integer getCoupons() {
    return coupons;
  }


  public void setCoupons(Integer coupons) {
    this.coupons = coupons;
  }


  public AccountAnalytics activeCoupons(Integer activeCoupons) {
    
    this.activeCoupons = activeCoupons;
    return this;
  }

   /**
   * Total number of active coupons in the account
   * @return activeCoupons
  **/
  @ApiModelProperty(required = true, value = "Total number of active coupons in the account")

  public Integer getActiveCoupons() {
    return activeCoupons;
  }


  public void setActiveCoupons(Integer activeCoupons) {
    this.activeCoupons = activeCoupons;
  }


  public AccountAnalytics expiredCoupons(Integer expiredCoupons) {
    
    this.expiredCoupons = expiredCoupons;
    return this;
  }

   /**
   * Total number of expired coupons in the account
   * @return expiredCoupons
  **/
  @ApiModelProperty(required = true, value = "Total number of expired coupons in the account")

  public Integer getExpiredCoupons() {
    return expiredCoupons;
  }


  public void setExpiredCoupons(Integer expiredCoupons) {
    this.expiredCoupons = expiredCoupons;
  }


  public AccountAnalytics referralCodes(Integer referralCodes) {
    
    this.referralCodes = referralCodes;
    return this;
  }

   /**
   * Total number of referral codes in the account
   * @return referralCodes
  **/
  @ApiModelProperty(required = true, value = "Total number of referral codes in the account")

  public Integer getReferralCodes() {
    return referralCodes;
  }


  public void setReferralCodes(Integer referralCodes) {
    this.referralCodes = referralCodes;
  }


  public AccountAnalytics activeReferralCodes(Integer activeReferralCodes) {
    
    this.activeReferralCodes = activeReferralCodes;
    return this;
  }

   /**
   * Total number of active referral codes in the account
   * @return activeReferralCodes
  **/
  @ApiModelProperty(required = true, value = "Total number of active referral codes in the account")

  public Integer getActiveReferralCodes() {
    return activeReferralCodes;
  }


  public void setActiveReferralCodes(Integer activeReferralCodes) {
    this.activeReferralCodes = activeReferralCodes;
  }


  public AccountAnalytics expiredReferralCodes(Integer expiredReferralCodes) {
    
    this.expiredReferralCodes = expiredReferralCodes;
    return this;
  }

   /**
   * Total number of expired referral codes in the account
   * @return expiredReferralCodes
  **/
  @ApiModelProperty(required = true, value = "Total number of expired referral codes in the account")

  public Integer getExpiredReferralCodes() {
    return expiredReferralCodes;
  }


  public void setExpiredReferralCodes(Integer expiredReferralCodes) {
    this.expiredReferralCodes = expiredReferralCodes;
  }


  public AccountAnalytics activeRules(Integer activeRules) {
    
    this.activeRules = activeRules;
    return this;
  }

   /**
   * Total number of active rules in the account
   * @return activeRules
  **/
  @ApiModelProperty(required = true, value = "Total number of active rules in the account")

  public Integer getActiveRules() {
    return activeRules;
  }


  public void setActiveRules(Integer activeRules) {
    this.activeRules = activeRules;
  }


  public AccountAnalytics users(Integer users) {
    
    this.users = users;
    return this;
  }

   /**
   * Total number of users in the account
   * @return users
  **/
  @ApiModelProperty(required = true, value = "Total number of users in the account")

  public Integer getUsers() {
    return users;
  }


  public void setUsers(Integer users) {
    this.users = users;
  }


  public AccountAnalytics roles(Integer roles) {
    
    this.roles = roles;
    return this;
  }

   /**
   * Total number of roles in the account
   * @return roles
  **/
  @ApiModelProperty(required = true, value = "Total number of roles in the account")

  public Integer getRoles() {
    return roles;
  }


  public void setRoles(Integer roles) {
    this.roles = roles;
  }


  public AccountAnalytics customAttributes(Integer customAttributes) {
    
    this.customAttributes = customAttributes;
    return this;
  }

   /**
   * Total number of custom attributes in the account
   * @return customAttributes
  **/
  @ApiModelProperty(required = true, value = "Total number of custom attributes in the account")

  public Integer getCustomAttributes() {
    return customAttributes;
  }


  public void setCustomAttributes(Integer customAttributes) {
    this.customAttributes = customAttributes;
  }


  public AccountAnalytics webhooks(Integer webhooks) {
    
    this.webhooks = webhooks;
    return this;
  }

   /**
   * Total number of webhooks in the account
   * @return webhooks
  **/
  @ApiModelProperty(required = true, value = "Total number of webhooks in the account")

  public Integer getWebhooks() {
    return webhooks;
  }


  public void setWebhooks(Integer webhooks) {
    this.webhooks = webhooks;
  }


  public AccountAnalytics loyaltyPrograms(Integer loyaltyPrograms) {
    
    this.loyaltyPrograms = loyaltyPrograms;
    return this;
  }

   /**
   * Total number of loyalty programs in the account
   * @return loyaltyPrograms
  **/
  @ApiModelProperty(required = true, value = "Total number of loyalty programs in the account")

  public Integer getLoyaltyPrograms() {
    return loyaltyPrograms;
  }


  public void setLoyaltyPrograms(Integer loyaltyPrograms) {
    this.loyaltyPrograms = loyaltyPrograms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAnalytics accountAnalytics = (AccountAnalytics) o;
    return Objects.equals(this.applications, accountAnalytics.applications) &&
        Objects.equals(this.liveApplications, accountAnalytics.liveApplications) &&
        Objects.equals(this.sandboxApplications, accountAnalytics.sandboxApplications) &&
        Objects.equals(this.campaigns, accountAnalytics.campaigns) &&
        Objects.equals(this.activeCampaigns, accountAnalytics.activeCampaigns) &&
        Objects.equals(this.liveActiveCampaigns, accountAnalytics.liveActiveCampaigns) &&
        Objects.equals(this.coupons, accountAnalytics.coupons) &&
        Objects.equals(this.activeCoupons, accountAnalytics.activeCoupons) &&
        Objects.equals(this.expiredCoupons, accountAnalytics.expiredCoupons) &&
        Objects.equals(this.referralCodes, accountAnalytics.referralCodes) &&
        Objects.equals(this.activeReferralCodes, accountAnalytics.activeReferralCodes) &&
        Objects.equals(this.expiredReferralCodes, accountAnalytics.expiredReferralCodes) &&
        Objects.equals(this.activeRules, accountAnalytics.activeRules) &&
        Objects.equals(this.users, accountAnalytics.users) &&
        Objects.equals(this.roles, accountAnalytics.roles) &&
        Objects.equals(this.customAttributes, accountAnalytics.customAttributes) &&
        Objects.equals(this.webhooks, accountAnalytics.webhooks) &&
        Objects.equals(this.loyaltyPrograms, accountAnalytics.loyaltyPrograms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications, liveApplications, sandboxApplications, campaigns, activeCampaigns, liveActiveCampaigns, coupons, activeCoupons, expiredCoupons, referralCodes, activeReferralCodes, expiredReferralCodes, activeRules, users, roles, customAttributes, webhooks, loyaltyPrograms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAnalytics {\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    liveApplications: ").append(toIndentedString(liveApplications)).append("\n");
    sb.append("    sandboxApplications: ").append(toIndentedString(sandboxApplications)).append("\n");
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    activeCampaigns: ").append(toIndentedString(activeCampaigns)).append("\n");
    sb.append("    liveActiveCampaigns: ").append(toIndentedString(liveActiveCampaigns)).append("\n");
    sb.append("    coupons: ").append(toIndentedString(coupons)).append("\n");
    sb.append("    activeCoupons: ").append(toIndentedString(activeCoupons)).append("\n");
    sb.append("    expiredCoupons: ").append(toIndentedString(expiredCoupons)).append("\n");
    sb.append("    referralCodes: ").append(toIndentedString(referralCodes)).append("\n");
    sb.append("    activeReferralCodes: ").append(toIndentedString(activeReferralCodes)).append("\n");
    sb.append("    expiredReferralCodes: ").append(toIndentedString(expiredReferralCodes)).append("\n");
    sb.append("    activeRules: ").append(toIndentedString(activeRules)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
    sb.append("    loyaltyPrograms: ").append(toIndentedString(loyaltyPrograms)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

