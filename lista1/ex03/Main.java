import java.util.Scanner;

public class Main
{
    public static int function(int x)
    {
        if(x >= 0 && x < 5)
        {
            return x;
        }
        else if(x >= 5 && x < 10)
        {
            return 2*x + 1;
        }
        else if (x >= 10)
        {
            return x - 3;
        }
        else
        {
            return -1;
        }
    }
    public static void main(String args[])
    {
        int x;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um valor: ");
        x = scanner.nextInt();

        System.out.println("f(x) vale: " + function(x));
        
    }
}
