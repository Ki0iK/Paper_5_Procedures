public class Main {
    public static void main(String[] args)
    {
        int[] a = {7, 4, -11};
        int[] b = {8, 133};
        int[] c = concatenate (a, b);
        for (int x : c)
            System.out.print(x + " ");
    }
    static int[] concatenate (int[] a, int[] b)
    {
        int[] res = new int [a.length + b.length]; // needs to contain both of the elements, res = result

        int i = 0; // index in the array res

        // copy the elements of a
        for (int v : a)
        {
            res [i] = v; // [i] = the index
            i = i + 1; // to get new element for a
        }

        // copy the elements of b
        for (int v : b)
        {
            res [i] = v; // [i] = the index
            i = i + 1; // to get new element for a
        }

        return res;
    }
}