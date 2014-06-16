package id.ac.uad.tot.domain;

import id.ac.uad.tot.domain.enums.BookingStatus;
import id.ac.uad.tot.domain.enums.CarType;

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
@Table(name = "CAR_RENTAL")
public class CarRental {
    @Id
    @Column(name = "CAR_RENTAL_ID")
    @SequenceGenerator(name = "carRental", sequenceName = "CAR_RENTAL")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "carRental")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "TRIP_ID", nullable = false)
    private Trip trip;
    @Column(name = "PROVIDER", length = 35)
    private String provider;
    @Column(name = "CITY", length = 35)
    private String city;
    @Column(name = "PICKUP_DATE")
    @Temporal(TemporalType.DATE)
    private Date pickupDate;
    @Column(name = "RETURN_DATE")
    @Temporal(TemporalType.DATE)
    private Date returnDate;
    @Column(name = "CAR_TYPE", nullable = false)
    private CarType carType;
    @Column(name = "RATE")
    private Double rate;
    @Column(name = "BOOKING_STATUS", nullable = false)
    private BookingStatus bookingStatus;
    @Column(name = "LAST_UPDATE")
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

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
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