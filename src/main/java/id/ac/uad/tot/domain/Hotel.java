package id.ac.uad.tot.domain;

import id.ac.uad.tot.domain.enums.BookingStatus;

import javax.persistence.*;
import java.util.Date;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
@Entity
@Table(name = "HOTEL")
public class Hotel {
    @Id
    @SequenceGenerator(name = "hotel", sequenceName = "HOTEL")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "hotel")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "TRIP_ID", nullable = false)
    private Trip trip;
    @Column(name = "HOTEL_NAME", length = 50)
    private String name;
    @Column(name = "CHECK_IN")
    @Temporal(TemporalType.DATE)
    private Date checkIn;
    @Column(name = "CHECK_OUT")
    @Temporal(TemporalType.DATE)
    private Date checkOut;
    @Column(name = "GUEST")
    private Integer guest;
    @Column(name = "BOOKING_STATUS")
    private BookingStatus status;
    @Column(name ="LAST_UPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Integer getGuest() {
        return guest;
    }

    public void setGuest(Integer guest) {
        this.guest = guest;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
