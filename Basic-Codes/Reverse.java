import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int rev = 0;
            while(n!=0)
            {
                rev = rev*10 + n%10;
                n = n/10;
            }
            System.out.println(rev);
        }
        catch(IOException e)
        {
            System.out.println("IOEXception");
        }

    }

}
