/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.jpa;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Moises
 */
@ApplicationScoped
public class EntityManagerProducer {
    private final EntityManagerFactory factory;
    
    public EntityManagerProducer(){
        factory = Persistence.createEntityManagerFactory("PedidoPU");
    }
    @Produces @RequestScoped
    public EntityManager createEntityManager(){
        return factory.createEntityManager();
    }
    
    public void closeEntityManager(@Disposes EntityManager manager){
        System.out.println("Fechando entity manager");
        manager.close();
    }
    
}
