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

public class ApplicationReferee {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Integer applicationId;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_ADVOCATE_INTEGRATION_ID = "advocateIntegrationId";
  @SerializedName(SERIALIZED_NAME_ADVOCATE_INTEGRATION_ID)
  private String advocateIntegrationId;

  public static final String SERIALIZED_NAME_FRIEND_INTEGRATION_ID = "friendIntegrationId";
  @SerializedName(SERIALIZED_NAME_FRIEND_INTEGRATION_ID)
  private String friendIntegrationId;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;


  public ApplicationReferee applicationId(Integer applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The ID of the application that owns this entity.
   * @return applicationId
  **/
  @ApiModelProperty(required = true, value = "The ID of the application that owns this entity.")

  public Integer getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }


  public ApplicationReferee sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Integration ID of the session in which the customer redeemed the referral
   * @return sessionId
  **/
  @ApiModelProperty(required = true, value = "Integration ID of the session in which the customer redeemed the referral")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public ApplicationReferee advocateIntegrationId(String advocateIntegrationId) {
    
    this.advocateIntegrationId = advocateIntegrationId;
    return this;
  }

   /**
   * Integration ID of the Advocate&#39;s Profile
   * @return advocateIntegrationId
  **/
  @ApiModelProperty(required = true, value = "Integration ID of the Advocate's Profile")

  public String getAdvocateIntegrationId() {
    return advocateIntegrationId;
  }


  public void setAdvocateIntegrationId(String advocateIntegrationId) {
    this.advocateIntegrationId = advocateIntegrationId;
  }


  public ApplicationReferee friendIntegrationId(String friendIntegrationId) {
    
    this.friendIntegrationId = friendIntegrationId;
    return this;
  }

   /**
   * Integration ID of the Friend&#39;s Profile
   * @return friendIntegrationId
  **/
  @ApiModelProperty(required = true, value = "Integration ID of the Friend's Profile")

  public String getFriendIntegrationId() {
    return friendIntegrationId;
  }


  public void setFriendIntegrationId(String friendIntegrationId) {
    this.friendIntegrationId = friendIntegrationId;
  }


  public ApplicationReferee code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Advocate&#39;s referral code.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Advocate's referral code.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ApplicationReferee created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Timestamp of the moment the customer redeemed the referral
   * @return created
  **/
  @ApiModelProperty(required = true, value = "Timestamp of the moment the customer redeemed the referral")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationReferee applicationReferee = (ApplicationReferee) o;
    return Objects.equals(this.applicationId, applicationReferee.applicationId) &&
        Objects.equals(this.sessionId, applicationReferee.sessionId) &&
        Objects.equals(this.advocateIntegrationId, applicationReferee.advocateIntegrationId) &&
        Objects.equals(this.friendIntegrationId, applicationReferee.friendIntegrationId) &&
        Objects.equals(this.code, applicationReferee.code) &&
        Objects.equals(this.created, applicationReferee.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, sessionId, advocateIntegrationId, friendIntegrationId, code, created);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationReferee {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    advocateIntegrationId: ").append(toIndentedString(advocateIntegrationId)).append("\n");
    sb.append("    friendIntegrationId: ").append(toIndentedString(friendIntegrationId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

