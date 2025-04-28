public class Principal
{
    public static void main(String args[])
    {
        Turma turma;
        Aluno a1, a2, a3;
        a1 = new Aluno("Aluno1", 1);
        a2 = new Aluno("Aluno2", 2);
        a3 = new Aluno("Aluno3", 3);

        turma = new Turma(9128, "Professor");

        turma.addAluno(a1);
        turma.addAluno(a2);
        turma.addAluno(a3);

        turma.printAlunos();                
    }
}
