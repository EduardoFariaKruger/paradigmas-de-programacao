public class Mago extends Personagem
{
    public Mago(String nome, double nivel, double forcaBase)
    {
        super(nome, nivel, forcaBase);
    }

    @Override
    public double calcularDano()
    {
        return this.forcaBase * this.nivel * 1.5 - 10;        
    }
}
