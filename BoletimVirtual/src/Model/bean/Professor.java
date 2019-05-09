/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

/**
 *
 * @author MATHEUS1
 */
public class Professor extends Pessoa {
    //atributos
    private String titulacao, disciplina;
    
    //construtor padrão
    public Professor(){
        super();
        titulacao = "";
        disciplina = "";
    }

    //construtor padrão
    public Professor(String titulacao, String disciplina) {
        this.titulacao = titulacao;
        this.disciplina = disciplina;
    }
    
    //getters e setters

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    //Métodos
    public void Imprimir(){
        super.Imprimir();
        System.out.println(titulacao);
        System.out.println(disciplina);
    }
    
    
    
    
}
