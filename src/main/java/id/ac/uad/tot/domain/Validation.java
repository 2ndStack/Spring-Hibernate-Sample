package id.ac.uad.tot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */

@Entity
@Table(name = "VALIDATION_TABLE")
public class Validation {
    @Id
    @Column(name = "KEYCOL")
    private Long keycol;

    public Long getKeycol() {
        return keycol;
    }

    public void setKeycol(Long keycol) {
        this.keycol = keycol;
    }
}
