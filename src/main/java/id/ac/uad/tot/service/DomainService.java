package id.ac.uad.tot.service;

import id.ac.uad.tot.domain.Trip;
import id.ac.uad.tot.domain.TripType;
import id.ac.uad.tot.repository.TripTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Deny Prasetyo,S.T
 * Java(Script) Developer and Trainer
 * Co-Founder | 2ndStack Studio
 * jasoet87@gmail.com
 * <p/>
 * http://github.com/jasoet
 * http://bitbucket.com/jasoet
 * <p/>
 * [at]jasoet
 */

@Service(value = "domainService")
public class DomainService {

    @Autowired
    private TripTypeRepository tripTypeRepository;

    @Transactional
    public void saveTripType(TripType tripType) {
        tripTypeRepository.save(tripType);
    }

    public Iterable<TripType> findAllTripType() {
        return tripTypeRepository.findAll();
    }

    public List<TripType> findAllTripTypeByName(String name) {
        return tripTypeRepository.findByName(name);
    }

  /*  @Transactional
    public void saveTrip(Trip trip) {
        entityManager.persist(trip);
    }

    public List<Trip> findAllTrip() {
        return entityManager.createQuery("SELECT o FROM Trip o", Trip.class).getResultList();
    }

    public List<Trip> findAllTripByTripType(TripType type) {
        return entityManager.createQuery("SELECT o FROM Trip o WHERE o.tripType=:tripType", Trip.class)
                .setParameter("tripType", type).getResultList();
    }

    public List<Trip> findAllTripByTripTypeName(String name) {
        return entityManager.createQuery("SELECT o FROM Trip o WHERE o.tripType.name LIKE :tripType", Trip.class)
                .setParameter("tripType", name).getResultList();
    }*/

}
