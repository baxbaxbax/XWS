//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.12 at 07:42:17 AM CEST 
//


package xws.tim16.rentacar.generated;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="occupiedRequest" type="{https://ftn.uns.ac.rs/car}TOccupied"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "occupiedRequest"
})
@XmlRootElement(name = "PostOccupiedRequest")
public class PostOccupiedRequest {

    @XmlElement(required = true)
    protected TOccupied occupiedRequest;

    /**
     * Gets the value of the occupiedRequest property.
     *
     * @return
     *     possible object is
     *     {@link TOccupied }
     *
     */
    public TOccupied getOccupiedRequest() {
        return occupiedRequest;
    }

    /**
     * Sets the value of the occupiedRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link TOccupied }
     *     
     */
    public void setOccupiedRequest(TOccupied value) {
        this.occupiedRequest = value;
    }

}
