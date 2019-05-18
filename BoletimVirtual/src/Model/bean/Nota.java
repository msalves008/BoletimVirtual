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
public class Nota {
    
    //Atributos
    private double nota;
    
    //Construtor Padrão
    public Nota(){
        nota = 0;
    }
    
    //Construtor Personalizado

    public Nota(double nota) {
        this.nota = nota;
    }
    
    //Getters e Setters

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    

    
}
