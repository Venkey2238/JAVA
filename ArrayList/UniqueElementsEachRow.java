import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class UniqueElementsEachRow {
    public static int count(ArrayList<Integer> al, int k)
    {
        int freq =0;
        for(int i=0;i<al.size();i++)
        {
            if(al.get(i) == k)
            {
                freq++;
            }
        }
        return freq;
    }

    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<ArrayList<Integer>> al = new ArrayList<>();
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
            for(int i=0;i<n;i++)
            {
                ArrayList<Integer> altwo = new ArrayList<>();
                for(int j=0;j<m;j++)
                {
                    int digit = Integer.parseInt(reader.readLine());
                    altwo.add(digit);
                }
                al.add(altwo);
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(al.get(i).get(j) + " ");
                }
                System.out.println();
            }
            ArrayList<ArrayList<Integer>> newal = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                ArrayList<Integer> newaltwo = al.get(i);
                for(int j=0;j<n;j++)
                {
                    if(count(newaltwo, newaltwo.get(j)) == 1)
                    {
                        temp.add(newaltwo.get(j));
                    }
                }
                newal.add(temp);
            }
            for(int i=0;i<newal.size();i++)
            {
                ArrayList<Integer> temp = newal.get(i);
                for(int j=0;j<temp.size();j++)
                {
                    System.out.print(temp.get(j));
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