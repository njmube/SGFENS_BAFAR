
package com.sap.bafar.ws.consultadispersion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Messtab" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBdcmsgcoll"/>
 *         &lt;element name="Subrc" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="TDisp" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZcmlOrdPago"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messtab",
    "subrc",
    "tDisp"
})
@XmlRootElement(name = "ZfmtrDisperResponse")
public class ZfmtrDisperResponse {

    @XmlElement(name = "Messtab", required = true)
    protected TableOfBdcmsgcoll messtab;
    @XmlElement(name = "Subrc", required = true)
    protected String subrc;
    @XmlElement(name = "TDisp", required = true)
    protected TableOfZcmlOrdPago tDisp;

    /**
     * Obtiene el valor de la propiedad messtab.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBdcmsgcoll }
     *     
     */
    public TableOfBdcmsgcoll getMesstab() {
        return messtab;
    }

    /**
     * Define el valor de la propiedad messtab.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBdcmsgcoll }
     *     
     */
    public void setMesstab(TableOfBdcmsgcoll value) {
        this.messtab = value;
    }

    /**
     * Obtiene el valor de la propiedad subrc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubrc() {
        return subrc;
    }

    /**
     * Define el valor de la propiedad subrc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubrc(String value) {
        this.subrc = value;
    }

    /**
     * Obtiene el valor de la propiedad tDisp.
     * 
     * @return
     *     possible object is
     *     {@link TableOfZcmlOrdPago }
     *     
     */
    public TableOfZcmlOrdPago getTDisp() {
        return tDisp;
    }

    /**
     * Define el valor de la propiedad tDisp.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfZcmlOrdPago }
     *     
     */
    public void setTDisp(TableOfZcmlOrdPago value) {
        this.tDisp = value;
    }

}
