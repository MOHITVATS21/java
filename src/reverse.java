import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
     int rev=0;
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int temp=x;
        while(temp!=0)
        {
            int y=temp%10;
            rev=rev*10+y;
            temp=temp/10;

        }
        System.out.println(rev);;
    }
}