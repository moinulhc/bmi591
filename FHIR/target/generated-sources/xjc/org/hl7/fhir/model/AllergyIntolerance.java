//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 10:09:54 PM MST 
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
 * <p>Java class for AllergyIntolerance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllergyIntolerance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="criticality" type="{http://hl7.org/fhir}Criticality" minOccurs="0"/&gt;
 *         &lt;element name="sensitivityType" type="{http://hl7.org/fhir}SensitivityType"/&gt;
 *         &lt;element name="recordedDate" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}SensitivityStatus"/&gt;
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="recorder" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="substance" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="reaction" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sensitivityTest" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllergyIntolerance", propOrder = {
    "identifiers",
    "criticality",
    "sensitivityType",
    "recordedDate",
    "status",
    "subject",
    "recorder",
    "substance",
    "reactions",
    "sensitivityTests"
})
@XmlRootElement(name = "AllergyIntolerance")
public class AllergyIntolerance
    extends Resource
    implements ToString
{

    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    protected Criticality criticality;
    @XmlElement(required = true)
    protected SensitivityType sensitivityType;
    protected DateTime recordedDate;
    @XmlElement(required = true)
    protected SensitivityStatus status;
    @XmlElement(required = true)
    protected ResourceReference subject;
    protected ResourceReference recorder;
    @XmlElement(required = true)
    protected ResourceReference substance;
    @XmlElement(name = "reaction")
    protected List<ResourceReference> reactions;
    @XmlElement(name = "sensitivityTest")
    protected List<ResourceReference> sensitivityTests;

    /**
     * Gets the value of the identifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    /**
     * Gets the value of the criticality property.
     * 
     * @return
     *     possible object is
     *     {@link Criticality }
     *     
     */
    public Criticality getCriticality() {
        return criticality;
    }

    /**
     * Sets the value of the criticality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Criticality }
     *     
     */
    public void setCriticality(Criticality value) {
        this.criticality = value;
    }

    /**
     * Gets the value of the sensitivityType property.
     * 
     * @return
     *     possible object is
     *     {@link SensitivityType }
     *     
     */
    public SensitivityType getSensitivityType() {
        return sensitivityType;
    }

    /**
     * Sets the value of the sensitivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitivityType }
     *     
     */
    public void setSensitivityType(SensitivityType value) {
        this.sensitivityType = value;
    }

    /**
     * Gets the value of the recordedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getRecordedDate() {
        return recordedDate;
    }

    /**
     * Sets the value of the recordedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setRecordedDate(DateTime value) {
        this.recordedDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SensitivityStatus }
     *     
     */
    public SensitivityStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitivityStatus }
     *     
     */
    public void setStatus(SensitivityStatus value) {
        this.status = value;
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
     * Gets the value of the recorder property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getRecorder() {
        return recorder;
    }

    /**
     * Sets the value of the recorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setRecorder(ResourceReference value) {
        this.recorder = value;
    }

    /**
     * Gets the value of the substance property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getSubstance() {
        return substance;
    }

    /**
     * Sets the value of the substance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSubstance(ResourceReference value) {
        this.substance = value;
    }

    /**
     * Gets the value of the reactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getReactions() {
        if (reactions == null) {
            reactions = new ArrayList<ResourceReference>();
        }
        return this.reactions;
    }

    /**
     * Gets the value of the sensitivityTests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sensitivityTests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSensitivityTests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getSensitivityTests() {
        if (sensitivityTests == null) {
            sensitivityTests = new ArrayList<ResourceReference>();
        }
        return this.sensitivityTests;
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
            List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            strategy.appendField(locator, this, "identifiers", buffer, theIdentifiers);
        }
        {
            Criticality theCriticality;
            theCriticality = this.getCriticality();
            strategy.appendField(locator, this, "criticality", buffer, theCriticality);
        }
        {
            SensitivityType theSensitivityType;
            theSensitivityType = this.getSensitivityType();
            strategy.appendField(locator, this, "sensitivityType", buffer, theSensitivityType);
        }
        {
            DateTime theRecordedDate;
            theRecordedDate = this.getRecordedDate();
            strategy.appendField(locator, this, "recordedDate", buffer, theRecordedDate);
        }
        {
            SensitivityStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            ResourceReference theRecorder;
            theRecorder = this.getRecorder();
            strategy.appendField(locator, this, "recorder", buffer, theRecorder);
        }
        {
            ResourceReference theSubstance;
            theSubstance = this.getSubstance();
            strategy.appendField(locator, this, "substance", buffer, theSubstance);
        }
        {
            List<ResourceReference> theReactions;
            theReactions = (((this.reactions!= null)&&(!this.reactions.isEmpty()))?this.getReactions():null);
            strategy.appendField(locator, this, "reactions", buffer, theReactions);
        }
        {
            List<ResourceReference> theSensitivityTests;
            theSensitivityTests = (((this.sensitivityTests!= null)&&(!this.sensitivityTests.isEmpty()))?this.getSensitivityTests():null);
            strategy.appendField(locator, this, "sensitivityTests", buffer, theSensitivityTests);
        }
        return buffer;
    }

}
