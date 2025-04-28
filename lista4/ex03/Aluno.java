public class Aluno
{
    private String nome;
    private int cr;

    public Aluno(){}
    public Aluno(String nome, int cr)
    {
        this.nome = nome;
        this.cr = cr;
    }

    public String toString()
    {
        return String.format("%S:%d", this.nome, this.cr);
    }
}
