public class Principal
{
    public static void main(String[] args)
    {
        Pessoa[] pessoas = new Pessoa[2];
        pessoas[0] = new Pessoa("Grace Hopper");
        pessoas[1] = new Pessoa("Ada Lovelace");

        pessoas[0].ajustarDataDeNascimento(9, 12, 1906);
        pessoas[1].ajustarDataDeNascimento(10, 12, 1815);

        for(int i = 0; i < 2; i++)
        {
            pessoas[i].calcularIdade(31, 3, 2025);
            System.out.println("Idade de " + pessoas[i].retornarNome() + ": " + pessoas[i].retornarIdade());
        }
    }
}
