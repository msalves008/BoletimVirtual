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
    private double nota1, nota2 , media;
    
    //Construtor Padrão

    public Nota() {
        nota1 = 0;
        nota2 = 0;
    }
    
    
    //Construtor Personalizado

    public Nota(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    //Getters e Setters
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

   // método
    
    public double CalcularMedia(){
       media = (nota1 + nota2)/2;
       return media;
    }

    
}
