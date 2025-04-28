public class Principal
{
    public static void main(String[] args)
    {
        Time time = new Time(21, 10);
        System.out.println("É igual? " + time.equals(20, 10));
        System.out.println("É anterior? " + time.anterior(20, 10));
        System.out.println("É posterior? " + time.posterior(20, 10));

        System.out.println(time);
    }
}
