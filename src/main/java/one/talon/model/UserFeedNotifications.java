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
import one.talon.model.FeedNotification;
import org.threeten.bp.OffsetDateTime;

/**
 * notifications to notify CAMA user about
 */
@ApiModel(description = "notifications to notify CAMA user about")

public class UserFeedNotifications {
  public static final String SERIALIZED_NAME_LAST_UPDATE = "lastUpdate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  private OffsetDateTime lastUpdate;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private List<FeedNotification> notifications = new ArrayList<FeedNotification>();


  public UserFeedNotifications lastUpdate(OffsetDateTime lastUpdate) {
    
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Timestamp of the last request for this list
   * @return lastUpdate
  **/
  @ApiModelProperty(required = true, value = "Timestamp of the last request for this list")

  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }


  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  public UserFeedNotifications notifications(List<FeedNotification> notifications) {
    
    this.notifications = notifications;
    return this;
  }

  public UserFeedNotifications addNotificationsItem(FeedNotification notificationsItem) {
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * List of all notifications to notify the user about
   * @return notifications
  **/
  @ApiModelProperty(required = true, value = "List of all notifications to notify the user about")

  public List<FeedNotification> getNotifications() {
    return notifications;
  }


  public void setNotifications(List<FeedNotification> notifications) {
    this.notifications = notifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFeedNotifications userFeedNotifications = (UserFeedNotifications) o;
    return Objects.equals(this.lastUpdate, userFeedNotifications.lastUpdate) &&
        Objects.equals(this.notifications, userFeedNotifications.notifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdate, notifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFeedNotifications {\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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

