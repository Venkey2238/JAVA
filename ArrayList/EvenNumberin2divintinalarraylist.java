import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EvenNumberin2divintinalarraylist {
    public static void main(String[] args) {
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
            ArrayList<ArrayList<Integer>> even = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                ArrayList<Integer> altwo = al.get(i);
                ArrayList<Integer> evenal = new ArrayList<>();
                for(int j=0;j<n;j++)
                {
                    if(altwo.get(j) % 2==0)
                    {
                        evenal.add(altwo.get(j));
                    }
                }
                even.add(evenal);
            }
            for(int i=0;i<even.size();i++)
            {
                for(int j=0;j<even.get(i).size();j++)
                {
                    System.out.print(even.get(i).get(j) + " ");
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
