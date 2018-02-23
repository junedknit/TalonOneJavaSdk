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
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * InlineResponse2005
 */

public class InlineResponse2005 {
  @SerializedName("totalResultSize")
  private Integer totalResultSize = null;

  @SerializedName("data")
  private List<CustomerActivityReport> data = new ArrayList<CustomerActivityReport>();

  public InlineResponse2005 totalResultSize(Integer totalResultSize) {
    this.totalResultSize = totalResultSize;
    return this;
  }

   /**
   * Get totalResultSize
   * @return totalResultSize
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTotalResultSize() {
    return totalResultSize;
  }

  public void setTotalResultSize(Integer totalResultSize) {
    this.totalResultSize = totalResultSize;
  }

  public InlineResponse2005 data(List<CustomerActivityReport> data) {
    this.data = data;
    return this;
  }

  public InlineResponse2005 addDataItem(CustomerActivityReport dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomerActivityReport> getData() {
    return data;
  }

  public void setData(List<CustomerActivityReport> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005 inlineResponse2005 = (InlineResponse2005) o;
    return Objects.equals(this.totalResultSize, inlineResponse2005.totalResultSize) &&
        Objects.equals(this.data, inlineResponse2005.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalResultSize, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005 {\n");

    sb.append("    totalResultSize: ").append(toIndentedString(totalResultSize)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
