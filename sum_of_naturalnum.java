import java.util.Scanner;

public class sum_of_naturalnum {
    public static void  printsum (int i,int n,int sum)
    {
        if(i==n)
        {
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        printsum(i+1,n,sum);

    }
    public static void main(String args[])
    {
        int m,j=1;
        try (Scanner sc = new Scanner(System.in)) {
            m=sc.nextInt();
            printsum(j,m,0);
        }
       
    }
}
    

