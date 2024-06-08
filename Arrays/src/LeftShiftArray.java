import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftShiftArray {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            int last = arr[0];
            for(int i=0;i<n-1;i++)
            {
                arr[i] = arr[i+1];
            }
            arr[n-1] = last;
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i] + " ");
            }

        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
//1 2 3 4 5
//2 3 4 5 1