/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import model.Categoria;


import repositoty.CategoriaRepository;

@FacesConverter(value = "catcon",forClass = model.Categoria.class)
public class CategoriaConverter implements Converter{
    @Inject
    private  CategoriaRepository categoriaRepository ;

    public CategoriaConverter() {
     //  categoriaRepository = CDILocator.getBean(CategoriaRepository.class);
    }
    
    

   
    
    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        model.Categoria categoria = null;
       // value = value.replace("model.Categoria@b", "");
        System.out.println(" valor sendo passado"+value);
        try {
            if(value!= null){  
                Long id = new Long(value);
                   categoria =  categoriaRepository.getCategoria(id);               
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        
        
        return categoria;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object value) {
        Categoria c;
        if(value != null && value instanceof Categoria){
            c = (Categoria)value;
            System.out.println("val "+c.getId());
        return String.valueOf(c);
    
    }
        
        return "";
    }

    
    
    
    
   
    
}
