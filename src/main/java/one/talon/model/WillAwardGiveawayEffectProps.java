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
 * The properties specific to the \&quot;awardGiveaway\&quot; effect when the session is not closed yet. This effect replaces \&quot;awardGiveaway\&quot; only when updating a session with any state other than \&quot;closed\&quot;. This is to ensure no giveaway codes are leaked when they are still not guaranteed to be awarded.
 */
@ApiModel(description = "The properties specific to the \"awardGiveaway\" effect when the session is not closed yet. This effect replaces \"awardGiveaway\" only when updating a session with any state other than \"closed\". This is to ensure no giveaway codes are leaked when they are still not guaranteed to be awarded.")

public class WillAwardGiveawayEffectProps {
  public static final String SERIALIZED_NAME_POOL_ID = "poolId";
  @SerializedName(SERIALIZED_NAME_POOL_ID)
  private Integer poolId;

  public static final String SERIALIZED_NAME_POOL_NAME = "poolName";
  @SerializedName(SERIALIZED_NAME_POOL_NAME)
  private String poolName;

  public static final String SERIALIZED_NAME_RECIPIENT_INTEGRATION_ID = "recipientIntegrationId";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_INTEGRATION_ID)
  private String recipientIntegrationId;


  public WillAwardGiveawayEffectProps poolId(Integer poolId) {
    
    this.poolId = poolId;
    return this;
  }

   /**
   * The ID of the giveaways pool the code will be taken from.
   * @return poolId
  **/
  @ApiModelProperty(required = true, value = "The ID of the giveaways pool the code will be taken from.")

  public Integer getPoolId() {
    return poolId;
  }


  public void setPoolId(Integer poolId) {
    this.poolId = poolId;
  }


  public WillAwardGiveawayEffectProps poolName(String poolName) {
    
    this.poolName = poolName;
    return this;
  }

   /**
   * The name of the giveaways pool the code will be taken from.
   * @return poolName
  **/
  @ApiModelProperty(required = true, value = "The name of the giveaways pool the code will be taken from.")

  public String getPoolName() {
    return poolName;
  }


  public void setPoolName(String poolName) {
    this.poolName = poolName;
  }


  public WillAwardGiveawayEffectProps recipientIntegrationId(String recipientIntegrationId) {
    
    this.recipientIntegrationId = recipientIntegrationId;
    return this;
  }

   /**
   * The integration ID of the profile that will be awarded the giveaway.
   * @return recipientIntegrationId
  **/
  @ApiModelProperty(required = true, value = "The integration ID of the profile that will be awarded the giveaway.")

  public String getRecipientIntegrationId() {
    return recipientIntegrationId;
  }


  public void setRecipientIntegrationId(String recipientIntegrationId) {
    this.recipientIntegrationId = recipientIntegrationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WillAwardGiveawayEffectProps willAwardGiveawayEffectProps = (WillAwardGiveawayEffectProps) o;
    return Objects.equals(this.poolId, willAwardGiveawayEffectProps.poolId) &&
        Objects.equals(this.poolName, willAwardGiveawayEffectProps.poolName) &&
        Objects.equals(this.recipientIntegrationId, willAwardGiveawayEffectProps.recipientIntegrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolId, poolName, recipientIntegrationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WillAwardGiveawayEffectProps {\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
    sb.append("    recipientIntegrationId: ").append(toIndentedString(recipientIntegrationId)).append("\n");
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

