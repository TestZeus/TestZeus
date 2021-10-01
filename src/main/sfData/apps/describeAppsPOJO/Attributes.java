
package sft.sfData.apps.describeAppsPOJO;

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
    "pageName",
    "objectApiName",
    "actionName",
    "name",
    "attributes"
})
public class Attributes {

    @JsonProperty("pageName")
    private String pageName;
    @JsonProperty("objectApiName")
    private String objectApiName;
    @JsonProperty("actionName")
    private String actionName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("attributes")
    private Attributes_ attributes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pageName")
    public String getPageName() {
        return pageName;
    }

    @JsonProperty("pageName")
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    @JsonProperty("objectApiName")
    public String getObjectApiName() {
        return objectApiName;
    }

    @JsonProperty("objectApiName")
    public void setObjectApiName(String objectApiName) {
        this.objectApiName = objectApiName;
    }

    @JsonProperty("actionName")
    public String getActionName() {
        return actionName;
    }

    @JsonProperty("actionName")
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("attributes")
    public Attributes_ getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(Attributes_ attributes) {
        this.attributes = attributes;
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
