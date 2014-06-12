/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.uad.tot.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

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
@Table(name = "PERSON")
public class Person {
    @Id
    @Column(name = "PERSON_ID")
    @SequenceGenerator(name = "personSequence", sequenceName = "PERSON_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "personSequence")
    private Integer id;
    @Column(name = "NAME", length = 255, nullable = false)
    private String name;
    @Column(name = "JOB_TITLE", length = 255)
    private String jobTitle;
    @Column(name = "FREQUENT_FLYER")
    private Integer frequentFlyer;
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Integer getFrequentFlyer() {
        return frequentFlyer;
    }

    public void setFrequentFlyer(Integer frequentFlyer) {
        this.frequentFlyer = frequentFlyer;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("jobTitle", jobTitle)
                .append("frequentFlyer", frequentFlyer)
                .append("lastUpdated", lastUpdated)
                .toString();
    }
}
