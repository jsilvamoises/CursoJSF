package theme;

import javax.inject.Inject;
import javax.inject.Named;
import userconfiguration.ConfiguracoesForm;

@Named
public class Theme {
    @Inject
    private ConfiguracoesForm configuracoesForm;
 
    private int id;
     
    private String displayName;
     
    private String name;
     
    public Theme() {}
 
    public Theme(int id, String displayName, String name) {
       
        this.id = id;
        this.displayName = displayName;
        this.name = name;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getDisplayName() {
        return displayName;
    }
 
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
 
    public String getName() {
       // configuracoesForm.setTema(name.isEmpty()?"bootstrap":name);
        return name;
    }
 
    public void setName(String name) {
        System.err.println("Passou aqui");
        configuracoesForm.setTema(name.isEmpty()?"bootstrap":name);
        this.name = name;
    }
    
    
     
    @Override
    public String toString() {
        return name;
    }

    public ConfiguracoesForm getConfiguracoesForm() {
        return configuracoesForm;
    }

    public void setConfiguracoesForm(ConfiguracoesForm configuracoesForm) {
        this.configuracoesForm = configuracoesForm;
    }
}