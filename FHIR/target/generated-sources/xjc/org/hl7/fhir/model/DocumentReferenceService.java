//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 08:26:41 PM MST 
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
 * A reference to a document.
 * 
 * <p>Java class for DocumentReference.Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentReference.Service"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="address" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="parameter" type="{http://hl7.org/fhir}DocumentReference.Parameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentReference.Service", propOrder = {
    "type",
    "address",
    "parameters"
})
public class DocumentReferenceService
    extends BackboneElement
    implements ToString
{

    @XmlElement(required = true)
    protected CodeableConcept type;
    protected org.hl7.fhir.model.String address;
    @XmlElement(name = "parameter")
    protected List<DocumentReferenceParameter> parameters;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setAddress(org.hl7.fhir.model.String value) {
        this.address = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceParameter }
     * 
     * 
     */
    public List<DocumentReferenceParameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<DocumentReferenceParameter>();
        }
        return this.parameters;
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
            CodeableConcept theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            org.hl7.fhir.model.String theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress);
        }
        {
            List<DocumentReferenceParameter> theParameters;
            theParameters = (((this.parameters!= null)&&(!this.parameters.isEmpty()))?this.getParameters():null);
            strategy.appendField(locator, this, "parameters", buffer, theParameters);
        }
        return buffer;
    }

}
