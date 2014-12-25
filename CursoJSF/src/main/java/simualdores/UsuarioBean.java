/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simualdores;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Moises
 */
@ManagedBean
public class UsuarioBean {
    private List<Integer> lista = new ArrayList<>();
    public List<Integer> getLista(){
        for(int i = 0; i < 100; i ++){
            lista.add(i);
        }
    return lista;
    }
}
