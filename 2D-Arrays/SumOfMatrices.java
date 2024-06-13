import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfMatrices {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
            int[][] arrOne = new int[n][m];
            int[][] arrTwo = new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arrOne[i][j] = Integer.parseInt(reader.readLine());
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arrTwo[i][j] = Integer.parseInt(reader.readLine());
                }
            }
            int[][] sum = new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    sum[i][j] = arrOne[i][j] + arrTwo[i][j];
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(arrOne[i][j] + " ");
                }
                System.out.println();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(arrTwo[i][j] + " ");
                }
                System.out.println();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
