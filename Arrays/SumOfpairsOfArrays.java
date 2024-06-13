import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfpairsOfArrays {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int count = 0;
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i] + arr[j] == b)
                    {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        catch (IOException e)
        {
            System.out.println("IOException e");
        }
    }
}
