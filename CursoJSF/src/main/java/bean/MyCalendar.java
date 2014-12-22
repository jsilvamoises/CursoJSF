/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.util.Calendar;

/**
 *
 * @author Moises
 */
@ManagedBean
@ViewScoped
public class MyCalendar implements Serializable{
    private String nome;
    private Date dataNascimento;
    
    public void atualizar(){
        System.err.println("Data nascimento.: " +this.dataNascimento);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!!!"));
    }
    
    public Date maxDate(){
        Date data = Calendar.getInstance().getTime();
        return data;
                
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
}
