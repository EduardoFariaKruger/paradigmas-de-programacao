class Estudante
{
    private String nome;
    private int notaFinal;


    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setNotaFinal(int notaFinal)
    {
        this.notaFinal = notaFinal;
    }

    public String getNome()
    {
        return this.nome;
    }

    public int getNotaFinal()
    {
        return this.notaFinal;
    }

    public void imprimirEstudante()
    {
        System.out.println("Estutande: " + this.nome + " nota final: " + this.notaFinal);
    }

    
    public Estudante(String nome, int notaFinal)
    {
        setNome(nome);
        setNotaFinal(notaFinal);
    }
}
