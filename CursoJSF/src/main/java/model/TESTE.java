/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.hibernate.Session;
import util.hibernate.HibernateUtil;

/**
 *
 * @author Moises
 */
public class TESTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TESTE().entityM();
        System.exit(0);
        
    }
    
    
    public void hibernate(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();
       List<Endereco> enderecos = new ArrayList<>();
        try {
            Cliente c = new Cliente();
            c.setCpf("215.049.798-00");
            c.setEmail("jsilva.moises@gmail.com");
            //c.setEnderecos(null);
            c.setNome("MOISES JUVENAL DA SILVA");
            c.setTipoPessoa(TipoPessoa.JURIDICA);
            
            Endereco endereco = new Endereco();
            endereco.setCep("13.221-301");
            endereco.setCidade("JUNDIAI");
            endereco.setCliente(c);
            endereco.setComplemento("CASA");
            endereco.setLogradouro("RUA MARIANA");
            endereco.setNumero("158");
            endereco.setUf("NG");
            enderecos.add(endereco);
            
            endereco = new Endereco();
            endereco.setCep("13.221-300");
            endereco.setCidade("VARZEA PAULISTA");
            endereco.setCliente(c);
            endereco.setComplemento("CADA");
            endereco.setLogradouro("RUA BERTIOGA");
            endereco.setNumero("49");
            endereco.setUf("SP");
            
            enderecos.add(endereco);
            c.setEnderecos(enderecos);               
            
            
            session.persist(c);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
    }
    
     public void entityM(){
         EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoPU");
         EntityManager manager = factory.createEntityManager();
         
         EntityTransaction transaction = manager.getTransaction();
         transaction.begin();
         
          List<Endereco> enderecos = new ArrayList<>();
        try {
             Cliente c = new Cliente();
            c.setCpf("215.049.798-00");
            c.setEmail("jsilva.moises@gmail.com");
            //c.setEnderecos(null);
            c.setNome("MOISES JUVENAL DA SILVA");
            c.setTipoPessoa(TipoPessoa.JURIDICA);
            
            Endereco endereco = new Endereco();
            endereco.setCep("13.221-301");
            endereco.setCidade("JUNDIAI");
            endereco.setCliente(c);
            endereco.setComplemento("CASA");
            endereco.setLogradouro("RUA MARIANA");
            endereco.setNumero("158");
            endereco.setUf("NG");
            enderecos.add(endereco);
            
            endereco = new Endereco();
            endereco.setCep("13.221-300");
            endereco.setCidade("VARZEA PAULISTA");
            endereco.setCliente(c);
            endereco.setComplemento("CADA");
            endereco.setLogradouro("RUA BERTIOGA");
            endereco.setNumero("49");
            endereco.setUf("SP");
            
            enderecos.add(endereco);
            
            c.setEnderecos(enderecos);  
            
            
            manager.persist(c);
            transaction.commit();
        } catch (Exception e) {
           transaction.rollback();
        }
    }
    
}
