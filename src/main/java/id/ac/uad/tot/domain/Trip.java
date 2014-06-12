/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.uad.tot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author jasoet
 */
@Entity
@Table(name = "TRIP")
public class Trip {
    @Id
    @Column(name = "TRIP_ID")
    @SequenceGenerator(name = "tripSequence", sequenceName = "TRIP_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "tripSequence")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "PERSON_ID", nullable = false)
    private Person person;
    @Column(name = "DEP_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date depDate;
    @Column(name = "DEP_CITY")
    private String depCity;
    @Column(name = "DEST_CITY")
    private String destCity;
    @ManyToOne
    @JoinColumn(name = "TRIP_TYPE_ID", nullable = false)
    private TripType tripType;
    @Column(name = "LAST_UPDATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getDepDate() {
        return depDate;
    }

    public void setDepDate(Date depDate) {
        this.depDate = depDate;
    }

    public String getDepCity() {
        return depCity;
    }

    public void setDepCity(String depCity) {
        this.depCity = depCity;
    }

    public String getDestCity() {
        return destCity;
    }

    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }

    public TripType getTripType() {
        return tripType;
    }

    public void setTripType(TripType tripType) {
        this.tripType = tripType;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Trip{");
        sb.append("id=").append(id);
        sb.append(", person=").append(person);
        sb.append(", depDate=").append(depDate);
        sb.append(", depCity='").append(depCity).append('\'');
        sb.append(", destCity='").append(destCity).append('\'');
        sb.append(", tripType=").append(tripType);
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append('}');
        return sb.toString();
    }
}
