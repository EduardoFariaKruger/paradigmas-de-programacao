import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        
        int numero;
        boolean ehPar; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("escreva um numero: ");

        numero = scanner.nextInt();
        ehPar = numero % 2 == 0;
        if(ehPar)
        {
            System.out.println("o numero digitado é Par");
            System.exit(1);
        }
        System.out.println("o numero digitado é Impar");
        System.exit(1);
    }
}
