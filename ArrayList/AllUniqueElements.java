import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AllUniqueElements {
    public static int count(ArrayList<ArrayList<Integer>> al, int k)
    {
        int count2 = 0;
        for(int i=0;i<al.size();i++)
        {
            for(int j=0;j<al.get(i).size();j++)
            {
                if(k == al.get(i).get(j))
                {
                    count2++;
                }
            }
        }
        return count2;
    }
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
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
            ArrayList<Integer> uniqal = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(count(al, al.get(i).get(j)) == 1)
                    {
                        uniqal.add(al.get(i).get(j));
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(al.get(i).get(j) + " ");
                }
                System.out.println();
            }
            for(int i=0;i<uniqal.size();i++)
            {
                System.out.print(uniqal.get(i) + " ");
            }
        }
        catch(IOException e)
        {
            System.out.println("IOException");
        }
    }
}
