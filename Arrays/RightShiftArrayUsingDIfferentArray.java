import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightShiftArrayUsingDIfferentArray {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int[] arr = new int[n];
            int[] newarr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            int last = arr[n-1];
            for(int i=0;i<n-1;i++)
            {
                newarr[i+1] = arr[i];
            }
            newarr[0] = last;
            for(int i=0;i<n;i++)
            {
                System.out.print(newarr[i] + " ");
            }

        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
