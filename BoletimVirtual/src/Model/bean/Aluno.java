package Model.bean;

import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class Aluno  extends Usuario{

    //Atributos
    private String  nomeDaMae ,nomeDoPai, telefone, celular ; 
    private int matricula;
    private Curso curso;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Nota> notas;
    
    //Costrutor PAdrão
    public Aluno(){
        super();
        nomeDaMae = "";
        nomeDoPai = "";
        telefone = "";
        celular = "";
        matricula = 0;
       // curso = new Curso();
        disciplinas = new ArrayList();
        notas = new ArrayList();
    }
    
    //Contrutor Personalizado

    public Aluno(String nomeDaMae, String nomeDoPai, String telefone, String celular, int matricula, Curso curso, ArrayList<Disciplina> disciplinas, ArrayList<Nota> notas) {
        this.nomeDaMae = nomeDaMae;
        this.nomeDoPai = nomeDoPai;
        this.telefone = telefone;
        this.celular = celular;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.notas = notas;
    }
    
    //Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
    
}
