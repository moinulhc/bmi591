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
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * A collection of error, warning or information messages that result from a system action.
 * 
 * <p>Java class for OperationOutcome.Issue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationOutcome.Issue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="severity" type="{http://hl7.org/fhir}IssueSeverity"/&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding" minOccurs="0"/&gt;
 *         &lt;element name="details" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationOutcome.Issue", propOrder = {
    "severity",
    "type",
    "details",
    "locations"
})
public class OperationOutcomeIssue
    extends BackboneElement
    implements ToString
{

    @XmlElement(required = true)
    protected IssueSeverity severity;
    protected Coding type;
    protected org.hl7.fhir.model.String details;
    @XmlElement(name = "location")
    protected List<org.hl7.fhir.model.String> locations;

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link IssueSeverity }
     *     
     */
    public IssueSeverity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueSeverity }
     *     
     */
    public void setSeverity(IssueSeverity value) {
        this.severity = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setType(Coding value) {
        this.type = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setDetails(org.hl7.fhir.model.String value) {
        this.details = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.hl7.fhir.model.String }
     * 
     * 
     */
    public List<org.hl7.fhir.model.String> getLocations() {
        if (locations == null) {
            locations = new ArrayList<org.hl7.fhir.model.String>();
        }
        return this.locations;
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
            IssueSeverity theSeverity;
            theSeverity = this.getSeverity();
            strategy.appendField(locator, this, "severity", buffer, theSeverity);
        }
        {
            Coding theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            org.hl7.fhir.model.String theDetails;
            theDetails = this.getDetails();
            strategy.appendField(locator, this, "details", buffer, theDetails);
        }
        {
            List<org.hl7.fhir.model.String> theLocations;
            theLocations = (((this.locations!= null)&&(!this.locations.isEmpty()))?this.getLocations():null);
            strategy.appendField(locator, this, "locations", buffer, theLocations);
        }
        return buffer;
    }

}