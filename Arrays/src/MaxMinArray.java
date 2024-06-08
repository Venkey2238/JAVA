import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMinArray {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                if(arr[i]<min)
                {
                    min = arr[i];
                }
                if(arr[i]>max)
                {
                    max = arr[i];
                }
            }
            System.out.print(min + " ");
            System.out.println(max + " ");
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
