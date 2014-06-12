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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author jasoet
 */
@Entity
@Table(name = "TRIP_TYPE")
public class TripType {

    @Id
    @Column(name = "TRIP_TYPE_ID")
    @SequenceGenerator(name = "tripTypeSequence", sequenceName = "TRIP_TYPE_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "tripTypeSequence")
    private Integer id;
    @Column(name = "NAME", nullable = false, length = 125)
    private String name;
    @Column(name = "DESCRIPTION",length = 1555)
    private String description;
    @Column(name = "LAST_UPDATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "TripType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
