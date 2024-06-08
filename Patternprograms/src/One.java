import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        catch(IOException e)
        {
            System.out.println("IOException");
        }
    }
}
