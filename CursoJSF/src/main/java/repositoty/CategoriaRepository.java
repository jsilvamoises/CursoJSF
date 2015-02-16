/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositoty;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Categoria;

/**
 *
 * @author Moises
 */
public class CategoriaRepository implements Serializable {

    private static final long serialVersionUID = 1L;
    @Inject
    private EntityManager manager;

    public List<Categoria> getListCategorias() {
        return manager.createQuery("SELECT C FROM Categoria C WHERE C.categoriaPai IS NULL").getResultList();
    }
    
    public List<Categoria> getListsSubCategorias(Categoria categoriaPai) {
        return manager.createQuery("SELECT C FROM Categoria C WHERE C.categoriaPai = :RAIZ", Categoria.class)
                .setParameter("RAIZ", categoriaPai)
                .getResultList();
    }

    public Categoria getCategoria(Long id) {
        if (id > 0) {
            Query q = manager.createQuery("SELECT c FROM Categoria c WHERE c.id = :id",Categoria.class);
            q.setParameter("id", id);
            return (Categoria) q.getResultList().get(0);
        }
        return null;
    }

}
