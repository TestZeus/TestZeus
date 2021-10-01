package sft.forceObject;

import sft.sfData.objectDescribe.describeLayoutPOJO.Details;

public class SFField
{
	public void setLabel(String label) {
		this.label = label;
	}
	public void setIsCompound(Boolean isCompound) {
		this.isCompound = isCompound;
	}
	public void setInFieldSet(String inFieldSet) {
		this.inFieldSet = inFieldSet;
	}
	public void setIsInCollapsed(Boolean isInCollapsed) {
		this.isInCollapsed = isInCollapsed;
	}
	public void setIsInuseCollapsibleSection(Boolean isInuseCollapsibleSection) {
		this.isInuseCollapsibleSection = isInuseCollapsibleSection;
	}
	public void setEditableForNew(Boolean editableForNew) {
		this.editableForNew = editableForNew;
	}
	public void setEditableForUpdate(Boolean editableForUpdate) {
		this.editableForUpdate = editableForUpdate;
	}
	public void setPlaceholder(Boolean placeholder) {
		this.placeholder = placeholder;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}
	public void setDetails(Details details) {
		this.details = details;
	}

	public String getLabel() {
		return label;
	}
	public Boolean getIsCompound() {
		return isCompound;
	}
	public String getInFieldSet() {
		return inFieldSet;
	}
	public Boolean getIsInCollapsed() {
		return isInCollapsed;
	}
	public Boolean getIsInuseCollapsibleSection() {
		return isInuseCollapsibleSection;
	}
	public Boolean getEditableForNew() {
		return editableForNew;
	}
	public Boolean getEditableForUpdate() {
		return editableForUpdate;
	}
	public Boolean getPlaceholder() {
		return placeholder;
	}
	public Boolean getRequired() {
		return required;
	}
	public Details getDetails() {
		return details;
	}

	public void setFieldsData(String inFieldSet, String label, Boolean editableForNew, Boolean editableForUpdate,Boolean placeholder,
			Boolean required, Boolean isInuseCollapsibleSection, Boolean isInCollapsed, Boolean isCompound, Details details)
	{
		this.inFieldSet = inFieldSet;
		this.label = label;
		this.editableForNew = editableForNew;
		this.editableForUpdate = editableForUpdate;
		this.placeholder = placeholder;
		this.required = required;
		this.isInuseCollapsibleSection = isInuseCollapsibleSection;
		this.isInCollapsed = isInCollapsed;
		this.isCompound = isCompound;
		this.details = details;
	}

	private String inFieldSet=null;
	private String label=null;
	private Boolean isCompound=false;
	private Boolean isInCollapsed=false;
	private Boolean isInuseCollapsibleSection=false;
	private Boolean editableForNew=false;
	private Boolean editableForUpdate=false;
	private Boolean placeholder=false;
	private Boolean required=false;
	private Details details=null;

}
