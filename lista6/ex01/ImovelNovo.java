public class ImovelNovo extends Imovel
{
    public ImovelNovo(Endereco endereco, double preco)
    {
        this.endereco = endereco;
        this.preco = preco;
    }
    public double calcularValorImovel()
    {
        return this.preco * 1.2f;
    }
}
