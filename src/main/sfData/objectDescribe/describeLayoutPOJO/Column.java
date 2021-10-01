
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
    "field",
    "fieldApiName",
    "format",
    "label",
    "lookupId",
    "name",
    "sortable"
})
public class Column {

    @JsonProperty("field")
    private String field;
    @JsonProperty("fieldApiName")
    private String fieldApiName;
    @JsonProperty("format")
    private String format;
    @JsonProperty("label")
    private String label;
    @JsonProperty("lookupId")
    private Object lookupId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("sortable")
    private Boolean sortable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    public Column withField(String field) {
        this.field = field;
        return this;
    }

    @JsonProperty("fieldApiName")
    public String getFieldApiName() {
        return fieldApiName;
    }

    @JsonProperty("fieldApiName")
    public void setFieldApiName(String fieldApiName) {
        this.fieldApiName = fieldApiName;
    }

    public Column withFieldApiName(String fieldApiName) {
        this.fieldApiName = fieldApiName;
        return this;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    public Column withFormat(String format) {
        this.format = format;
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

    public Column withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("lookupId")
    public Object getLookupId() {
        return lookupId;
    }

    @JsonProperty("lookupId")
    public void setLookupId(Object lookupId) {
        this.lookupId = lookupId;
    }

    public Column withLookupId(Object lookupId) {
        this.lookupId = lookupId;
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

    public Column withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("sortable")
    public Boolean getSortable() {
        return sortable;
    }

    @JsonProperty("sortable")
    public void setSortable(Boolean sortable) {
        this.sortable = sortable;
    }

    public Column withSortable(Boolean sortable) {
        this.sortable = sortable;
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

    public Column withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Column.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("field");
        sb.append('=');
        sb.append(((this.field == null)?"<null>":this.field));
        sb.append(',');
        sb.append("fieldApiName");
        sb.append('=');
        sb.append(((this.fieldApiName == null)?"<null>":this.fieldApiName));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("lookupId");
        sb.append('=');
        sb.append(((this.lookupId == null)?"<null>":this.lookupId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("sortable");
        sb.append('=');
        sb.append(((this.sortable == null)?"<null>":this.sortable));
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
        result = ((result* 31)+((this.lookupId == null)? 0 :this.lookupId.hashCode()));
        result = ((result* 31)+((this.field == null)? 0 :this.field.hashCode()));
        result = ((result* 31)+((this.fieldApiName == null)? 0 :this.fieldApiName.hashCode()));
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.sortable == null)? 0 :this.sortable.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Column) == false) {
            return false;
        }
        Column rhs = ((Column) other);
        return (((((((((this.lookupId == rhs.lookupId)||((this.lookupId!= null)&&this.lookupId.equals(rhs.lookupId)))&&((this.field == rhs.field)||((this.field!= null)&&this.field.equals(rhs.field))))&&((this.fieldApiName == rhs.fieldApiName)||((this.fieldApiName!= null)&&this.fieldApiName.equals(rhs.fieldApiName))))&&((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.sortable == rhs.sortable)||((this.sortable!= null)&&this.sortable.equals(rhs.sortable))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
