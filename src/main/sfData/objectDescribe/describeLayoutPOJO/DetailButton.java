
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
    "behavior",
    "colors",
    "content",
    "contentSource",
    "custom",
    "encoding",
    "height",
    "icons",
    "label",
    "menubar",
    "name",
    "overridden",
    "resizeable",
    "scrollbars",
    "showsLocation",
    "showsStatus",
    "toolbar",
    "url",
    "width",
    "windowPosition"
})
public class DetailButton {

    @JsonProperty("behavior")
    private Object behavior;
    @JsonProperty("colors")
    private Object colors;
    @JsonProperty("content")
    private Object content;
    @JsonProperty("contentSource")
    private Object contentSource;
    @JsonProperty("custom")
    private Boolean custom;
    @JsonProperty("encoding")
    private Object encoding;
    @JsonProperty("height")
    private Object height;
    @JsonProperty("icons")
    private Object icons;
    @JsonProperty("label")
    private String label;
    @JsonProperty("menubar")
    private Boolean menubar;
    @JsonProperty("name")
    private String name;
    @JsonProperty("overridden")
    private Boolean overridden;
    @JsonProperty("resizeable")
    private Boolean resizeable;
    @JsonProperty("scrollbars")
    private Boolean scrollbars;
    @JsonProperty("showsLocation")
    private Boolean showsLocation;
    @JsonProperty("showsStatus")
    private Boolean showsStatus;
    @JsonProperty("toolbar")
    private Boolean toolbar;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("width")
    private Object width;
    @JsonProperty("windowPosition")
    private Object windowPosition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("behavior")
    public Object getBehavior() {
        return behavior;
    }

    @JsonProperty("behavior")
    public void setBehavior(Object behavior) {
        this.behavior = behavior;
    }

    public DetailButton withBehavior(Object behavior) {
        this.behavior = behavior;
        return this;
    }

    @JsonProperty("colors")
    public Object getColors() {
        return colors;
    }

    @JsonProperty("colors")
    public void setColors(Object colors) {
        this.colors = colors;
    }

    public DetailButton withColors(Object colors) {
        this.colors = colors;
        return this;
    }

    @JsonProperty("content")
    public Object getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(Object content) {
        this.content = content;
    }

    public DetailButton withContent(Object content) {
        this.content = content;
        return this;
    }

    @JsonProperty("contentSource")
    public Object getContentSource() {
        return contentSource;
    }

    @JsonProperty("contentSource")
    public void setContentSource(Object contentSource) {
        this.contentSource = contentSource;
    }

    public DetailButton withContentSource(Object contentSource) {
        this.contentSource = contentSource;
        return this;
    }

    @JsonProperty("custom")
    public Boolean getCustom() {
        return custom;
    }

    @JsonProperty("custom")
    public void setCustom(Boolean custom) {
        this.custom = custom;
    }

    public DetailButton withCustom(Boolean custom) {
        this.custom = custom;
        return this;
    }

    @JsonProperty("encoding")
    public Object getEncoding() {
        return encoding;
    }

    @JsonProperty("encoding")
    public void setEncoding(Object encoding) {
        this.encoding = encoding;
    }

    public DetailButton withEncoding(Object encoding) {
        this.encoding = encoding;
        return this;
    }

