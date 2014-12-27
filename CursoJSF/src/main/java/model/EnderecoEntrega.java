/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author Moises
 */
@Embeddable
public class EnderecoEntrega implements Serializable {

    private static final long serialVersionUID = 1L;

    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;
    private String cep;

    public EnderecoEntrega() {
    }

    @NotBlank @Size(max = 150)
    @Column(name = "logradouro", nullable = false, length = 150)
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    @NotNull@Size(max = 50)
    @Column(name = "numero", nullable = false, length = 50)
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Column(name = "complemento", length = 50)
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    @NotBlank @Size(max = 150)
    @Column(name = "cidade", nullable = false, length = 150)
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    @NotBlank @Size(max = 100)
    @Column(name = "estado", nullable = false, length = 100)
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    @NotBlank @Size(max = 10)   
     @Column(name = "cep", nullable = false, length = 10)
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
