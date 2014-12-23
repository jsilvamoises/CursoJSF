/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author Moises
 */
@ViewScoped
@ManagedBean
public  class FuncionarioBean  implements Serializable{
    private Funcionario funcionario; ;
    private double somaSalario=0.00;
    public FuncionarioBean() {
        funcionario = new Funcionario();
         listaFuncionario.clear();
         for(int i=0;i<100;i++){
             funcionario = new Funcionario();
             funcionario.setMatricula(i);
             funcionario.setNome("MOISES "+i);
             funcionario.setDataAdmissao(Calendar.getInstance().getTime());
             funcionario.setSalario(new Float(i*102));
             somaSalario+=funcionario.getSalario();
             listaFuncionario.add(funcionario);
         }
    }

   
    
    
    
    private List<Funcionario> listaFuncionario = new ArrayList<>();
    
    public void preencherListaFuncionario(){
        
         
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Funcionario> getListaFuncionario() {
       
        return listaFuncionario;
    }

    public void setListaFuncionario(List<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }

    public double getSomaSalario() {
        return somaSalario;
    }

    public void setSomaSalario(Float somaSalario) {
        this.somaSalario = somaSalario;
    }
    
}
