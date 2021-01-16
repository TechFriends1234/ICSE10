import java.util.*;
public class GCD_of_two
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();//To store the number1
        int b = sc.nextInt();//To store the number2
        int r=0;//Variable in while
        while(b!=0)
        {
            r=a%b;
            a=b;
            b=r;  
        }
        System.out.println("The GCD is "+a);     
    }
}