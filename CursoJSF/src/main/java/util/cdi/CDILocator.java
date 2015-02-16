/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.cdi;

 
import java.util.Iterator;
 
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.naming.InitialContext;
import javax.naming.NamingException;
 
/**
 *
 * @author Moises
 */
public class CDILocator {
	
	private static BeanManager getBeanManager(){
		try {
			return (BeanManager) InitialContext.doLookup("java:comp/BeanManager");
		} catch (NamingException e) {
			throw new RuntimeException(e);
		}
	}
	
	@SuppressWarnings("unchecked")
    public static <T> T getBean(final Class<T> clazz) {
        final BeanManager bm = getBeanManager();
        final Iterator<Bean<?>> iter = bm.getBeans(clazz).iterator();
        if (!iter.hasNext()) {
            throw new IllegalStateException("CDI BeanManager cannot find an instance of requested type " + clazz.getName());
        }
        final Bean<T> bean = (Bean<T>) iter.next();
        final CreationalContext<T> ctx = bm.createCreationalContext(bean);
        return (T) bm.getReference(bean, clazz, ctx);
    }
}
