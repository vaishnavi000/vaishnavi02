import java.util.Scanner;
import java.lang.String;

public class streverse 
{
static String reverse(String st) 
{
    if(st.length()==1)
    return st;
    else
    return reverse(st.substring(1))+st.charAt(0);
}   
 public static void main(String[] args)
{
    Scanner sc = new Scanner (System.in);
    String st,st1;
    st=sc.nextLine();
    st1=reverse(st);
    System.out.println(st1);
    
    
    sc.close();

    
}
}
