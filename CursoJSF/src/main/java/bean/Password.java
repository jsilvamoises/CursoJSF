/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
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
public class Password implements Serializable {
   private static final long serialVersionUID = 1L;
   private String login;
   private String senha;

    public Password() {
    }
    
    public void atualizar(){
        System.out.println("Senha.: "+senha);
        FacesContext.getCurrentInstance().addMessage(login, new FacesMessage("Perfil atualizado!!!"));
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
