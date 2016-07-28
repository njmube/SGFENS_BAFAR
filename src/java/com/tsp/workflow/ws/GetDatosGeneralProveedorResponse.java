
package com.tsp.workflow.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getDatosGeneralProveedorResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getDatosGeneralProveedorResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.workflow.tsp.com/}consultaDatosGralProveedorResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDatosGeneralProveedorResponse", propOrder = {
    "_return"
})
public class GetDatosGeneralProveedorResponse {

    @XmlElement(name = "return")
    protected ConsultaDatosGralProveedorResponse _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaDatosGralProveedorResponse }
     *     
     */
    public ConsultaDatosGralProveedorResponse getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaDatosGralProveedorResponse }
     *     
     */
    public void setReturn(ConsultaDatosGralProveedorResponse value) {
        this._return = value;
    }

}
