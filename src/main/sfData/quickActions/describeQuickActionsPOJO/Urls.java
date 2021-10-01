package sft.sfData.quickActions.describeQuickActionsPOJO;

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

    @JsonProperty("quickAction")
    public String getQuickAction() {
        return quickAction;
    }

    @JsonProperty("quickAction")
    public void setQuickAction(String quickAction) {
        this.quickAction = quickAction;
    }

    @JsonProperty("describe")
    public String getDescribe() {
        return describe;
    }

    @JsonProperty("describe")
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @JsonProperty("defaultValuesTemplate")
    public String getDefaultValuesTemplate() {
        return defaultValuesTemplate;
    }

    @JsonProperty("defaultValuesTemplate")
    public void setDefaultValuesTemplate(String defaultValuesTemplate) {
        this.defaultValuesTemplate = defaultValuesTemplate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
