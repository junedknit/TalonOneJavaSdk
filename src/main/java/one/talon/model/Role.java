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
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class Role {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_CAMPAIGN_GROUP_I_D = "campaignGroupID";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_GROUP_I_D)
  private Integer campaignGroupID;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<Integer> members = null;

  public static final String SERIALIZED_NAME_ACL = "acl";
  @SerializedName(SERIALIZED_NAME_ACL)
  private Object acl;


  public Role id(Integer id) {
    
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


  public Role created(OffsetDateTime created) {
    
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


  public Role modified(OffsetDateTime modified) {
    
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


  public Role accountId(Integer accountId) {
    
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


  public Role campaignGroupID(Integer campaignGroupID) {
    
    this.campaignGroupID = campaignGroupID;
    return this;
  }

   /**
   * The ID of the Campaign Group this role was created for.
   * @return campaignGroupID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the Campaign Group this role was created for.")

  public Integer getCampaignGroupID() {
    return campaignGroupID;
  }


  public void setCampaignGroupID(Integer campaignGroupID) {
    this.campaignGroupID = campaignGroupID;
  }


  public Role name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the role
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the role")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Role description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the role
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the role")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Role members(List<Integer> members) {
    
    this.members = members;
    return this;
  }

  public Role addMembersItem(Integer membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<Integer>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * A list of user identifiers assigned to this role
   * @return members
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of user identifiers assigned to this role")

  public List<Integer> getMembers() {
    return members;
  }


  public void setMembers(List<Integer> members) {
    this.members = members;
  }


  public Role acl(Object acl) {
    
    this.acl = acl;
    return this;
  }

   /**
   * Role ACL Policy
   * @return acl
  **/
  @ApiModelProperty(required = true, value = "Role ACL Policy")

  public Object getAcl() {
    return acl;
  }


  public void setAcl(Object acl) {
    this.acl = acl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.id, role.id) &&
        Objects.equals(this.created, role.created) &&
        Objects.equals(this.modified, role.modified) &&
        Objects.equals(this.accountId, role.accountId) &&
        Objects.equals(this.campaignGroupID, role.campaignGroupID) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.description, role.description) &&
        Objects.equals(this.members, role.members) &&
        Objects.equals(this.acl, role.acl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, modified, accountId, campaignGroupID, name, description, members, acl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignGroupID: ").append(toIndentedString(campaignGroupID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
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

