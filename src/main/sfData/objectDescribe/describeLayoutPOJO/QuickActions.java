
package sft.sfData.objectDescribe.describeLayoutPOJO;

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
    "actionEnumOrId",
    "canvasApplicationId",
    "canvasApplicationName",
    "colors",
    "contextSobjectType",
    "defaultValues",
    "flowDevName",
    "flowRecordIdVar",
    "height",
    "iconName",
    "iconUrl",
    "icons",
    "label",
    "layout",
    "lightningComponentBundleId",
    "lightningComponentBundleName",
    "lightningComponentQualifiedName",
    "miniIconUrl",
    "mobileExtensionId",
    "name",
    "showQuickActionLcHeader",
    "showQuickActionVfHeader",
    "targetParentField",
    "targetRecordTypeId",
    "targetSobjectType",
    "type",
    "urls",
    "visualforcePageName",
    "visualforcePageUrl",
    "width"
})
public class QuickActions {

    @JsonProperty("accessLevelRequired")
    private Object accessLevelRequired;
    @JsonProperty("actionEnumOrId")
    private String actionEnumOrId;
    @JsonProperty("canvasApplicationId")
    private Object canvasApplicationId;
    @JsonProperty("canvasApplicationName")
    private Object canvasApplicationName;
    @JsonProperty("colors")
    private List<Color> colors = null;
    @JsonProperty("contextSobjectType")
    private Object contextSobjectType;
    @JsonProperty("defaultValues")
    private List<DefaultValue> defaultValues = null;
    @JsonProperty("flowDevName")
    private Object flowDevName;
    @JsonProperty("flowRecordIdVar")
    private Object flowRecordIdVar;
    @JsonProperty("height")
    private Object height;
    @JsonProperty("iconName")
    private Object iconName;
    @JsonProperty("iconUrl")
    private String iconUrl;
    @JsonProperty("icons")
    private List<Icon> icons = null;
    @JsonProperty("label")
    private String label;
    @JsonProperty("layout")
    private Layout layout;
    @JsonProperty("lightningComponentBundleId")
    private Object lightningComponentBundleId;
    @JsonProperty("lightningComponentBundleName")
    private Object lightningComponentBundleName;
    @JsonProperty("lightningComponentQualifiedName")
    private Object lightningComponentQualifiedName;
    @JsonProperty("miniIconUrl")
    private String miniIconUrl;
    @JsonProperty("mobileExtensionId")
    private Object mobileExtensionId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("showQuickActionLcHeader")
    private Boolean showQuickActionLcHeader;
    @JsonProperty("showQuickActionVfHeader")
    private Boolean showQuickActionVfHeader;
    @JsonProperty("targetParentField")
    private Object targetParentField;
    @JsonProperty("targetRecordTypeId")
    private Object targetRecordTypeId;
    @JsonProperty("targetSobjectType")
    private String targetSobjectType;
    @JsonProperty("type")
    private String type;
    @JsonProperty("urls")
    private Urls urls;
    @JsonProperty("visualforcePageName")
    private Object visualforcePageName;
    @JsonProperty("visualforcePageUrl")
    private Object visualforcePageUrl;
    @JsonProperty("width")
    private Object width;
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

    @JsonProperty("actionEnumOrId")
    public String getActionEnumOrId() {
        return actionEnumOrId;
    }

    @JsonProperty("actionEnumOrId")
    public void setActionEnumOrId(String actionEnumOrId) {
        this.actionEnumOrId = actionEnumOrId;
    }

    @JsonProperty("canvasApplicationId")
    public Object getCanvasApplicationId() {
        return canvasApplicationId;
    }

    @JsonProperty("canvasApplicationId")
    public void setCanvasApplicationId(Object canvasApplicationId) {
        this.canvasApplicationId = canvasApplicationId;
    }

    @JsonProperty("canvasApplicationName")
    public Object getCanvasApplicationName() {
        return canvasApplicationName;
    }

    @JsonProperty("canvasApplicationName")
    public void setCanvasApplicationName(Object canvasApplicationName) {
        this.canvasApplicationName = canvasApplicationName;
    }

    @JsonProperty("colors")
    public List<Color> getColors() {
        return colors;
    }

    @JsonProperty("colors")
    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    @JsonProperty("contextSobjectType")
    public Object getContextSobjectType() {
        return contextSobjectType;
    }

    @JsonProperty("contextSobjectType")
    public void setContextSobjectType(Object contextSobjectType) {
        this.contextSobjectType = contextSobjectType;
    }

    @JsonProperty("defaultValues")
    public List<DefaultValue> getDefaultValues() {
        return defaultValues;
    }

    @JsonProperty("defaultValues")
    public void setDefaultValues(List<DefaultValue> defaultValues) {
        this.defaultValues = defaultValues;
    }

    @JsonProperty("flowDevName")
    public Object getFlowDevName() {
        return flowDevName;
    }

    @JsonProperty("flowDevName")
    public void setFlowDevName(Object flowDevName) {
        this.flowDevName = flowDevName;
    }

