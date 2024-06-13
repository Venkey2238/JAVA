import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxOfEveryRow {
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
                for(int j=0;j<m;j++)
                {
                    arr[i][j] =  Integer.parseInt(reader.readLine());
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            int[] maxrow = new int[n];
            int[] maxcol = new int[m];
            int maxr = Integer.MIN_VALUE;
            int maxc = Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(arr[i][j]>maxr)
                    {
                        maxrow[i] = arr[i][j];
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(maxrow[i] + " ");
            }
            System.out.println();
            for(int j=0;j<n;j++)
            {
                for(int i=0;i<n;i++)
                {
                    if(arr[i][j]>maxc)
                    {
                        maxcol[j] = arr[i][j];
                    }
                }
            }
            for(int j=0;j<n;j++)
            {
                System.out.print(maxcol[j] + " ");
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
