public class Livro
{
    String titulo;
    int anoDePublicacao;
    Autor autor;

    public Livro(){}
    public Livro(String titulo, int anoDePublicacao, String nome, String nacionalidade)
    {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
        this.autor = new Autor(nome, nacionalidade);
    }
    public Livro(String titulo, int anoDePublicacao, Autor autor)
    {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
        this.autor = autor;
    }

    public String toString()
    {
        return String.format("%S, Escrito em %d por %S, nascido em %S", this.titulo, this.anoDePublicacao, this.autor.nome, this.autor.nacionalidade);
    }
}
