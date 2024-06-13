import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FunctionReturnArray {
    public static int[] sum(int N)
    {
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i] = i+1;
        }
        return (arr);
    }
    public static void main (String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int[] result = sum(n);
            System.out.println(Arrays.toString(result));
        }
        catch (IOException e)
        {
            System.out.println("IOException e");
        }
    }
}
