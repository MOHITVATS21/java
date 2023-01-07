import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int   n=sc.nextInt();
        prime_finder obj= new prime_finder();
        System.out.println(obj.primef(n));


        // System.out.println(count);
    }
}
class prime_finder {
    public boolean primef(int n) {



        float x=(float)Math.sqrt(n);

        for(int i=2;i<=x;i++)
        {
              /*  if(n%2==0)
            {
                count++;
            }*/
            if(n%i!=0)
            {
                return true;
            }

        }
        return false;
    }
}