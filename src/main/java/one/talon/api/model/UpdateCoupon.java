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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * 
 */
@ApiModel(description = "")

public class UpdateCoupon {
  @SerializedName("value")
  private String value = null;

  @SerializedName("usageLimit")
  private Integer usageLimit = null;

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("expiryDate")
  private OffsetDateTime expiryDate = null;

  @SerializedName("recipientIntegrationId")
  private String recipientIntegrationId = null;

  public UpdateCoupon value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The actual coupon code.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The actual coupon code.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public UpdateCoupon usageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
    return this;
  }

   /**
   * The number of times a coupon code can be redeemed. This can be set to 0 for no limit, but any campaign usage limits will still apply. 
   * minimum: 0
   * @return usageLimit
  **/
  @ApiModelProperty(required = true, value = "The number of times a coupon code can be redeemed. This can be set to 0 for no limit, but any campaign usage limits will still apply. ")
  public Integer getUsageLimit() {
    return usageLimit;
  }

  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }

  public UpdateCoupon startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Timestamp at which point the coupon becomes valid.
   * @return startDate
  **/
  @ApiModelProperty(value = "Timestamp at which point the coupon becomes valid.")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public UpdateCoupon expiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Expiry date of the coupon. Coupon never expires if this is omitted, zero, or negative.
   * @return expiryDate
  **/
  @ApiModelProperty(value = "Expiry date of the coupon. Coupon never expires if this is omitted, zero, or negative.")
  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }

  public UpdateCoupon recipientIntegrationId(String recipientIntegrationId) {
    this.recipientIntegrationId = recipientIntegrationId;
    return this;
  }

   /**
   * The integration ID for this coupon&#39;s beneficiary&#39;s profile
   * @return recipientIntegrationId
  **/
  @ApiModelProperty(value = "The integration ID for this coupon's beneficiary's profile")
  public String getRecipientIntegrationId() {
    return recipientIntegrationId;
  }

  public void setRecipientIntegrationId(String recipientIntegrationId) {
    this.recipientIntegrationId = recipientIntegrationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCoupon updateCoupon = (UpdateCoupon) o;
    return Objects.equals(this.value, updateCoupon.value) &&
        Objects.equals(this.usageLimit, updateCoupon.usageLimit) &&
        Objects.equals(this.startDate, updateCoupon.startDate) &&
        Objects.equals(this.expiryDate, updateCoupon.expiryDate) &&
        Objects.equals(this.recipientIntegrationId, updateCoupon.recipientIntegrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, usageLimit, startDate, expiryDate, recipientIntegrationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCoupon {\n");

    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    recipientIntegrationId: ").append(toIndentedString(recipientIntegrationId)).append("\n");
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
