/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simualdores;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.security.auth.callback.ConfirmationCallback;

/**
 *
 * @author Moises
 */
@ManagedBean
@ViewScoped
public class SimProdutosBean {
    private List<String> produtos = new ArrayList<>();
    private String produtoSelecionado;
    private String novoProduto;
    public SimProdutosBean() {
        produtos.add("Arroz");
        produtos.add("Feijao");
        produtos.add("Mandioca");
        produtos.add("Queijo");
        
    }
    
    public void adcionarProduto(){
        if(!produtos.contains(novoProduto)){
            produtos.add(novoProduto);
            novoProduto = "";
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Produto ".concat(novoProduto).concat(" Adicionado com sucesso!")));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Produto ".concat(novoProduto).concat(" Não pode ser incluído por já está cadastrado!")));
        }
        
    }
    
    public void removerProduto(){
        if(produtos.remove(produtoSelecionado)){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Produto ".concat(produtoSelecionado).concat(" removido com sucesso!")));
        }
        
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }

    public String getProduto() {
        return produtoSelecionado;
    }

    public void setProduto(String produto) {
        this.produtoSelecionado = produto;
    }

    public String getProdutoSelecionado() {
        return produtoSelecionado;
    }

    public void setProdutoSelecionado(String produtoSelecionado) {
        this.produtoSelecionado = produtoSelecionado;
    }

    public String getNovoProduto() {
        return novoProduto;
    }

    public void setNovoProduto(String novoProduto) {
        this.novoProduto = novoProduto;
    }
    
}
