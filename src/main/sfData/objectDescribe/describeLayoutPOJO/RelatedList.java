
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
    "accessLevelRequiredForCreate",
    "buttons",
    "columns",
    "custom",
    "field",
    "label",
    "limitRows",
    "name",
    "sobject",
    "sort"
})
public class RelatedList {

    @JsonProperty("accessLevelRequiredForCreate")
    private Object accessLevelRequiredForCreate;
    @JsonProperty("buttons")
    private List<Button> buttons = new ArrayList<Button>();
    @JsonProperty("columns")
    private List<Column> columns = new ArrayList<Column>();
    @JsonProperty("custom")
    private Boolean custom;
    @JsonProperty("field")
    private String field;
    @JsonProperty("label")
    private String label;
    @JsonProperty("limitRows")
    private Integer limitRows;
    @JsonProperty("name")
    private String name;
    @JsonProperty("sobject")
    private String sobject;
    @JsonProperty("sort")
    private List<Sort> sort = new ArrayList<Sort>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("accessLevelRequiredForCreate")
    public Object getAccessLevelRequiredForCreate() {
        return accessLevelRequiredForCreate;
    }

    @JsonProperty("accessLevelRequiredForCreate")
    public void setAccessLevelRequiredForCreate(Object accessLevelRequiredForCreate) {
        this.accessLevelRequiredForCreate = accessLevelRequiredForCreate;
    }

    public RelatedList withAccessLevelRequiredForCreate(Object accessLevelRequiredForCreate) {
        this.accessLevelRequiredForCreate = accessLevelRequiredForCreate;
        return this;
    }

    @JsonProperty("buttons")
    public List<Button> getButtons() {
        return buttons;
    }

    @JsonProperty("buttons")
    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    public RelatedList withButtons(List<Button> buttons) {
        this.buttons = buttons;
        return this;
    }

    @JsonProperty("columns")
    public List<Column> getColumns() {
        return columns;
    }

    @JsonProperty("columns")
    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public RelatedList withColumns(List<Column> columns) {
        this.columns = columns;
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

    public RelatedList withCustom(Boolean custom) {
        this.custom = custom;
        return this;
    }

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    public RelatedList withField(String field) {
        this.field = field;
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

    public RelatedList withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("limitRows")
    public Integer getLimitRows() {
        return limitRows;
    }

    @JsonProperty("limitRows")
    public void setLimitRows(Integer limitRows) {
        this.limitRows = limitRows;
    }

    public RelatedList withLimitRows(Integer limitRows) {
        this.limitRows = limitRows;
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

    public RelatedList withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("sobject")
    public String getSobject() {
        return sobject;
    }

    @JsonProperty("sobject")
    public void setSobject(String sobject) {
        this.sobject = sobject;
    }

    public RelatedList withSobject(String sobject) {
        this.sobject = sobject;
        return this;
    }

    @JsonProperty("sort")
    public List<Sort> getSort() {
        return sort;
    }

    @JsonProperty("sort")
    public void setSort(List<Sort> sort) {
        this.sort = sort;
    }

    public RelatedList withSort(List<Sort> sort) {
        this.sort = sort;
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

    public RelatedList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RelatedList.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accessLevelRequiredForCreate");
        sb.append('=');
        sb.append(((this.accessLevelRequiredForCreate == null)?"<null>":this.accessLevelRequiredForCreate));
        sb.append(',');
        sb.append("buttons");
        sb.append('=');
        sb.append(((this.buttons == null)?"<null>":this.buttons));
        sb.append(',');
        sb.append("columns");
        sb.append('=');
        sb.append(((this.columns == null)?"<null>":this.columns));
        sb.append(',');
        sb.append("custom");
        sb.append('=');
        sb.append(((this.custom == null)?"<null>":this.custom));
        sb.append(',');
        sb.append("field");
        sb.append('=');
        sb.append(((this.field == null)?"<null>":this.field));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("limitRows");
        sb.append('=');
        sb.append(((this.limitRows == null)?"<null>":this.limitRows));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("sobject");
        sb.append('=');
        sb.append(((this.sobject == null)?"<null>":this.sobject));
        sb.append(',');
        sb.append("sort");
        sb.append('=');
        sb.append(((this.sort == null)?"<null>":this.sort));
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
        result = ((result* 31)+((this.accessLevelRequiredForCreate == null)? 0 :this.accessLevelRequiredForCreate.hashCode()));
        result = ((result* 31)+((this.buttons == null)? 0 :this.buttons.hashCode()));
        result = ((result* 31)+((this.limitRows == null)? 0 :this.limitRows.hashCode()));
        result = ((result* 31)+((this.field == null)? 0 :this.field.hashCode()));
        result = ((result* 31)+((this.columns == null)? 0 :this.columns.hashCode()));
        result = ((result* 31)+((this.custom == null)? 0 :this.custom.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.sort == null)? 0 :this.sort.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sobject == null)? 0 :this.sobject.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RelatedList) == false) {
            return false;
        }
        RelatedList rhs = ((RelatedList) other);
        return ((((((((((((this.accessLevelRequiredForCreate == rhs.accessLevelRequiredForCreate)||((this.accessLevelRequiredForCreate!= null)&&this.accessLevelRequiredForCreate.equals(rhs.accessLevelRequiredForCreate)))&&((this.buttons == rhs.buttons)||((this.buttons!= null)&&this.buttons.equals(rhs.buttons))))&&((this.limitRows == rhs.limitRows)||((this.limitRows!= null)&&this.limitRows.equals(rhs.limitRows))))&&((this.field == rhs.field)||((this.field!= null)&&this.field.equals(rhs.field))))&&((this.columns == rhs.columns)||((this.columns!= null)&&this.columns.equals(rhs.columns))))&&((this.custom == rhs.custom)||((this.custom!= null)&&this.custom.equals(rhs.custom))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.sort == rhs.sort)||((this.sort!= null)&&this.sort.equals(rhs.sort))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sobject == rhs.sobject)||((this.sobject!= null)&&this.sobject.equals(rhs.sobject))));
    }

}
