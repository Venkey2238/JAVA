import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ListOfPositiveElementsInAnArray {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                int digit = Integer.parseInt(reader.readLine());
                al.add(digit);
            }
            ArrayList<Integer> evenal = new ArrayList<>();
            for(int i=0;i<al.size();i++)
            {
                if(al.get(i)%2==0)
                {
                    evenal.add(al.get(i));
                }
            }
            for(int i=0;i<evenal.size();i++)
            {
                System.out.print(evenal.get(i) + " ");
            }

        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
