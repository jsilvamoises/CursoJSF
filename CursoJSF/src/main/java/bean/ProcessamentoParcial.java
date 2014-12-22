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
public class ProcessamentoParcial implements Serializable {

    private static long serialVersionUID = 1L;
    private String login;
    private String nome;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void verificarDisponibilidadeLogin() {
        
        //Simula demora no processamento
        
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        
        
        
        FacesMessage msg = null;
        msg = new FacesMessage("Inciando verificação.");
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, msg);
        if ("moises.silva".equalsIgnoreCase(login)) {
            msg = new FacesMessage("Login em uso.");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);

        } else {
            msg = new FacesMessage("Login disponivel.");
            msg.setSeverity(FacesMessage.SEVERITY_INFO);

        }
        fc.addMessage(null, msg);
    }

    public void cadastrar() {
        System.out.println("Nome..: " + this.nome);
        System.out.println("Login.: " + this.login);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro efetuado com sucesso!"));

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
