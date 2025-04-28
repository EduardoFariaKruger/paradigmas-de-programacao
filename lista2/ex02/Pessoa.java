import java.time.LocalDate;
import java.time.Period;

public class Pessoa
{
    private String nome;
    private int idade;
    private int dia;
    private int mes;
    private int ano;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void ajustarDataDeNascimento(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String retornarNome()
    {
        return this.nome;
    }

    public int retornarIdade()
    {
        return this.idade; 
    }

    public void calcularIdade(int diaAtual, int mesAtual, int anoAtual)
    {
        LocalDate dataNascimento = LocalDate.of(this.ano, this.mes, this.dia);
        LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);
        this.idade = Period.between(dataNascimento, dataAtual).getYears();
    }
}
