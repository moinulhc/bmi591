//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 08:26:41 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedicationPrescriptionStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicationPrescriptionStatus-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="on hold"/&gt;
 *     &lt;enumeration value="completed"/&gt;
 *     &lt;enumeration value="entered in error"/&gt;
 *     &lt;enumeration value="stopped"/&gt;
 *     &lt;enumeration value="superceded"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MedicationPrescriptionStatus-list")
@XmlEnum
public enum MedicationPrescriptionStatusList {


    /**
     * The prescription is 'actionable', but not all actions that are implied by it have occurred yet.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * Actions implied by the prescription have been temporarily halted, but are expected to continue later.  May also be called "suspended".
     * 
     */
    @XmlEnumValue("on hold")
    ON_HOLD("on hold"),

    /**
     * All actions that are implied by the prescription have occurred (this will rarely be made explicit).
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The prescription was entered in error and therefore nullified.
     * 
     */
    @XmlEnumValue("entered in error")
    ENTERED_IN_ERROR("entered in error"),

    /**
     * Actions implied by the prescription have been permanently halted, before all of them occurred.
     * 
     */
    @XmlEnumValue("stopped")
    STOPPED("stopped"),

    /**
     * The prescription was replaced by a newer one, which encompasses all the information in the previous one.
     * 
     */
    @XmlEnumValue("superceded")
    SUPERCEDED("superceded");
    private final java.lang.String value;

    MedicationPrescriptionStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MedicationPrescriptionStatusList fromValue(java.lang.String v) {
        for (MedicationPrescriptionStatusList c: MedicationPrescriptionStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
