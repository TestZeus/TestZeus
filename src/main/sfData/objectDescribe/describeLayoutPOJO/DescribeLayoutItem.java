
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
    "editableForNew",
    "editableForUpdate",
    "label",
    "layoutComponents",
    "placeholder",
    "required"
})
public class DescribeLayoutItem {

    @JsonProperty("editableForNew")
    private Boolean editableForNew;
    @JsonProperty("editableForUpdate")
    private Boolean editableForUpdate;
    @JsonProperty("label")
    private String label;
    @JsonProperty("layoutComponents")
    private List<LayoutComponent__2> layoutComponents = new ArrayList<LayoutComponent__2>();
    @JsonProperty("placeholder")
    private Boolean placeholder;
    @JsonProperty("required")
    private Boolean required;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("editableForNew")
    public Boolean getEditableForNew() {
        return editableForNew;
    }

    @JsonProperty("editableForNew")
    public void setEditableForNew(Boolean editableForNew) {
        this.editableForNew = editableForNew;
    }

    public DescribeLayoutItem withEditableForNew(Boolean editableForNew) {
        this.editableForNew = editableForNew;
        return this;
    }

    @JsonProperty("editableForUpdate")
    public Boolean getEditableForUpdate() {
        return editableForUpdate;
    }

    @JsonProperty("editableForUpdate")
    public void setEditableForUpdate(Boolean editableForUpdate) {
        this.editableForUpdate = editableForUpdate;
    }

    public DescribeLayoutItem withEditableForUpdate(Boolean editableForUpdate) {
        this.editableForUpdate = editableForUpdate;
        return this;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public DescribeLayoutItem withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("layoutComponents")
    public List<LayoutComponent__2> getLayoutComponents() {
        return layoutComponents;
    }

    @JsonProperty("layoutComponents")
    public void setLayoutComponents(List<LayoutComponent__2> layoutComponents) {
        this.layoutComponents = layoutComponents;
    }

    public DescribeLayoutItem withLayoutComponents(List<LayoutComponent__2> layoutComponents) {
        this.layoutComponents = layoutComponents;
        return this;
    }

    @JsonProperty("placeholder")
    public Boolean getPlaceholder() {
        return placeholder;
    }

    @JsonProperty("placeholder")
    public void setPlaceholder(Boolean placeholder) {
        this.placeholder = placeholder;
    }

    public DescribeLayoutItem withPlaceholder(Boolean placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    @JsonProperty("required")
    public Boolean getRequired() {
        return required;
    }

    @JsonProperty("required")
    public void setRequired(Boolean required) {
        this.required = required;
    }

    public DescribeLayoutItem withRequired(Boolean required) {
        this.required = required;
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

    public DescribeLayoutItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DescribeLayoutItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("editableForNew");
        sb.append('=');
        sb.append(((this.editableForNew == null)?"<null>":this.editableForNew));
        sb.append(',');
        sb.append("editableForUpdate");
        sb.append('=');
        sb.append(((this.editableForUpdate == null)?"<null>":this.editableForUpdate));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("layoutComponents");
        sb.append('=');
        sb.append(((this.layoutComponents == null)?"<null>":this.layoutComponents));
        sb.append(',');
        sb.append("placeholder");
        sb.append('=');
        sb.append(((this.placeholder == null)?"<null>":this.placeholder));
        sb.append(',');
        sb.append("required");
        sb.append('=');
        sb.append(((this.required == null)?"<null>":this.required));
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
        result = ((result* 31)+((this.editableForUpdate == null)? 0 :this.editableForUpdate.hashCode()));
        result = ((result* 31)+((this.editableForNew == null)? 0 :this.editableForNew.hashCode()));
        result = ((result* 31)+((this.layoutComponents == null)? 0 :this.layoutComponents.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.placeholder == null)? 0 :this.placeholder.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.required == null)? 0 :this.required.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DescribeLayoutItem) == false) {
            return false;
        }
        DescribeLayoutItem rhs = ((DescribeLayoutItem) other);
        return ((((((((this.editableForUpdate == rhs.editableForUpdate)||((this.editableForUpdate!= null)&&this.editableForUpdate.equals(rhs.editableForUpdate)))&&((this.editableForNew == rhs.editableForNew)||((this.editableForNew!= null)&&this.editableForNew.equals(rhs.editableForNew))))&&((this.layoutComponents == rhs.layoutComponents)||((this.layoutComponents!= null)&&this.layoutComponents.equals(rhs.layoutComponents))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.placeholder == rhs.placeholder)||((this.placeholder!= null)&&this.placeholder.equals(rhs.placeholder))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.required == rhs.required)||((this.required!= null)&&this.required.equals(rhs.required))));
    }

}
