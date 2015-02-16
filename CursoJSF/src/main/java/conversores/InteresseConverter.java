/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversores;

import bean.OldCategoria;
import bean.PerfilUsuarioBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter("interesse")
public class InteresseConverter  implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if(value!=null){
            for(OldCategoria interesse:PerfilUsuarioBean.INTERESSES){
                if(value.equals(interesse.getDescricao())){
                    return interesse;
                }
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object value) {
        if(value!=null && !value.equals("")){
          OldCategoria interesse = (OldCategoria)value;
          return interesse.getDescricao();
        }
        return null;
    }

   
    
}
