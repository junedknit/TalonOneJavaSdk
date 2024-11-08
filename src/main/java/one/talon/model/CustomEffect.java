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
import java.util.ArrayList;
import java.util.List;
import one.talon.model.TemplateArgDef;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class CustomEffect {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS_IDS = "subscribedApplicationsIds";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED_APPLICATIONS_IDS)
  private List<Integer> subscribedApplicationsIds = null;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private List<TemplateArgDef> params = null;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private Integer modifiedBy;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Integer createdBy;


  public CustomEffect id(Integer id) {
    
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


  public CustomEffect created(OffsetDateTime created) {
    
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


  public CustomEffect accountId(Integer accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account that owns this entity.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account that owns this entity.")

  public Integer getAccountId() {
    return accountId;
  }


  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }


  public CustomEffect modified(OffsetDateTime modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * The exact moment this entity was last modified.
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "The exact moment this entity was last modified.")

  public OffsetDateTime getModified() {
    return modified;
  }


  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }


  public CustomEffect name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this effect.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of this effect.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CustomEffect title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of this effect.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "The title of this effect.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CustomEffect payload(String payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * The JSON payload of this effect.
   * @return payload
  **/
  @ApiModelProperty(required = true, value = "The JSON payload of this effect.")

  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    this.payload = payload;
  }


  public CustomEffect description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of this effect.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of this effect.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CustomEffect enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Determines if this effect is active.
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "Determines if this effect is active.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public CustomEffect subscribedApplicationsIds(List<Integer> subscribedApplicationsIds) {
    
    this.subscribedApplicationsIds = subscribedApplicationsIds;
    return this;
  }

  public CustomEffect addSubscribedApplicationsIdsItem(Integer subscribedApplicationsIdsItem) {
    if (this.subscribedApplicationsIds == null) {
      this.subscribedApplicationsIds = new ArrayList<Integer>();
    }
    this.subscribedApplicationsIds.add(subscribedApplicationsIdsItem);
    return this;
  }

   /**
   * A list of the IDs of the applications that this effect is enabled for
   * @return subscribedApplicationsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the IDs of the applications that this effect is enabled for")

  public List<Integer> getSubscribedApplicationsIds() {
    return subscribedApplicationsIds;
  }


  public void setSubscribedApplicationsIds(List<Integer> subscribedApplicationsIds) {
    this.subscribedApplicationsIds = subscribedApplicationsIds;
  }


  public CustomEffect params(List<TemplateArgDef> params) {
    
    this.params = params;
    return this;
  }

  public CustomEffect addParamsItem(TemplateArgDef paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<TemplateArgDef>();
    }
    this.params.add(paramsItem);
    return this;
  }

   /**
   * Array of template argument definitions
   * @return params
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of template argument definitions")

  public List<TemplateArgDef> getParams() {
    return params;
  }


  public void setParams(List<TemplateArgDef> params) {
    this.params = params;
  }


  public CustomEffect modifiedBy(Integer modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * ID of the user who last updated this effect if available.
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the user who last updated this effect if available.")

  public Integer getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(Integer modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public CustomEffect createdBy(Integer createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * ID of the user who created this effect.
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "ID of the user who created this effect.")

  public Integer getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEffect customEffect = (CustomEffect) o;
    return Objects.equals(this.id, customEffect.id) &&
        Objects.equals(this.created, customEffect.created) &&
        Objects.equals(this.accountId, customEffect.accountId) &&
        Objects.equals(this.modified, customEffect.modified) &&
        Objects.equals(this.name, customEffect.name) &&
        Objects.equals(this.title, customEffect.title) &&
        Objects.equals(this.payload, customEffect.payload) &&
        Objects.equals(this.description, customEffect.description) &&
        Objects.equals(this.enabled, customEffect.enabled) &&
        Objects.equals(this.subscribedApplicationsIds, customEffect.subscribedApplicationsIds) &&
        Objects.equals(this.params, customEffect.params) &&
        Objects.equals(this.modifiedBy, customEffect.modifiedBy) &&
        Objects.equals(this.createdBy, customEffect.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, accountId, modified, name, title, payload, description, enabled, subscribedApplicationsIds, params, modifiedBy, createdBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEffect {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    subscribedApplicationsIds: ").append(toIndentedString(subscribedApplicationsIds)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

