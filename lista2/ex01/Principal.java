public class Principal
{
    public static void main(String[] args)
    {
        Pessoa graceHopper = new Pessoa("Grace Hopper");
        Pessoa adaLovelace = new Pessoa("Ada Lovelace");

        graceHopper.ajustarDataDeNascimento(9, 12, 1906);
        adaLovelace.ajustarDataDeNascimento(10, 12, 1815);

        graceHopper.calcularIdade(31, 3, 2025);
        adaLovelace.calcularIdade(31, 3, 2025);

        System.out.println("Idade de Grace: " + graceHopper.retornarIdade());
        System.out.println("Idade de Ada: " + adaLovelace.retornarIdade());
    }
}
