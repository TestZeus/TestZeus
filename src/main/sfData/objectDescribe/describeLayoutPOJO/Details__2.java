
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
    "aggregatable",
    "aiPredictionField",
    "autoNumber",
    "byteLength",
    "calculated",
    "calculatedFormula",
    "cascadeDelete",
    "caseSensitive",
    "compoundFieldName",
    "controllerName",
    "createable",
    "custom",
    "defaultValue",
    "defaultValueFormula",
    "defaultedOnCreate",
    "dependentPicklist",
    "deprecatedAndHidden",
    "digits",
    "displayLocationInDecimal",
    "encrypted",
    "externalId",
    "extraTypeInfo",
    "filterable",
    "filteredLookupInfo",
    "formulaTreatNullNumberAsZero",
    "groupable",
    "highScaleNumber",
    "htmlFormatted",
    "idLookup",
    "inlineHelpText",
    "label",
    "length",
    "mask",
    "maskType",
    "name",
    "nameField",
    "namePointing",
    "nillable",
    "permissionable",
    "picklistValues",
    "polymorphicForeignKey",
    "precision",
    "queryByDistance",
    "referenceTargetField",
    "referenceTo",
    "relationshipName",
    "relationshipOrder",
    "restrictedDelete",
    "restrictedPicklist",
    "scale",
    "searchPrefilterable",
    "soapType",
    "sortable",
    "type",
    "unique",
    "updateable",
    "writeRequiresMasterRead"
})
public class Details__2 {

    @JsonProperty("aggregatable")
    private Boolean aggregatable;
    @JsonProperty("aiPredictionField")
    private Boolean aiPredictionField;
    @JsonProperty("autoNumber")
    private Boolean autoNumber;
    @JsonProperty("byteLength")
    private Integer byteLength;
    @JsonProperty("calculated")
    private Boolean calculated;
    @JsonProperty("calculatedFormula")
    private Object calculatedFormula;
    @JsonProperty("cascadeDelete")
    private Boolean cascadeDelete;
    @JsonProperty("caseSensitive")
    private Boolean caseSensitive;
    @JsonProperty("compoundFieldName")
    private Object compoundFieldName;
    @JsonProperty("controllerName")
    private Object controllerName;
    @JsonProperty("createable")
    private Boolean createable;
    @JsonProperty("custom")
    private Boolean custom;
    @JsonProperty("defaultValue")
    private Object defaultValue;
    @JsonProperty("defaultValueFormula")
    private Object defaultValueFormula;
    @JsonProperty("defaultedOnCreate")
    private Boolean defaultedOnCreate;
    @JsonProperty("dependentPicklist")
    private Boolean dependentPicklist;
    @JsonProperty("deprecatedAndHidden")
    private Boolean deprecatedAndHidden;
    @JsonProperty("digits")
    private Integer digits;
    @JsonProperty("displayLocationInDecimal")
    private Boolean displayLocationInDecimal;
    @JsonProperty("encrypted")
    private Boolean encrypted;
    @JsonProperty("externalId")
    private Boolean externalId;
    @JsonProperty("extraTypeInfo")
    private String extraTypeInfo;
    @JsonProperty("filterable")
    private Boolean filterable;
    @JsonProperty("filteredLookupInfo")
    private Object filteredLookupInfo;
    @JsonProperty("formulaTreatNullNumberAsZero")
    private Boolean formulaTreatNullNumberAsZero;
    @JsonProperty("groupable")
    private Boolean groupable;
    @JsonProperty("highScaleNumber")
    private Boolean highScaleNumber;
    @JsonProperty("htmlFormatted")
    private Boolean htmlFormatted;
    @JsonProperty("idLookup")
    private Boolean idLookup;
    @JsonProperty("inlineHelpText")
    private Object inlineHelpText;
    @JsonProperty("label")
    private String label;
    @JsonProperty("length")
    private Integer length;
    @JsonProperty("mask")
    private Object mask;
    @JsonProperty("maskType")
    private Object maskType;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nameField")
    private Boolean nameField;
    @JsonProperty("namePointing")
    private Boolean namePointing;
    @JsonProperty("nillable")
    private Boolean nillable;
    @JsonProperty("permissionable")
    private Boolean permissionable;
    @JsonProperty("picklistValues")
    private List<PicklistValue__2> picklistValues = new ArrayList<PicklistValue__2>();
    @JsonProperty("polymorphicForeignKey")
    private Boolean polymorphicForeignKey;
    @JsonProperty("precision")
    private Integer precision;
    @JsonProperty("queryByDistance")
    private Boolean queryByDistance;
    @JsonProperty("referenceTargetField")
    private Object referenceTargetField;
    @JsonProperty("referenceTo")
    private List<String> referenceTo = new ArrayList<String>();
    @JsonProperty("relationshipName")
    private Object relationshipName;
    @JsonProperty("relationshipOrder")
    private Object relationshipOrder;
    @JsonProperty("restrictedDelete")
    private Boolean restrictedDelete;
    @JsonProperty("restrictedPicklist")
    private Boolean restrictedPicklist;
    @JsonProperty("scale")
    private Integer scale;
    @JsonProperty("searchPrefilterable")
    private Boolean searchPrefilterable;
    @JsonProperty("soapType")
    private String soapType;
    @JsonProperty("sortable")
    private Boolean sortable;
    @JsonProperty("type")
    private String type;
    @JsonProperty("unique")
    private Boolean unique;
    @JsonProperty("updateable")
    private Boolean updateable;
    @JsonProperty("writeRequiresMasterRead")
    private Boolean writeRequiresMasterRead;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("aggregatable")
    public Boolean getAggregatable() {
        return aggregatable;
    }

    @JsonProperty("aggregatable")
    public void setAggregatable(Boolean aggregatable) {
        this.aggregatable = aggregatable;
    }

    public Details__2 withAggregatable(Boolean aggregatable) {
        this.aggregatable = aggregatable;
        return this;
    }

