public abstract class Personagem implements Comparable<Personagem>
{
    protected String nome;
    protected double nivel;
    protected double forcaBase;

    protected abstract double calcularDano();
    protected String getNome()
    {
        return this.nome;
    }

    public Personagem(String nome, double nivel, double forcaBase)
    {
        this.nome = nome;
        this.nivel = nivel;
        this.forcaBase = forcaBase;
    } 

    public int compareTo(Personagem outro)
    {
        if(this.calcularDano() > outro.calcularDano())
        {
            return 1;
        }
        if(this.calcularDano() < outro.calcularDano())
        {
            return -1;
        }
        return 0;
    }
}
