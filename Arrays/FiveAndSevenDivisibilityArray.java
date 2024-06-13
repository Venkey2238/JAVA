import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FiveAndSevenDivisibilityArray {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            ArrayList<Integer> dival = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                if(arr[i]%5==0 && arr[i]%7==0)
                {
                    dival.add(arr[i]);
                }
            }
            for(int i=0;i<dival.size();i++)
            {
                System.out.print(dival.get(i) + " ");
            }

        }
        catch (IOException e)
        {
            System.out.println("IOException e");
        }
    }
}
