import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arm = 0;
        int tem = n;
        while(tem!=0)
        {
            int digit = tem%10;
            arm = arm + digit*digit*digit;
            tem = tem/10;
        }
        if(n == arm)
        {
            System.out.println("it's an armstrong number");
        }
    }
}
