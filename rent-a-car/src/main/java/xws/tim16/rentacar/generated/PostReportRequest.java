//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.21 at 01:33:30 PM CEST 
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
 *         &lt;element name="reportRequest" type="{https://ftn.uns.ac.rs/car}TReport"/&gt;
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
    "reportRequest"
})
@XmlRootElement(name = "PostReportRequest")
public class PostReportRequest {

    @XmlElement(required = true)
    protected TReport reportRequest;

    /**
     * Gets the value of the reportRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TReport }
     *     
     */
    public TReport getReportRequest() {
        return reportRequest;
    }

    /**
     * Sets the value of the reportRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TReport }
     *     
     */
    public void setReportRequest(TReport value) {
        this.reportRequest = value;
    }

}
