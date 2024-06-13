import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Printjthcolumn {
    public static void main(String[] args){
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
            int[][] arr = new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int k=0;k<n;k++)
                {
                    arr[i][k] = Integer.parseInt(reader.readLine());
                }
            }
            int j=0;
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i][j] + " ");
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
