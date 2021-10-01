
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
    "displayLines",
    "tabOrder",
    "type",
    "value"
})
public class LayoutComponent__2 {

    @JsonProperty("displayLines")
    private Integer displayLines;
    @JsonProperty("tabOrder")
    private Integer tabOrder;
    @JsonProperty("type")
    private String type;
    @JsonProperty("value")
    private String value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayLines")
    public Integer getDisplayLines() {
        return displayLines;
    }

    @JsonProperty("displayLines")
    public void setDisplayLines(Integer displayLines) {
        this.displayLines = displayLines;
    }

    public LayoutComponent__2 withDisplayLines(Integer displayLines) {
        this.displayLines = displayLines;
        return this;
    }

    @JsonProperty("tabOrder")
    public Integer getTabOrder() {
        return tabOrder;
    }

    @JsonProperty("tabOrder")
    public void setTabOrder(Integer tabOrder) {
        this.tabOrder = tabOrder;
    }

    public LayoutComponent__2 withTabOrder(Integer tabOrder) {
        this.tabOrder = tabOrder;
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

    public LayoutComponent__2 withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public LayoutComponent__2 withValue(String value) {
        this.value = value;
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

    public LayoutComponent__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LayoutComponent__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayLines");
        sb.append('=');
        sb.append(((this.displayLines == null)?"<null>":this.displayLines));
        sb.append(',');
        sb.append("tabOrder");
        sb.append('=');
        sb.append(((this.tabOrder == null)?"<null>":this.tabOrder));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.displayLines == null)? 0 :this.displayLines.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.tabOrder == null)? 0 :this.tabOrder.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LayoutComponent__2) == false) {
            return false;
        }
        LayoutComponent__2 rhs = ((LayoutComponent__2) other);
        return ((((((this.displayLines == rhs.displayLines)||((this.displayLines!= null)&&this.displayLines.equals(rhs.displayLines)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.tabOrder == rhs.tabOrder)||((this.tabOrder!= null)&&this.tabOrder.equals(rhs.tabOrder))));
    }

}
