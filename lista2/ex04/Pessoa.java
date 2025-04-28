import java.time.LocalDate;
import java.time.Period;

public class Pessoa
{
    private String nome;
    private int idade;
    public Data dataDeNascimento;

    
    public Pessoa(String nome) {
        this.nome = nome;
        this.dataDeNascimento = new Data();
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
        LocalDate dataNascimento = LocalDate.of(this.dataDeNascimento.ano, this.dataDeNascimento.mes, this.dataDeNascimento.dia);
        LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);
        this.idade = Period.between(dataNascimento, dataAtual).getYears();
    }
}
