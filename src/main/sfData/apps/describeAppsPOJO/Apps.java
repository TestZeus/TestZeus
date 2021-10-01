
package sft.sfData.apps.describeAppsPOJO;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apps",
    "eTag"
})
public class Apps {

    @JsonProperty("apps")
    private List<App> apps = null;
    @JsonProperty("eTag")
    private String eTag;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("apps")
    public List<App> getApps() {
        return apps;
    }

    @JsonProperty("apps")
    public void setApps(List<App> apps) {
        this.apps = apps;
    }

    @JsonProperty("eTag")
    public String getETag() {
        return eTag;
    }

    @JsonProperty("eTag")
    public void setETag(String eTag) {
        this.eTag = eTag;
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
