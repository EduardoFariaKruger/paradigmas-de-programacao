import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int contador = 0;
        float peso, altura, imc;
        peso = 0f;
        altura = 0f;
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Digite o peso: ");
            peso = scanner.nextFloat();
            System.out.println("Digite a altura: ");
            altura = scanner.nextFloat();
            if(peso != -1 && altura != 1)
            {
                imc = peso / (altura*altura);
                if (imc > 25)
                {
                    contador += 1;
                }
            }
            else
            {
                break;
            }
        }
        System.out.println(contador + " pessoas estão acima do peso");
    }
}
