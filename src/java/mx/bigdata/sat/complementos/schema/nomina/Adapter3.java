//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.14 at 10:26:51 AM CST 
//


package mx.bigdata.sat.complementos.schema.nomina;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return (mx.bigdata.sat.schema.binder.IntegerCustomBinder.parseInt(value));
    }

    public String marshal(Integer value) {
        return (mx.bigdata.sat.schema.binder.IntegerCustomBinder.printInt3LeadZeros(value));
    }

}
