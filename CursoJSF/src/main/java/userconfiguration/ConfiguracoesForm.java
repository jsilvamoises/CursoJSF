/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userconfiguration;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Moises
 */
@Named
@ApplicationScoped
public class ConfiguracoesForm {
    private String tema = "bootstrap";

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        System.err.println("Tema selecionado" + tema);
        this.tema = tema;
    }
    
}
