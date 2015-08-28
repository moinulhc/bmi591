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
 * <p>Java class for QueryOutcome-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryOutcome-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ok"/&gt;
 *     &lt;enumeration value="limited"/&gt;
 *     &lt;enumeration value="refused"/&gt;
 *     &lt;enumeration value="error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QueryOutcome-list")
@XmlEnum
public enum QueryOutcomeList {


    /**
     * The query was processed successfully.
     * 
     */
    @XmlEnumValue("ok")
    OK("ok"),

    /**
     * The query was processed successfully, but some additional limitations were added.
     * 
     */
    @XmlEnumValue("limited")
    LIMITED("limited"),

    /**
     * The server refused to process the query.
     * 
     */
    @XmlEnumValue("refused")
    REFUSED("refused"),

    /**
     * The server tried to process the query, but some error occurred.
     * 
     */
    @XmlEnumValue("error")
    ERROR("error");
    private final java.lang.String value;

    QueryOutcomeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static QueryOutcomeList fromValue(java.lang.String v) {
        for (QueryOutcomeList c: QueryOutcomeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
