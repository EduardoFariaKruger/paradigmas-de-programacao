import java.util.*;

public class Turma
{
    private int codigo;
    private String nomeDoProfessor;
    private ArrayList<Aluno> alunos;

    public Turma(){}
    public Turma(int codigo, String nomeDoProfessor)
    {
        this.codigo = codigo;
        this.nomeDoProfessor = nomeDoProfessor;
        this.alunos = new ArrayList<Aluno>();
    }
    public void addAluno(Aluno aluno)
    {
        this.alunos.add(aluno);
    }
    public void printAlunos()
    {
        for(Aluno aluno: this.alunos)
        {
            System.out.println(aluno);
        }
    }    
}
