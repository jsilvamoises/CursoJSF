/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Moises
 */
public enum FormaPagamento implements Serializable{
    DINHEIRO, CARTAO_CREDITO, CARTAO_DEBITO,CHEQUE, BOLETO_BANCARIO,DEPOSITO_BANCARIO
    
}
