//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 10:09:54 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventTiming-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventTiming-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HS"/&gt;
 *     &lt;enumeration value="WAKE"/&gt;
 *     &lt;enumeration value="AC"/&gt;
 *     &lt;enumeration value="ACM"/&gt;
 *     &lt;enumeration value="ACD"/&gt;
 *     &lt;enumeration value="ACV"/&gt;
 *     &lt;enumeration value="PC"/&gt;
 *     &lt;enumeration value="PCM"/&gt;
 *     &lt;enumeration value="PCD"/&gt;
 *     &lt;enumeration value="PCV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventTiming-list")
@XmlEnum
public enum EventTimingList {


    /**
     * event occurs [duration] before the hour of sleep (or trying to).
     * 
     */
    HS,

    /**
     * event occurs [duration] after waking.
     * 
     */
    WAKE,

    /**
     * event occurs [duration] before a meal (from the Latin ante cibus).
     * 
     */
    AC,

    /**
     * event occurs [duration] before breakfast (from the Latin ante cibus matutinus).
     * 
     */
    ACM,

    /**
     * event occurs [duration] before lunch (from the Latin ante cibus diurnus).
     * 
     */
    ACD,

    /**
     * event occurs [duration] before dinner (from the Latin ante cibus vespertinus).
     * 
     */
    ACV,

    /**
     * event occurs [duration] after a meal (from the Latin post cibus).
     * 
     */
    PC,

    /**
     * event occurs [duration] after breakfast (from the Latin post cibus matutinus).
     * 
     */
    PCM,

    /**
     * event occurs [duration] after lunch (from the Latin post cibus diurnus).
     * 
     */
    PCD,

    /**
     * event occurs [duration] after dinner (from the Latin post cibus vespertinus).
     * 
     */
    PCV;

    public java.lang.String value() {
        return name();
    }

    public static EventTimingList fromValue(java.lang.String v) {
        return valueOf(v);
    }

}
