public class Main {
    public static void main(String[] args)
    {
       int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
       System.out.println(contains(array, 2000));

       int[] a = {1, 3, 2, 4, 5,6 };
       int[] b = {0, 0, 8, 9, 0, 8};
        System.out.println(any(a, b));
    }

    // part 1.
    static boolean contains (int[] array, int value) // contains take sin () = parameters
    {
        boolean contains = false;
        for (int n : array) // goes through the array = traverses the array7
        {
            if (n == value)
                contains = true;
        }
        return contains;
    }

    // part 2.
    static boolean any (int[] a, int[] b)
    {
        boolean any = false;
        for (int aa : a)
        {
            if (contains(b, aa) == true) // checking if true
               any = true;
        }
        return any;

    }
}