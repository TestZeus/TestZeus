
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
    "collapsed",
    "columns",
    "heading",
    "layoutRows",
    "layoutSectionId",
    "parentLayoutId",
    "rows",
    "tabOrder",
    "useCollapsibleSection",
    "useHeading"
})
public class DetailLayoutSection {

    @JsonProperty("collapsed")
    private Boolean collapsed;
    @JsonProperty("columns")
    private Integer columns;
    @JsonProperty("heading")
    private String heading;
    @JsonProperty("layoutRows")
    private List<LayoutRow> layoutRows = new ArrayList<LayoutRow>();
    @JsonProperty("layoutSectionId")
    private String layoutSectionId;
    @JsonProperty("parentLayoutId")
    private String parentLayoutId;
    @JsonProperty("rows")
    private Integer rows;
    @JsonProperty("tabOrder")
    private String tabOrder;
    @JsonProperty("useCollapsibleSection")
    private Boolean useCollapsibleSection;
    @JsonProperty("useHeading")
    private Boolean useHeading;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("collapsed")
    public Boolean getCollapsed() {
        return collapsed;
    }

    @JsonProperty("collapsed")
    public void setCollapsed(Boolean collapsed) {
        this.collapsed = collapsed;
    }

    public DetailLayoutSection withCollapsed(Boolean collapsed) {
        this.collapsed = collapsed;
        return this;
    }

    @JsonProperty("columns")
    public Integer getColumns() {
        return columns;
    }

    @JsonProperty("columns")
    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public DetailLayoutSection withColumns(Integer columns) {
        this.columns = columns;
        return this;
    }

    @JsonProperty("heading")
    public String getHeading() {
        return heading;
    }

    @JsonProperty("heading")
    public void setHeading(String heading) {
        this.heading = heading;
    }

    public DetailLayoutSection withHeading(String heading) {
        this.heading = heading;
        return this;
    }

    @JsonProperty("layoutRows")
    public List<LayoutRow> getLayoutRows() {
        return layoutRows;
    }

    @JsonProperty("layoutRows")
    public void setLayoutRows(List<LayoutRow> layoutRows) {
        this.layoutRows = layoutRows;
    }

    public DetailLayoutSection withLayoutRows(List<LayoutRow> layoutRows) {
        this.layoutRows = layoutRows;
        return this;
    }

    @JsonProperty("layoutSectionId")
    public String getLayoutSectionId() {
        return layoutSectionId;
    }

    @JsonProperty("layoutSectionId")
    public void setLayoutSectionId(String layoutSectionId) {
        this.layoutSectionId = layoutSectionId;
    }

    public DetailLayoutSection withLayoutSectionId(String layoutSectionId) {
        this.layoutSectionId = layoutSectionId;
        return this;
    }

    @JsonProperty("parentLayoutId")
    public String getParentLayoutId() {
        return parentLayoutId;
    }

    @JsonProperty("parentLayoutId")
    public void setParentLayoutId(String parentLayoutId) {
        this.parentLayoutId = parentLayoutId;
    }

    public DetailLayoutSection withParentLayoutId(String parentLayoutId) {
        this.parentLayoutId = parentLayoutId;
        return this;
    }

    @JsonProperty("rows")
    public Integer getRows() {
        return rows;
    }

    @JsonProperty("rows")
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public DetailLayoutSection withRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    @JsonProperty("tabOrder")
    public String getTabOrder() {
        return tabOrder;
    }

    @JsonProperty("tabOrder")
    public void setTabOrder(String tabOrder) {
        this.tabOrder = tabOrder;
    }

    public DetailLayoutSection withTabOrder(String tabOrder) {
        this.tabOrder = tabOrder;
        return this;
    }

    @JsonProperty("useCollapsibleSection")
    public Boolean getUseCollapsibleSection() {
        return useCollapsibleSection;
    }

    @JsonProperty("useCollapsibleSection")
    public void setUseCollapsibleSection(Boolean useCollapsibleSection) {
        this.useCollapsibleSection = useCollapsibleSection;
    }

    public DetailLayoutSection withUseCollapsibleSection(Boolean useCollapsibleSection) {
        this.useCollapsibleSection = useCollapsibleSection;
        return this;
    }

    @JsonProperty("useHeading")
    public Boolean getUseHeading() {
        return useHeading;
    }

