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
public class Pessoa {
    //Atributos
    private String nome, cpf, endereco;
    
    //Construtor Padrão

    public Pessoa(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    //Set e Get
    public Pessoa(){
        nome = "";
        cpf = "";
        endereco = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    //Método
    public void Imprimir(){
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(endereco);
    }
}
