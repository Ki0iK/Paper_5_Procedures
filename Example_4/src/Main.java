public class Main {
    public static void main(String[] args)
    {
        int[] vs = {5, -1, 2, 11, -16};
        //swap (vs, 0, 2); // for 1.
        reverse (vs); // for 2.
        for (int v : vs)
            System.out.print(v + " ");
    }

    // for 2.
    static void reverse (int[] array)
    {
        int l = array.length;
        for (int i = 0; i < l / 2; i = i + 1)
            swap (array, i, l - 1 - i);
    }

    // for 1. actual method
    static void swap (int[] array, int ind1, int ind2)
    {
        int tmp = array [ind1];
        array [ind1] = array [ind2];
        array [ind2] = tmp;
    }
}