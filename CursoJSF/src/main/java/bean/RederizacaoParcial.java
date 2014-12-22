/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Moises
 */
@ManagedBean
@ViewScoped
public class RederizacaoParcial {

    private static final long SerialVersionUID = 1L;
    
    private String nome;
    private String nomeInvertido;
    private int quantidadePalavras;
    
    public void inverter(){
        this.nomeInvertido = "";
        this.quantidadePalavras = 0;
        if(this.nome != null && !this.nome.isEmpty()){
            this.quantidadePalavras = 1;
        }
        
        for(int i = this.nome.length()-1;i>=0;i--){
            char letra = this.nome.charAt(i);
            this.nomeInvertido+=letra;
            
            if(letra== ' '){
                this.quantidadePalavras++;
            }
        }
        
        System.err.println("Nome invertido.: "+nomeInvertido);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeInvertido() {
        return nomeInvertido;
    }

    public void setNomeInvertido(String nomeInvertido) {
        this.nomeInvertido = nomeInvertido;
    }

    public int getQuantidadePalavras() {
        return quantidadePalavras;
    }

    public void setQuantidadePalavras(int quantidadePalavras) {
        this.quantidadePalavras = quantidadePalavras;
    }
    
    
    
    
}
