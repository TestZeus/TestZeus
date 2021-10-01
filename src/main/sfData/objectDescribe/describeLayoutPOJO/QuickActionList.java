
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
    "quickActionListItems"
})
public class QuickActionList {

    @JsonProperty("quickActionListItems")
    private List<QuickActionListItem> quickActionListItems = new ArrayList<QuickActionListItem>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("quickActionListItems")
    public List<QuickActionListItem> getQuickActionListItems() {
        return quickActionListItems;
    }

    @JsonProperty("quickActionListItems")
    public void setQuickActionListItems(List<QuickActionListItem> quickActionListItems) {
        this.quickActionListItems = quickActionListItems;
    }

    public QuickActionList withQuickActionListItems(List<QuickActionListItem> quickActionListItems) {
        this.quickActionListItems = quickActionListItems;
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

    public QuickActionList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QuickActionList.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("quickActionListItems");
        sb.append('=');
        sb.append(((this.quickActionListItems == null)?"<null>":this.quickActionListItems));
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
        result = ((result* 31)+((this.quickActionListItems == null)? 0 :this.quickActionListItems.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuickActionList) == false) {
            return false;
        }
        QuickActionList rhs = ((QuickActionList) other);
        return (((this.quickActionListItems == rhs.quickActionListItems)||((this.quickActionListItems!= null)&&this.quickActionListItems.equals(rhs.quickActionListItems)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
