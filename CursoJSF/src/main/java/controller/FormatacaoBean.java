/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import qualifier.Brasil;

/**
 *
 * @author Moises
 */
@Named("data")

@RequestScoped
public class FormatacaoBean implements Serializable{
   @Inject @Brasil
    private DateFormat formatoData;
   
    private Date dataInformada ;
    private String dataFormatada;

    public FormatacaoBean() {
    }
    
    
    public void enviar(){
       
        dataFormatada = formatoData.format(dataInformada);
        System.out.println(dataFormatada);
       
    }

    public DateFormat getFormatoData() {
        return formatoData;
    }

    public void setFormatoData(DateFormat formatoData) {
        this.formatoData = formatoData;
    }

    public Date getDataInformada() {
        return dataInformada;
    }

    public void setDataInformada(Date dataInformada) {
        this.dataInformada = dataInformada;
    }

    public String getDataFormatada() {
        return dataFormatada;
    }

    public void setDataFormatada(String dataFormatada) {
        this.dataFormatada = dataFormatada;
    }

    
}
