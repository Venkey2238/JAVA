import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimArrayInWaveFrom {
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
                    arr[i][j] = Integer.parseInt(reader.readLine());
                }
            }
            for(int i=0;i<n;i++)
            {
                if(i%2==0)
                {
                    for(int j=0;j<m;j++)
                    {
                        System.out.print(arr[i][j] + " ");
                    }
                }
                else
                {
                    for(int j=m-1;j>=0;j--)
                    {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException e");
        }
    }
}
//1 2 3
//4 5 6
//7 8 9

//1 2 3 6 5 4 7 8 9