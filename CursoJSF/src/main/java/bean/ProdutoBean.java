/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import model.Categoria;
import model.Produto;
import repositoty.CategoriaRepository;
import util.jsf.FacesUtil;

/**
 *
 * @author Moises
 */
@Named
@ViewScoped
public class ProdutoBean implements Serializable {

    @Inject
    private CategoriaRepository categoriaRepository;

    private Produto produto;

    private List<Categoria> categoriasRaizes;
    
    private List<Categoria> subCategorias;
    private Categoria categoriaPai;

    public ProdutoBean() {
       produto = new Produto();
    }

    public void init() {
        if (FacesUtil.isNotPostback()) {
            categoriasRaizes = categoriaRepository.getListCategorias();
            System.err.println("Iniciando pesquisa");
        }

    }
    
    public void listarSubcategorias(){
        subCategorias = categoriaRepository.getListsSubCategorias(categoriaPai);
    }
    
    public void limpar(){
        produto = new Produto();
    }

    public void salvar() {
        System.out.println("" + categoriaPai.getDescricao());
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Categoria> getCategorias() {
        return categoriasRaizes;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categoriasRaizes = categorias;
    }

    public Categoria getCategoria() {
        return categoriaPai;
    }

    public void setCategoria(Categoria categoria) {
        this.categoriaPai = categoria;
    }

    public Categoria getCategoriaPai() {
        return categoriaPai;
    }

    public void setCategoriaPai(Categoria categoriaPai) {
        this.categoriaPai = categoriaPai;
    }

    public List<Categoria> getSubCategorias() {
        return subCategorias;
    }

}
