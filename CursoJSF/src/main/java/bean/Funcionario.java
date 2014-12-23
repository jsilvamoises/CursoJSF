/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Moises
 */
public class Funcionario implements Serializable{
    
    private long matricula;
    @NotNull
    private String nome;    
    private Date dataAdmissao;
    private Float salario;

   

    Funcionario() {        
    }
    
    

    /**
     * Get the value of salario
     *
     * @return the value of salario
     */
    public Float getSalario() {
        return salario;
    }

    /**
     * Set the value of salario
     *
     * @param salario new value of salario
     */
    public void setSalario(Float salario) {
        this.salario = salario;
    }

    

    /**
     * Get the value of dataAdmissao
     *
     * @return the value of dataAdmissao
     */
    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    /**
     * Set the value of dataAdmissao
     *
     * @param dataAdmissao new value of dataAdmissao
     */
    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }


    /**
     * Get the value of nome
     *
     * @return the value of nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Set the value of nome
     *
     * @param nome new value of nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }


    /**
     * Get the value of matricula
     *
     * @return the value of matricula
     */
    public long getMatricula() {
        return matricula;
    }

    /**
     * Set the value of matricula
     *
     * @param matricula new value of matricula
     */
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

}
