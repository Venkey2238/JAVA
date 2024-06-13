//1 2 3
//4 5 6
//7 8 9

//1 4 7
//2 5 8
//3 6 9


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransposeOfMatrix {
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
            int[][] trans = new int[n][m];
            for(int j=0;j<n;j++)
            {
                 for(int i=0;i<n;i++)
                 {
                     trans[j][i] = arr[i][j];
                 }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(trans[i][j] + " ");
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
