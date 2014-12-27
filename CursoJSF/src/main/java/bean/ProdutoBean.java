/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import model.Produto;

/**
 *
 * @author Moises
 */
@Named
@RequestScoped
public class ProdutoBean {
    private Produto produto;

    public ProdutoBean() {
        produto = new Produto();
    }
    
    public void salvar(){
        
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
    
}
