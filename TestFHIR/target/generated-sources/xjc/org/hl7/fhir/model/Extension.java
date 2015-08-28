//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 10:15:25 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Extension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Extension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="valueBoolean" type="{http://hl7.org/fhir}boolean"/&gt;
 *           &lt;element name="valueInteger" type="{http://hl7.org/fhir}integer"/&gt;
 *           &lt;element name="valueDecimal" type="{http://hl7.org/fhir}decimal"/&gt;
 *           &lt;element name="valueBase64Binary" type="{http://hl7.org/fhir}base64Binary"/&gt;
 *           &lt;element name="valueInstant" type="{http://hl7.org/fhir}instant"/&gt;
 *           &lt;element name="valueString" type="{http://hl7.org/fhir}string"/&gt;
 *           &lt;element name="valueUri" type="{http://hl7.org/fhir}uri"/&gt;
 *           &lt;element name="valueDate" type="{http://hl7.org/fhir}date"/&gt;
 *           &lt;element name="valueDateTime" type="{http://hl7.org/fhir}dateTime"/&gt;
 *           &lt;element name="valueCode" type="{http://hl7.org/fhir}code"/&gt;
 *           &lt;element name="valueAttachment" type="{http://hl7.org/fhir}Attachment"/&gt;
 *           &lt;element name="valueIdentifier" type="{http://hl7.org/fhir}Identifier"/&gt;
 *           &lt;element name="valueCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *           &lt;element name="valueCoding" type="{http://hl7.org/fhir}Coding"/&gt;
 *           &lt;element name="valueQuantity" type="{http://hl7.org/fhir}Quantity"/&gt;
 *           &lt;element name="valueRange" type="{http://hl7.org/fhir}Range"/&gt;
 *           &lt;element name="valuePeriod" type="{http://hl7.org/fhir}Period"/&gt;
 *           &lt;element name="valueRatio" type="{http://hl7.org/fhir}Ratio"/&gt;
 *           &lt;element name="valueResource" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *           &lt;element name="valueSampledData" type="{http://hl7.org/fhir}SampledData"/&gt;
 *           &lt;element name="valueHumanName" type="{http://hl7.org/fhir}HumanName"/&gt;
 *           &lt;element name="valueAddress" type="{http://hl7.org/fhir}Address"/&gt;
 *           &lt;element name="valueContact" type="{http://hl7.org/fhir}Contact"/&gt;
 *           &lt;element name="valueSchedule" type="{http://hl7.org/fhir}Schedule"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="url" use="required" type="{http://hl7.org/fhir}uri-primitive" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extension", propOrder = {
    "valueSchedule",
    "valueContact",
    "valueAddress",
    "valueHumanName",
    "valueSampledData",
    "valueResource",
    "valueRatio",
    "valuePeriod",
    "valueRange",
    "valueQuantity",
    "valueCoding",
    "valueCodeableConcept",
    "valueIdentifier",
    "valueAttachment",
    "valueCode",
    "valueDateTime",
    "valueDate",
    "valueUri",
    "valueString",
    "valueInstant",
    "valueBase64Binary",
    "valueDecimal",
    "valueInteger",
    "valueBoolean"
})
public class Extension
    extends Element
    implements ToString
{

    protected Schedule valueSchedule;
    protected Contact valueContact;
    protected Address valueAddress;
    protected HumanName valueHumanName;
    protected SampledData valueSampledData;
    protected ResourceReference valueResource;
    protected Ratio valueRatio;
    protected Period valuePeriod;
    protected Range valueRange;
    protected Quantity valueQuantity;
    protected Coding valueCoding;
    protected CodeableConcept valueCodeableConcept;
    protected Identifier valueIdentifier;
    protected Attachment valueAttachment;
    protected Code valueCode;
    protected DateTime valueDateTime;
    protected Date valueDate;
    protected Uri valueUri;
    protected org.hl7.fhir.model.String valueString;
    protected Instant valueInstant;
    protected Base64Binary valueBase64Binary;
    protected Decimal valueDecimal;
    protected Integer valueInteger;
    protected Boolean valueBoolean;
    @XmlAttribute(name = "url", required = true)
    protected java.lang.String url;

    /**
     * Gets the value of the valueSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getValueSchedule() {
        return valueSchedule;
    }

    /**
     * Sets the value of the valueSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setValueSchedule(Schedule value) {
        this.valueSchedule = value;
    }

    /**
     * Gets the value of the valueContact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getValueContact() {
        return valueContact;
    }

    /**
     * Sets the value of the valueContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setValueContact(Contact value) {
        this.valueContact = value;
    }

    /**
     * Gets the value of the valueAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getValueAddress() {
        return valueAddress;
    }

    /**
     * Sets the value of the valueAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setValueAddress(Address value) {
        this.valueAddress = value;
    }

    /**
     * Gets the value of the valueHumanName property.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    public HumanName getValueHumanName() {
        return valueHumanName;
    }

    /**
     * Sets the value of the valueHumanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    public void setValueHumanName(HumanName value) {
        this.valueHumanName = value;
    }

    /**
     * Gets the value of the valueSampledData property.
     * 
     * @return
     *     possible object is
     *     {@link SampledData }
     *     
     */
    public SampledData getValueSampledData() {
        return valueSampledData;
    }

    /**
     * Sets the value of the valueSampledData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampledData }
     *     
     */
    public void setValueSampledData(SampledData value) {
        this.valueSampledData = value;
    }

    /**
     * Gets the value of the valueResource property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getValueResource() {
        return valueResource;
    }

    /**
     * Sets the value of the valueResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setValueResource(ResourceReference value) {
        this.valueResource = value;
    }

    /**
     * Gets the value of the valueRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getValueRatio() {
        return valueRatio;
    }

    /**
     * Sets the value of the valueRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setValueRatio(Ratio value) {
        this.valueRatio = value;
    }

    /**
     * Gets the value of the valuePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getValuePeriod() {
        return valuePeriod;
    }

    /**
     * Sets the value of the valuePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setValuePeriod(Period value) {
        this.valuePeriod = value;
    }

    /**
     * Gets the value of the valueRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getValueRange() {
        return valueRange;
    }

    /**
     * Sets the value of the valueRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setValueRange(Range value) {
        this.valueRange = value;
    }

    /**
     * Gets the value of the valueQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getValueQuantity() {
        return valueQuantity;
    }

    /**
     * Sets the value of the valueQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setValueQuantity(Quantity value) {
        this.valueQuantity = value;
    }

    /**
     * Gets the value of the valueCoding property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getValueCoding() {
        return valueCoding;
    }

    /**
     * Sets the value of the valueCoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setValueCoding(Coding value) {
        this.valueCoding = value;
    }

    /**
     * Gets the value of the valueCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    /**
     * Sets the value of the valueCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setValueCodeableConcept(CodeableConcept value) {
        this.valueCodeableConcept = value;
    }

    /**
     * Gets the value of the valueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getValueIdentifier() {
        return valueIdentifier;
    }

    /**
     * Sets the value of the valueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setValueIdentifier(Identifier value) {
        this.valueIdentifier = value;
    }

    /**
     * Gets the value of the valueAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getValueAttachment() {
        return valueAttachment;
    }

    /**
     * Sets the value of the valueAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setValueAttachment(Attachment value) {
        this.valueAttachment = value;
    }

    /**
     * Gets the value of the valueCode property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getValueCode() {
        return valueCode;
    }

    /**
     * Sets the value of the valueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setValueCode(Code value) {
        this.valueCode = value;
    }

    /**
     * Gets the value of the valueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getValueDateTime() {
        return valueDateTime;
    }

    /**
     * Sets the value of the valueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setValueDateTime(DateTime value) {
        this.valueDateTime = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setValueDate(Date value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the valueUri property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getValueUri() {
        return valueUri;
    }

    /**
     * Sets the value of the valueUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setValueUri(Uri value) {
        this.valueUri = value;
    }

    /**
     * Gets the value of the valueString property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getValueString() {
        return valueString;
    }

    /**
     * Sets the value of the valueString property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setValueString(org.hl7.fhir.model.String value) {
        this.valueString = value;
    }

    /**
     * Gets the value of the valueInstant property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getValueInstant() {
        return valueInstant;
    }

    /**
     * Sets the value of the valueInstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setValueInstant(Instant value) {
        this.valueInstant = value;
    }

    /**
     * Gets the value of the valueBase64Binary property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getValueBase64Binary() {
        return valueBase64Binary;
    }

    /**
     * Sets the value of the valueBase64Binary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setValueBase64Binary(Base64Binary value) {
        this.valueBase64Binary = value;
    }

    /**
     * Gets the value of the valueDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getValueDecimal() {
        return valueDecimal;
    }

    /**
     * Sets the value of the valueDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setValueDecimal(Decimal value) {
        this.valueDecimal = value;
    }

    /**
     * Gets the value of the valueInteger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueInteger() {
        return valueInteger;
    }

    /**
     * Sets the value of the valueInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueInteger(Integer value) {
        this.valueInteger = value;
    }

    /**
     * Gets the value of the valueBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    /**
     * Sets the value of the valueBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValueBoolean(Boolean value) {
        this.valueBoolean = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setUrl(java.lang.String value) {
        this.url = value;
    }

    public java.lang.String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            Schedule theValueSchedule;
            theValueSchedule = this.getValueSchedule();
            strategy.appendField(locator, this, "valueSchedule", buffer, theValueSchedule);
        }
        {
            Contact theValueContact;
            theValueContact = this.getValueContact();
            strategy.appendField(locator, this, "valueContact", buffer, theValueContact);
        }
        {
            Address theValueAddress;
            theValueAddress = this.getValueAddress();
            strategy.appendField(locator, this, "valueAddress", buffer, theValueAddress);
        }
        {
            HumanName theValueHumanName;
            theValueHumanName = this.getValueHumanName();
            strategy.appendField(locator, this, "valueHumanName", buffer, theValueHumanName);
        }
        {
            SampledData theValueSampledData;
            theValueSampledData = this.getValueSampledData();
            strategy.appendField(locator, this, "valueSampledData", buffer, theValueSampledData);
        }
        {
            ResourceReference theValueResource;
            theValueResource = this.getValueResource();
            strategy.appendField(locator, this, "valueResource", buffer, theValueResource);
        }
        {
            Ratio theValueRatio;
            theValueRatio = this.getValueRatio();
            strategy.appendField(locator, this, "valueRatio", buffer, theValueRatio);
        }
        {
            Period theValuePeriod;
            theValuePeriod = this.getValuePeriod();
            strategy.appendField(locator, this, "valuePeriod", buffer, theValuePeriod);
        }
        {
            Range theValueRange;
            theValueRange = this.getValueRange();
            strategy.appendField(locator, this, "valueRange", buffer, theValueRange);
        }
        {
            Quantity theValueQuantity;
            theValueQuantity = this.getValueQuantity();
            strategy.appendField(locator, this, "valueQuantity", buffer, theValueQuantity);
        }
        {
            Coding theValueCoding;
            theValueCoding = this.getValueCoding();
            strategy.appendField(locator, this, "valueCoding", buffer, theValueCoding);
        }
        {
            CodeableConcept theValueCodeableConcept;
            theValueCodeableConcept = this.getValueCodeableConcept();
            strategy.appendField(locator, this, "valueCodeableConcept", buffer, theValueCodeableConcept);
        }
        {
            Identifier theValueIdentifier;
            theValueIdentifier = this.getValueIdentifier();
            strategy.appendField(locator, this, "valueIdentifier", buffer, theValueIdentifier);
        }
        {
            Attachment theValueAttachment;
            theValueAttachment = this.getValueAttachment();
            strategy.appendField(locator, this, "valueAttachment", buffer, theValueAttachment);
        }
        {
            Code theValueCode;
            theValueCode = this.getValueCode();
            strategy.appendField(locator, this, "valueCode", buffer, theValueCode);
        }
        {
            DateTime theValueDateTime;
            theValueDateTime = this.getValueDateTime();
            strategy.appendField(locator, this, "valueDateTime", buffer, theValueDateTime);
        }
        {
            Date theValueDate;
            theValueDate = this.getValueDate();
            strategy.appendField(locator, this, "valueDate", buffer, theValueDate);
        }
        {
            Uri theValueUri;
            theValueUri = this.getValueUri();
            strategy.appendField(locator, this, "valueUri", buffer, theValueUri);
        }
        {
            org.hl7.fhir.model.String theValueString;
            theValueString = this.getValueString();
            strategy.appendField(locator, this, "valueString", buffer, theValueString);
        }
        {
            Instant theValueInstant;
            theValueInstant = this.getValueInstant();
            strategy.appendField(locator, this, "valueInstant", buffer, theValueInstant);
        }
        {
            Base64Binary theValueBase64Binary;
            theValueBase64Binary = this.getValueBase64Binary();
            strategy.appendField(locator, this, "valueBase64Binary", buffer, theValueBase64Binary);
        }
        {
            Decimal theValueDecimal;
            theValueDecimal = this.getValueDecimal();
            strategy.appendField(locator, this, "valueDecimal", buffer, theValueDecimal);
        }
        {
            Integer theValueInteger;
            theValueInteger = this.getValueInteger();
            strategy.appendField(locator, this, "valueInteger", buffer, theValueInteger);
        }
        {
            Boolean theValueBoolean;
            theValueBoolean = this.getValueBoolean();
            strategy.appendField(locator, this, "valueBoolean", buffer, theValueBoolean);
        }
        {
            java.lang.String theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        return buffer;
    }

}
