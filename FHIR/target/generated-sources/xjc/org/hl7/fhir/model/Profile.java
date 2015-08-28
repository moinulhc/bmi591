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
 * <p>Java class for Profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}ResourceProfileStatus"/&gt;
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="requirements" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="fhirVersion" type="{http://hl7.org/fhir}id" minOccurs="0"/&gt;
 *         &lt;element name="mapping" type="{http://hl7.org/fhir}Profile.Mapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="structure" type="{http://hl7.org/fhir}Profile.Structure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="extensionDefn" type="{http://hl7.org/fhir}Profile.ExtensionDefn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="query" type="{http://hl7.org/fhir}Profile.Query" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", propOrder = {
    "identifier",
    "version",
    "name",
    "publisher",
    "telecoms",
    "description",
    "codes",
    "status",
    "experimental",
    "date",
    "requirements",
    "fhirVersion",
    "mappings",
    "structures",
    "extensionDefns",
    "queries"
})
@XmlRootElement(name = "Profile")
public class Profile
    extends Resource
    implements ToString
{

    protected org.hl7.fhir.model.String identifier;
    protected org.hl7.fhir.model.String version;
    @XmlElement(required = true)
    protected org.hl7.fhir.model.String name;
    protected org.hl7.fhir.model.String publisher;
    @XmlElement(name = "telecom")
    protected List<Contact> telecoms;
    protected org.hl7.fhir.model.String description;
    @XmlElement(name = "code")
    protected List<Coding> codes;
    @XmlElement(required = true)
    protected ResourceProfileStatus status;
    protected Boolean experimental;
    protected DateTime date;
    protected org.hl7.fhir.model.String requirements;
    protected Id fhirVersion;
    @XmlElement(name = "mapping")
    protected List<ProfileMapping> mappings;
    @XmlElement(name = "structure")
    protected List<ProfileStructure> structures;
    @XmlElement(name = "extensionDefn")
    protected List<ProfileExtensionDefn> extensionDefns;
    @XmlElement(name = "query")
    protected List<ProfileQuery> queries;

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
     * Gets the value of the codes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getCodes() {
        if (codes == null) {
            codes = new ArrayList<Coding>();
        }
        return this.codes;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceProfileStatus }
     *     
     */
    public ResourceProfileStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceProfileStatus }
     *     
     */
    public void setStatus(ResourceProfileStatus value) {
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
     * Gets the value of the requirements property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getRequirements() {
        return requirements;
    }

    /**
     * Sets the value of the requirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setRequirements(org.hl7.fhir.model.String value) {
        this.requirements = value;
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
     * Gets the value of the mappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileMapping }
     * 
     * 
     */
    public List<ProfileMapping> getMappings() {
        if (mappings == null) {
            mappings = new ArrayList<ProfileMapping>();
        }
        return this.mappings;
    }

    /**
     * Gets the value of the structures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileStructure }
     * 
     * 
     */
    public List<ProfileStructure> getStructures() {
        if (structures == null) {
            structures = new ArrayList<ProfileStructure>();
        }
        return this.structures;
    }

    /**
     * Gets the value of the extensionDefns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionDefns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionDefns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileExtensionDefn }
     * 
     * 
     */
    public List<ProfileExtensionDefn> getExtensionDefns() {
        if (extensionDefns == null) {
            extensionDefns = new ArrayList<ProfileExtensionDefn>();
        }
        return this.extensionDefns;
    }

    /**
     * Gets the value of the queries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileQuery }
     * 
     * 
     */
    public List<ProfileQuery> getQueries() {
        if (queries == null) {
            queries = new ArrayList<ProfileQuery>();
        }
        return this.queries;
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
            List<Coding> theCodes;
            theCodes = (((this.codes!= null)&&(!this.codes.isEmpty()))?this.getCodes():null);
            strategy.appendField(locator, this, "codes", buffer, theCodes);
        }
        {
            ResourceProfileStatus theStatus;
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
            org.hl7.fhir.model.String theRequirements;
            theRequirements = this.getRequirements();
            strategy.appendField(locator, this, "requirements", buffer, theRequirements);
        }
        {
            Id theFhirVersion;
            theFhirVersion = this.getFhirVersion();
            strategy.appendField(locator, this, "fhirVersion", buffer, theFhirVersion);
        }
        {
            List<ProfileMapping> theMappings;
            theMappings = (((this.mappings!= null)&&(!this.mappings.isEmpty()))?this.getMappings():null);
            strategy.appendField(locator, this, "mappings", buffer, theMappings);
        }
        {
            List<ProfileStructure> theStructures;
            theStructures = (((this.structures!= null)&&(!this.structures.isEmpty()))?this.getStructures():null);
            strategy.appendField(locator, this, "structures", buffer, theStructures);
        }
        {
            List<ProfileExtensionDefn> theExtensionDefns;
            theExtensionDefns = (((this.extensionDefns!= null)&&(!this.extensionDefns.isEmpty()))?this.getExtensionDefns():null);
            strategy.appendField(locator, this, "extensionDefns", buffer, theExtensionDefns);
        }
        {
            List<ProfileQuery> theQueries;
            theQueries = (((this.queries!= null)&&(!this.queries.isEmpty()))?this.getQueries():null);
            strategy.appendField(locator, this, "queries", buffer, theQueries);
        }
        return buffer;
    }

}
