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
public class CadastroAlunoBean implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String nome;
    private String email;

    public void Cadastrar() {
        System.out.println("Nome" + this.nome);
        System.out.println("Email" + this.email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
