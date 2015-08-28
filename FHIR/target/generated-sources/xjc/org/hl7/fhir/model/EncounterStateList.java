//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 10:09:54 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncounterState-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EncounterState-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="planned"/&gt;
 *     &lt;enumeration value="in progress"/&gt;
 *     &lt;enumeration value="onleave"/&gt;
 *     &lt;enumeration value="finished"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EncounterState-list")
@XmlEnum
public enum EncounterStateList {


    /**
     * The Encounter has not yet started.
     * 
     */
    @XmlEnumValue("planned")
    PLANNED("planned"),

    /**
     * The Encounter has begun and the patient is present / the practitioner and the patient are meeting.
     * 
     */
    @XmlEnumValue("in progress")
    IN_PROGRESS("in progress"),

    /**
     * The Encounter has begun, but the patient is temporarily on leave.
     * 
     */
    @XmlEnumValue("onleave")
    ONLEAVE("onleave"),

    /**
     * The Encounter has ended.
     * 
     */
    @XmlEnumValue("finished")
    FINISHED("finished"),

    /**
     * The Encounter has ended before it has begun.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled");
    private final java.lang.String value;

    EncounterStateList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EncounterStateList fromValue(java.lang.String v) {
        for (EncounterStateList c: EncounterStateList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
