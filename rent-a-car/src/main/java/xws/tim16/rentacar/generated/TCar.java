//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.21 at 01:33:30 PM CEST 
//


package xws.tim16.rentacar.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TCar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="markId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="modelId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="fuelId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="gearboxId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="carClassId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="kilometrage" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="numberOfChildSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hasAndroid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCar", namespace = "https://ftn.uns.ac.rs/ad", propOrder = {
    "id",
    "markId",
    "modelId",
    "fuelId",
    "gearboxId",
    "carClassId",
    "userId",
    "kilometrage",
    "numberOfChildSeats",
    "hasAndroid"
})
public class TCar {

    protected long id;
    protected long markId;
    protected long modelId;
    protected long fuelId;
    protected long gearboxId;
    protected long carClassId;
    protected long userId;
    protected double kilometrage;
    protected int numberOfChildSeats;
    protected boolean hasAndroid;

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

    /**
     * Gets the value of the markId property.
     * 
     */
    public long getMarkId() {
        return markId;
    }

    /**
     * Sets the value of the markId property.
     * 
     */
    public void setMarkId(long value) {
        this.markId = value;
    }

    /**
     * Gets the value of the modelId property.
     * 
     */
    public long getModelId() {
        return modelId;
    }

    /**
     * Sets the value of the modelId property.
     * 
     */
    public void setModelId(long value) {
        this.modelId = value;
    }

    /**
     * Gets the value of the fuelId property.
     * 
     */
    public long getFuelId() {
        return fuelId;
    }

    /**
     * Sets the value of the fuelId property.
     * 
     */
    public void setFuelId(long value) {
        this.fuelId = value;
    }

    /**
     * Gets the value of the gearboxId property.
     * 
     */
    public long getGearboxId() {
        return gearboxId;
    }

    /**
     * Sets the value of the gearboxId property.
     * 
     */
    public void setGearboxId(long value) {
        this.gearboxId = value;
    }

    /**
     * Gets the value of the carClassId property.
     * 
     */
    public long getCarClassId() {
        return carClassId;
    }

    /**
     * Sets the value of the carClassId property.
     * 
     */
    public void setCarClassId(long value) {
        this.carClassId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the kilometrage property.
     * 
     */
    public double getKilometrage() {
        return kilometrage;
    }

    /**
     * Sets the value of the kilometrage property.
     * 
     */
    public void setKilometrage(double value) {
        this.kilometrage = value;
    }

    /**
     * Gets the value of the numberOfChildSeats property.
     * 
     */
    public int getNumberOfChildSeats() {
        return numberOfChildSeats;
    }

    /**
     * Sets the value of the numberOfChildSeats property.
     * 
     */
    public void setNumberOfChildSeats(int value) {
        this.numberOfChildSeats = value;
    }

    /**
     * Gets the value of the hasAndroid property.
     * 
     */
    public boolean isHasAndroid() {
        return hasAndroid;
    }

    /**
     * Sets the value of the hasAndroid property.
     * 
     */
    public void setHasAndroid(boolean value) {
        this.hasAndroid = value;
    }

}