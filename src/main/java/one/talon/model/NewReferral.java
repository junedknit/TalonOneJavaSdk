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
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class NewReferral {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_USAGE_LIMIT = "usageLimit";
  @SerializedName(SERIALIZED_NAME_USAGE_LIMIT)
  private Integer usageLimit;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Integer campaignId;

  public static final String SERIALIZED_NAME_ADVOCATE_PROFILE_INTEGRATION_ID = "advocateProfileIntegrationId";
  @SerializedName(SERIALIZED_NAME_ADVOCATE_PROFILE_INTEGRATION_ID)
  private String advocateProfileIntegrationId;

  public static final String SERIALIZED_NAME_FRIEND_PROFILE_INTEGRATION_ID = "friendProfileIntegrationId";
  @SerializedName(SERIALIZED_NAME_FRIEND_PROFILE_INTEGRATION_ID)
  private String friendProfileIntegrationId;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;


  public NewReferral startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Timestamp at which point the referral code becomes valid.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp at which point the referral code becomes valid.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public NewReferral expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Expiry date of the referral code. Referral never expires if this is omitted, zero, or negative.
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expiry date of the referral code. Referral never expires if this is omitted, zero, or negative.")

  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  public NewReferral usageLimit(Integer usageLimit) {
    
    this.usageLimit = usageLimit;
    return this;
  }

   /**
   * The number of times a referral code can be used. This can be set to 0 for no limit, but any campaign usage limits will still apply. 
   * minimum: 0
   * maximum: 999999
   * @return usageLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of times a referral code can be used. This can be set to 0 for no limit, but any campaign usage limits will still apply. ")

  public Integer getUsageLimit() {
    return usageLimit;
  }


  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }


  public NewReferral campaignId(Integer campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * ID of the campaign from which the referral received the referral code.
   * @return campaignId
  **/
  @ApiModelProperty(required = true, value = "ID of the campaign from which the referral received the referral code.")

  public Integer getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }


  public NewReferral advocateProfileIntegrationId(String advocateProfileIntegrationId) {
    
    this.advocateProfileIntegrationId = advocateProfileIntegrationId;
    return this;
  }

   /**
   * The Integration ID of the Advocate&#39;s Profile.
   * @return advocateProfileIntegrationId
  **/
  @ApiModelProperty(required = true, value = "The Integration ID of the Advocate's Profile.")

  public String getAdvocateProfileIntegrationId() {
    return advocateProfileIntegrationId;
  }


  public void setAdvocateProfileIntegrationId(String advocateProfileIntegrationId) {
    this.advocateProfileIntegrationId = advocateProfileIntegrationId;
  }


  public NewReferral friendProfileIntegrationId(String friendProfileIntegrationId) {
    
    this.friendProfileIntegrationId = friendProfileIntegrationId;
    return this;
  }

   /**
   * An optional Integration ID of the Friend&#39;s Profile
   * @return friendProfileIntegrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional Integration ID of the Friend's Profile")

  public String getFriendProfileIntegrationId() {
    return friendProfileIntegrationId;
  }


  public void setFriendProfileIntegrationId(String friendProfileIntegrationId) {
    this.friendProfileIntegrationId = friendProfileIntegrationId;
  }


  public NewReferral attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this item.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary properties associated with this item.")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewReferral newReferral = (NewReferral) o;
    return Objects.equals(this.startDate, newReferral.startDate) &&
        Objects.equals(this.expiryDate, newReferral.expiryDate) &&
        Objects.equals(this.usageLimit, newReferral.usageLimit) &&
        Objects.equals(this.campaignId, newReferral.campaignId) &&
        Objects.equals(this.advocateProfileIntegrationId, newReferral.advocateProfileIntegrationId) &&
        Objects.equals(this.friendProfileIntegrationId, newReferral.friendProfileIntegrationId) &&
        Objects.equals(this.attributes, newReferral.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, expiryDate, usageLimit, campaignId, advocateProfileIntegrationId, friendProfileIntegrationId, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewReferral {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    advocateProfileIntegrationId: ").append(toIndentedString(advocateProfileIntegrationId)).append("\n");
    sb.append("    friendProfileIntegrationId: ").append(toIndentedString(friendProfileIntegrationId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

