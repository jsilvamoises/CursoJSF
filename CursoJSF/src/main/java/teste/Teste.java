/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import org.hibernate.Session;
import util.hibernate.HibernateUtil;

/**
 *
 * @author Moises
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();
        
        org.hibernate.Query q = session.createQuery("SELECT U FROM Usuario U");
        System.err.println(q.list().size());;
                
    }
    
}
