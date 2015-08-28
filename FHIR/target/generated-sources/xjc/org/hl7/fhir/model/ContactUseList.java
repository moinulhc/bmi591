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
 * <p>Java class for ContactUse-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactUse-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="home"/&gt;
 *     &lt;enumeration value="work"/&gt;
 *     &lt;enumeration value="temp"/&gt;
 *     &lt;enumeration value="old"/&gt;
 *     &lt;enumeration value="mobile"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactUse-list")
@XmlEnum
public enum ContactUseList {


    /**
     * A communication contact at a home; attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available.
     * 
     */
    @XmlEnumValue("home")
    HOME("home"),

    /**
     * An office contact. First choice for business related contacts during business hours.
     * 
     */
    @XmlEnumValue("work")
    WORK("work"),

    /**
     * A temporary contact. The period can provide more detailed information.
     * 
     */
    @XmlEnumValue("temp")
    TEMP("temp"),

    /**
     * This contact is no longer in use (or was never correct, but retained for records).
     * 
     */
    @XmlEnumValue("old")
    OLD("old"),

    /**
     * A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business.
     * 
     */
    @XmlEnumValue("mobile")
    MOBILE("mobile");
    private final java.lang.String value;

    ContactUseList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ContactUseList fromValue(java.lang.String v) {
        for (ContactUseList c: ContactUseList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
