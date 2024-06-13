import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static int factorial(int a)
    {
        int fact = 1;
        for(int i=1;i<=a;i++)
        {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            System.out.println(factorial(n));
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