    @JsonProperty("aiPredictionField")
    public Boolean getAiPredictionField() {
        return aiPredictionField;
    }

    @JsonProperty("aiPredictionField")
    public void setAiPredictionField(Boolean aiPredictionField) {
        this.aiPredictionField = aiPredictionField;
    }

    public Details__2 withAiPredictionField(Boolean aiPredictionField) {
        this.aiPredictionField = aiPredictionField;
        return this;
    }

    @JsonProperty("autoNumber")
    public Boolean getAutoNumber() {
        return autoNumber;
    }

    @JsonProperty("autoNumber")
    public void setAutoNumber(Boolean autoNumber) {
        this.autoNumber = autoNumber;
    }

    public Details__2 withAutoNumber(Boolean autoNumber) {
        this.autoNumber = autoNumber;
        return this;
    }

    @JsonProperty("byteLength")
    public Integer getByteLength() {
        return byteLength;
    }

    @JsonProperty("byteLength")
    public void setByteLength(Integer byteLength) {
        this.byteLength = byteLength;
    }

    public Details__2 withByteLength(Integer byteLength) {
        this.byteLength = byteLength;
        return this;
    }

    @JsonProperty("calculated")
    public Boolean getCalculated() {
        return calculated;
    }

    @JsonProperty("calculated")
    public void setCalculated(Boolean calculated) {
        this.calculated = calculated;
    }

    public Details__2 withCalculated(Boolean calculated) {
        this.calculated = calculated;
        return this;
    }

    @JsonProperty("calculatedFormula")
    public Object getCalculatedFormula() {
        return calculatedFormula;
    }

    @JsonProperty("calculatedFormula")
    public void setCalculatedFormula(Object calculatedFormula) {
        this.calculatedFormula = calculatedFormula;
    }

    public Details__2 withCalculatedFormula(Object calculatedFormula) {
        this.calculatedFormula = calculatedFormula;
        return this;
    }

    @JsonProperty("cascadeDelete")
    public Boolean getCascadeDelete() {
        return cascadeDelete;
    }

    @JsonProperty("cascadeDelete")
    public void setCascadeDelete(Boolean cascadeDelete) {
        this.cascadeDelete = cascadeDelete;
    }

    public Details__2 withCascadeDelete(Boolean cascadeDelete) {
        this.cascadeDelete = cascadeDelete;
        return this;
    }

    @JsonProperty("caseSensitive")
    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    @JsonProperty("caseSensitive")
    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    public Details__2 withCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    @JsonProperty("compoundFieldName")
    public Object getCompoundFieldName() {
        return compoundFieldName;
    }

    @JsonProperty("compoundFieldName")
    public void setCompoundFieldName(Object compoundFieldName) {
        this.compoundFieldName = compoundFieldName;
    }

    public Details__2 withCompoundFieldName(Object compoundFieldName) {
        this.compoundFieldName = compoundFieldName;
        return this;
    }

    @JsonProperty("controllerName")
    public Object getControllerName() {
        return controllerName;
    }

    @JsonProperty("controllerName")
    public void setControllerName(Object controllerName) {
        this.controllerName = controllerName;
    }

    public Details__2 withControllerName(Object controllerName) {
        this.controllerName = controllerName;
        return this;
    }

    @JsonProperty("createable")
    public Boolean getCreateable() {
        return createable;
    }

    @JsonProperty("createable")
    public void setCreateable(Boolean createable) {
        this.createable = createable;
    }

