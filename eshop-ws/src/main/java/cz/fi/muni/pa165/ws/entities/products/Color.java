//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.28 at 11:04:25 PM CET 
//


package cz.fi.muni.pa165.ws.entities.products;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Color.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Color">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BLACK"/>
 *     &lt;enumeration value="WHITE"/>
 *     &lt;enumeration value="RED"/>
 *     &lt;enumeration value="GREEN"/>
 *     &lt;enumeration value="BLUE"/>
 *     &lt;enumeration value="ORANGE"/>
 *     &lt;enumeration value="YELLOW"/>
 *     &lt;enumeration value="AZURE"/>
 *     &lt;enumeration value="MAGENTA"/>
 *     &lt;enumeration value="BROWN"/>
 *     &lt;enumeration value="PINK"/>
 *     &lt;enumeration value="GRAY"/>
 *     &lt;enumeration value="UNDEFINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Color")
@XmlEnum
public enum Color {

    BLACK,
    WHITE,
    RED,
    GREEN,
    BLUE,
    ORANGE,
    YELLOW,
    AZURE,
    MAGENTA,
    BROWN,
    PINK,
    GRAY,
    UNDEFINED;

    public String value() {
        return name();
    }

    public static Color fromValue(String v) {
        return valueOf(v);
    }

}
