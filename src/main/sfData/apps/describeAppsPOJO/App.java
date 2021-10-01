
package sft.sfData.apps.describeAppsPOJO;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "appId",
    "description",
    "developerName",
    "eTag",
    "formFactors",
    "headerColor",
    "iconUrl",
    "isNavAutoTempTabsDisabled",
    "isNavPersonalizationDisabled",
    "label",
    "logoUrl",
    "mobileStartUrl",
    "navItems",
    "selected",
    "startUrl",
    "type",
    "userNavItems"
})
public class App {

    @JsonProperty("appId")
    private String appId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("developerName")
    private String developerName;
    @JsonProperty("eTag")
    private String eTag;
    @JsonProperty("formFactors")
    private List<String> formFactors = null;
    @JsonProperty("headerColor")
    private String headerColor;
    @JsonProperty("iconUrl")
    private String iconUrl;
    @JsonProperty("isNavAutoTempTabsDisabled")
    private Boolean isNavAutoTempTabsDisabled;
    @JsonProperty("isNavPersonalizationDisabled")
    private Boolean isNavPersonalizationDisabled;
    @JsonProperty("label")
    private String label;
    @JsonProperty("logoUrl")
    private String logoUrl;
    @JsonProperty("mobileStartUrl")
    private Object mobileStartUrl;
    @JsonProperty("navItems")
    private List<NavItem> navItems = null;
    @JsonProperty("selected")
    private Boolean selected;
    @JsonProperty("startUrl")
    private String startUrl;
    @JsonProperty("type")
    private String type;
    @JsonProperty("userNavItems")
    private List<Object> userNavItems = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("appId")
    public String getAppId() {
        return appId;
    }

    @JsonProperty("appId")
    public void setAppId(String appId) {
        this.appId = appId;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("developerName")
    public String getDeveloperName() {
        return developerName;
    }

    @JsonProperty("developerName")
    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    @JsonProperty("eTag")
    public String getETag() {
        return eTag;
    }

    @JsonProperty("eTag")
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    @JsonProperty("formFactors")
    public List<String> getFormFactors() {
        return formFactors;
    }

    @JsonProperty("formFactors")
    public void setFormFactors(List<String> formFactors) {
        this.formFactors = formFactors;
    }

    @JsonProperty("headerColor")
    public String getHeaderColor() {
        return headerColor;
    }

    @JsonProperty("headerColor")
    public void setHeaderColor(String headerColor) {
        this.headerColor = headerColor;
    }

    @JsonProperty("iconUrl")
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty("iconUrl")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @JsonProperty("isNavAutoTempTabsDisabled")
    public Boolean getIsNavAutoTempTabsDisabled() {
        return isNavAutoTempTabsDisabled;
    }

    @JsonProperty("isNavAutoTempTabsDisabled")
    public void setIsNavAutoTempTabsDisabled(Boolean isNavAutoTempTabsDisabled) {
        this.isNavAutoTempTabsDisabled = isNavAutoTempTabsDisabled;
    }

    @JsonProperty("isNavPersonalizationDisabled")
    public Boolean getIsNavPersonalizationDisabled() {
        return isNavPersonalizationDisabled;
    }

    @JsonProperty("isNavPersonalizationDisabled")
    public void setIsNavPersonalizationDisabled(Boolean isNavPersonalizationDisabled) {
        this.isNavPersonalizationDisabled = isNavPersonalizationDisabled;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("logoUrl")
    public String getLogoUrl() {
        return logoUrl;
    }

    @JsonProperty("logoUrl")
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    @JsonProperty("mobileStartUrl")
    public Object getMobileStartUrl() {
        return mobileStartUrl;
    }

    @JsonProperty("mobileStartUrl")
    public void setMobileStartUrl(Object mobileStartUrl) {
        this.mobileStartUrl = mobileStartUrl;
    }

    @JsonProperty("navItems")
    public List<NavItem> getNavItems() {
        return navItems;
    }

    @JsonProperty("navItems")
    public void setNavItems(List<NavItem> navItems) {
        this.navItems = navItems;
    }

    @JsonProperty("selected")
    public Boolean getSelected() {
        return selected;
    }

    @JsonProperty("selected")
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    @JsonProperty("startUrl")
    public String getStartUrl() {
        return startUrl;
    }

    @JsonProperty("startUrl")
    public void setStartUrl(String startUrl) {
        this.startUrl = startUrl;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("userNavItems")
    public List<Object> getUserNavItems() {
        return userNavItems;
    }

    @JsonProperty("userNavItems")
    public void setUserNavItems(List<Object> userNavItems) {
        this.userNavItems = userNavItems;
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
