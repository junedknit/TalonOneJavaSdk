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
import one.talon.model.NewReturn;

/**
 * The body of a return integration API request. Next to the cart items details, this contains an optional listing of extra properties that should be returned in the response.
 */
@ApiModel(description = "The body of a return integration API request. Next to the cart items details, this contains an optional listing of extra properties that should be returned in the response.")

public class ReturnIntegrationRequest {
  public static final String SERIALIZED_NAME_RETURN = "return";
  @SerializedName(SERIALIZED_NAME_RETURN)
  private NewReturn _return;

  /**
   * Gets or Sets responseContent
   */
  @JsonAdapter(ResponseContentEnum.Adapter.class)
  public enum ResponseContentEnum {
    CUSTOMERSESSION("customerSession"),
    
    CUSTOMERPROFILE("customerProfile"),
    
    COUPONS("coupons"),
    
    TRIGGEREDCAMPAIGNS("triggeredCampaigns"),
    
    REFERRAL("referral"),
    
    LOYALTY("loyalty"),
    
    EVENT("event"),
    
    PREVIOUSRETURNS("previousReturns");

    private String value;

    ResponseContentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResponseContentEnum fromValue(String value) {
      for (ResponseContentEnum b : ResponseContentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResponseContentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResponseContentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResponseContentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResponseContentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESPONSE_CONTENT = "responseContent";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CONTENT)
  private List<ResponseContentEnum> responseContent = null;


  public ReturnIntegrationRequest _return(NewReturn _return) {
    
    this._return = _return;
    return this;
  }

   /**
   * Get _return
   * @return _return
  **/
  @ApiModelProperty(required = true, value = "")

  public NewReturn getReturn() {
    return _return;
  }


  public void setReturn(NewReturn _return) {
    this._return = _return;
  }


  public ReturnIntegrationRequest responseContent(List<ResponseContentEnum> responseContent) {
    
    this.responseContent = responseContent;
    return this;
  }

  public ReturnIntegrationRequest addResponseContentItem(ResponseContentEnum responseContentItem) {
    if (this.responseContent == null) {
      this.responseContent = new ArrayList<ResponseContentEnum>();
    }
    this.responseContent.add(responseContentItem);
    return this;
  }

   /**
   * Optional list of requested information to be present on the response related to the return request. 
   * @return responseContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[customerSession, customerProfile]", value = "Optional list of requested information to be present on the response related to the return request. ")

  public List<ResponseContentEnum> getResponseContent() {
    return responseContent;
  }


  public void setResponseContent(List<ResponseContentEnum> responseContent) {
    this.responseContent = responseContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnIntegrationRequest returnIntegrationRequest = (ReturnIntegrationRequest) o;
    return Objects.equals(this._return, returnIntegrationRequest._return) &&
        Objects.equals(this.responseContent, returnIntegrationRequest.responseContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_return, responseContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnIntegrationRequest {\n");
    sb.append("    _return: ").append(toIndentedString(_return)).append("\n");
    sb.append("    responseContent: ").append(toIndentedString(responseContent)).append("\n");
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

