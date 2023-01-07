import java.util.Scanner;

public class digit_in_number {
    public static long main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        double f=1;
        for(int i=1;i<=x;i++)

        {
            f=f*i;
        }
        long count=0;
        while(f>0)
        {
            f=f/10;
            count++;

        }
        return count;
    }
}