    @JsonProperty("flowRecordIdVar")
    public Object getFlowRecordIdVar() {
        return flowRecordIdVar;
    }

    @JsonProperty("flowRecordIdVar")
    public void setFlowRecordIdVar(Object flowRecordIdVar) {
        this.flowRecordIdVar = flowRecordIdVar;
    }

    @JsonProperty("height")
    public Object getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Object height) {
        this.height = height;
    }

    @JsonProperty("iconName")
    public Object getIconName() {
        return iconName;
    }

    @JsonProperty("iconName")
    public void setIconName(Object iconName) {
        this.iconName = iconName;
    }

    @JsonProperty("iconUrl")
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty("iconUrl")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @JsonProperty("icons")
    public List<Icon> getIcons() {
        return icons;
    }

    @JsonProperty("icons")
    public void setIcons(List<Icon> icons) {
        this.icons = icons;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("layout")
    public Layout getLayout() {
        return layout;
    }

    @JsonProperty("layout")
    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    @JsonProperty("lightningComponentBundleId")
    public Object getLightningComponentBundleId() {
        return lightningComponentBundleId;
    }

    @JsonProperty("lightningComponentBundleId")
    public void setLightningComponentBundleId(Object lightningComponentBundleId) {
        this.lightningComponentBundleId = lightningComponentBundleId;
    }

    @JsonProperty("lightningComponentBundleName")
    public Object getLightningComponentBundleName() {
        return lightningComponentBundleName;
    }

    @JsonProperty("lightningComponentBundleName")
    public void setLightningComponentBundleName(Object lightningComponentBundleName) {
        this.lightningComponentBundleName = lightningComponentBundleName;
    }

    @JsonProperty("lightningComponentQualifiedName")
    public Object getLightningComponentQualifiedName() {
        return lightningComponentQualifiedName;
    }

    @JsonProperty("lightningComponentQualifiedName")
    public void setLightningComponentQualifiedName(Object lightningComponentQualifiedName) {
        this.lightningComponentQualifiedName = lightningComponentQualifiedName;
    }

    @JsonProperty("miniIconUrl")
    public String getMiniIconUrl() {
        return miniIconUrl;
    }

    @JsonProperty("miniIconUrl")
    public void setMiniIconUrl(String miniIconUrl) {
        this.miniIconUrl = miniIconUrl;
    }

    @JsonProperty("mobileExtensionId")
    public Object getMobileExtensionId() {
        return mobileExtensionId;
    }

    @JsonProperty("mobileExtensionId")
    public void setMobileExtensionId(Object mobileExtensionId) {
        this.mobileExtensionId = mobileExtensionId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("showQuickActionLcHeader")
    public Boolean getShowQuickActionLcHeader() {
        return showQuickActionLcHeader;
    }

    @JsonProperty("showQuickActionLcHeader")
    public void setShowQuickActionLcHeader(Boolean showQuickActionLcHeader) {
        this.showQuickActionLcHeader = showQuickActionLcHeader;
    }

    @JsonProperty("showQuickActionVfHeader")
    public Boolean getShowQuickActionVfHeader() {
        return showQuickActionVfHeader;
    }

    @JsonProperty("showQuickActionVfHeader")
    public void setShowQuickActionVfHeader(Boolean showQuickActionVfHeader) {
        this.showQuickActionVfHeader = showQuickActionVfHeader;
    }

    @JsonProperty("targetParentField")
    public Object getTargetParentField() {
        return targetParentField;
    }

    @JsonProperty("targetParentField")
    public void setTargetParentField(Object targetParentField) {
        this.targetParentField = targetParentField;
    }

    @JsonProperty("targetRecordTypeId")
    public Object getTargetRecordTypeId() {
        return targetRecordTypeId;
    }

    @JsonProperty("targetRecordTypeId")
    public void setTargetRecordTypeId(Object targetRecordTypeId) {
        this.targetRecordTypeId = targetRecordTypeId;
    }

    @JsonProperty("targetSobjectType")
    public String getTargetSobjectType() {
        return targetSobjectType;
    }

    @JsonProperty("targetSobjectType")
    public void setTargetSobjectType(String targetSobjectType) {
        this.targetSobjectType = targetSobjectType;
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

    @JsonProperty("visualforcePageName")
    public Object getVisualforcePageName() {
        return visualforcePageName;
    }

    @JsonProperty("visualforcePageName")
    public void setVisualforcePageName(Object visualforcePageName) {
        this.visualforcePageName = visualforcePageName;
    }

    @JsonProperty("visualforcePageUrl")
    public Object getVisualforcePageUrl() {
        return visualforcePageUrl;
    }

    @JsonProperty("visualforcePageUrl")
    public void setVisualforcePageUrl(Object visualforcePageUrl) {
        this.visualforcePageUrl = visualforcePageUrl;
    }

    @JsonProperty("width")
    public Object getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Object width) {
        this.width = width;
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
