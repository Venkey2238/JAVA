import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumArray {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int[] arr  = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            int sum = 0;
            for(int i=0;i<n;i++)
            {
                sum += arr[i];
            }
            System.out.println(sum);
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
