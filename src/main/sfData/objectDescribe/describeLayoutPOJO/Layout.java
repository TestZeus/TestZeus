
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
    "buttonLayoutSection",
    "detailLayoutSections",
    "editLayoutSections",
    "feedView",
    "highlightsPanelLayoutSection",
    "id",
    "multirowEditLayoutSections",
    "offlineLinks",
    "quickActionList",
    "relatedContent",
    "relatedLists",
    "saveOptions"
})
public class Layout {

    @JsonProperty("buttonLayoutSection")
    private ButtonLayoutSection buttonLayoutSection;
    @JsonProperty("detailLayoutSections")
    private List<DetailLayoutSection> detailLayoutSections = new ArrayList<DetailLayoutSection>();
    @JsonProperty("editLayoutSections")
    private List<EditLayoutSection> editLayoutSections = new ArrayList<EditLayoutSection>();
    @JsonProperty("feedView")
    private Object feedView;
    @JsonProperty("highlightsPanelLayoutSection")
    private Object highlightsPanelLayoutSection;
    @JsonProperty("id")
    private String id;
    @JsonProperty("multirowEditLayoutSections")
    private List<Object> multirowEditLayoutSections = new ArrayList<Object>();
    @JsonProperty("offlineLinks")
    private List<Object> offlineLinks = new ArrayList<Object>();
    @JsonProperty("quickActionList")
    private QuickActionList quickActionList;
    @JsonProperty("relatedContent")
    private RelatedContent relatedContent;
    @JsonProperty("relatedLists")
    private List<RelatedList> relatedLists = new ArrayList<RelatedList>();
    @JsonProperty("saveOptions")
    private List<Object> saveOptions = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("buttonLayoutSection")
    public ButtonLayoutSection getButtonLayoutSection() {
        return buttonLayoutSection;
    }

    @JsonProperty("buttonLayoutSection")
    public void setButtonLayoutSection(ButtonLayoutSection buttonLayoutSection) {
        this.buttonLayoutSection = buttonLayoutSection;
    }

    public Layout withButtonLayoutSection(ButtonLayoutSection buttonLayoutSection) {
        this.buttonLayoutSection = buttonLayoutSection;
        return this;
    }

    @JsonProperty("detailLayoutSections")
    public List<DetailLayoutSection> getDetailLayoutSections() {
        return detailLayoutSections;
    }

    @JsonProperty("detailLayoutSections")
    public void setDetailLayoutSections(List<DetailLayoutSection> detailLayoutSections) {
        this.detailLayoutSections = detailLayoutSections;
    }

    public Layout withDetailLayoutSections(List<DetailLayoutSection> detailLayoutSections) {
        this.detailLayoutSections = detailLayoutSections;
        return this;
    }

    @JsonProperty("editLayoutSections")
    public List<EditLayoutSection> getEditLayoutSections() {
        return editLayoutSections;
    }

    @JsonProperty("editLayoutSections")
    public void setEditLayoutSections(List<EditLayoutSection> editLayoutSections) {
        this.editLayoutSections = editLayoutSections;
    }

    public Layout withEditLayoutSections(List<EditLayoutSection> editLayoutSections) {
        this.editLayoutSections = editLayoutSections;
        return this;
    }

    @JsonProperty("feedView")
    public Object getFeedView() {
        return feedView;
    }

    @JsonProperty("feedView")
    public void setFeedView(Object feedView) {
        this.feedView = feedView;
    }

    public Layout withFeedView(Object feedView) {
        this.feedView = feedView;
        return this;
    }

    @JsonProperty("highlightsPanelLayoutSection")
    public Object getHighlightsPanelLayoutSection() {
        return highlightsPanelLayoutSection;
    }

    @JsonProperty("highlightsPanelLayoutSection")
    public void setHighlightsPanelLayoutSection(Object highlightsPanelLayoutSection) {
        this.highlightsPanelLayoutSection = highlightsPanelLayoutSection;
    }

