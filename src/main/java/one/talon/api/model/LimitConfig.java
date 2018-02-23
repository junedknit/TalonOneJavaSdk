/*
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package one.talon.api.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LimitConfig
 */

public class LimitConfig {
  /**
   * The limitable action to which this limit will be applied
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    REDEEMCOUPON("redeemCoupon"),
    
    REDEEMREFERRAL("redeemReferral"),
    
    SETDISCOUNT("setDiscount");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("action")
  private ActionEnum action = null;

  @SerializedName("limit")
  private BigDecimal limit = null;

  @SerializedName("entities")
  private List<LimitEntityEnum> entities = new ArrayList<LimitEntityEnum>();

  public LimitConfig action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * The limitable action to which this limit will be applied
   * @return action
  **/
  @ApiModelProperty(required = true, value = "The limitable action to which this limit will be applied")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public LimitConfig limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The value to set for the limit
   * minimum: 0
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "The value to set for the limit")
  public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  public LimitConfig entities(List<LimitEntityEnum> entities) {
    this.entities = entities;
    return this;
  }

  public LimitConfig addEntitiesItem(LimitEntityEnum entitiesItem) {
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * The entities that make the address of this limit
   * @return entities
  **/
  @ApiModelProperty(required = true, value = "The entities that make the address of this limit")
  public List<LimitEntityEnum> getEntities() {
    return entities;
  }

  public void setEntities(List<LimitEntityEnum> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitConfig limitConfig = (LimitConfig) o;
    return Objects.equals(this.action, limitConfig.action) &&
        Objects.equals(this.limit, limitConfig.limit) &&
        Objects.equals(this.entities, limitConfig.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, limit, entities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitConfig {\n");

    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
