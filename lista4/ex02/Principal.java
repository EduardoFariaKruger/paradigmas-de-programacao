public class Principal
{
    public static void main(String[] args)
    {
        Autor autor = new Autor("Jorge Amado", "Brasil");
        Livro livro = new Livro("Titulo", 2025, autor);

        livro.exibir();
        
    }
}