    public Layout withHighlightsPanelLayoutSection(Object highlightsPanelLayoutSection) {
        this.highlightsPanelLayoutSection = highlightsPanelLayoutSection;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Layout withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("multirowEditLayoutSections")
    public List<Object> getMultirowEditLayoutSections() {
        return multirowEditLayoutSections;
    }

    @JsonProperty("multirowEditLayoutSections")
    public void setMultirowEditLayoutSections(List<Object> multirowEditLayoutSections) {
        this.multirowEditLayoutSections = multirowEditLayoutSections;
    }

    public Layout withMultirowEditLayoutSections(List<Object> multirowEditLayoutSections) {
        this.multirowEditLayoutSections = multirowEditLayoutSections;
        return this;
    }

    @JsonProperty("offlineLinks")
    public List<Object> getOfflineLinks() {
        return offlineLinks;
    }

    @JsonProperty("offlineLinks")
    public void setOfflineLinks(List<Object> offlineLinks) {
        this.offlineLinks = offlineLinks;
    }

    public Layout withOfflineLinks(List<Object> offlineLinks) {
        this.offlineLinks = offlineLinks;
        return this;
    }

    @JsonProperty("quickActionList")
    public QuickActionList getQuickActionList() {
        return quickActionList;
    }

    @JsonProperty("quickActionList")
    public void setQuickActionList(QuickActionList quickActionList) {
        this.quickActionList = quickActionList;
    }

    public Layout withQuickActionList(QuickActionList quickActionList) {
        this.quickActionList = quickActionList;
        return this;
    }

    @JsonProperty("relatedContent")
    public RelatedContent getRelatedContent() {
        return relatedContent;
    }

    @JsonProperty("relatedContent")
    public void setRelatedContent(RelatedContent relatedContent) {
        this.relatedContent = relatedContent;
    }

    public Layout withRelatedContent(RelatedContent relatedContent) {
        this.relatedContent = relatedContent;
        return this;
    }

    @JsonProperty("relatedLists")
    public List<RelatedList> getRelatedLists() {
        return relatedLists;
    }

    @JsonProperty("relatedLists")
    public void setRelatedLists(List<RelatedList> relatedLists) {
        this.relatedLists = relatedLists;
    }

    public Layout withRelatedLists(List<RelatedList> relatedLists) {
        this.relatedLists = relatedLists;
        return this;
    }

    @JsonProperty("saveOptions")
    public List<Object> getSaveOptions() {
        return saveOptions;
    }

    @JsonProperty("saveOptions")
    public void setSaveOptions(List<Object> saveOptions) {
        this.saveOptions = saveOptions;
    }

    public Layout withSaveOptions(List<Object> saveOptions) {
        this.saveOptions = saveOptions;
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

    public Layout withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Layout.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("buttonLayoutSection");
        sb.append('=');
        sb.append(((this.buttonLayoutSection == null)?"<null>":this.buttonLayoutSection));
        sb.append(',');
        sb.append("detailLayoutSections");
        sb.append('=');
        sb.append(((this.detailLayoutSections == null)?"<null>":this.detailLayoutSections));
        sb.append(',');
        sb.append("editLayoutSections");
        sb.append('=');
        sb.append(((this.editLayoutSections == null)?"<null>":this.editLayoutSections));
        sb.append(',');
        sb.append("feedView");
        sb.append('=');
        sb.append(((this.feedView == null)?"<null>":this.feedView));
        sb.append(',');
        sb.append("highlightsPanelLayoutSection");
        sb.append('=');
        sb.append(((this.highlightsPanelLayoutSection == null)?"<null>":this.highlightsPanelLayoutSection));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("multirowEditLayoutSections");
        sb.append('=');
        sb.append(((this.multirowEditLayoutSections == null)?"<null>":this.multirowEditLayoutSections));
        sb.append(',');
        sb.append("offlineLinks");
        sb.append('=');
        sb.append(((this.offlineLinks == null)?"<null>":this.offlineLinks));
        sb.append(',');
        sb.append("quickActionList");
        sb.append('=');
        sb.append(((this.quickActionList == null)?"<null>":this.quickActionList));
        sb.append(',');
        sb.append("relatedContent");
        sb.append('=');
        sb.append(((this.relatedContent == null)?"<null>":this.relatedContent));
        sb.append(',');
        sb.append("relatedLists");
        sb.append('=');
        sb.append(((this.relatedLists == null)?"<null>":this.relatedLists));
        sb.append(',');
        sb.append("saveOptions");
        sb.append('=');
        sb.append(((this.saveOptions == null)?"<null>":this.saveOptions));
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
        result = ((result* 31)+((this.relatedLists == null)? 0 :this.relatedLists.hashCode()));
        result = ((result* 31)+((this.buttonLayoutSection == null)? 0 :this.buttonLayoutSection.hashCode()));
        result = ((result* 31)+((this.quickActionList == null)? 0 :this.quickActionList.hashCode()));
        result = ((result* 31)+((this.multirowEditLayoutSections == null)? 0 :this.multirowEditLayoutSections.hashCode()));
        result = ((result* 31)+((this.saveOptions == null)? 0 :this.saveOptions.hashCode()));
        result = ((result* 31)+((this.detailLayoutSections == null)? 0 :this.detailLayoutSections.hashCode()));
        result = ((result* 31)+((this.feedView == null)? 0 :this.feedView.hashCode()));
        result = ((result* 31)+((this.relatedContent == null)? 0 :this.relatedContent.hashCode()));
        result = ((result* 31)+((this.editLayoutSections == null)? 0 :this.editLayoutSections.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.offlineLinks == null)? 0 :this.offlineLinks.hashCode()));
        result = ((result* 31)+((this.highlightsPanelLayoutSection == null)? 0 :this.highlightsPanelLayoutSection.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Layout) == false) {
            return false;
        }
        Layout rhs = ((Layout) other);
        return ((((((((((((((this.relatedLists == rhs.relatedLists)||((this.relatedLists!= null)&&this.relatedLists.equals(rhs.relatedLists)))&&((this.buttonLayoutSection == rhs.buttonLayoutSection)||((this.buttonLayoutSection!= null)&&this.buttonLayoutSection.equals(rhs.buttonLayoutSection))))&&((this.quickActionList == rhs.quickActionList)||((this.quickActionList!= null)&&this.quickActionList.equals(rhs.quickActionList))))&&((this.multirowEditLayoutSections == rhs.multirowEditLayoutSections)||((this.multirowEditLayoutSections!= null)&&this.multirowEditLayoutSections.equals(rhs.multirowEditLayoutSections))))&&((this.saveOptions == rhs.saveOptions)||((this.saveOptions!= null)&&this.saveOptions.equals(rhs.saveOptions))))&&((this.detailLayoutSections == rhs.detailLayoutSections)||((this.detailLayoutSections!= null)&&this.detailLayoutSections.equals(rhs.detailLayoutSections))))&&((this.feedView == rhs.feedView)||((this.feedView!= null)&&this.feedView.equals(rhs.feedView))))&&((this.relatedContent == rhs.relatedContent)||((this.relatedContent!= null)&&this.relatedContent.equals(rhs.relatedContent))))&&((this.editLayoutSections == rhs.editLayoutSections)||((this.editLayoutSections!= null)&&this.editLayoutSections.equals(rhs.editLayoutSections))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.offlineLinks == rhs.offlineLinks)||((this.offlineLinks!= null)&&this.offlineLinks.equals(rhs.offlineLinks))))&&((this.highlightsPanelLayoutSection == rhs.highlightsPanelLayoutSection)||((this.highlightsPanelLayoutSection!= null)&&this.highlightsPanelLayoutSection.equals(rhs.highlightsPanelLayoutSection))));
    }

}
