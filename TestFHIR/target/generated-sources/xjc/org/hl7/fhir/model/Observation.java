//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 10:15:25 PM MST 
//


package org.hl7.fhir.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Observation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Observation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="valueQuantity" type="{http://hl7.org/fhir}Quantity"/&gt;
 *           &lt;element name="valueCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *           &lt;element name="valueAttachment" type="{http://hl7.org/fhir}Attachment"/&gt;
 *           &lt;element name="valueRatio" type="{http://hl7.org/fhir}Ratio"/&gt;
 *           &lt;element name="valuePeriod" type="{http://hl7.org/fhir}Period"/&gt;
 *           &lt;element name="valueSampledData" type="{http://hl7.org/fhir}SampledData"/&gt;
 *           &lt;element name="valueString" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="interpretation" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="appliesDateTime" type="{http://hl7.org/fhir}dateTime"/&gt;
 *           &lt;element name="appliesPeriod" type="{http://hl7.org/fhir}Period"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="issued" type="{http://hl7.org/fhir}instant" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}ObservationStatus"/&gt;
 *         &lt;element name="reliability" type="{http://hl7.org/fhir}ObservationReliability"/&gt;
 *         &lt;element name="bodySite" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="method" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="specimen" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="performer" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenceRange" type="{http://hl7.org/fhir}Observation.ReferenceRange" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="related" type="{http://hl7.org/fhir}Observation.Related" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Observation", propOrder = {
    "name",
    "valueString",
    "valueSampledData",
    "valuePeriod",
    "valueRatio",
    "valueAttachment",
    "valueCodeableConcept",
    "valueQuantity",
    "interpretation",
    "comments",
    "appliesPeriod",
    "appliesDateTime",
    "issued",
    "status",
    "reliability",
    "bodySite",
    "method",
    "identifier",
    "subject",
    "specimen",
    "performers",
    "referenceRanges",
    "relateds"
})
@XmlRootElement(name = "Observation")
public class Observation
    extends Resource
    implements ToString
{

    @XmlElement(required = true)
    protected CodeableConcept name;
    protected org.hl7.fhir.model.String valueString;
    protected SampledData valueSampledData;
    protected Period valuePeriod;
    protected Ratio valueRatio;
    protected Attachment valueAttachment;
    protected CodeableConcept valueCodeableConcept;
    protected Quantity valueQuantity;
    protected CodeableConcept interpretation;
    protected org.hl7.fhir.model.String comments;
    protected Period appliesPeriod;
    protected DateTime appliesDateTime;
    protected Instant issued;
    @XmlElement(required = true)
    protected ObservationStatus status;
    @XmlElement(required = true)
    protected ObservationReliability reliability;
    protected CodeableConcept bodySite;
    protected CodeableConcept method;
    protected Identifier identifier;
    protected ResourceReference subject;
    protected ResourceReference specimen;
    @XmlElement(name = "performer")
    protected List<ResourceReference> performers;
    @XmlElement(name = "referenceRange")
    protected List<ObservationReferenceRange> referenceRanges;
    @XmlElement(name = "related")
    protected List<ObservationRelated> relateds;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setName(CodeableConcept value) {
        this.name = value;
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
     * Gets the value of the interpretation property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getInterpretation() {
        return interpretation;
    }

    /**
     * Sets the value of the interpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setInterpretation(CodeableConcept value) {
        this.interpretation = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setComments(org.hl7.fhir.model.String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the appliesPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getAppliesPeriod() {
        return appliesPeriod;
    }

    /**
     * Sets the value of the appliesPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setAppliesPeriod(Period value) {
        this.appliesPeriod = value;
    }

    /**
     * Gets the value of the appliesDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getAppliesDateTime() {
        return appliesDateTime;
    }

    /**
     * Sets the value of the appliesDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setAppliesDateTime(DateTime value) {
        this.appliesDateTime = value;
    }

    /**
     * Gets the value of the issued property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getIssued() {
        return issued;
    }

    /**
     * Sets the value of the issued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setIssued(Instant value) {
        this.issued = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationStatus }
     *     
     */
    public ObservationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationStatus }
     *     
     */
    public void setStatus(ObservationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the reliability property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationReliability }
     *     
     */
    public ObservationReliability getReliability() {
        return reliability;
    }

    /**
     * Sets the value of the reliability property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationReliability }
     *     
     */
    public void setReliability(ObservationReliability value) {
        this.reliability = value;
    }

    /**
     * Gets the value of the bodySite property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getBodySite() {
        return bodySite;
    }

    /**
     * Sets the value of the bodySite property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setBodySite(CodeableConcept value) {
        this.bodySite = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMethod(CodeableConcept value) {
        this.method = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSubject(ResourceReference value) {
        this.subject = value;
    }

    /**
     * Gets the value of the specimen property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getSpecimen() {
        return specimen;
    }

    /**
     * Sets the value of the specimen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSpecimen(ResourceReference value) {
        this.specimen = value;
    }

    /**
     * Gets the value of the performers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getPerformers() {
        if (performers == null) {
            performers = new ArrayList<ResourceReference>();
        }
        return this.performers;
    }

    /**
     * Gets the value of the referenceRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationReferenceRange }
     * 
     * 
     */
    public List<ObservationReferenceRange> getReferenceRanges() {
        if (referenceRanges == null) {
            referenceRanges = new ArrayList<ObservationReferenceRange>();
        }
        return this.referenceRanges;
    }

    /**
     * Gets the value of the relateds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relateds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelateds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationRelated }
     * 
     * 
     */
    public List<ObservationRelated> getRelateds() {
        if (relateds == null) {
            relateds = new ArrayList<ObservationRelated>();
        }
        return this.relateds;
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
            CodeableConcept theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            org.hl7.fhir.model.String theValueString;
            theValueString = this.getValueString();
            strategy.appendField(locator, this, "valueString", buffer, theValueString);
        }
        {
            SampledData theValueSampledData;
            theValueSampledData = this.getValueSampledData();
            strategy.appendField(locator, this, "valueSampledData", buffer, theValueSampledData);
        }
        {
            Period theValuePeriod;
            theValuePeriod = this.getValuePeriod();
            strategy.appendField(locator, this, "valuePeriod", buffer, theValuePeriod);
        }
        {
            Ratio theValueRatio;
            theValueRatio = this.getValueRatio();
            strategy.appendField(locator, this, "valueRatio", buffer, theValueRatio);
        }
        {
            Attachment theValueAttachment;
            theValueAttachment = this.getValueAttachment();
            strategy.appendField(locator, this, "valueAttachment", buffer, theValueAttachment);
        }
        {
            CodeableConcept theValueCodeableConcept;
            theValueCodeableConcept = this.getValueCodeableConcept();
            strategy.appendField(locator, this, "valueCodeableConcept", buffer, theValueCodeableConcept);
        }
        {
            Quantity theValueQuantity;
            theValueQuantity = this.getValueQuantity();
            strategy.appendField(locator, this, "valueQuantity", buffer, theValueQuantity);
        }
        {
            CodeableConcept theInterpretation;
            theInterpretation = this.getInterpretation();
            strategy.appendField(locator, this, "interpretation", buffer, theInterpretation);
        }
        {
            org.hl7.fhir.model.String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments);
        }
        {
            Period theAppliesPeriod;
            theAppliesPeriod = this.getAppliesPeriod();
            strategy.appendField(locator, this, "appliesPeriod", buffer, theAppliesPeriod);
        }
        {
            DateTime theAppliesDateTime;
            theAppliesDateTime = this.getAppliesDateTime();
            strategy.appendField(locator, this, "appliesDateTime", buffer, theAppliesDateTime);
        }
        {
            Instant theIssued;
            theIssued = this.getIssued();
            strategy.appendField(locator, this, "issued", buffer, theIssued);
        }
        {
            ObservationStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            ObservationReliability theReliability;
            theReliability = this.getReliability();
            strategy.appendField(locator, this, "reliability", buffer, theReliability);
        }
        {
            CodeableConcept theBodySite;
            theBodySite = this.getBodySite();
            strategy.appendField(locator, this, "bodySite", buffer, theBodySite);
        }
        {
            CodeableConcept theMethod;
            theMethod = this.getMethod();
            strategy.appendField(locator, this, "method", buffer, theMethod);
        }
        {
            Identifier theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            ResourceReference theSpecimen;
            theSpecimen = this.getSpecimen();
            strategy.appendField(locator, this, "specimen", buffer, theSpecimen);
        }
        {
            List<ResourceReference> thePerformers;
            thePerformers = (((this.performers!= null)&&(!this.performers.isEmpty()))?this.getPerformers():null);
            strategy.appendField(locator, this, "performers", buffer, thePerformers);
        }
        {
            List<ObservationReferenceRange> theReferenceRanges;
            theReferenceRanges = (((this.referenceRanges!= null)&&(!this.referenceRanges.isEmpty()))?this.getReferenceRanges():null);
            strategy.appendField(locator, this, "referenceRanges", buffer, theReferenceRanges);
        }
        {
            List<ObservationRelated> theRelateds;
            theRelateds = (((this.relateds!= null)&&(!this.relateds.isEmpty()))?this.getRelateds():null);
            strategy.appendField(locator, this, "relateds", buffer, theRelateds);
        }
        return buffer;
    }

}
