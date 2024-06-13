import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtleastOneElementGreaterThanItself {
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
            int max = Integer.MIN_VALUE;
            int count = 0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]>max)
                {
                    max = arr[i];
                }
            }
            for(int i=0;i<n;i++)
            {
                if(arr[i]<max)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
//        int max = arr[0];
//        int count = 0;
        //1 2 3 4 5
        //7 4 2 10 5
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                count = i; // Reset count, as all previous elements are less than the new max
//            } else if (arr[i] < max) {
//                count++;
//            }
//        }
        catch (IOException e)
        {
            System.out.println("IOException e");
        }
    }
}
