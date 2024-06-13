import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterPyramid {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(reader.readLine());
//            char ch = reader.readLine().charAt(0);
            for(int i=1;i<N;i++)
            {
                char ch = 'A';
                for(int j=1;j<=i;j++)
                {
                    System.out.print(ch + " ");
                    ch++;
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
