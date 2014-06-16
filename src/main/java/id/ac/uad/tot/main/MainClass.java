/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.uad.tot.main;

import id.ac.uad.tot.domain.TripType;
import id.ac.uad.tot.provider.ApplicationContextProvider;
import id.ac.uad.tot.service.DomainService;
import org.springframework.context.ApplicationContext;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;

/**
 * @author jasoet
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                ApplicationContextProvider.getInstance().getApplicationContext();

        DomainService domainService = applicationContext.getBean("domainService", DomainService.class);

        TripType tt = new TripType();
        tt.setName("Plesir");
        tt.setDescription("Jalan Jalan Sore");
        tt.setLastUpdated(new Date());

        domainService.saveTripType(tt);

        tt = domainService.findTripTypeById(tt.getId());
        tt.setName("Oke Oke Oke");
        domainService.saveTripType(tt);

        List<TripType> result = domainService.findAllTripType();


        System.out.println(result);
    }
}
