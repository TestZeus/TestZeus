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
    "actionEnumOrId",
    "label",
    "name",
    "type",
    "urls"
})
public class AllActions {

    @JsonProperty("actionEnumOrId")
    private String actionEnumOrId;
    @JsonProperty("label")
    private String label;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("urls")
    private Urls urls;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("actionEnumOrId")
    public String getActionEnumOrId() {
        return actionEnumOrId;
    }

    @JsonProperty("actionEnumOrId")
    public void setActionEnumOrId(String actionEnumOrId) {
        this.actionEnumOrId = actionEnumOrId;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("urls")
    public Urls getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(Urls urls) {
        this.urls = urls;
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
