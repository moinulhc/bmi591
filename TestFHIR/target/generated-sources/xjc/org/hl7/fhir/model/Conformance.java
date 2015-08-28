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
 * <p>Java class for Conformance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conformance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}ConformanceStatementStatus" minOccurs="0"/&gt;
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime"/&gt;
 *         &lt;element name="software" type="{http://hl7.org/fhir}Conformance.Software" minOccurs="0"/&gt;
 *         &lt;element name="implementation" type="{http://hl7.org/fhir}Conformance.Implementation" minOccurs="0"/&gt;
 *         &lt;element name="fhirVersion" type="{http://hl7.org/fhir}id"/&gt;
 *         &lt;element name="acceptUnknown" type="{http://hl7.org/fhir}boolean"/&gt;
 *         &lt;element name="format" type="{http://hl7.org/fhir}code" maxOccurs="unbounded"/&gt;
 *         &lt;element name="profile" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rest" type="{http://hl7.org/fhir}Conformance.Rest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="messaging" type="{http://hl7.org/fhir}Conformance.Messaging" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="document" type="{http://hl7.org/fhir}Conformance.Document" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance", propOrder = {
    "identifier",
    "version",
    "name",
    "publisher",
    "telecoms",
    "description",
    "status",
    "experimental",
    "date",
    "software",
    "implementation",
    "fhirVersion",
    "acceptUnknown",
    "formats",
    "profiles",
    "rests",
    "messagings",
    "documents"
})
@XmlRootElement(name = "Conformance")
public class Conformance
    extends Resource
    implements ToString
{

    protected org.hl7.fhir.model.String identifier;
    protected org.hl7.fhir.model.String version;
    protected org.hl7.fhir.model.String name;
    @XmlElement(required = true)
    protected org.hl7.fhir.model.String publisher;
    @XmlElement(name = "telecom")
    protected List<Contact> telecoms;
    protected org.hl7.fhir.model.String description;
    protected ConformanceStatementStatus status;
    protected Boolean experimental;
    @XmlElement(required = true)
    protected DateTime date;
    protected ConformanceSoftware software;
    protected ConformanceImplementation implementation;
    @XmlElement(required = true)
    protected Id fhirVersion;
    @XmlElement(required = true)
    protected Boolean acceptUnknown;
    @XmlElement(name = "format", required = true)
    protected List<Code> formats;
    @XmlElement(name = "profile")
    protected List<ResourceReference> profiles;
    @XmlElement(name = "rest")
    protected List<ConformanceRest> rests;
    @XmlElement(name = "messaging")
    protected List<ConformanceMessaging> messagings;
    @XmlElement(name = "document")
    protected List<ConformanceDocument> documents;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setIdentifier(org.hl7.fhir.model.String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setVersion(org.hl7.fhir.model.String value) {
        this.version = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setName(org.hl7.fhir.model.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setPublisher(org.hl7.fhir.model.String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the telecoms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecoms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecoms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getTelecoms() {
        if (telecoms == null) {
            telecoms = new ArrayList<Contact>();
        }
        return this.telecoms;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setDescription(org.hl7.fhir.model.String value) {
        this.description = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceStatementStatus }
     *     
     */
    public ConformanceStatementStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceStatementStatus }
     *     
     */
    public void setStatus(ConformanceStatementStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the experimental property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExperimental() {
        return experimental;
    }

    /**
     * Sets the value of the experimental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExperimental(Boolean value) {
        this.experimental = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the software property.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceSoftware }
     *     
     */
    public ConformanceSoftware getSoftware() {
        return software;
    }

    /**
     * Sets the value of the software property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceSoftware }
     *     
     */
    public void setSoftware(ConformanceSoftware value) {
        this.software = value;
    }

    /**
     * Gets the value of the implementation property.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceImplementation }
     *     
     */
    public ConformanceImplementation getImplementation() {
        return implementation;
    }

    /**
     * Sets the value of the implementation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceImplementation }
     *     
     */
    public void setImplementation(ConformanceImplementation value) {
        this.implementation = value;
    }

    /**
     * Gets the value of the fhirVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getFhirVersion() {
        return fhirVersion;
    }

    /**
     * Sets the value of the fhirVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setFhirVersion(Id value) {
        this.fhirVersion = value;
    }

    /**
     * Gets the value of the acceptUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAcceptUnknown() {
        return acceptUnknown;
    }

    /**
     * Sets the value of the acceptUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptUnknown(Boolean value) {
        this.acceptUnknown = value;
    }

    /**
     * Gets the value of the formats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Code }
     * 
     * 
     */
    public List<Code> getFormats() {
        if (formats == null) {
            formats = new ArrayList<Code>();
        }
        return this.formats;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getProfiles() {
        if (profiles == null) {
            profiles = new ArrayList<ResourceReference>();
        }
        return this.profiles;
    }

    /**
     * Gets the value of the rests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceRest }
     * 
     * 
     */
    public List<ConformanceRest> getRests() {
        if (rests == null) {
            rests = new ArrayList<ConformanceRest>();
        }
        return this.rests;
    }

    /**
     * Gets the value of the messagings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messagings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessagings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceMessaging }
     * 
     * 
     */
    public List<ConformanceMessaging> getMessagings() {
        if (messagings == null) {
            messagings = new ArrayList<ConformanceMessaging>();
        }
        return this.messagings;
    }

    /**
     * Gets the value of the documents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceDocument }
     * 
     * 
     */
    public List<ConformanceDocument> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<ConformanceDocument>();
        }
        return this.documents;
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
            org.hl7.fhir.model.String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            org.hl7.fhir.model.String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        {
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            org.hl7.fhir.model.String thePublisher;
            thePublisher = this.getPublisher();
            strategy.appendField(locator, this, "publisher", buffer, thePublisher);
        }
        {
            List<Contact> theTelecoms;
            theTelecoms = (((this.telecoms!= null)&&(!this.telecoms.isEmpty()))?this.getTelecoms():null);
            strategy.appendField(locator, this, "telecoms", buffer, theTelecoms);
        }
        {
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            ConformanceStatementStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            Boolean theExperimental;
            theExperimental = this.getExperimental();
            strategy.appendField(locator, this, "experimental", buffer, theExperimental);
        }
        {
            DateTime theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate);
        }
        {
            ConformanceSoftware theSoftware;
            theSoftware = this.getSoftware();
            strategy.appendField(locator, this, "software", buffer, theSoftware);
        }
        {
            ConformanceImplementation theImplementation;
            theImplementation = this.getImplementation();
            strategy.appendField(locator, this, "implementation", buffer, theImplementation);
        }
        {
            Id theFhirVersion;
            theFhirVersion = this.getFhirVersion();
            strategy.appendField(locator, this, "fhirVersion", buffer, theFhirVersion);
        }
        {
            Boolean theAcceptUnknown;
            theAcceptUnknown = this.getAcceptUnknown();
            strategy.appendField(locator, this, "acceptUnknown", buffer, theAcceptUnknown);
        }
        {
            List<Code> theFormats;
            theFormats = (((this.formats!= null)&&(!this.formats.isEmpty()))?this.getFormats():null);
            strategy.appendField(locator, this, "formats", buffer, theFormats);
        }
        {
            List<ResourceReference> theProfiles;
            theProfiles = (((this.profiles!= null)&&(!this.profiles.isEmpty()))?this.getProfiles():null);
            strategy.appendField(locator, this, "profiles", buffer, theProfiles);
        }
        {
            List<ConformanceRest> theRests;
            theRests = (((this.rests!= null)&&(!this.rests.isEmpty()))?this.getRests():null);
            strategy.appendField(locator, this, "rests", buffer, theRests);
        }
        {
            List<ConformanceMessaging> theMessagings;
            theMessagings = (((this.messagings!= null)&&(!this.messagings.isEmpty()))?this.getMessagings():null);
            strategy.appendField(locator, this, "messagings", buffer, theMessagings);
        }
        {
            List<ConformanceDocument> theDocuments;
            theDocuments = (((this.documents!= null)&&(!this.documents.isEmpty()))?this.getDocuments():null);
            strategy.appendField(locator, this, "documents", buffer, theDocuments);
        }
        return buffer;
    }

}
