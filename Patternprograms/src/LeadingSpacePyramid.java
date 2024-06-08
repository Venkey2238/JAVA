import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeadingSpacePyramid {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
            for(int i=1;i<=n;i++)
            {
                for(int j=i;j<=(m-1);j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++)
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
