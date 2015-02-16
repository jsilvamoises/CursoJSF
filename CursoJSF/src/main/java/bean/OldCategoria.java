/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author Moises
 */

public class OldCategoria implements Serializable{
    private static final long serialVersionUID = 1L;
    private String descricao;
    private String icon;

    public OldCategoria() {
    }

    public OldCategoria(String descricao, String icon) {
        this.descricao = descricao;
        this.icon = icon;
    }
   
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    
}