    @JsonProperty("height")
    public Object getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Object height) {
        this.height = height;
    }

    public DetailButton withHeight(Object height) {
        this.height = height;
        return this;
    }

    @JsonProperty("icons")
    public Object getIcons() {
        return icons;
    }

    @JsonProperty("icons")
    public void setIcons(Object icons) {
        this.icons = icons;
    }

    public DetailButton withIcons(Object icons) {
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

    public DetailButton withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("menubar")
    public Boolean getMenubar() {
        return menubar;
    }

    @JsonProperty("menubar")
    public void setMenubar(Boolean menubar) {
        this.menubar = menubar;
    }

    public DetailButton withMenubar(Boolean menubar) {
        this.menubar = menubar;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public DetailButton withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("overridden")
    public Boolean getOverridden() {
        return overridden;
    }

    @JsonProperty("overridden")
    public void setOverridden(Boolean overridden) {
        this.overridden = overridden;
    }

    public DetailButton withOverridden(Boolean overridden) {
        this.overridden = overridden;
        return this;
    }

    @JsonProperty("resizeable")
    public Boolean getResizeable() {
        return resizeable;
    }

    @JsonProperty("resizeable")
    public void setResizeable(Boolean resizeable) {
        this.resizeable = resizeable;
    }

    public DetailButton withResizeable(Boolean resizeable) {
        this.resizeable = resizeable;
        return this;
    }

    @JsonProperty("scrollbars")
    public Boolean getScrollbars() {
        return scrollbars;
    }

    @JsonProperty("scrollbars")
    public void setScrollbars(Boolean scrollbars) {
        this.scrollbars = scrollbars;
    }

    public DetailButton withScrollbars(Boolean scrollbars) {
        this.scrollbars = scrollbars;
        return this;
    }

    @JsonProperty("showsLocation")
    public Boolean getShowsLocation() {
        return showsLocation;
    }

    @JsonProperty("showsLocation")
    public void setShowsLocation(Boolean showsLocation) {
        this.showsLocation = showsLocation;
    }

    public DetailButton withShowsLocation(Boolean showsLocation) {
        this.showsLocation = showsLocation;
        return this;
    }

    @JsonProperty("showsStatus")
    public Boolean getShowsStatus() {
        return showsStatus;
    }

    @JsonProperty("showsStatus")
    public void setShowsStatus(Boolean showsStatus) {
        this.showsStatus = showsStatus;
    }

    public DetailButton withShowsStatus(Boolean showsStatus) {
        this.showsStatus = showsStatus;
        return this;
    }

    @JsonProperty("toolbar")
    public Boolean getToolbar() {
        return toolbar;
    }

    @JsonProperty("toolbar")
    public void setToolbar(Boolean toolbar) {
        this.toolbar = toolbar;
    }

    public DetailButton withToolbar(Boolean toolbar) {
        this.toolbar = toolbar;
        return this;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    public DetailButton withUrl(Object url) {
        this.url = url;
        return this;
    }

    @JsonProperty("width")
    public Object getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Object width) {
        this.width = width;
    }

    public DetailButton withWidth(Object width) {
        this.width = width;
        return this;
    }

    @JsonProperty("windowPosition")
    public Object getWindowPosition() {
        return windowPosition;
    }

    @JsonProperty("windowPosition")
    public void setWindowPosition(Object windowPosition) {
        this.windowPosition = windowPosition;
    }

    public DetailButton withWindowPosition(Object windowPosition) {
        this.windowPosition = windowPosition;
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

    public DetailButton withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DetailButton.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("behavior");
        sb.append('=');
        sb.append(((this.behavior == null)?"<null>":this.behavior));
        sb.append(',');
        sb.append("colors");
        sb.append('=');
        sb.append(((this.colors == null)?"<null>":this.colors));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
        sb.append(',');
        sb.append("contentSource");
        sb.append('=');
        sb.append(((this.contentSource == null)?"<null>":this.contentSource));
        sb.append(',');
        sb.append("custom");
        sb.append('=');
        sb.append(((this.custom == null)?"<null>":this.custom));
        sb.append(',');
        sb.append("encoding");
        sb.append('=');
        sb.append(((this.encoding == null)?"<null>":this.encoding));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("icons");
        sb.append('=');
        sb.append(((this.icons == null)?"<null>":this.icons));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("menubar");
        sb.append('=');
        sb.append(((this.menubar == null)?"<null>":this.menubar));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("overridden");
        sb.append('=');
        sb.append(((this.overridden == null)?"<null>":this.overridden));
        sb.append(',');
        sb.append("resizeable");
        sb.append('=');
        sb.append(((this.resizeable == null)?"<null>":this.resizeable));
        sb.append(',');
        sb.append("scrollbars");
        sb.append('=');
        sb.append(((this.scrollbars == null)?"<null>":this.scrollbars));
        sb.append(',');
        sb.append("showsLocation");
        sb.append('=');
        sb.append(((this.showsLocation == null)?"<null>":this.showsLocation));
        sb.append(',');
        sb.append("showsStatus");
        sb.append('=');
        sb.append(((this.showsStatus == null)?"<null>":this.showsStatus));
        sb.append(',');
        sb.append("toolbar");
        sb.append('=');
        sb.append(((this.toolbar == null)?"<null>":this.toolbar));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
        sb.append(',');
        sb.append("windowPosition");
        sb.append('=');
        sb.append(((this.windowPosition == null)?"<null>":this.windowPosition));
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
        result = ((result* 31)+((this.showsStatus == null)? 0 :this.showsStatus.hashCode()));
        result = ((result* 31)+((this.custom == null)? 0 :this.custom.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.overridden == null)? 0 :this.overridden.hashCode()));
        result = ((result* 31)+((this.encoding == null)? 0 :this.encoding.hashCode()));
        result = ((result* 31)+((this.icons == null)? 0 :this.icons.hashCode()));
        result = ((result* 31)+((this.windowPosition == null)? 0 :this.windowPosition.hashCode()));
        result = ((result* 31)+((this.colors == null)? 0 :this.colors.hashCode()));
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.toolbar == null)? 0 :this.toolbar.hashCode()));
        result = ((result* 31)+((this.menubar == null)? 0 :this.menubar.hashCode()));
        result = ((result* 31)+((this.contentSource == null)? 0 :this.contentSource.hashCode()));
        result = ((result* 31)+((this.scrollbars == null)? 0 :this.scrollbars.hashCode()));
        result = ((result* 31)+((this.showsLocation == null)? 0 :this.showsLocation.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.resizeable == null)? 0 :this.resizeable.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.behavior == null)? 0 :this.behavior.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetailButton) == false) {
            return false;
        }
        DetailButton rhs = ((DetailButton) other);
        return ((((((((((((((((((((((this.showsStatus == rhs.showsStatus)||((this.showsStatus!= null)&&this.showsStatus.equals(rhs.showsStatus)))&&((this.custom == rhs.custom)||((this.custom!= null)&&this.custom.equals(rhs.custom))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.overridden == rhs.overridden)||((this.overridden!= null)&&this.overridden.equals(rhs.overridden))))&&((this.encoding == rhs.encoding)||((this.encoding!= null)&&this.encoding.equals(rhs.encoding))))&&((this.icons == rhs.icons)||((this.icons!= null)&&this.icons.equals(rhs.icons))))&&((this.windowPosition == rhs.windowPosition)||((this.windowPosition!= null)&&this.windowPosition.equals(rhs.windowPosition))))&&((this.colors == rhs.colors)||((this.colors!= null)&&this.colors.equals(rhs.colors))))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.toolbar == rhs.toolbar)||((this.toolbar!= null)&&this.toolbar.equals(rhs.toolbar))))&&((this.menubar == rhs.menubar)||((this.menubar!= null)&&this.menubar.equals(rhs.menubar))))&&((this.contentSource == rhs.contentSource)||((this.contentSource!= null)&&this.contentSource.equals(rhs.contentSource))))&&((this.scrollbars == rhs.scrollbars)||((this.scrollbars!= null)&&this.scrollbars.equals(rhs.scrollbars))))&&((this.showsLocation == rhs.showsLocation)||((this.showsLocation!= null)&&this.showsLocation.equals(rhs.showsLocation))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width))))&&((this.resizeable == rhs.resizeable)||((this.resizeable!= null)&&this.resizeable.equals(rhs.resizeable))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.behavior == rhs.behavior)||((this.behavior!= null)&&this.behavior.equals(rhs.behavior))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
    }

}
