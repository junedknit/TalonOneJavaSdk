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
 * InlineResponse2006
 */

public class InlineResponse2006 {
  @SerializedName("totalResultSize")
  private Integer totalResultSize = null;

  @SerializedName("data")
  private List<ApplicationSession> data = new ArrayList<ApplicationSession>();

  public InlineResponse2006 totalResultSize(Integer totalResultSize) {
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

  public InlineResponse2006 data(List<ApplicationSession> data) {
    this.data = data;
    return this;
  }

  public InlineResponse2006 addDataItem(ApplicationSession dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ApplicationSession> getData() {
    return data;
  }

  public void setData(List<ApplicationSession> data) {
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
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(this.totalResultSize, inlineResponse2006.totalResultSize) &&
        Objects.equals(this.data, inlineResponse2006.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalResultSize, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");

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
