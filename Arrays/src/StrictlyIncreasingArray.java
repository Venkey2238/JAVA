import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrictlyIncreasingArray {
    public static void main(String[] args) {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] =  Integer.parseInt(reader.readLine());
            }
            boolean isStrictlyIncreacing = true;
            for(int i=0;i<n-1;i++)
            {
                if(arr[i]>=arr[i+1])
                {
                    isStrictlyIncreacing = false;
                    break;
                }

            }
            if(isStrictlyIncreacing)
            {
                System.out.println("yes it is");
            }
            else
            {
                System.out.println("it's not");
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException e");
        }
    }
}
