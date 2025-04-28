import java.util.*;

class Principal
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);


        String frase1, frase2;

        System.out.println("Escreva a primeira frase: ");
        frase1 = scanner.nextLine();

        System.out.println("Escreva a segunda frase: ");
        frase2 = scanner.nextLine();

        System.out.println("Frase1 ao contrário: ");
        for(int i = frase1.length() - 1; i > 0; i--)
        {
            if (frase1.charAt(i) == 'A')
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(frase1.charAt(i));
            }
        }
        System.out.println();

        System.out.println("Frase2 ao contrário: ");        
        for(int i = frase2.length() - 1; i > 0; i--)
        {
            if (frase2.charAt(i) == 'A')
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(frase2.charAt(i));
            }
        }
        System.out.println();
    }
}
