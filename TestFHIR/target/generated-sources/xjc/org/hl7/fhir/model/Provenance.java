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
 * <p>Java class for Provenance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Provenance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="target" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded"/&gt;
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/&gt;
 *         &lt;element name="recorded" type="{http://hl7.org/fhir}instant"/&gt;
 *         &lt;element name="reason" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="policy" type="{http://hl7.org/fhir}uri" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="agent" type="{http://hl7.org/fhir}Provenance.Agent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entity" type="{http://hl7.org/fhir}Provenance.Entity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="integritySignature" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Provenance", propOrder = {
    "targets",
    "period",
    "recorded",
    "reason",
    "location",
    "policies",
    "agents",
    "entities",
    "integritySignature"
})
@XmlRootElement(name = "Provenance")
public class Provenance
    extends Resource
    implements ToString
{

    @XmlElement(name = "target", required = true)
    protected List<ResourceReference> targets;
    protected Period period;
    @XmlElement(required = true)
    protected Instant recorded;
    protected CodeableConcept reason;
    protected ResourceReference location;
    @XmlElement(name = "policy")
    protected List<Uri> policies;
    @XmlElement(name = "agent")
    protected List<ProvenanceAgent> agents;
    @XmlElement(name = "entity")
    protected List<ProvenanceEntity> entities;
    protected org.hl7.fhir.model.String integritySignature;

    /**
     * Gets the value of the targets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getTargets() {
        if (targets == null) {
            targets = new ArrayList<ResourceReference>();
        }
        return this.targets;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    /**
     * Gets the value of the recorded property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getRecorded() {
        return recorded;
    }

    /**
     * Sets the value of the recorded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setRecorded(Instant value) {
        this.recorded = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReason(CodeableConcept value) {
        this.reason = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setLocation(ResourceReference value) {
        this.location = value;
    }

    /**
     * Gets the value of the policies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uri }
     * 
     * 
     */
    public List<Uri> getPolicies() {
        if (policies == null) {
            policies = new ArrayList<Uri>();
        }
        return this.policies;
    }

    /**
     * Gets the value of the agents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvenanceAgent }
     * 
     * 
     */
    public List<ProvenanceAgent> getAgents() {
        if (agents == null) {
            agents = new ArrayList<ProvenanceAgent>();
        }
        return this.agents;
    }

    /**
     * Gets the value of the entities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvenanceEntity }
     * 
     * 
     */
    public List<ProvenanceEntity> getEntities() {
        if (entities == null) {
            entities = new ArrayList<ProvenanceEntity>();
        }
        return this.entities;
    }

    /**
     * Gets the value of the integritySignature property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getIntegritySignature() {
        return integritySignature;
    }

    /**
     * Sets the value of the integritySignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setIntegritySignature(org.hl7.fhir.model.String value) {
        this.integritySignature = value;
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
            List<ResourceReference> theTargets;
            theTargets = (((this.targets!= null)&&(!this.targets.isEmpty()))?this.getTargets():null);
            strategy.appendField(locator, this, "targets", buffer, theTargets);
        }
        {
            Period thePeriod;
            thePeriod = this.getPeriod();
            strategy.appendField(locator, this, "period", buffer, thePeriod);
        }
        {
            Instant theRecorded;
            theRecorded = this.getRecorded();
            strategy.appendField(locator, this, "recorded", buffer, theRecorded);
        }
        {
            CodeableConcept theReason;
            theReason = this.getReason();
            strategy.appendField(locator, this, "reason", buffer, theReason);
        }
        {
            ResourceReference theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation);
        }
        {
            List<Uri> thePolicies;
            thePolicies = (((this.policies!= null)&&(!this.policies.isEmpty()))?this.getPolicies():null);
            strategy.appendField(locator, this, "policies", buffer, thePolicies);
        }
        {
            List<ProvenanceAgent> theAgents;
            theAgents = (((this.agents!= null)&&(!this.agents.isEmpty()))?this.getAgents():null);
            strategy.appendField(locator, this, "agents", buffer, theAgents);
        }
        {
            List<ProvenanceEntity> theEntities;
            theEntities = (((this.entities!= null)&&(!this.entities.isEmpty()))?this.getEntities():null);
            strategy.appendField(locator, this, "entities", buffer, theEntities);
        }
        {
            org.hl7.fhir.model.String theIntegritySignature;
            theIntegritySignature = this.getIntegritySignature();
            strategy.appendField(locator, this, "integritySignature", buffer, theIntegritySignature);
        }
        return buffer;
    }

}
