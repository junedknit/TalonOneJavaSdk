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

public class Referral {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

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

  public static final String SERIALIZED_NAME_IMPORT_ID = "importId";
  @SerializedName(SERIALIZED_NAME_IMPORT_ID)
  private Integer importId;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_USAGE_COUNTER = "usageCounter";
  @SerializedName(SERIALIZED_NAME_USAGE_COUNTER)
  private Integer usageCounter;

  public static final String SERIALIZED_NAME_BATCH_ID = "batchId";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private String batchId;


  public Referral id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID for this entity.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique ID for this entity.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Referral created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The exact moment this entity was created.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The exact moment this entity was created.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public Referral startDate(OffsetDateTime startDate) {
    
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


  public Referral expiryDate(OffsetDateTime expiryDate) {
    
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


  public Referral usageLimit(Integer usageLimit) {
    
    this.usageLimit = usageLimit;
    return this;
  }

   /**
   * The number of times a referral code can be used. This can be set to 0 for no limit, but any campaign usage limits will still apply. 
   * minimum: 0
   * maximum: 999999
   * @return usageLimit
  **/
  @ApiModelProperty(required = true, value = "The number of times a referral code can be used. This can be set to 0 for no limit, but any campaign usage limits will still apply. ")

  public Integer getUsageLimit() {
    return usageLimit;
  }


  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }


  public Referral campaignId(Integer campaignId) {
    
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


  public Referral advocateProfileIntegrationId(String advocateProfileIntegrationId) {
    
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


  public Referral friendProfileIntegrationId(String friendProfileIntegrationId) {
    
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


  public Referral attributes(Object attributes) {
    
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


  public Referral importId(Integer importId) {
    
    this.importId = importId;
    return this;
  }

   /**
   * The ID of the Import which created this referral.
   * @return importId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the Import which created this referral.")

  public Integer getImportId() {
    return importId;
  }


  public void setImportId(Integer importId) {
    this.importId = importId;
  }


  public Referral code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The actual referral code.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The actual referral code.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public Referral usageCounter(Integer usageCounter) {
    
    this.usageCounter = usageCounter;
    return this;
  }

   /**
   * The number of times this referral code has been successfully used.
   * @return usageCounter
  **/
  @ApiModelProperty(required = true, value = "The number of times this referral code has been successfully used.")

  public Integer getUsageCounter() {
    return usageCounter;
  }


  public void setUsageCounter(Integer usageCounter) {
    this.usageCounter = usageCounter;
  }


  public Referral batchId(String batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * The ID of the batch the referrals belong to.
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the batch the referrals belong to.")

  public String getBatchId() {
    return batchId;
  }


  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Referral referral = (Referral) o;
    return Objects.equals(this.id, referral.id) &&
        Objects.equals(this.created, referral.created) &&
        Objects.equals(this.startDate, referral.startDate) &&
        Objects.equals(this.expiryDate, referral.expiryDate) &&
        Objects.equals(this.usageLimit, referral.usageLimit) &&
        Objects.equals(this.campaignId, referral.campaignId) &&
        Objects.equals(this.advocateProfileIntegrationId, referral.advocateProfileIntegrationId) &&
        Objects.equals(this.friendProfileIntegrationId, referral.friendProfileIntegrationId) &&
        Objects.equals(this.attributes, referral.attributes) &&
        Objects.equals(this.importId, referral.importId) &&
        Objects.equals(this.code, referral.code) &&
        Objects.equals(this.usageCounter, referral.usageCounter) &&
        Objects.equals(this.batchId, referral.batchId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, startDate, expiryDate, usageLimit, campaignId, advocateProfileIntegrationId, friendProfileIntegrationId, attributes, importId, code, usageCounter, batchId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Referral {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    advocateProfileIntegrationId: ").append(toIndentedString(advocateProfileIntegrationId)).append("\n");
    sb.append("    friendProfileIntegrationId: ").append(toIndentedString(friendProfileIntegrationId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    importId: ").append(toIndentedString(importId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    usageCounter: ").append(toIndentedString(usageCounter)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
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

