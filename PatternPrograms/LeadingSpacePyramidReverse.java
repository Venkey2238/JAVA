import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeadingSpacePyramidReverse {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
            for(int i=n;i>=1;i--)
            {
                for(int j=n-i;j>=1;j--)
                {
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
