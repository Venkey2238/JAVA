import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfUpperAndLowerChars {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            int countsmall = 0;
            int countbig = 0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                {
                    countbig++;
                }
                else if(str.charAt(i)>='a' && str.charAt(i)<='z')
                {
                    countsmall++;
                }

            }
            System.out.println("Big : "+countbig);
            System.out.println("small : "+countsmall);
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
