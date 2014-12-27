/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.annotation.PostConstruct;

/**
 *
 * @author Moises
 */
public class CalculadoraPreco {
    @PostConstruct
    public void init(){
        System.out.println("Inicializando Calculadora preco");
    }
    public double calcularPreco(int quantidade, double preco){
        return quantidade*preco;
    }
    
}
