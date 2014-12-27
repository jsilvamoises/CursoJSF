/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import qualifier.Brasil;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.enterprise.inject.Produces;


/**
 *
 * @author Moises
 */
public class FormataData {
    @Produces @Brasil
    public DateFormat getFormatoBrasil(){
        return new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
    }
    @Produces
    public DateFormat getFormatoUSA(){
        return new SimpleDateFormat("yyyy/MM/dd", Locale.US);
    }
}
