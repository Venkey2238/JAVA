import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversedRowOfMatrix {
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
                for(int j=0;j<m;j++)
                {
                    System.out.println(arr[i][j]);
                }
            }
            for(int i=0;i<n;i++)
            {
                int l = 0;
                int r = n-1;
                while(l<r)
                {
                    int temp = arr[i][l];
                    arr[i][l] = arr[i][r];
                    arr[i][r] = temp;
                    l++;
                    r--;
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
            System.out.println("IOException e");
        }
    }
}
//1 2 3    0,0 0,1 0,2
//4 5 6    1,0 1,1 1,2
//7 8 9    2,0 2,1 2,2

//3 2 1    0,2 0,1 0,0
//6 5 4    1,2 1,1 1,0
//9 8 7    2,2 2,1 2,0