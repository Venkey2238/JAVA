import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfVowelsAndConsonants {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            int countVowels = 0;
            int countConsonants =0;
            for(int i=0;i<str.length();i++)
            {
                if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z'))
                {
                    if(str.charAt(i)== 'a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ||str.charAt(i)== 'A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' ||str.charAt(i)== 'U')
                    {
                        countVowels++;
                    }
                    else
                    {
                        countConsonants++;
                    }
                }
            }
            System.out.println("count vowels " + countVowels);
            System.out.println("count consonants " + countConsonants);
        }catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
