
package sft.sfData.objectDescribe.describeLayoutPOJO;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "defaultValues",
    "quickAction",
    "describe",
    "defaultValuesTemplate"
})
public class Urls {

    @JsonProperty("defaultValues")
    private String defaultValues;
    @JsonProperty("quickAction")
    private String quickAction;
    @JsonProperty("describe")
    private String describe;
    @JsonProperty("defaultValuesTemplate")
    private String defaultValuesTemplate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("defaultValues")
    public String getDefaultValues() {
        return defaultValues;
    }

    @JsonProperty("defaultValues")
    public void setDefaultValues(String defaultValues) {
        this.defaultValues = defaultValues;
    }

    public Urls withDefaultValues(String defaultValues) {
        this.defaultValues = defaultValues;
        return this;
    }

    @JsonProperty("quickAction")
    public String getQuickAction() {
        return quickAction;
    }

    @JsonProperty("quickAction")
    public void setQuickAction(String quickAction) {
        this.quickAction = quickAction;
    }

    public Urls withQuickAction(String quickAction) {
        this.quickAction = quickAction;
        return this;
    }

    @JsonProperty("describe")
    public String getDescribe() {
        return describe;
    }

    @JsonProperty("describe")
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Urls withDescribe(String describe) {
        this.describe = describe;
        return this;
    }

    @JsonProperty("defaultValuesTemplate")
    public String getDefaultValuesTemplate() {
        return defaultValuesTemplate;
    }

    @JsonProperty("defaultValuesTemplate")
    public void setDefaultValuesTemplate(String defaultValuesTemplate) {
        this.defaultValuesTemplate = defaultValuesTemplate;
    }

    public Urls withDefaultValuesTemplate(String defaultValuesTemplate) {
        this.defaultValuesTemplate = defaultValuesTemplate;
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

    public Urls withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Urls.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("defaultValues");
        sb.append('=');
        sb.append(((this.defaultValues == null)?"<null>":this.defaultValues));
        sb.append(',');
        sb.append("quickAction");
        sb.append('=');
        sb.append(((this.quickAction == null)?"<null>":this.quickAction));
        sb.append(',');
        sb.append("describe");
        sb.append('=');
        sb.append(((this.describe == null)?"<null>":this.describe));
        sb.append(',');
        sb.append("defaultValuesTemplate");
        sb.append('=');
        sb.append(((this.defaultValuesTemplate == null)?"<null>":this.defaultValuesTemplate));
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
        result = ((result* 31)+((this.defaultValues == null)? 0 :this.defaultValues.hashCode()));
        result = ((result* 31)+((this.quickAction == null)? 0 :this.quickAction.hashCode()));
        result = ((result* 31)+((this.describe == null)? 0 :this.describe.hashCode()));
        result = ((result* 31)+((this.defaultValuesTemplate == null)? 0 :this.defaultValuesTemplate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Urls) == false) {
            return false;
        }
        Urls rhs = ((Urls) other);
        return ((((((this.defaultValues == rhs.defaultValues)||((this.defaultValues!= null)&&this.defaultValues.equals(rhs.defaultValues)))&&((this.quickAction == rhs.quickAction)||((this.quickAction!= null)&&this.quickAction.equals(rhs.quickAction))))&&((this.describe == rhs.describe)||((this.describe!= null)&&this.describe.equals(rhs.describe))))&&((this.defaultValuesTemplate == rhs.defaultValuesTemplate)||((this.defaultValuesTemplate!= null)&&this.defaultValuesTemplate.equals(rhs.defaultValuesTemplate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
