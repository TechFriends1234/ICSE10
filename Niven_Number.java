import java.util.*;
public class Niven_Number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();//To store the number
        if(a%Sum_of_Digits(a)==0)
            System.out.println("The number "+a+" is a Niven number.");
        else
            System.out.println("The number "+a+" is not a Niven number.");   
    }
    public static int Sum_of_Digits(int a)
    {
        int sum=0;//To calculate the sum of digits
        while(a>0)
        {
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
}