/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

/**
 *
 * @author ALUNO
 */
public class Boletim {
    
    //atributos
    private Aluno aluno;
    
    //construtor padrão
    public Boletim(){
        aluno = new Aluno();
    }

    //construtor personalizado
    public Boletim(Aluno aluno) {
        this.aluno = aluno;
    }

    //getters e setters
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
 
}
