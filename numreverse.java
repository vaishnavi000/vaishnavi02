import java.util.Scanner;

public class numreverse 
{
    static int reverse(int n , int s)
    {
        if (n==0)
        return s;
        else
        s=s*10+n%10;
        return reverse(n/10,s);
    }
    public static void main(String[] args) {
        int n,num,s=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter num");
        n=sc.nextInt();
        num=reverse(n,s);
        System.out.println("reversed number is "+num);

        sc.close();
    }
}
