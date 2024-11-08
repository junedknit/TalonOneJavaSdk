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
 * Provides statistics regarding an application&#39;s campaigns
 */
@ApiModel(description = "Provides statistics regarding an application's campaigns")

public class ApplicationCampaignStats {
  public static final String SERIALIZED_NAME_DRAFT = "draft";
  @SerializedName(SERIALIZED_NAME_DRAFT)
  private Integer draft;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Integer disabled;

  public static final String SERIALIZED_NAME_SCHEDULED = "scheduled";
  @SerializedName(SERIALIZED_NAME_SCHEDULED)
  private Integer scheduled;

  public static final String SERIALIZED_NAME_RUNNING = "running";
  @SerializedName(SERIALIZED_NAME_RUNNING)
  private Integer running;

  public static final String SERIALIZED_NAME_EXPIRED = "expired";
  @SerializedName(SERIALIZED_NAME_EXPIRED)
  private Integer expired;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Integer archived;


  public ApplicationCampaignStats draft(Integer draft) {
    
    this.draft = draft;
    return this;
  }

   /**
   * Number of draft campaigns
   * @return draft
  **/
  @ApiModelProperty(required = true, value = "Number of draft campaigns")

  public Integer getDraft() {
    return draft;
  }


  public void setDraft(Integer draft) {
    this.draft = draft;
  }


  public ApplicationCampaignStats disabled(Integer disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Number of disabled campaigns
   * @return disabled
  **/
  @ApiModelProperty(required = true, value = "Number of disabled campaigns")

  public Integer getDisabled() {
    return disabled;
  }


  public void setDisabled(Integer disabled) {
    this.disabled = disabled;
  }


  public ApplicationCampaignStats scheduled(Integer scheduled) {
    
    this.scheduled = scheduled;
    return this;
  }

   /**
   * Number of scheduled campaigns
   * @return scheduled
  **/
  @ApiModelProperty(required = true, value = "Number of scheduled campaigns")

  public Integer getScheduled() {
    return scheduled;
  }


  public void setScheduled(Integer scheduled) {
    this.scheduled = scheduled;
  }


  public ApplicationCampaignStats running(Integer running) {
    
    this.running = running;
    return this;
  }

   /**
   * Number of running campaigns
   * @return running
  **/
  @ApiModelProperty(required = true, value = "Number of running campaigns")

  public Integer getRunning() {
    return running;
  }


  public void setRunning(Integer running) {
    this.running = running;
  }


  public ApplicationCampaignStats expired(Integer expired) {
    
    this.expired = expired;
    return this;
  }

   /**
   * Number of expired campaigns
   * @return expired
  **/
  @ApiModelProperty(required = true, value = "Number of expired campaigns")

  public Integer getExpired() {
    return expired;
  }


  public void setExpired(Integer expired) {
    this.expired = expired;
  }


  public ApplicationCampaignStats archived(Integer archived) {
    
    this.archived = archived;
    return this;
  }

   /**
   * Number of archived campaigns
   * @return archived
  **/
  @ApiModelProperty(required = true, value = "Number of archived campaigns")

  public Integer getArchived() {
    return archived;
  }


  public void setArchived(Integer archived) {
    this.archived = archived;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationCampaignStats applicationCampaignStats = (ApplicationCampaignStats) o;
    return Objects.equals(this.draft, applicationCampaignStats.draft) &&
        Objects.equals(this.disabled, applicationCampaignStats.disabled) &&
        Objects.equals(this.scheduled, applicationCampaignStats.scheduled) &&
        Objects.equals(this.running, applicationCampaignStats.running) &&
        Objects.equals(this.expired, applicationCampaignStats.expired) &&
        Objects.equals(this.archived, applicationCampaignStats.archived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draft, disabled, scheduled, running, expired, archived);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationCampaignStats {\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    scheduled: ").append(toIndentedString(scheduled)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
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

