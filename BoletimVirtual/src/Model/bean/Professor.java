
package Model.bean;

/**
 *
 * @author MATHEUS1
 */
public class Professor extends Usuario {
    //atributos
    private int matricula;
    private String titulacao;

    
    //construtor padrão
    public Professor(){
        super();
        titulacao = "";
       
    }

    //construtor padrão
    public Professor(String titulacao, String disciplina) {
        this.titulacao = titulacao;
        
    }
    
    //getters e setters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    //Métodos
    public void Imprimir(){
        super.toString();
        System.out.println(titulacao);
      
    }
    
    
    
    
}
