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
import java.util.ArrayList;
import java.util.List;

/**
 * BaseLoyaltyProgram
 */

public class BaseLoyaltyProgram {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS = "subscribedApplications";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS)
  private List<Integer> subscribedApplications = null;

  public static final String SERIALIZED_NAME_DEFAULT_VALIDITY = "defaultValidity";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALIDITY)
  private String defaultValidity;

  public static final String SERIALIZED_NAME_DEFAULT_PENDING = "defaultPending";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PENDING)
  private String defaultPending;

  public static final String SERIALIZED_NAME_ALLOW_SUBLEDGER = "allowSubledger";
  @SerializedName(SERIALIZED_NAME_ALLOW_SUBLEDGER)
  private Boolean allowSubledger;

  public static final String SERIALIZED_NAME_USERS_PER_CARD_LIMIT = "usersPerCardLimit";
  @SerializedName(SERIALIZED_NAME_USERS_PER_CARD_LIMIT)
  private Integer usersPerCardLimit;


  public BaseLoyaltyProgram title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The display title for the Loyalty Program.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Point collection", value = "The display title for the Loyalty Program.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public BaseLoyaltyProgram description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of our Loyalty Program.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Customers collect 10 points per 1$ spent", value = "Description of our Loyalty Program.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BaseLoyaltyProgram subscribedApplications(List<Integer> subscribedApplications) {
    
    this.subscribedApplications = subscribedApplications;
    return this;
  }

  public BaseLoyaltyProgram addSubscribedApplicationsItem(Integer subscribedApplicationsItem) {
    if (this.subscribedApplications == null) {
      this.subscribedApplications = new ArrayList<Integer>();
    }
    this.subscribedApplications.add(subscribedApplicationsItem);
    return this;
  }

   /**
   * A list containing the IDs of all applications that are subscribed to this Loyalty Program.
   * @return subscribedApplications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[132, 97]", value = "A list containing the IDs of all applications that are subscribed to this Loyalty Program.")

  public List<Integer> getSubscribedApplications() {
    return subscribedApplications;
  }


  public void setSubscribedApplications(List<Integer> subscribedApplications) {
    this.subscribedApplications = subscribedApplications;
  }


  public BaseLoyaltyProgram defaultValidity(String defaultValidity) {
    
    this.defaultValidity = defaultValidity;
    return this;
  }

   /**
   * Indicates the default duration after which new loyalty points should expire. The format is a number, followed by one letter indicating the unit; like &#39;1h&#39; or &#39;40m&#39;.
   * @return defaultValidity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "unlimited", value = "Indicates the default duration after which new loyalty points should expire. The format is a number, followed by one letter indicating the unit; like '1h' or '40m'.")

  public String getDefaultValidity() {
    return defaultValidity;
  }


  public void setDefaultValidity(String defaultValidity) {
    this.defaultValidity = defaultValidity;
  }


  public BaseLoyaltyProgram defaultPending(String defaultPending) {
    
    this.defaultPending = defaultPending;
    return this;
  }

   /**
   * Indicates the default duration for the pending time, after which points will be valid. The format is a number followed by a duration unit, like &#39;1h&#39; or &#39;40m&#39;.
   * @return defaultPending
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "immediate", value = "Indicates the default duration for the pending time, after which points will be valid. The format is a number followed by a duration unit, like '1h' or '40m'.")

  public String getDefaultPending() {
    return defaultPending;
  }


  public void setDefaultPending(String defaultPending) {
    this.defaultPending = defaultPending;
  }


  public BaseLoyaltyProgram allowSubledger(Boolean allowSubledger) {
    
    this.allowSubledger = allowSubledger;
    return this;
  }

   /**
   * Indicates if this program supports subledgers inside the program
   * @return allowSubledger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates if this program supports subledgers inside the program")

  public Boolean getAllowSubledger() {
    return allowSubledger;
  }


  public void setAllowSubledger(Boolean allowSubledger) {
    this.allowSubledger = allowSubledger;
  }


  public BaseLoyaltyProgram usersPerCardLimit(Integer usersPerCardLimit) {
    
    this.usersPerCardLimit = usersPerCardLimit;
    return this;
  }

   /**
   * The max amount of user profiles with whom a card can be shared. This can be set to 0 for no limit. This property is only used when &#x60;cardBased&#x60; is &#x60;true&#x60;. 
   * minimum: 0
   * @return usersPerCardLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "111", value = "The max amount of user profiles with whom a card can be shared. This can be set to 0 for no limit. This property is only used when `cardBased` is `true`. ")

  public Integer getUsersPerCardLimit() {
    return usersPerCardLimit;
  }


  public void setUsersPerCardLimit(Integer usersPerCardLimit) {
    this.usersPerCardLimit = usersPerCardLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseLoyaltyProgram baseLoyaltyProgram = (BaseLoyaltyProgram) o;
    return Objects.equals(this.title, baseLoyaltyProgram.title) &&
        Objects.equals(this.description, baseLoyaltyProgram.description) &&
        Objects.equals(this.subscribedApplications, baseLoyaltyProgram.subscribedApplications) &&
        Objects.equals(this.defaultValidity, baseLoyaltyProgram.defaultValidity) &&
        Objects.equals(this.defaultPending, baseLoyaltyProgram.defaultPending) &&
        Objects.equals(this.allowSubledger, baseLoyaltyProgram.allowSubledger) &&
        Objects.equals(this.usersPerCardLimit, baseLoyaltyProgram.usersPerCardLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, subscribedApplications, defaultValidity, defaultPending, allowSubledger, usersPerCardLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseLoyaltyProgram {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subscribedApplications: ").append(toIndentedString(subscribedApplications)).append("\n");
    sb.append("    defaultValidity: ").append(toIndentedString(defaultValidity)).append("\n");
    sb.append("    defaultPending: ").append(toIndentedString(defaultPending)).append("\n");
    sb.append("    allowSubledger: ").append(toIndentedString(allowSubledger)).append("\n");
    sb.append("    usersPerCardLimit: ").append(toIndentedString(usersPerCardLimit)).append("\n");
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

