/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class Disciplina {

    //Atributos
   private int id;
    private String nome ;
    private ArrayList<Aluno> alunos;
    private Professor professor;
    
    //Construtor Padrão
    public Disciplina(){
        nome = "";
        alunos = new ArrayList();
        professor = new Professor();
    }
    
    //Construtor Personalizado

    public Disciplina(String nome, ArrayList<Aluno> alunos, Professor professor) {
        this.nome = nome;
        this.alunos = alunos;
        this.professor = professor;
    }
    
    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
