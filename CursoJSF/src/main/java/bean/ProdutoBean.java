/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Categoria;
import model.Produto;

/**
 *
 * @author Moises
 */
@Named
@RequestScoped
public class ProdutoBean {
    private Produto produto;
    @Inject
    private EntityManager manager;
    
    private List<Categoria> categorias;

    public ProdutoBean() {
        produto = new Produto();
    }
    
    public void init(){
        
        categorias = manager.createQuery("SELECT C FROM Categoria C", Categoria.class).getResultList();
       
    }
    
    public void salvar(){
        
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    
    
}
