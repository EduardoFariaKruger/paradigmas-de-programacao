import java.util.Scanner;

class Principal
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int nota;
        int exame = 0;
        int reprovados = 0;
        int media = 0;
        
        Estudante[] vetor = new Estudante[5];

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Nome do estudante " + (i+1) + ": ");
            nome = scanner.nextLine();
            System.out.println("Nota final do estudante " + (i+1) + ": ");
            nota = scanner.nextInt();
            scanner.nextLine();
            vetor[i] = new Estudante(nome, nota);
            if(nota < 70 && nota >= 40)
            {
                exame++;
            }
            if(nota < 40)
            {
                reprovados++;
            }
            media += nota;
        }

        System.out.println("Media da turma: " + media/5);
        System.out.println("Numero de estudantes reprovados: " + reprovados);
        System.out.println("Numero de estudantes em exame final: " + exame);
        System.out.println("Lista de alunos aprovados:");
        for(int i = 0; i < 5; i++)
        {
            if(vetor[i].getNotaFinal() >= 70)
            {
                vetor[i].imprimirEstudante();
            }
        }
        
    }
}
