/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.uad.tot.main;

import id.ac.uad.tot.model.Person;
import id.ac.uad.tot.provider.ApplicationContextProvider;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author jasoet
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext = 
                ApplicationContextProvider.getInstance().getApplicationContext();
        
        Person p = applicationContext.getBean("person",Person.class);
        
        System.out.println(p);
        
    }
}
