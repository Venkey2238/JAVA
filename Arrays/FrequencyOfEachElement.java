import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FrequencyOfEachElement {
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
            int[] freq = new int[n];
            for(int i=0;i<n;i++)
            {
                int digit = arr[i];
                int count = 0;
                for(int j=0;j<n;j++)
                {
                    if(digit == arr[j])
                    {
                        count++;
                    }
                }
                freq[i] = count;
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(freq[i] + " ");
            }
        }
        catch (IOException e)
        {
            System.out.println("IOExeception e");
        }

    }
}
