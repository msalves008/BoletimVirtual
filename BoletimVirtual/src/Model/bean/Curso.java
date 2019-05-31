/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

import java.util.ArrayList;

/**
 *
 * @author MATHEUS1
 */
public class Curso {
    
     //Atributos
    private int id;
    private String nome;
    private Aluno aluno;
    private ArrayList<Disciplina> disciplinas;
    
    //Contrutor padrão
    public Curso(){
        nome = "";
        //aluno = new Aluno();
        disciplinas = new ArrayList();
    }
    
    //Construtor Personalizado

    public Curso(int id , String nome, Aluno aluno, Disciplina disciplina) {
        this.nome = nome;
        this.id = id;
        this.aluno = aluno;
        this.disciplinas = new ArrayList();
    }
    
    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    
}
