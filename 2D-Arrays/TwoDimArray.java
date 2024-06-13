import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimArray {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
            int[][] arr = new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j] = Integer.parseInt(reader.readLine());
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException ");
        }
    }
}
