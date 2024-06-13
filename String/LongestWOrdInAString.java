import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestWOrdInAString {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            char ch = ' ';
            int max = Integer.MIN_VALUE;
            int count = 0;
            StringBuilder str2 = new StringBuilder();
            for(int i=0;i<str.length();i++)
            {
               if(str.charAt(i) != ' ')
               {
                   count++;
               }
               else if(max<count)
               {
                   max = count;
                   count = 0;
               }
            }
            if(max<count)
            {
                max = count;
            }

            System.out.println(max);
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }

    }
}

// Hello WOrld I am Venkatesh
//