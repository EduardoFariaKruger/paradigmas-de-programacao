public class Main
{
    public static void main(String args[])
    {
        int somador;
        somador = 0;
        for(int i = 1; i < 11; i++)
        {
            somador += 3*i;
        }
        System.out.println("A soma dos 10 primeiros multiplos de 3 é: " + somador);
    }
}
