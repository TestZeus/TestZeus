
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
    "active",
    "available",
    "defaultRecordTypeMapping",
    "developerName",
    "layoutId",
    "master",
    "name",
    "picklistsForRecordType",
    "recordTypeId",
    "urls"
})
public class RecordTypeMapping {

    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("available")
    private Boolean available;
    @JsonProperty("defaultRecordTypeMapping")
    private Boolean defaultRecordTypeMapping;
    @JsonProperty("developerName")
    private String developerName;
    @JsonProperty("layoutId")
    private String layoutId;
    @JsonProperty("master")
    private Boolean master;
    @JsonProperty("name")
    private String name;
    @JsonProperty("picklistsForRecordType")
    private List<Object> picklistsForRecordType = new ArrayList<Object>();
    @JsonProperty("recordTypeId")
    private String recordTypeId;
    @JsonProperty("urls")
    private Urls__1 urls;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    public RecordTypeMapping withActive(Boolean active) {
        this.active = active;
        return this;
    }

    @JsonProperty("available")
    public Boolean getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public RecordTypeMapping withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    @JsonProperty("defaultRecordTypeMapping")
    public Boolean getDefaultRecordTypeMapping() {
        return defaultRecordTypeMapping;
    }

    @JsonProperty("defaultRecordTypeMapping")
    public void setDefaultRecordTypeMapping(Boolean defaultRecordTypeMapping) {
        this.defaultRecordTypeMapping = defaultRecordTypeMapping;
    }

    public RecordTypeMapping withDefaultRecordTypeMapping(Boolean defaultRecordTypeMapping) {
        this.defaultRecordTypeMapping = defaultRecordTypeMapping;
        return this;
    }

    @JsonProperty("developerName")
    public String getDeveloperName() {
        return developerName;
    }

    @JsonProperty("developerName")
    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public RecordTypeMapping withDeveloperName(String developerName) {
        this.developerName = developerName;
        return this;
    }

    @JsonProperty("layoutId")
    public String getLayoutId() {
        return layoutId;
    }

    @JsonProperty("layoutId")
    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    public RecordTypeMapping withLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }

    @JsonProperty("master")
    public Boolean getMaster() {
        return master;
    }

    @JsonProperty("master")
    public void setMaster(Boolean master) {
        this.master = master;
    }

    public RecordTypeMapping withMaster(Boolean master) {
        this.master = master;
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

    public RecordTypeMapping withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("picklistsForRecordType")
    public List<Object> getPicklistsForRecordType() {
        return picklistsForRecordType;
    }

    @JsonProperty("picklistsForRecordType")
    public void setPicklistsForRecordType(List<Object> picklistsForRecordType) {
        this.picklistsForRecordType = picklistsForRecordType;
    }

    public RecordTypeMapping withPicklistsForRecordType(List<Object> picklistsForRecordType) {
        this.picklistsForRecordType = picklistsForRecordType;
        return this;
    }

    @JsonProperty("recordTypeId")
    public String getRecordTypeId() {
        return recordTypeId;
    }

    @JsonProperty("recordTypeId")
    public void setRecordTypeId(String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }

    public RecordTypeMapping withRecordTypeId(String recordTypeId) {
        this.recordTypeId = recordTypeId;
        return this;
    }

    @JsonProperty("urls")
    public Urls__1 getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(Urls__1 urls) {
        this.urls = urls;
    }

    public RecordTypeMapping withUrls(Urls__1 urls) {
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

    public RecordTypeMapping withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RecordTypeMapping.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("available");
        sb.append('=');
        sb.append(((this.available == null)?"<null>":this.available));
        sb.append(',');
        sb.append("defaultRecordTypeMapping");
        sb.append('=');
        sb.append(((this.defaultRecordTypeMapping == null)?"<null>":this.defaultRecordTypeMapping));
        sb.append(',');
        sb.append("developerName");
        sb.append('=');
        sb.append(((this.developerName == null)?"<null>":this.developerName));
        sb.append(',');
        sb.append("layoutId");
        sb.append('=');
        sb.append(((this.layoutId == null)?"<null>":this.layoutId));
        sb.append(',');
        sb.append("master");
        sb.append('=');
        sb.append(((this.master == null)?"<null>":this.master));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("picklistsForRecordType");
        sb.append('=');
        sb.append(((this.picklistsForRecordType == null)?"<null>":this.picklistsForRecordType));
        sb.append(',');
        sb.append("recordTypeId");
        sb.append('=');
        sb.append(((this.recordTypeId == null)?"<null>":this.recordTypeId));
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
        result = ((result* 31)+((this.defaultRecordTypeMapping == null)? 0 :this.defaultRecordTypeMapping.hashCode()));
        result = ((result* 31)+((this.urls == null)? 0 :this.urls.hashCode()));
        result = ((result* 31)+((this.recordTypeId == null)? 0 :this.recordTypeId.hashCode()));
        result = ((result* 31)+((this.available == null)? 0 :this.available.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.picklistsForRecordType == null)? 0 :this.picklistsForRecordType.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.developerName == null)? 0 :this.developerName.hashCode()));
        result = ((result* 31)+((this.layoutId == null)? 0 :this.layoutId.hashCode()));
        result = ((result* 31)+((this.master == null)? 0 :this.master.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecordTypeMapping) == false) {
            return false;
        }
        RecordTypeMapping rhs = ((RecordTypeMapping) other);
        return ((((((((((((this.defaultRecordTypeMapping == rhs.defaultRecordTypeMapping)||((this.defaultRecordTypeMapping!= null)&&this.defaultRecordTypeMapping.equals(rhs.defaultRecordTypeMapping)))&&((this.urls == rhs.urls)||((this.urls!= null)&&this.urls.equals(rhs.urls))))&&((this.recordTypeId == rhs.recordTypeId)||((this.recordTypeId!= null)&&this.recordTypeId.equals(rhs.recordTypeId))))&&((this.available == rhs.available)||((this.available!= null)&&this.available.equals(rhs.available))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.picklistsForRecordType == rhs.picklistsForRecordType)||((this.picklistsForRecordType!= null)&&this.picklistsForRecordType.equals(rhs.picklistsForRecordType))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.developerName == rhs.developerName)||((this.developerName!= null)&&this.developerName.equals(rhs.developerName))))&&((this.layoutId == rhs.layoutId)||((this.layoutId!= null)&&this.layoutId.equals(rhs.layoutId))))&&((this.master == rhs.master)||((this.master!= null)&&this.master.equals(rhs.master))));
    }

}
