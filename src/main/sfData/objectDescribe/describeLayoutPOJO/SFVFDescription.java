
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
    "layouts",
    "recordTypeMappings",
    "recordTypeSelectorRequired"
})
public class SFVFDescription {

    @JsonProperty("layouts")
    private List<Layout> layouts = new ArrayList<Layout>();
    @JsonProperty("recordTypeMappings")
    private List<RecordTypeMapping> recordTypeMappings = new ArrayList<RecordTypeMapping>();
    @JsonProperty("recordTypeSelectorRequired")
    private List<Boolean> recordTypeSelectorRequired = new ArrayList<Boolean>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("layouts")
    public List<Layout> getLayouts() {
        return layouts;
    }

    @JsonProperty("layouts")
    public void setLayouts(List<Layout> layouts) {
        this.layouts = layouts;
    }

    public SFVFDescription withLayouts(List<Layout> layouts) {
        this.layouts = layouts;
        return this;
    }

    @JsonProperty("recordTypeMappings")
    public List<RecordTypeMapping> getRecordTypeMappings() {
        return recordTypeMappings;
    }

    @JsonProperty("recordTypeMappings")
    public void setRecordTypeMappings(List<RecordTypeMapping> recordTypeMappings) {
        this.recordTypeMappings = recordTypeMappings;
    }

    public SFVFDescription withRecordTypeMappings(List<RecordTypeMapping> recordTypeMappings) {
        this.recordTypeMappings = recordTypeMappings;
        return this;
    }

    @JsonProperty("recordTypeSelectorRequired")
    public List<Boolean> getRecordTypeSelectorRequired() {
        return recordTypeSelectorRequired;
    }

    @JsonProperty("recordTypeSelectorRequired")
    public void setRecordTypeSelectorRequired(List<Boolean> recordTypeSelectorRequired) {
        this.recordTypeSelectorRequired = recordTypeSelectorRequired;
    }

    public SFVFDescription withRecordTypeSelectorRequired(List<Boolean> recordTypeSelectorRequired) {
        this.recordTypeSelectorRequired = recordTypeSelectorRequired;
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

    public SFVFDescription withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SFVFDescription.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("layouts");
        sb.append('=');
        sb.append(((this.layouts == null)?"<null>":this.layouts));
        sb.append(',');
        sb.append("recordTypeMappings");
        sb.append('=');
        sb.append(((this.recordTypeMappings == null)?"<null>":this.recordTypeMappings));
        sb.append(',');
        sb.append("recordTypeSelectorRequired");
        sb.append('=');
        sb.append(((this.recordTypeSelectorRequired == null)?"<null>":this.recordTypeSelectorRequired));
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
        result = ((result* 31)+((this.layouts == null)? 0 :this.layouts.hashCode()));
        result = ((result* 31)+((this.recordTypeMappings == null)? 0 :this.recordTypeMappings.hashCode()));
        result = ((result* 31)+((this.recordTypeSelectorRequired == null)? 0 :this.recordTypeSelectorRequired.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SFVFDescription) == false) {
            return false;
        }
        SFVFDescription rhs = ((SFVFDescription) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.layouts == rhs.layouts)||((this.layouts!= null)&&this.layouts.equals(rhs.layouts))))&&((this.recordTypeMappings == rhs.recordTypeMappings)||((this.recordTypeMappings!= null)&&this.recordTypeMappings.equals(rhs.recordTypeMappings))))&&((this.recordTypeSelectorRequired == rhs.recordTypeSelectorRequired)||((this.recordTypeSelectorRequired!= null)&&this.recordTypeSelectorRequired.equals(rhs.recordTypeSelectorRequired))));
    }

}
