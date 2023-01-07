
import java.io.*;
import java.util.*;
class exactly_3_divisor {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);



        //taking testcases
        int T=sc.nextInt();

        while(T-->0)
        {
            Solution obj=new Solution();
            int N;
            N=sc.nextInt();//taking N
            //calling function exactly3Divisors()
            System.out.println(obj.exactly3Divisors(N));


        }

    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{

    public int exactly3Divisors(int n)
    {
        int count=0;
        int d=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {

                if(i%j==0)
                {
                    count++;



                }


                // n++;

            }


        }

        return d;

    }


}
