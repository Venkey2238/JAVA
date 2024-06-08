import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddNumberPyramidWithSpace {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j+=2)
                {
                   System.out.print(j);
                   if(j<i)
                   {
                       System.out.print("_");
                   }
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
//1
//1_
//1_3
//1_3_
//1_3_5


