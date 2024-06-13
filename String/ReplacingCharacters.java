import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplacingCharacters {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            StringBuilder str2 = new StringBuilder();
            char ch = reader.readLine().charAt(0);
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)!= ch)
                {
                    str2.append(str.charAt(i));
                }
                else
                {
                    str2.append('@');
                }
            }
            System.out.println(str2);
        }
        catch (IOException e)
        {
            System.out.println("IOException e");
        }
    }
}
