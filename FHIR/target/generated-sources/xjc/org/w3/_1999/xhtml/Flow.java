//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 10:09:54 PM MST 
//


package org.w3._1999.xhtml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * 
 * 				"Flow" mixes block and inline and is used for list items etc.
 * 			
 * 
 * <p>Java class for Flow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}p"/&gt;
 *             &lt;choice&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h1"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h2"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h3"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h4"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h5"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h6"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}div"/&gt;
 *             &lt;choice&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}ul"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}ol"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}dl"/&gt;
 *             &lt;/choice&gt;
 *             &lt;choice&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}pre"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}hr"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}blockquote"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}table"/&gt;
 *           &lt;/choice&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}a"/&gt;
 *             &lt;choice&gt;
 *               &lt;choice&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}br"/&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}span"/&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}bdo"/&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}map"/&gt;
 *               &lt;/choice&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}img"/&gt;
 *             &lt;/choice&gt;
 *             &lt;choice&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}tt"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}i"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}b"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}big"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}small"/&gt;
 *             &lt;/choice&gt;
 *             &lt;choice&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}em"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}strong"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}dfn"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}code"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}q"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}samp"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}kbd"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}var"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}cite"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}abbr"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}acronym"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}sub"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}sup"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/choice&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flow", propOrder = {
    "content"
})
@XmlSeeAlso({
    Div.class,
    Td.class,
    Th.class,
    Dd.class,
    Li.class
})
public class Flow implements ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "em", namespace = "http://www.w3.org/1999/xhtml", type = Em.class, required = false),
        @XmlElementRef(name = "h2", namespace = "http://www.w3.org/1999/xhtml", type = H2 .class, required = false),
        @XmlElementRef(name = "blockquote", namespace = "http://www.w3.org/1999/xhtml", type = Blockquote.class, required = false),
        @XmlElementRef(name = "map", namespace = "http://www.w3.org/1999/xhtml", type = Map.class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.w3.org/1999/xhtml", type = Q.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.w3.org/1999/xhtml", type = Tt.class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.w3.org/1999/xhtml", type = Dfn.class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://www.w3.org/1999/xhtml", type = Ul.class, required = false),
        @XmlElementRef(name = "kbd", namespace = "http://www.w3.org/1999/xhtml", type = Kbd.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.w3.org/1999/xhtml", type = Span.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.w3.org/1999/xhtml", type = Big.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.w3.org/1999/xhtml", type = Img.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.w3.org/1999/xhtml", type = Var.class, required = false),
        @XmlElementRef(name = "bdo", namespace = "http://www.w3.org/1999/xhtml", type = Bdo.class, required = false),
        @XmlElementRef(name = "ol", namespace = "http://www.w3.org/1999/xhtml", type = Ol.class, required = false),
        @XmlElementRef(name = "h4", namespace = "http://www.w3.org/1999/xhtml", type = H4 .class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.w3.org/1999/xhtml", type = Strong.class, required = false),
        @XmlElementRef(name = "h1", namespace = "http://www.w3.org/1999/xhtml", type = H1 .class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.w3.org/1999/xhtml", type = I.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://www.w3.org/1999/xhtml", type = Table.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.w3.org/1999/xhtml", type = Br.class, required = false),
        @XmlElementRef(name = "h6", namespace = "http://www.w3.org/1999/xhtml", type = H6 .class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.w3.org/1999/xhtml", type = Cite.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://www.w3.org/1999/xhtml", type = Acronym.class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.w3.org/1999/xhtml", type = Small.class, required = false),
        @XmlElementRef(name = "h5", namespace = "http://www.w3.org/1999/xhtml", type = H5 .class, required = false),
        @XmlElementRef(name = "h3", namespace = "http://www.w3.org/1999/xhtml", type = H3 .class, required = false),
        @XmlElementRef(name = "p", namespace = "http://www.w3.org/1999/xhtml", type = P.class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.w3.org/1999/xhtml", type = Samp.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.w3.org/1999/xhtml", type = Abbr.class, required = false),
        @XmlElementRef(name = "div", namespace = "http://www.w3.org/1999/xhtml", type = Div.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.w3.org/1999/xhtml", type = B.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.w3.org/1999/xhtml", type = Sub.class, required = false),
        @XmlElementRef(name = "dl", namespace = "http://www.w3.org/1999/xhtml", type = Dl.class, required = false),
        @XmlElementRef(name = "hr", namespace = "http://www.w3.org/1999/xhtml", type = Hr.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.w3.org/1999/xhtml", type = Code.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://www.w3.org/1999/xhtml", type = A.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.w3.org/1999/xhtml", type = Sup.class, required = false),
        @XmlElementRef(name = "pre", namespace = "http://www.w3.org/1999/xhtml", type = Pre.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;

    /**
     * 
     * 				"Flow" mixes block and inline and is used for list items etc.
     * 			Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link H2 }
     * {@link Em }
     * {@link Blockquote }
     * {@link Map }
     * {@link Tt }
     * {@link Q }
     * {@link Dfn }
     * {@link String }
     * {@link Ul }
     * {@link Kbd }
     * {@link Span }
     * {@link Img }
     * {@link Big }
     * {@link Bdo }
     * {@link Var }
     * {@link Ol }
     * {@link H4 }
     * {@link H1 }
     * {@link Strong }
     * {@link I }
     * {@link Table }
     * {@link Br }
     * {@link H6 }
     * {@link Cite }
     * {@link Acronym }
     * {@link Small }
     * {@link H5 }
     * {@link H3 }
     * {@link P }
     * {@link Samp }
     * {@link Abbr }
     * {@link B }
     * {@link Div }
     * {@link Hr }
     * {@link Dl }
     * {@link Sub }
     * {@link A }
     * {@link Code }
     * {@link Sup }
     * {@link Pre }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    public String toString() {
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
        {
            List<Object> theContent;
            theContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            strategy.appendField(locator, this, "content", buffer, theContent);
        }
        return buffer;
    }

}
