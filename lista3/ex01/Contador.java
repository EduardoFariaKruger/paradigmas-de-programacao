public class Contador
{
    private int valor;

    public int getValor()
    {
        return this.valor;
    }

    public void setValor(int valor)
    {
        if(valor >= 0)
        {
            this.valor = valor;
        }
    }

    public void zerarContador()
    {
        this.valor = 0;
    }

    public void incrementarContador()
    {
        this.valor++;
    }

    public void decrementarContador()
    {
        if(this.valor > 0)
        {
            this.valor--;
        }
    }
}
