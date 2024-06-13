import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TwoDimArrayList {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            ArrayList<ArrayList<Integer>> al = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                ArrayList<Integer> newal = new ArrayList<>();
                for(int j=0;j<n;j++)
                {
                    int digit = Integer.parseInt(reader.readLine());
                    newal.add(digit);
                }
                al.add(newal);
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(al.get(i).get(j) + " ");
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
