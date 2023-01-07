import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long   x=sc.nextLong();
        long  y=sc.nextLong();
        long s=x+y;
        System.out.println(s);
        long m = (s%1000000007);
        System.out.println(m);
    }
}
