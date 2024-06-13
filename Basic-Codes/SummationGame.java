import java.util.Scanner;

public class SummationGame {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        int sum =0;
        while(x<n)
        {
           sum = sum + x;
           x = x+1;
        }
        System.out.println(sum);
    }
}
