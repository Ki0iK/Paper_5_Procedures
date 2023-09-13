public class Main {
    public static void main(String[] args) // the main is also a method/procedure (that takes in string)
    {
        System.out.println(abs (-15));
        System.out.println(distance (-15, -33)); // tings that go in are in parentheses separated by a comma
    }

    // part 1.
    // int comes out, int goes in // two ints, the 1st int out, 2nd int out (?)
    // static is technical , means - this method exists (even if only created)
    // abs - name of a variable (could be what ever)
    // signature of a method (?)
    static int abs (int x) // the signature, need to specify everything - what in, out, etc.
    {
        // body of the method, specify what is the code that implements this procedure
        if (x >= 0)
            return x;
        else
            return -x;
    }

    // part 2.
    static int distance (int a, int b)
    {
        return abs (a - b);
    }
}