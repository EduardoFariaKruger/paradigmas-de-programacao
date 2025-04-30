public class ImovelVelho extends Imovel
{
    public ImovelVelho(Endereco endereco, double preco)
    {
        this.endereco = endereco;
        this.preco = preco;
    }

    public double calcularValorImovel()
    {
        return this.preco;
    }
}
