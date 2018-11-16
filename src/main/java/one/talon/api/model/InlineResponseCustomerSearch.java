/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package one.talon.api.model;

import java.util.Objects;
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
import one.talon.api.model.InlineResponseCustomerSearchData;

/**
 * InlineResponse20015
 */

public class InlineResponseCustomerSearch {
    @SerializedName("hasMore")
    private Boolean hasMore = null;

    @SerializedName("data")
    private List<InlineResponseCustomerSearchData> data = new ArrayList<InlineResponseCustomerSearchData>();

    public InlineResponseCustomerSearch hasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * Get hasMore
     * @return hasMore
     **/
    @ApiModelProperty(required = true, value = "")
    public Boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public InlineResponseCustomerSearch data(List<InlineResponseCustomerSearchData> data) {
        this.data = data;
        return this;
    }

    public InlineResponseCustomerSearch addDataItem(InlineResponseCustomerSearchData dataItem) {
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @ApiModelProperty(required = true, value = "")
    public List<InlineResponseCustomerSearchData> getData() {
        return data;
    }

    public void setData(List<InlineResponseCustomerSearchData> data) {
        this.data = data;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineResponseCustomerSearch inlineResponse20015 = (InlineResponseCustomerSearch) o;
        return Objects.equals(this.hasMore, inlineResponse20015.hasMore) &&
                Objects.equals(this.data, inlineResponse20015.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasMore, data);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse20015 {\n");

        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
