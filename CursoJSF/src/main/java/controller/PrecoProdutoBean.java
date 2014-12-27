/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import service.CalculadoraPreco;

/**
 *
 * @author Moises
 */
@Named("meuBean")
@Dependent
//@RequestScoped
//@SessionScoped
//@ApplicationScoped
public class PrecoProdutoBean implements Serializable{
    @Inject
    private CalculadoraPreco calculadoraPreco;
    @PostConstruct
    public void init(){
        System.out.println("Inicializando preco produto bean");
    }
    public double getPreco(){
        
       
        return calculadoraPreco.calcularPreco(12, 44.55);
    }
}
