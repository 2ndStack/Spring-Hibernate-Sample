package id.ac.uad.tot.domain;

import javax.persistence.*;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
@Entity
@Table(name = "PERSON_TRIP")
public class PersonTrip {
    @Id
    @Column(name = "TRIP_ID")
    @SequenceGenerator(name = "personTrip", sequenceName = "PERSON_TRIP")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "personTrip")
    private Long id;
    @Column(name = "NAME", length = 50)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
