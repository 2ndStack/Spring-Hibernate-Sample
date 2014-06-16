package id.ac.uad.tot.repository;

import id.ac.uad.tot.domain.TripType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

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

public interface TripTypeRepository extends PagingAndSortingRepository<TripType, Integer> {

    @Query("SELECT o FROM TripType o WHERE o.name LIKE :name")
    public List<TripType> findByName(@Param("name") String name);
}
