
package sft.sfData.objectDescribe.describeLayoutPOJO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "layoutItems",
    "numItems"
})
public class LayoutRow {

    @JsonProperty("layoutItems")
    private List<LayoutItem> layoutItems = new ArrayList<LayoutItem>();
    @JsonProperty("numItems")
    private Integer numItems;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("layoutItems")
    public List<LayoutItem> getLayoutItems() {
        return layoutItems;
    }

    @JsonProperty("layoutItems")
    public void setLayoutItems(List<LayoutItem> layoutItems) {
        this.layoutItems = layoutItems;
    }

    public LayoutRow withLayoutItems(List<LayoutItem> layoutItems) {
        this.layoutItems = layoutItems;
        return this;
    }

    @JsonProperty("numItems")
    public Integer getNumItems() {
        return numItems;
    }

    @JsonProperty("numItems")
    public void setNumItems(Integer numItems) {
        this.numItems = numItems;
    }

    public LayoutRow withNumItems(Integer numItems) {
        this.numItems = numItems;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public LayoutRow withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LayoutRow.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("layoutItems");
        sb.append('=');
        sb.append(((this.layoutItems == null)?"<null>":this.layoutItems));
        sb.append(',');
        sb.append("numItems");
        sb.append('=');
        sb.append(((this.numItems == null)?"<null>":this.numItems));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.layoutItems == null)? 0 :this.layoutItems.hashCode()));
        result = ((result* 31)+((this.numItems == null)? 0 :this.numItems.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LayoutRow) == false) {
            return false;
        }
        LayoutRow rhs = ((LayoutRow) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.layoutItems == rhs.layoutItems)||((this.layoutItems!= null)&&this.layoutItems.equals(rhs.layoutItems))))&&((this.numItems == rhs.numItems)||((this.numItems!= null)&&this.numItems.equals(rhs.numItems))));
    }

}