    public Details__2 withCreateable(Boolean createable) {
        this.createable = createable;
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

    public Details__2 withCustom(Boolean custom) {
        this.custom = custom;
        return this;
    }

    @JsonProperty("defaultValue")
    public Object getDefaultValue() {
        return defaultValue;
    }

    @JsonProperty("defaultValue")
    public void setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Details__2 withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    @JsonProperty("defaultValueFormula")
    public Object getDefaultValueFormula() {
        return defaultValueFormula;
    }

    @JsonProperty("defaultValueFormula")
    public void setDefaultValueFormula(Object defaultValueFormula) {
        this.defaultValueFormula = defaultValueFormula;
    }

    public Details__2 withDefaultValueFormula(Object defaultValueFormula) {
        this.defaultValueFormula = defaultValueFormula;
        return this;
    }

    @JsonProperty("defaultedOnCreate")
    public Boolean getDefaultedOnCreate() {
        return defaultedOnCreate;
    }

    @JsonProperty("defaultedOnCreate")
    public void setDefaultedOnCreate(Boolean defaultedOnCreate) {
        this.defaultedOnCreate = defaultedOnCreate;
    }

    public Details__2 withDefaultedOnCreate(Boolean defaultedOnCreate) {
        this.defaultedOnCreate = defaultedOnCreate;
        return this;
    }

    @JsonProperty("dependentPicklist")
    public Boolean getDependentPicklist() {
        return dependentPicklist;
    }

    @JsonProperty("dependentPicklist")
    public void setDependentPicklist(Boolean dependentPicklist) {
        this.dependentPicklist = dependentPicklist;
    }

    public Details__2 withDependentPicklist(Boolean dependentPicklist) {
        this.dependentPicklist = dependentPicklist;
        return this;
    }

    @JsonProperty("deprecatedAndHidden")
    public Boolean getDeprecatedAndHidden() {
        return deprecatedAndHidden;
    }

    @JsonProperty("deprecatedAndHidden")
    public void setDeprecatedAndHidden(Boolean deprecatedAndHidden) {
        this.deprecatedAndHidden = deprecatedAndHidden;
    }

    public Details__2 withDeprecatedAndHidden(Boolean deprecatedAndHidden) {
        this.deprecatedAndHidden = deprecatedAndHidden;
        return this;
    }

    @JsonProperty("digits")
    public Integer getDigits() {
        return digits;
    }

    @JsonProperty("digits")
    public void setDigits(Integer digits) {
        this.digits = digits;
    }

    public Details__2 withDigits(Integer digits) {
        this.digits = digits;
        return this;
    }

    @JsonProperty("displayLocationInDecimal")
    public Boolean getDisplayLocationInDecimal() {
        return displayLocationInDecimal;
    }

    @JsonProperty("displayLocationInDecimal")
    public void setDisplayLocationInDecimal(Boolean displayLocationInDecimal) {
        this.displayLocationInDecimal = displayLocationInDecimal;
    }

    public Details__2 withDisplayLocationInDecimal(Boolean displayLocationInDecimal) {
        this.displayLocationInDecimal = displayLocationInDecimal;
        return this;
    }

    @JsonProperty("encrypted")
    public Boolean getEncrypted() {
        return encrypted;
    }

    @JsonProperty("encrypted")
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Details__2 withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    @JsonProperty("externalId")
    public Boolean getExternalId() {
        return externalId;
    }

    @JsonProperty("externalId")
    public void setExternalId(Boolean externalId) {
        this.externalId = externalId;
    }

    public Details__2 withExternalId(Boolean externalId) {
        this.externalId = externalId;
        return this;
    }

    @JsonProperty("extraTypeInfo")
    public String getExtraTypeInfo() {
        return extraTypeInfo;
    }

    @JsonProperty("extraTypeInfo")
    public void setExtraTypeInfo(String extraTypeInfo) {
        this.extraTypeInfo = extraTypeInfo;
    }

    public Details__2 withExtraTypeInfo(String extraTypeInfo) {
        this.extraTypeInfo = extraTypeInfo;
        return this;
    }

    @JsonProperty("filterable")
    public Boolean getFilterable() {
        return filterable;
    }

    @JsonProperty("filterable")
    public void setFilterable(Boolean filterable) {
        this.filterable = filterable;
    }

    public Details__2 withFilterable(Boolean filterable) {
        this.filterable = filterable;
        return this;
    }

    @JsonProperty("filteredLookupInfo")
    public Object getFilteredLookupInfo() {
        return filteredLookupInfo;
    }

    @JsonProperty("filteredLookupInfo")
    public void setFilteredLookupInfo(Object filteredLookupInfo) {
        this.filteredLookupInfo = filteredLookupInfo;
    }

    public Details__2 withFilteredLookupInfo(Object filteredLookupInfo) {
        this.filteredLookupInfo = filteredLookupInfo;
        return this;
    }

    @JsonProperty("formulaTreatNullNumberAsZero")
    public Boolean getFormulaTreatNullNumberAsZero() {
        return formulaTreatNullNumberAsZero;
    }

    @JsonProperty("formulaTreatNullNumberAsZero")
    public void setFormulaTreatNullNumberAsZero(Boolean formulaTreatNullNumberAsZero) {
        this.formulaTreatNullNumberAsZero = formulaTreatNullNumberAsZero;
    }

    public Details__2 withFormulaTreatNullNumberAsZero(Boolean formulaTreatNullNumberAsZero) {
        this.formulaTreatNullNumberAsZero = formulaTreatNullNumberAsZero;
        return this;
    }

    @JsonProperty("groupable")
    public Boolean getGroupable() {
        return groupable;
    }

    @JsonProperty("groupable")
    public void setGroupable(Boolean groupable) {
        this.groupable = groupable;
    }

    public Details__2 withGroupable(Boolean groupable) {
        this.groupable = groupable;
        return this;
    }

    @JsonProperty("highScaleNumber")
    public Boolean getHighScaleNumber() {
        return highScaleNumber;
    }

    @JsonProperty("highScaleNumber")
    public void setHighScaleNumber(Boolean highScaleNumber) {
        this.highScaleNumber = highScaleNumber;
    }

    public Details__2 withHighScaleNumber(Boolean highScaleNumber) {
        this.highScaleNumber = highScaleNumber;
        return this;
    }

    @JsonProperty("htmlFormatted")
    public Boolean getHtmlFormatted() {
        return htmlFormatted;
    }

    @JsonProperty("htmlFormatted")
    public void setHtmlFormatted(Boolean htmlFormatted) {
        this.htmlFormatted = htmlFormatted;
    }

    public Details__2 withHtmlFormatted(Boolean htmlFormatted) {
        this.htmlFormatted = htmlFormatted;
        return this;
    }

    @JsonProperty("idLookup")
    public Boolean getIdLookup() {
        return idLookup;
    }

    @JsonProperty("idLookup")
    public void setIdLookup(Boolean idLookup) {
        this.idLookup = idLookup;
    }

    public Details__2 withIdLookup(Boolean idLookup) {
        this.idLookup = idLookup;
        return this;
    }

    @JsonProperty("inlineHelpText")
    public Object getInlineHelpText() {
        return inlineHelpText;
    }

    @JsonProperty("inlineHelpText")
    public void setInlineHelpText(Object inlineHelpText) {
        this.inlineHelpText = inlineHelpText;
    }

    public Details__2 withInlineHelpText(Object inlineHelpText) {
        this.inlineHelpText = inlineHelpText;
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

    public Details__2 withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("length")
    public Integer getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(Integer length) {
        this.length = length;
    }

    public Details__2 withLength(Integer length) {
        this.length = length;
        return this;
    }

    @JsonProperty("mask")
    public Object getMask() {
        return mask;
    }

    @JsonProperty("mask")
    public void setMask(Object mask) {
        this.mask = mask;
    }

    public Details__2 withMask(Object mask) {
        this.mask = mask;
        return this;
    }

    @JsonProperty("maskType")
    public Object getMaskType() {
        return maskType;
    }

    @JsonProperty("maskType")
    public void setMaskType(Object maskType) {
        this.maskType = maskType;
    }

    public Details__2 withMaskType(Object maskType) {
        this.maskType = maskType;
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

    public Details__2 withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("nameField")
    public Boolean getNameField() {
        return nameField;
    }

    @JsonProperty("nameField")
    public void setNameField(Boolean nameField) {
        this.nameField = nameField;
    }

    public Details__2 withNameField(Boolean nameField) {
        this.nameField = nameField;
        return this;
    }

    @JsonProperty("namePointing")
    public Boolean getNamePointing() {
        return namePointing;
    }

    @JsonProperty("namePointing")
    public void setNamePointing(Boolean namePointing) {
        this.namePointing = namePointing;
    }

    public Details__2 withNamePointing(Boolean namePointing) {
        this.namePointing = namePointing;
        return this;
    }

    @JsonProperty("nillable")
    public Boolean getNillable() {
        return nillable;
    }

    @JsonProperty("nillable")
    public void setNillable(Boolean nillable) {
        this.nillable = nillable;
    }

    public Details__2 withNillable(Boolean nillable) {
        this.nillable = nillable;
        return this;
    }

    @JsonProperty("permissionable")
    public Boolean getPermissionable() {
        return permissionable;
    }

    @JsonProperty("permissionable")
    public void setPermissionable(Boolean permissionable) {
        this.permissionable = permissionable;
    }

    public Details__2 withPermissionable(Boolean permissionable) {
        this.permissionable = permissionable;
        return this;
    }

    @JsonProperty("picklistValues")
    public List<PicklistValue__2> getPicklistValues() {
        return picklistValues;
    }

    @JsonProperty("picklistValues")
    public void setPicklistValues(List<PicklistValue__2> picklistValues) {
        this.picklistValues = picklistValues;
    }

    public Details__2 withPicklistValues(List<PicklistValue__2> picklistValues) {
        this.picklistValues = picklistValues;
        return this;
    }

    @JsonProperty("polymorphicForeignKey")
    public Boolean getPolymorphicForeignKey() {
        return polymorphicForeignKey;
    }

    @JsonProperty("polymorphicForeignKey")
    public void setPolymorphicForeignKey(Boolean polymorphicForeignKey) {
        this.polymorphicForeignKey = polymorphicForeignKey;
    }

    public Details__2 withPolymorphicForeignKey(Boolean polymorphicForeignKey) {
        this.polymorphicForeignKey = polymorphicForeignKey;
        return this;
    }

    @JsonProperty("precision")
    public Integer getPrecision() {
        return precision;
    }

    @JsonProperty("precision")
    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Details__2 withPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    @JsonProperty("queryByDistance")
    public Boolean getQueryByDistance() {
        return queryByDistance;
    }

    @JsonProperty("queryByDistance")
    public void setQueryByDistance(Boolean queryByDistance) {
        this.queryByDistance = queryByDistance;
    }

    public Details__2 withQueryByDistance(Boolean queryByDistance) {
        this.queryByDistance = queryByDistance;
        return this;
    }

    @JsonProperty("referenceTargetField")
    public Object getReferenceTargetField() {
        return referenceTargetField;
    }

    @JsonProperty("referenceTargetField")
    public void setReferenceTargetField(Object referenceTargetField) {
        this.referenceTargetField = referenceTargetField;
    }

    public Details__2 withReferenceTargetField(Object referenceTargetField) {
        this.referenceTargetField = referenceTargetField;
        return this;
    }

    @JsonProperty("referenceTo")
    public List<String> getReferenceTo() {
        return referenceTo;
    }

    @JsonProperty("referenceTo")
    public void setReferenceTo(List<String> referenceTo) {
        this.referenceTo = referenceTo;
    }

    public Details__2 withReferenceTo(List<String> referenceTo) {
        this.referenceTo = referenceTo;
        return this;
    }

    @JsonProperty("relationshipName")
    public Object getRelationshipName() {
        return relationshipName;
    }

    @JsonProperty("relationshipName")
    public void setRelationshipName(Object relationshipName) {
        this.relationshipName = relationshipName;
    }

    public Details__2 withRelationshipName(Object relationshipName) {
        this.relationshipName = relationshipName;
        return this;
    }

    @JsonProperty("relationshipOrder")
    public Object getRelationshipOrder() {
        return relationshipOrder;
    }

    @JsonProperty("relationshipOrder")
    public void setRelationshipOrder(Object relationshipOrder) {
        this.relationshipOrder = relationshipOrder;
    }

    public Details__2 withRelationshipOrder(Object relationshipOrder) {
        this.relationshipOrder = relationshipOrder;
        return this;
    }

    @JsonProperty("restrictedDelete")
    public Boolean getRestrictedDelete() {
        return restrictedDelete;
    }

    @JsonProperty("restrictedDelete")
    public void setRestrictedDelete(Boolean restrictedDelete) {
        this.restrictedDelete = restrictedDelete;
    }

    public Details__2 withRestrictedDelete(Boolean restrictedDelete) {
        this.restrictedDelete = restrictedDelete;
        return this;
    }

    @JsonProperty("restrictedPicklist")
    public Boolean getRestrictedPicklist() {
        return restrictedPicklist;
    }

    @JsonProperty("restrictedPicklist")
    public void setRestrictedPicklist(Boolean restrictedPicklist) {
        this.restrictedPicklist = restrictedPicklist;
    }

    public Details__2 withRestrictedPicklist(Boolean restrictedPicklist) {
        this.restrictedPicklist = restrictedPicklist;
        return this;
    }

    @JsonProperty("scale")
    public Integer getScale() {
        return scale;
    }

    @JsonProperty("scale")
    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Details__2 withScale(Integer scale) {
        this.scale = scale;
        return this;
    }

    @JsonProperty("searchPrefilterable")
    public Boolean getSearchPrefilterable() {
        return searchPrefilterable;
    }

    @JsonProperty("searchPrefilterable")
    public void setSearchPrefilterable(Boolean searchPrefilterable) {
        this.searchPrefilterable = searchPrefilterable;
    }

    public Details__2 withSearchPrefilterable(Boolean searchPrefilterable) {
        this.searchPrefilterable = searchPrefilterable;
        return this;
    }

    @JsonProperty("soapType")
    public String getSoapType() {
        return soapType;
    }

    @JsonProperty("soapType")
    public void setSoapType(String soapType) {
        this.soapType = soapType;
    }

    public Details__2 withSoapType(String soapType) {
        this.soapType = soapType;
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

    public Details__2 withSortable(Boolean sortable) {
        this.sortable = sortable;
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

    public Details__2 withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("unique")
    public Boolean getUnique() {
        return unique;
    }

    @JsonProperty("unique")
    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public Details__2 withUnique(Boolean unique) {
        this.unique = unique;
        return this;
    }

    @JsonProperty("updateable")
    public Boolean getUpdateable() {
        return updateable;
    }

    @JsonProperty("updateable")
    public void setUpdateable(Boolean updateable) {
        this.updateable = updateable;
    }

    public Details__2 withUpdateable(Boolean updateable) {
        this.updateable = updateable;
        return this;
    }

    @JsonProperty("writeRequiresMasterRead")
    public Boolean getWriteRequiresMasterRead() {
        return writeRequiresMasterRead;
    }

    @JsonProperty("writeRequiresMasterRead")
    public void setWriteRequiresMasterRead(Boolean writeRequiresMasterRead) {
        this.writeRequiresMasterRead = writeRequiresMasterRead;
    }

    public Details__2 withWriteRequiresMasterRead(Boolean writeRequiresMasterRead) {
        this.writeRequiresMasterRead = writeRequiresMasterRead;
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

    public Details__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Details__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("aggregatable");
        sb.append('=');
        sb.append(((this.aggregatable == null)?"<null>":this.aggregatable));
        sb.append(',');
        sb.append("aiPredictionField");
        sb.append('=');
        sb.append(((this.aiPredictionField == null)?"<null>":this.aiPredictionField));
        sb.append(',');
        sb.append("autoNumber");
        sb.append('=');
        sb.append(((this.autoNumber == null)?"<null>":this.autoNumber));
        sb.append(',');
        sb.append("byteLength");
        sb.append('=');
        sb.append(((this.byteLength == null)?"<null>":this.byteLength));
        sb.append(',');
        sb.append("calculated");
        sb.append('=');
        sb.append(((this.calculated == null)?"<null>":this.calculated));
        sb.append(',');
        sb.append("calculatedFormula");
        sb.append('=');
        sb.append(((this.calculatedFormula == null)?"<null>":this.calculatedFormula));
        sb.append(',');
        sb.append("cascadeDelete");
        sb.append('=');
        sb.append(((this.cascadeDelete == null)?"<null>":this.cascadeDelete));
        sb.append(',');
        sb.append("caseSensitive");
        sb.append('=');
        sb.append(((this.caseSensitive == null)?"<null>":this.caseSensitive));
        sb.append(',');
        sb.append("compoundFieldName");
        sb.append('=');
        sb.append(((this.compoundFieldName == null)?"<null>":this.compoundFieldName));
        sb.append(',');
        sb.append("controllerName");
        sb.append('=');
        sb.append(((this.controllerName == null)?"<null>":this.controllerName));
        sb.append(',');
        sb.append("createable");
        sb.append('=');
        sb.append(((this.createable == null)?"<null>":this.createable));
        sb.append(',');
        sb.append("custom");
        sb.append('=');
        sb.append(((this.custom == null)?"<null>":this.custom));
        sb.append(',');
        sb.append("defaultValue");
        sb.append('=');
        sb.append(((this.defaultValue == null)?"<null>":this.defaultValue));
        sb.append(',');
        sb.append("defaultValueFormula");
        sb.append('=');
        sb.append(((this.defaultValueFormula == null)?"<null>":this.defaultValueFormula));
        sb.append(',');
        sb.append("defaultedOnCreate");
        sb.append('=');
        sb.append(((this.defaultedOnCreate == null)?"<null>":this.defaultedOnCreate));
        sb.append(',');
        sb.append("dependentPicklist");
        sb.append('=');
        sb.append(((this.dependentPicklist == null)?"<null>":this.dependentPicklist));
        sb.append(',');
        sb.append("deprecatedAndHidden");
        sb.append('=');
        sb.append(((this.deprecatedAndHidden == null)?"<null>":this.deprecatedAndHidden));
        sb.append(',');
        sb.append("digits");
        sb.append('=');
        sb.append(((this.digits == null)?"<null>":this.digits));
        sb.append(',');
        sb.append("displayLocationInDecimal");
        sb.append('=');
        sb.append(((this.displayLocationInDecimal == null)?"<null>":this.displayLocationInDecimal));
        sb.append(',');
        sb.append("encrypted");
        sb.append('=');
        sb.append(((this.encrypted == null)?"<null>":this.encrypted));
        sb.append(',');
        sb.append("externalId");
        sb.append('=');
        sb.append(((this.externalId == null)?"<null>":this.externalId));
        sb.append(',');
        sb.append("extraTypeInfo");
        sb.append('=');
        sb.append(((this.extraTypeInfo == null)?"<null>":this.extraTypeInfo));
        sb.append(',');
        sb.append("filterable");
        sb.append('=');
        sb.append(((this.filterable == null)?"<null>":this.filterable));
        sb.append(',');
        sb.append("filteredLookupInfo");
        sb.append('=');
        sb.append(((this.filteredLookupInfo == null)?"<null>":this.filteredLookupInfo));
        sb.append(',');
        sb.append("formulaTreatNullNumberAsZero");
        sb.append('=');
        sb.append(((this.formulaTreatNullNumberAsZero == null)?"<null>":this.formulaTreatNullNumberAsZero));
        sb.append(',');
        sb.append("groupable");
        sb.append('=');
        sb.append(((this.groupable == null)?"<null>":this.groupable));
        sb.append(',');
        sb.append("highScaleNumber");
        sb.append('=');
        sb.append(((this.highScaleNumber == null)?"<null>":this.highScaleNumber));
        sb.append(',');
        sb.append("htmlFormatted");
        sb.append('=');
        sb.append(((this.htmlFormatted == null)?"<null>":this.htmlFormatted));
        sb.append(',');
        sb.append("idLookup");
        sb.append('=');
        sb.append(((this.idLookup == null)?"<null>":this.idLookup));
        sb.append(',');
        sb.append("inlineHelpText");
        sb.append('=');
        sb.append(((this.inlineHelpText == null)?"<null>":this.inlineHelpText));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("length");
        sb.append('=');
        sb.append(((this.length == null)?"<null>":this.length));
        sb.append(',');
        sb.append("mask");
        sb.append('=');
        sb.append(((this.mask == null)?"<null>":this.mask));
        sb.append(',');
        sb.append("maskType");
        sb.append('=');
        sb.append(((this.maskType == null)?"<null>":this.maskType));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nameField");
        sb.append('=');
        sb.append(((this.nameField == null)?"<null>":this.nameField));
        sb.append(',');
        sb.append("namePointing");
        sb.append('=');
        sb.append(((this.namePointing == null)?"<null>":this.namePointing));
        sb.append(',');
        sb.append("nillable");
        sb.append('=');
        sb.append(((this.nillable == null)?"<null>":this.nillable));
        sb.append(',');
        sb.append("permissionable");
        sb.append('=');
        sb.append(((this.permissionable == null)?"<null>":this.permissionable));
        sb.append(',');
        sb.append("picklistValues");
        sb.append('=');
        sb.append(((this.picklistValues == null)?"<null>":this.picklistValues));
        sb.append(',');
        sb.append("polymorphicForeignKey");
        sb.append('=');
        sb.append(((this.polymorphicForeignKey == null)?"<null>":this.polymorphicForeignKey));
        sb.append(',');
        sb.append("precision");
        sb.append('=');
        sb.append(((this.precision == null)?"<null>":this.precision));
        sb.append(',');
        sb.append("queryByDistance");
        sb.append('=');
        sb.append(((this.queryByDistance == null)?"<null>":this.queryByDistance));
        sb.append(',');
        sb.append("referenceTargetField");
        sb.append('=');
        sb.append(((this.referenceTargetField == null)?"<null>":this.referenceTargetField));
        sb.append(',');
        sb.append("referenceTo");
        sb.append('=');
        sb.append(((this.referenceTo == null)?"<null>":this.referenceTo));
        sb.append(',');
        sb.append("relationshipName");
        sb.append('=');
        sb.append(((this.relationshipName == null)?"<null>":this.relationshipName));
        sb.append(',');
        sb.append("relationshipOrder");
        sb.append('=');
        sb.append(((this.relationshipOrder == null)?"<null>":this.relationshipOrder));
        sb.append(',');
        sb.append("restrictedDelete");
        sb.append('=');
        sb.append(((this.restrictedDelete == null)?"<null>":this.restrictedDelete));
        sb.append(',');
        sb.append("restrictedPicklist");
        sb.append('=');
        sb.append(((this.restrictedPicklist == null)?"<null>":this.restrictedPicklist));
        sb.append(',');
        sb.append("scale");
        sb.append('=');
        sb.append(((this.scale == null)?"<null>":this.scale));
        sb.append(',');
        sb.append("searchPrefilterable");
        sb.append('=');
        sb.append(((this.searchPrefilterable == null)?"<null>":this.searchPrefilterable));
        sb.append(',');
        sb.append("soapType");
        sb.append('=');
        sb.append(((this.soapType == null)?"<null>":this.soapType));
        sb.append(',');
        sb.append("sortable");
        sb.append('=');
        sb.append(((this.sortable == null)?"<null>":this.sortable));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("unique");
        sb.append('=');
        sb.append(((this.unique == null)?"<null>":this.unique));
        sb.append(',');
        sb.append("updateable");
        sb.append('=');
        sb.append(((this.updateable == null)?"<null>":this.updateable));
        sb.append(',');
        sb.append("writeRequiresMasterRead");
        sb.append('=');
        sb.append(((this.writeRequiresMasterRead == null)?"<null>":this.writeRequiresMasterRead));
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
        result = ((result* 31)+((this.defaultValue == null)? 0 :this.defaultValue.hashCode()));
        result = ((result* 31)+((this.precision == null)? 0 :this.precision.hashCode()));
        result = ((result* 31)+((this.compoundFieldName == null)? 0 :this.compoundFieldName.hashCode()));
        result = ((result* 31)+((this.nameField == null)? 0 :this.nameField.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.restrictedDelete == null)? 0 :this.restrictedDelete.hashCode()));
        result = ((result* 31)+((this.relationshipName == null)? 0 :this.relationshipName.hashCode()));
        result = ((result* 31)+((this.calculatedFormula == null)? 0 :this.calculatedFormula.hashCode()));
        result = ((result* 31)+((this.controllerName == null)? 0 :this.controllerName.hashCode()));
        result = ((result* 31)+((this.namePointing == null)? 0 :this.namePointing.hashCode()));
        result = ((result* 31)+((this.defaultValueFormula == null)? 0 :this.defaultValueFormula.hashCode()));
        result = ((result* 31)+((this.calculated == null)? 0 :this.calculated.hashCode()));
        result = ((result* 31)+((this.writeRequiresMasterRead == null)? 0 :this.writeRequiresMasterRead.hashCode()));
        result = ((result* 31)+((this.inlineHelpText == null)? 0 :this.inlineHelpText.hashCode()));
        result = ((result* 31)+((this.picklistValues == null)? 0 :this.picklistValues.hashCode()));
        result = ((result* 31)+((this.aiPredictionField == null)? 0 :this.aiPredictionField.hashCode()));
        result = ((result* 31)+((this.filterable == null)? 0 :this.filterable.hashCode()));
        result = ((result* 31)+((this.maskType == null)? 0 :this.maskType.hashCode()));
        result = ((result* 31)+((this.queryByDistance == null)? 0 :this.queryByDistance.hashCode()));
        result = ((result* 31)+((this.caseSensitive == null)? 0 :this.caseSensitive.hashCode()));
        result = ((result* 31)+((this.aggregatable == null)? 0 :this.aggregatable.hashCode()));
        result = ((result* 31)+((this.referenceTo == null)? 0 :this.referenceTo.hashCode()));
        result = ((result* 31)+((this.soapType == null)? 0 :this.soapType.hashCode()));
        result = ((result* 31)+((this.unique == null)? 0 :this.unique.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.highScaleNumber == null)? 0 :this.highScaleNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.idLookup == null)? 0 :this.idLookup.hashCode()));
        result = ((result* 31)+((this.displayLocationInDecimal == null)? 0 :this.displayLocationInDecimal.hashCode()));
        result = ((result* 31)+((this.defaultedOnCreate == null)? 0 :this.defaultedOnCreate.hashCode()));
        result = ((result* 31)+((this.updateable == null)? 0 :this.updateable.hashCode()));
        result = ((result* 31)+((this.deprecatedAndHidden == null)? 0 :this.deprecatedAndHidden.hashCode()));
        result = ((result* 31)+((this.byteLength == null)? 0 :this.byteLength.hashCode()));
        result = ((result* 31)+((this.scale == null)? 0 :this.scale.hashCode()));
        result = ((result* 31)+((this.polymorphicForeignKey == null)? 0 :this.polymorphicForeignKey.hashCode()));
        result = ((result* 31)+((this.nillable == null)? 0 :this.nillable.hashCode()));
        result = ((result* 31)+((this.htmlFormatted == null)? 0 :this.htmlFormatted.hashCode()));
        result = ((result* 31)+((this.referenceTargetField == null)? 0 :this.referenceTargetField.hashCode()));
        result = ((result* 31)+((this.cascadeDelete == null)? 0 :this.cascadeDelete.hashCode()));
        result = ((result* 31)+((this.mask == null)? 0 :this.mask.hashCode()));
        result = ((result* 31)+((this.permissionable == null)? 0 :this.permissionable.hashCode()));
        result = ((result* 31)+((this.relationshipOrder == null)? 0 :this.relationshipOrder.hashCode()));
        result = ((result* 31)+((this.custom == null)? 0 :this.custom.hashCode()));
        result = ((result* 31)+((this.length == null)? 0 :this.length.hashCode()));
        result = ((result* 31)+((this.externalId == null)? 0 :this.externalId.hashCode()));
        result = ((result* 31)+((this.dependentPicklist == null)? 0 :this.dependentPicklist.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.sortable == null)? 0 :this.sortable.hashCode()));
        result = ((result* 31)+((this.autoNumber == null)? 0 :this.autoNumber.hashCode()));
        result = ((result* 31)+((this.filteredLookupInfo == null)? 0 :this.filteredLookupInfo.hashCode()));
        result = ((result* 31)+((this.restrictedPicklist == null)? 0 :this.restrictedPicklist.hashCode()));
        result = ((result* 31)+((this.createable == null)? 0 :this.createable.hashCode()));
        result = ((result* 31)+((this.encrypted == null)? 0 :this.encrypted.hashCode()));
        result = ((result* 31)+((this.searchPrefilterable == null)? 0 :this.searchPrefilterable.hashCode()));
        result = ((result* 31)+((this.extraTypeInfo == null)? 0 :this.extraTypeInfo.hashCode()));
        result = ((result* 31)+((this.groupable == null)? 0 :this.groupable.hashCode()));
        result = ((result* 31)+((this.digits == null)? 0 :this.digits.hashCode()));
        result = ((result* 31)+((this.formulaTreatNullNumberAsZero == null)? 0 :this.formulaTreatNullNumberAsZero.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Details__2) == false) {
            return false;
        }
        Details__2 rhs = ((Details__2) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.defaultValue == rhs.defaultValue)||((this.defaultValue!= null)&&this.defaultValue.equals(rhs.defaultValue)))&&((this.precision == rhs.precision)||((this.precision!= null)&&this.precision.equals(rhs.precision))))&&((this.compoundFieldName == rhs.compoundFieldName)||((this.compoundFieldName!= null)&&this.compoundFieldName.equals(rhs.compoundFieldName))))&&((this.nameField == rhs.nameField)||((this.nameField!= null)&&this.nameField.equals(rhs.nameField))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.restrictedDelete == rhs.restrictedDelete)||((this.restrictedDelete!= null)&&this.restrictedDelete.equals(rhs.restrictedDelete))))&&((this.relationshipName == rhs.relationshipName)||((this.relationshipName!= null)&&this.relationshipName.equals(rhs.relationshipName))))&&((this.calculatedFormula == rhs.calculatedFormula)||((this.calculatedFormula!= null)&&this.calculatedFormula.equals(rhs.calculatedFormula))))&&((this.controllerName == rhs.controllerName)||((this.controllerName!= null)&&this.controllerName.equals(rhs.controllerName))))&&((this.namePointing == rhs.namePointing)||((this.namePointing!= null)&&this.namePointing.equals(rhs.namePointing))))&&((this.defaultValueFormula == rhs.defaultValueFormula)||((this.defaultValueFormula!= null)&&this.defaultValueFormula.equals(rhs.defaultValueFormula))))&&((this.calculated == rhs.calculated)||((this.calculated!= null)&&this.calculated.equals(rhs.calculated))))&&((this.writeRequiresMasterRead == rhs.writeRequiresMasterRead)||((this.writeRequiresMasterRead!= null)&&this.writeRequiresMasterRead.equals(rhs.writeRequiresMasterRead))))&&((this.inlineHelpText == rhs.inlineHelpText)||((this.inlineHelpText!= null)&&this.inlineHelpText.equals(rhs.inlineHelpText))))&&((this.picklistValues == rhs.picklistValues)||((this.picklistValues!= null)&&this.picklistValues.equals(rhs.picklistValues))))&&((this.aiPredictionField == rhs.aiPredictionField)||((this.aiPredictionField!= null)&&this.aiPredictionField.equals(rhs.aiPredictionField))))&&((this.filterable == rhs.filterable)||((this.filterable!= null)&&this.filterable.equals(rhs.filterable))))&&((this.maskType == rhs.maskType)||((this.maskType!= null)&&this.maskType.equals(rhs.maskType))))&&((this.queryByDistance == rhs.queryByDistance)||((this.queryByDistance!= null)&&this.queryByDistance.equals(rhs.queryByDistance))))&&((this.caseSensitive == rhs.caseSensitive)||((this.caseSensitive!= null)&&this.caseSensitive.equals(rhs.caseSensitive))))&&((this.aggregatable == rhs.aggregatable)||((this.aggregatable!= null)&&this.aggregatable.equals(rhs.aggregatable))))&&((this.referenceTo == rhs.referenceTo)||((this.referenceTo!= null)&&this.referenceTo.equals(rhs.referenceTo))))&&((this.soapType == rhs.soapType)||((this.soapType!= null)&&this.soapType.equals(rhs.soapType))))&&((this.unique == rhs.unique)||((this.unique!= null)&&this.unique.equals(rhs.unique))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.highScaleNumber == rhs.highScaleNumber)||((this.highScaleNumber!= null)&&this.highScaleNumber.equals(rhs.highScaleNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.idLookup == rhs.idLookup)||((this.idLookup!= null)&&this.idLookup.equals(rhs.idLookup))))&&((this.displayLocationInDecimal == rhs.displayLocationInDecimal)||((this.displayLocationInDecimal!= null)&&this.displayLocationInDecimal.equals(rhs.displayLocationInDecimal))))&&((this.defaultedOnCreate == rhs.defaultedOnCreate)||((this.defaultedOnCreate!= null)&&this.defaultedOnCreate.equals(rhs.defaultedOnCreate))))&&((this.updateable == rhs.updateable)||((this.updateable!= null)&&this.updateable.equals(rhs.updateable))))&&((this.deprecatedAndHidden == rhs.deprecatedAndHidden)||((this.deprecatedAndHidden!= null)&&this.deprecatedAndHidden.equals(rhs.deprecatedAndHidden))))&&((this.byteLength == rhs.byteLength)||((this.byteLength!= null)&&this.byteLength.equals(rhs.byteLength))))&&((this.scale == rhs.scale)||((this.scale!= null)&&this.scale.equals(rhs.scale))))&&((this.polymorphicForeignKey == rhs.polymorphicForeignKey)||((this.polymorphicForeignKey!= null)&&this.polymorphicForeignKey.equals(rhs.polymorphicForeignKey))))&&((this.nillable == rhs.nillable)||((this.nillable!= null)&&this.nillable.equals(rhs.nillable))))&&((this.htmlFormatted == rhs.htmlFormatted)||((this.htmlFormatted!= null)&&this.htmlFormatted.equals(rhs.htmlFormatted))))&&((this.referenceTargetField == rhs.referenceTargetField)||((this.referenceTargetField!= null)&&this.referenceTargetField.equals(rhs.referenceTargetField))))&&((this.cascadeDelete == rhs.cascadeDelete)||((this.cascadeDelete!= null)&&this.cascadeDelete.equals(rhs.cascadeDelete))))&&((this.mask == rhs.mask)||((this.mask!= null)&&this.mask.equals(rhs.mask))))&&((this.permissionable == rhs.permissionable)||((this.permissionable!= null)&&this.permissionable.equals(rhs.permissionable))))&&((this.relationshipOrder == rhs.relationshipOrder)||((this.relationshipOrder!= null)&&this.relationshipOrder.equals(rhs.relationshipOrder))))&&((this.custom == rhs.custom)||((this.custom!= null)&&this.custom.equals(rhs.custom))))&&((this.length == rhs.length)||((this.length!= null)&&this.length.equals(rhs.length))))&&((this.externalId == rhs.externalId)||((this.externalId!= null)&&this.externalId.equals(rhs.externalId))))&&((this.dependentPicklist == rhs.dependentPicklist)||((this.dependentPicklist!= null)&&this.dependentPicklist.equals(rhs.dependentPicklist))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.sortable == rhs.sortable)||((this.sortable!= null)&&this.sortable.equals(rhs.sortable))))&&((this.autoNumber == rhs.autoNumber)||((this.autoNumber!= null)&&this.autoNumber.equals(rhs.autoNumber))))&&((this.filteredLookupInfo == rhs.filteredLookupInfo)||((this.filteredLookupInfo!= null)&&this.filteredLookupInfo.equals(rhs.filteredLookupInfo))))&&((this.restrictedPicklist == rhs.restrictedPicklist)||((this.restrictedPicklist!= null)&&this.restrictedPicklist.equals(rhs.restrictedPicklist))))&&((this.createable == rhs.createable)||((this.createable!= null)&&this.createable.equals(rhs.createable))))&&((this.encrypted == rhs.encrypted)||((this.encrypted!= null)&&this.encrypted.equals(rhs.encrypted))))&&((this.searchPrefilterable == rhs.searchPrefilterable)||((this.searchPrefilterable!= null)&&this.searchPrefilterable.equals(rhs.searchPrefilterable))))&&((this.extraTypeInfo == rhs.extraTypeInfo)||((this.extraTypeInfo!= null)&&this.extraTypeInfo.equals(rhs.extraTypeInfo))))&&((this.groupable == rhs.groupable)||((this.groupable!= null)&&this.groupable.equals(rhs.groupable))))&&((this.digits == rhs.digits)||((this.digits!= null)&&this.digits.equals(rhs.digits))))&&((this.formulaTreatNullNumberAsZero == rhs.formulaTreatNullNumberAsZero)||((this.formulaTreatNullNumberAsZero!= null)&&this.formulaTreatNullNumberAsZero.equals(rhs.formulaTreatNullNumberAsZero))));
    }

}
