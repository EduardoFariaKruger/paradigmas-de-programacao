public class Guerreiro extends Personagem
{
    public Guerreiro(String nome, double nivel, double forcaBase)
    {
        super(nome, nivel, forcaBase);
    }

    @Override
    public double calcularDano()
    {
        return this.forcaBase * this.nivel * 1.2;
    }
}
