
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
    "accessLevelRequired",
    "colors",
    "iconUrl",
    "icons",
    "label",
    "miniIconUrl",
    "quickActionName",
    "targetSobjectType",
    "type",
    "urls"
})
public class QuickActionListItem {

    @JsonProperty("accessLevelRequired")
    private Object accessLevelRequired;
    @JsonProperty("colors")
    private List<Color> colors = new ArrayList<Color>();
    @JsonProperty("iconUrl")
    private String iconUrl;
    @JsonProperty("icons")
    private List<Icon> icons = new ArrayList<Icon>();
    @JsonProperty("label")
    private String label;
    @JsonProperty("miniIconUrl")
    private String miniIconUrl;
    @JsonProperty("quickActionName")
    private String quickActionName;
    @JsonProperty("targetSobjectType")
    private String targetSobjectType;
    @JsonProperty("type")
    private String type;
    @JsonProperty("urls")
    private Urls urls;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("accessLevelRequired")
    public Object getAccessLevelRequired() {
        return accessLevelRequired;
    }

    @JsonProperty("accessLevelRequired")
    public void setAccessLevelRequired(Object accessLevelRequired) {
        this.accessLevelRequired = accessLevelRequired;
    }

    public QuickActionListItem withAccessLevelRequired(Object accessLevelRequired) {
        this.accessLevelRequired = accessLevelRequired;
        return this;
    }

    @JsonProperty("colors")
    public List<Color> getColors() {
        return colors;
    }

    @JsonProperty("colors")
    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public QuickActionListItem withColors(List<Color> colors) {
        this.colors = colors;
        return this;
    }

    @JsonProperty("iconUrl")
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty("iconUrl")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public QuickActionListItem withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    @JsonProperty("icons")
    public List<Icon> getIcons() {
        return icons;
    }

    @JsonProperty("icons")
    public void setIcons(List<Icon> icons) {
        this.icons = icons;
    }

    public QuickActionListItem withIcons(List<Icon> icons) {
        this.icons = icons;
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

    public QuickActionListItem withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("miniIconUrl")
    public String getMiniIconUrl() {
        return miniIconUrl;
    }

    @JsonProperty("miniIconUrl")
    public void setMiniIconUrl(String miniIconUrl) {
        this.miniIconUrl = miniIconUrl;
    }

    public QuickActionListItem withMiniIconUrl(String miniIconUrl) {
        this.miniIconUrl = miniIconUrl;
        return this;
    }

    @JsonProperty("quickActionName")
    public String getQuickActionName() {
        return quickActionName;
    }

    @JsonProperty("quickActionName")
    public void setQuickActionName(String quickActionName) {
        this.quickActionName = quickActionName;
    }

    public QuickActionListItem withQuickActionName(String quickActionName) {
        this.quickActionName = quickActionName;
        return this;
    }

    @JsonProperty("targetSobjectType")
    public String getTargetSobjectType() {
        return targetSobjectType;
    }

    @JsonProperty("targetSobjectType")
    public void setTargetSobjectType(String targetSobjectType) {
        this.targetSobjectType = targetSobjectType;
    }

    public QuickActionListItem withTargetSobjectType(String targetSobjectType) {
        this.targetSobjectType = targetSobjectType;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public QuickActionListItem withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("urls")
    public Urls getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public QuickActionListItem withUrls(Urls urls) {
        this.urls = urls;
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

    public QuickActionListItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QuickActionListItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accessLevelRequired");
        sb.append('=');
        sb.append(((this.accessLevelRequired == null)?"<null>":this.accessLevelRequired));
        sb.append(',');
        sb.append("colors");
        sb.append('=');
        sb.append(((this.colors == null)?"<null>":this.colors));
        sb.append(',');
        sb.append("iconUrl");
        sb.append('=');
        sb.append(((this.iconUrl == null)?"<null>":this.iconUrl));
        sb.append(',');
        sb.append("icons");
        sb.append('=');
        sb.append(((this.icons == null)?"<null>":this.icons));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("miniIconUrl");
        sb.append('=');
        sb.append(((this.miniIconUrl == null)?"<null>":this.miniIconUrl));
        sb.append(',');
        sb.append("quickActionName");
        sb.append('=');
        sb.append(((this.quickActionName == null)?"<null>":this.quickActionName));
        sb.append(',');
        sb.append("targetSobjectType");
        sb.append('=');
        sb.append(((this.targetSobjectType == null)?"<null>":this.targetSobjectType));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("urls");
        sb.append('=');
        sb.append(((this.urls == null)?"<null>":this.urls));
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
        result = ((result* 31)+((this.quickActionName == null)? 0 :this.quickActionName.hashCode()));
        result = ((result* 31)+((this.urls == null)? 0 :this.urls.hashCode()));
        result = ((result* 31)+((this.miniIconUrl == null)? 0 :this.miniIconUrl.hashCode()));
        result = ((result* 31)+((this.targetSobjectType == null)? 0 :this.targetSobjectType.hashCode()));
        result = ((result* 31)+((this.iconUrl == null)? 0 :this.iconUrl.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.accessLevelRequired == null)? 0 :this.accessLevelRequired.hashCode()));
        result = ((result* 31)+((this.icons == null)? 0 :this.icons.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.colors == null)? 0 :this.colors.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuickActionListItem) == false) {
            return false;
        }
        QuickActionListItem rhs = ((QuickActionListItem) other);
        return ((((((((((((this.quickActionName == rhs.quickActionName)||((this.quickActionName!= null)&&this.quickActionName.equals(rhs.quickActionName)))&&((this.urls == rhs.urls)||((this.urls!= null)&&this.urls.equals(rhs.urls))))&&((this.miniIconUrl == rhs.miniIconUrl)||((this.miniIconUrl!= null)&&this.miniIconUrl.equals(rhs.miniIconUrl))))&&((this.targetSobjectType == rhs.targetSobjectType)||((this.targetSobjectType!= null)&&this.targetSobjectType.equals(rhs.targetSobjectType))))&&((this.iconUrl == rhs.iconUrl)||((this.iconUrl!= null)&&this.iconUrl.equals(rhs.iconUrl))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.accessLevelRequired == rhs.accessLevelRequired)||((this.accessLevelRequired!= null)&&this.accessLevelRequired.equals(rhs.accessLevelRequired))))&&((this.icons == rhs.icons)||((this.icons!= null)&&this.icons.equals(rhs.icons))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.colors == rhs.colors)||((this.colors!= null)&&this.colors.equals(rhs.colors))));
    }

}