    @JsonProperty("useHeading")
    public void setUseHeading(Boolean useHeading) {
        this.useHeading = useHeading;
    }

    public DetailLayoutSection withUseHeading(Boolean useHeading) {
        this.useHeading = useHeading;
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

    public DetailLayoutSection withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DetailLayoutSection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("collapsed");
        sb.append('=');
        sb.append(((this.collapsed == null)?"<null>":this.collapsed));
        sb.append(',');
        sb.append("columns");
        sb.append('=');
        sb.append(((this.columns == null)?"<null>":this.columns));
        sb.append(',');
        sb.append("heading");
        sb.append('=');
        sb.append(((this.heading == null)?"<null>":this.heading));
        sb.append(',');
        sb.append("layoutRows");
        sb.append('=');
        sb.append(((this.layoutRows == null)?"<null>":this.layoutRows));
        sb.append(',');
        sb.append("layoutSectionId");
        sb.append('=');
        sb.append(((this.layoutSectionId == null)?"<null>":this.layoutSectionId));
        sb.append(',');
        sb.append("parentLayoutId");
        sb.append('=');
        sb.append(((this.parentLayoutId == null)?"<null>":this.parentLayoutId));
        sb.append(',');
        sb.append("rows");
        sb.append('=');
        sb.append(((this.rows == null)?"<null>":this.rows));
        sb.append(',');
        sb.append("tabOrder");
        sb.append('=');
        sb.append(((this.tabOrder == null)?"<null>":this.tabOrder));
        sb.append(',');
        sb.append("useCollapsibleSection");
        sb.append('=');
        sb.append(((this.useCollapsibleSection == null)?"<null>":this.useCollapsibleSection));
        sb.append(',');
        sb.append("useHeading");
        sb.append('=');
        sb.append(((this.useHeading == null)?"<null>":this.useHeading));
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
        result = ((result* 31)+((this.heading == null)? 0 :this.heading.hashCode()));
        result = ((result* 31)+((this.collapsed == null)? 0 :this.collapsed.hashCode()));
        result = ((result* 31)+((this.columns == null)? 0 :this.columns.hashCode()));
        result = ((result* 31)+((this.parentLayoutId == null)? 0 :this.parentLayoutId.hashCode()));
        result = ((result* 31)+((this.tabOrder == null)? 0 :this.tabOrder.hashCode()));
        result = ((result* 31)+((this.useCollapsibleSection == null)? 0 :this.useCollapsibleSection.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rows == null)? 0 :this.rows.hashCode()));
        result = ((result* 31)+((this.useHeading == null)? 0 :this.useHeading.hashCode()));
        result = ((result* 31)+((this.layoutRows == null)? 0 :this.layoutRows.hashCode()));
        result = ((result* 31)+((this.layoutSectionId == null)? 0 :this.layoutSectionId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetailLayoutSection) == false) {
            return false;
        }
        DetailLayoutSection rhs = ((DetailLayoutSection) other);
        return ((((((((((((this.heading == rhs.heading)||((this.heading!= null)&&this.heading.equals(rhs.heading)))&&((this.collapsed == rhs.collapsed)||((this.collapsed!= null)&&this.collapsed.equals(rhs.collapsed))))&&((this.columns == rhs.columns)||((this.columns!= null)&&this.columns.equals(rhs.columns))))&&((this.parentLayoutId == rhs.parentLayoutId)||((this.parentLayoutId!= null)&&this.parentLayoutId.equals(rhs.parentLayoutId))))&&((this.tabOrder == rhs.tabOrder)||((this.tabOrder!= null)&&this.tabOrder.equals(rhs.tabOrder))))&&((this.useCollapsibleSection == rhs.useCollapsibleSection)||((this.useCollapsibleSection!= null)&&this.useCollapsibleSection.equals(rhs.useCollapsibleSection))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rows == rhs.rows)||((this.rows!= null)&&this.rows.equals(rhs.rows))))&&((this.useHeading == rhs.useHeading)||((this.useHeading!= null)&&this.useHeading.equals(rhs.useHeading))))&&((this.layoutRows == rhs.layoutRows)||((this.layoutRows!= null)&&this.layoutRows.equals(rhs.layoutRows))))&&((this.layoutSectionId == rhs.layoutSectionId)||((this.layoutSectionId!= null)&&this.layoutSectionId.equals(rhs.layoutSectionId))));
    }

}
