public class Arqueiro extends Personagem
{
    public Arqueiro(String nome, double nivel, double forcaBase)
    {
        super(nome, nivel, forcaBase);
    }
    
    @Override
    public double calcularDano()
    {
        return this.forcaBase * this.nivel + 15;
    }
}
