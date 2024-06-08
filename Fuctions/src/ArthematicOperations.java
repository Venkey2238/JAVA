import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArthematicOperations {
    public static int add(int c, int d)
    {
        return c+d;
    }
    public static int sub(int e, int f)
    {
        return e-f;
    }
    public static int div(int i, int j)
    {
        return i/j;
    }
    public static int mul(int k, int l)
    {
        return k*l;
    }
    public static int pow(int m)
    {
        return m*m;
    }
    public static int cube(int n)
    {
        return n*n*n;
    }


    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            System.out.println(add(a, b));
            System.out.println(sub(a, b));
            System.out.println(div(a, b));
            System.out.println(mul(a, b));
            System.out.println(pow(a));
            System.out.println(cube(a));
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
