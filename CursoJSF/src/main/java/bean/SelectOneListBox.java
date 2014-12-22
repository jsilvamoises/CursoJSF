/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Moises
 */
@ManagedBean
@ViewScoped
public class SelectOneListBox implements Serializable{
   private static final long serialVersionUID = 1L;
    
   private String profissao;
   private String nome;
   private Interesse interesse;
   public static final List<Interesse> INTERESSES = new ArrayList<>();
   static {
       INTERESSES.add(new Interesse("Esportes", "disk-icon-16"));
       INTERESSES.add(new Interesse("Computaçao", "disk-icon-16"));
       INTERESSES.add(new Interesse("Tecnologia", "disk-icon-16"));
       INTERESSES.add(new Interesse("Corrida", "disk-icon-16"));
   }
   public void atualizar(){
       System.out.println("Profissão.: " + this.profissao);
       System.out.println("Interesse.: " + this.interesse.getDescricao());
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!!!"));
   }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Interesse getInteresse() {
        return interesse;
    }

    public void setInteresse(Interesse interesse) {
        this.interesse = interesse;
    }
    
    
    public List<Interesse> getInteresses(){
        return INTERESSES;
    }

  
    
}
