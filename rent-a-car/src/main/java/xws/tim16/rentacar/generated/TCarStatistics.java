//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.12 at 07:42:17 AM CEST 
//


package xws.tim16.rentacar.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TCarStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCarStatistics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comments" type="{https://ftn.uns.ac.rs/car}TComment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="grades" type="{https://ftn.uns.ac.rs/car}TGrade" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reports" type="{https://ftn.uns.ac.rs/car}TReport" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCarStatistics", propOrder = {
    "comments",
    "grades",
    "reports",
    "id"
})
public class TCarStatistics {

    protected List<TComment> comments;
    protected List<TGrade> grades;
    protected List<TReport> reports;
    protected long id;

    /**
     * Gets the value of the comments property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TComment }
     *
     *
     */
    public List<TComment> getComments() {
        if (comments == null) {
            comments = new ArrayList<TComment>();
        }
        return this.comments;
    }

    /**
     * Gets the value of the grades property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grades property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrades().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TGrade }
     *
     *
     */
    public List<TGrade> getGrades() {
        if (grades == null) {
            grades = new ArrayList<TGrade>();
        }
        return this.grades;
    }

    /**
     * Gets the value of the reports property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reports property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReports().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TReport }
     *
     *
     */
    public List<TReport> getReports() {
        if (reports == null) {
            reports = new ArrayList<TReport>();
        }
        return this.reports;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

}
