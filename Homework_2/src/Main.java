public class Main {
    public static void main(String[] args)
    {
        for (int n = 0; n < 21; n = n + 1)
            System.out.print(sumUpTo (n) + " ");
    }
    static int sumUpTo (int n)
    {
        return (n * (n + 1)) / 2;
    }
}