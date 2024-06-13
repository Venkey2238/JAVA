import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LengthOfRowAndColumn {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
            int[][]  arr = new int[n][m];
            System.out.println("Row Length " + arr.length );
            System.out.println("Column Length "+ arr[0].length);
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
