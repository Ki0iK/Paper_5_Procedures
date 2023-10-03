public class Main {
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5};
        int[] a_rev = reverse(a);   // call the reverse a,
                                    // no need/not int[] since a is already defined to be an array (prevously
                                    // with int[] a = , voilà
    }

    static int[] reverse (int[] a)
    {
        int[] a_rev = new int[a.length];
        for (int i = 0; i < a.length; i = i + 1)    // i starts from 0 cause array starts from [0],
                                                    // a.length since a_rev needs to have the ...
            a_rev [i] = a[a.length - 1 - i];// i in [] b/c a_rev starts from [0] e.g. first element.
                                            // So, then u write what it equals to something(num is arr a)
                                            // it will be stored in a_rev[i], then i is gonna increase
                                            // by 1, so you get a new slot option
        return a_rev;
    }

}