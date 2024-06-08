//        0 0 0 0 1 0 0 0 0
//        0 0 0 2 3 2 0 0 0
//        0 0 3 4 5 4 3 0 0
//        0 4 5 6 7 6 5 4 0
//        5 6 7 8 9 8 7 6 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DifficultNumberPyramid {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int end =1;
            for(int i=1;i<n;i++)
            {
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print("0");
                }
                for(int j=i;j<=end;j++)
                {
                    System.out.print(j);
                }
                for(int j=end-1;j>=i;j--)
                {
                    System.out.print(j);
                }
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print("0");
                }
                end+=2;
                System.out.println();
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
