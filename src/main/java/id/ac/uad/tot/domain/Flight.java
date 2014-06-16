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
@Table(name = "FLIGHT")
public class Flight {
    @Id
    @Column(name = "FLIGHT_ID")
    @SequenceGenerator(name = "flight", sequenceName = "FLIGHT")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "flight")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "TRIP_ID", nullable = false)
    private Trip trip;
    @Column(name = "DIRECTION", length = 5)
    private String direction;
    @Column(name = "FLIGHT_NUM", length = 20)
    private String flightNum;
    @Column(name = "DEPTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deptime;
    @Column(name = "DEPAIRPORT", length = 35)
    private String depairport;
    @Column(name = "ARR_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date arrTime;
    @Column(name = "ARR_AIRPORT")
    private String arrAirport;
    @Column(name = "AIR_LINE_NAME")
    private String airLineName;
    @Column(name = "BOOKING_STATUS")
    private BookingStatus bookingStatus;
    @Column(name = "LAST_UDATE")
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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public Date getDeptime() {
        return deptime;
    }

    public void setDeptime(Date deptime) {
        this.deptime = deptime;
    }

    public String getDepairport() {
        return depairport;
    }

    public void setDepairport(String depairport) {
        this.depairport = depairport;
    }

    public Date getArrTime() {
        return arrTime;
    }

    public void setArrTime(Date arrTime) {
        this.arrTime = arrTime;
    }

    public String getArrAirport() {
        return arrAirport;
    }

    public void setArrAirport(String arrAirport) {
        this.arrAirport = arrAirport;
    }

    public String getAirLineName() {
        return airLineName;
    }

    public void setAirLineName(String airLineName) {
        this.airLineName = airLineName;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
