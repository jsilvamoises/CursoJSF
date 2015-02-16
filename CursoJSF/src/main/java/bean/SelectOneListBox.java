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
   private OldCategoria interesse;
   public static final List<OldCategoria> INTERESSES = new ArrayList<>();
   static {
       INTERESSES.add(new OldCategoria("Esportes", "disk-icon-16"));
       INTERESSES.add(new OldCategoria("Computaçao", "disk-icon-16"));
       INTERESSES.add(new OldCategoria("Tecnologia", "disk-icon-16"));
       INTERESSES.add(new OldCategoria("Corrida", "disk-icon-16"));
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

    public OldCategoria getInteresse() {
        return interesse;
    }

    public void setInteresse(OldCategoria interesse) {
        this.interesse = interesse;
    }
    
    
    public List<OldCategoria> getInteresses(){
        return INTERESSES;
    }

  
    
}
