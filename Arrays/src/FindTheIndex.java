import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTheIndex {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            for(int i=0;i<n;i++)
            {
                if(arr[i] == b)
                {
                    System.out.println(i);
                }
            }

        }
        catch (IOException e)
        {
            System.out.println("IOException e");
        }
    }
}
