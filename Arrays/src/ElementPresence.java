import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElementPresence {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int[] arr = new int[n];
            int b = Integer.parseInt(reader.readLine());
            for(int i=0;i<n;i++)
            {
                arr[i] =  Integer.parseInt(reader.readLine());
            }
            for(int i=0;i<n;i++)
            {
                if(arr[i]==b)
                {
                    System.out.println("1");
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
