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
public class InputTextArea implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String nome;
    private String sobre;
    private List<String> lista;
    
    public List<String> autoCompletar(String consulta){
        lista = new ArrayList<>();
        lista.add("MOISES JUVENAL SILVA");
        lista.add("SANDRA ADRIANA DA SILVA");
        lista.add("ABRAO JUVENAL DA SILVA");
        lista.add("ANDRES SILVA ROSA");
        lista.add("CARLOS ALBERTO");
        lista.add("NESTOR CAMPOS");
        lista.add("ISAQUE NILTON");
        lista.add("MAIRA CAMPOS");
        lista.add("ESTALINA COIMBRA");
        return lista;
    }
    public void atualizar(){
        System.err.println("Sobre.: " +this.sobre);
        FacesContext.getCurrentInstance().addMessage(sobre, new FacesMessage("Perfil atualizado!!!"));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }
    
}
