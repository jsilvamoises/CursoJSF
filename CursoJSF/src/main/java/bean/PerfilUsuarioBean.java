/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Moises
 */
@ManagedBean
@ViewScoped
public class PerfilUsuarioBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String profissao;
    private String nome;
    private Interesse interesse;
    private String pais;

    private List<String> paises = new ArrayList<>();

    public String getPais() {
        return pais;
    }

    public List<String> getPaises() {
        return paises;
    }

    private List<String> parentes = new ArrayList<>();
    private String estado;
    private String cidade;

    private String sexo;
    private String filho;

    private String estadoCivil;
    private String telefone;
    private String cep;
    private String cpf;

    public void atualizarImputMask() {
        System.out.println("Telefone.: " + this.telefone);
        System.out.println("Cep.: " + this.cep);
        System.out.println("Cpf.: " + this.cpf);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!!!"));
        
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private List<String> estados = new ArrayList<>();
    private List<String> cidades = new ArrayList<>();

    public List<String> getEstados() {
        return estados;
    }

    public PerfilUsuarioBean() {
        paises.add("Brasil");
        paises.add("Estados Unidos");
        paises.add("China");
        paises.add("Bulgaria");
        paises.add("Canada");

        estados.add("RJ");
        estados.add("SP");
        estados.add("PE");
        estados.add("MG");

    }

    public List<String> sugerirPaises(String consulta) {
        List<String> paisesSugeridos = new ArrayList<>();
        for (String pais : this.paises) {
            if (pais.toLowerCase().startsWith(consulta)) {
                paisesSugeridos.add(pais);
            }
        }
        return paisesSugeridos;
    }

    public void atualizarCidades() {
        cidades.clear();
        if (estado.equals("RJ")) {
            cidades.add("RJ - A");
            cidades.add("RJ - B");
            cidades.add("RJ - C");
            cidades.add("RJ - D");
        } else if (estado.equals("PE")) {
            cidades.add("PE - A");
            cidades.add("PE - B");
            cidades.add("PE - C");
            cidades.add("PE - D");
        } else if (estado.equals("SP")) {
            cidades.add("SP - A");
            cidades.add("SP - B");
            cidades.add("SP - C");
            cidades.add("SP - D");
        } else if (estado.equals("MG")) {
            cidades.add("MG - A");
            cidades.add("MG - B");
            cidades.add("MG - C");
            cidades.add("MG - D");
        }

    }

    public List<String> getCidades() {
        return cidades;
    }

    public static final List<Interesse> INTERESSES = new ArrayList<>();

    static {
        INTERESSES.add(new Interesse("Esportes", "disk-icon-16"));
        INTERESSES.add(new Interesse("Computaçao", "disk-icon-16"));
        INTERESSES.add(new Interesse("Tecnologia", "disk-icon-16"));
        INTERESSES.add(new Interesse("Corrida", "disk-icon-16"));
    }

    public void atualizar() {
        System.out.println("Estado Civil.: " + this.estadoCivil);
        System.out.println("Sexo.: " + this.sexo);
      // System.out.println("Estadp.: " + this.estado);
        // System.out.println("Cidade.: " + this.cidade);
        //  System.out.println("Interesse.: " + this.interesse.getDescricao());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!!!"));
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Interesse getInteresse() {
        return interesse;
    }

    public void setInteresse(Interesse interesse) {
        this.interesse = interesse;
    }

    public List<Interesse> getInteresses() {
        return INTERESSES;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getFilho() {
        return filho;
    }

    public void setFilho(String filho) {
        this.filho = filho;
    }

    public List<String> getParentes() {
        return parentes;
    }

    public void setParentes(List<String> parentes) {
        this.parentes = parentes;
    }

}
