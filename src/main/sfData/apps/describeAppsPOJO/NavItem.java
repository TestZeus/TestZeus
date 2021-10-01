
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
    "availableInClassic",
    "availableInLightning",
    "color",
    "content",
    "custom",
    "developerName",
    "iconUrl",
    "id",
    "itemType",
    "label",
    "objectApiName",
    "objectLabel",
    "objectLabelPlural",
    "pageReference",
    "standardType"
})
public class NavItem {

    @JsonProperty("availableInClassic")
    private Boolean availableInClassic;
    @JsonProperty("availableInLightning")
    private Boolean availableInLightning;
    @JsonProperty("color")
    private String color;
    @JsonProperty("content")
    private String content;
    @JsonProperty("custom")
    private Boolean custom;
    @JsonProperty("developerName")
    private String developerName;
    @JsonProperty("iconUrl")
    private String iconUrl;
    @JsonProperty("id")
    private Object id;
    @JsonProperty("itemType")
    private String itemType;
    @JsonProperty("label")
    private String label;
    @JsonProperty("objectApiName")
    private String objectApiName;
    @JsonProperty("objectLabel")
    private Object objectLabel;
    @JsonProperty("objectLabelPlural")
    private Object objectLabelPlural;
    @JsonProperty("pageReference")
    private PageReference pageReference;
    @JsonProperty("standardType")
    private String standardType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("availableInClassic")
    public Boolean getAvailableInClassic() {
        return availableInClassic;
    }

    @JsonProperty("availableInClassic")
    public void setAvailableInClassic(Boolean availableInClassic) {
        this.availableInClassic = availableInClassic;
    }

    @JsonProperty("availableInLightning")
    public Boolean getAvailableInLightning() {
        return availableInLightning;
    }

    @JsonProperty("availableInLightning")
    public void setAvailableInLightning(Boolean availableInLightning) {
        this.availableInLightning = availableInLightning;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("custom")
    public Boolean getCustom() {
        return custom;
    }

    @JsonProperty("custom")
    public void setCustom(Boolean custom) {
        this.custom = custom;
    }

    @JsonProperty("developerName")
    public String getDeveloperName() {
        return developerName;
    }

    @JsonProperty("developerName")
    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    @JsonProperty("iconUrl")
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty("iconUrl")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    @JsonProperty("itemType")
    public String getItemType() {
        return itemType;
    }

    @JsonProperty("itemType")
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("objectApiName")
    public String getObjectApiName() {
        return objectApiName;
    }

    @JsonProperty("objectApiName")
    public void setObjectApiName(String objectApiName) {
        this.objectApiName = objectApiName;
    }

    @JsonProperty("objectLabel")
    public Object getObjectLabel() {
        return objectLabel;
    }

    @JsonProperty("objectLabel")
    public void setObjectLabel(Object objectLabel) {
        this.objectLabel = objectLabel;
    }

    @JsonProperty("objectLabelPlural")
    public Object getObjectLabelPlural() {
        return objectLabelPlural;
    }

    @JsonProperty("objectLabelPlural")
    public void setObjectLabelPlural(Object objectLabelPlural) {
        this.objectLabelPlural = objectLabelPlural;
    }

    @JsonProperty("pageReference")
    public PageReference getPageReference() {
        return pageReference;
    }

    @JsonProperty("pageReference")
    public void setPageReference(PageReference pageReference) {
        this.pageReference = pageReference;
    }

    @JsonProperty("standardType")
    public String getStandardType() {
        return standardType;
    }

    @JsonProperty("standardType")
    public void setStandardType(String standardType) {
        this.standardType = standardType;
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
