
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
    "relatedContentItems"
})
public class RelatedContent {

    @JsonProperty("relatedContentItems")
    private List<RelatedContentItem> relatedContentItems = new ArrayList<RelatedContentItem>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("relatedContentItems")
    public List<RelatedContentItem> getRelatedContentItems() {
        return relatedContentItems;
    }

    @JsonProperty("relatedContentItems")
    public void setRelatedContentItems(List<RelatedContentItem> relatedContentItems) {
        this.relatedContentItems = relatedContentItems;
    }

    public RelatedContent withRelatedContentItems(List<RelatedContentItem> relatedContentItems) {
        this.relatedContentItems = relatedContentItems;
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

    public RelatedContent withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RelatedContent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("relatedContentItems");
        sb.append('=');
        sb.append(((this.relatedContentItems == null)?"<null>":this.relatedContentItems));
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
        result = ((result* 31)+((this.relatedContentItems == null)? 0 :this.relatedContentItems.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RelatedContent) == false) {
            return false;
        }
        RelatedContent rhs = ((RelatedContent) other);
        return (((this.relatedContentItems == rhs.relatedContentItems)||((this.relatedContentItems!= null)&&this.relatedContentItems.equals(rhs.relatedContentItems)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
