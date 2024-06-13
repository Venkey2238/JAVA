import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfCharacterInSecondStringOfFirstString {
        public static void main(String[] args)
        {
            try
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String str = reader.readLine();
                String stre = reader.readLine();
                int count = 0;
                for(int i=0;i<str.length();i++)
                {
                    for(int j=0;j<stre.length();j++)
                    {
                        if(str.charAt(i) == stre.charAt(j))
                        {
                            count++;
                            break;
                        }
                    }
                }
                System.out.println(count);

            }
            catch (IOException e)
            {
                System.out.println("IOException");
        }
    }
}
