public class LampadaFluorescente extends Lampada
{
    private int comprimento;

    public LampadaFluorescente(boolean ligado, int comprimento)
    {
        this.ligado = ligado;
        this.comprimento = comprimento;
    }    

    public void setComprimento(int comprimento)
    {
        this.comprimento = comprimento;
    }
    public int getComprimento()
    {
        return this.comprimento;
    }
}
