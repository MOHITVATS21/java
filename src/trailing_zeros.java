import java.util.Scanner;

public class trailing_zeros {
    public static void main(String[] args) {
        int rev=0;
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        for (int i = 5; i <=x ;i=i*5 ) {
            rev=rev+x/i;

        }
        if(x<5)
        {
            System.out.println("zero");
        }
        System.out.println(rev);
    }
}
