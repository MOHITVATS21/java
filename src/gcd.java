import java.util.Scanner;

import static java.lang.Math.min;

public class gcd {
    public static void main(String[] args) {



        Scanner sc= new Scanner(System.in);
       int   x=sc.nextInt();
        int  y=sc.nextInt();
        //int res=min(x,y);

        gcd_finder obj= new gcd_finder();
        System.out.println(obj.gcdf(x,y));
    }
}
class gcd_finder{
    public int gcdf(int x , int y)
    {
        if(y==0)
        {
            return x;
        }
        return gcdf(y,x%y);

    }
}
