import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigitsTestcase {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(reader.readLine());
            for(int i=0;i<t;i++)
            {
                int n = Integer.parseInt(reader.readLine());
                int sum =0;
                int temp = n;
                while(temp!=0)
                {
                    sum = sum + temp%10;
                    temp = temp / 10;
                }
                System.out.println(sum);
                
            }

        }
        catch(IOException e)
        {
            System.out.println("IOException");
        }
    }
}
