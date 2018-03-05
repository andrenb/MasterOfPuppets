package ninja.soumuito.mastecontrol;


import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by root on 02/03/18.
 */
public class Aluno{

    public String nome ;
    public String matricula;
    public String curso;
    public String campus;
    public ArrayList<Interesse> interesses = new ArrayList<>();
    public String data_nsc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public ArrayList<Interesse> getInteresses() {
       return interesses;
    }

   public void setInteresses(ArrayList<Interesse> interesses) {
        this.interesses = interesses;}

    public String getData_nsc() {
        return data_nsc;
    }

    public void setData_nsc(String data_nsc) {
        this.data_nsc = data_nsc;
    }

   }
