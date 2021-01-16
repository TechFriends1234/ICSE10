import java.util.*;
public class Pronic_Number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();//To store the number
        int c=0;//Counter in for-loop
        int i=0;//Variable in for-loop
        if(a<0)
        {
            System.out.println("The number "+a+" is negative.");
            System.exit(0);
        }
        for(i=0;i<=a;i++)
        {
            if(i*(i+1)==a)
            {
                c++;
                break;
            }            
        }
        if(c==1)
            System.out.println("The number "+a+" is a Pronic number.");
        else
            System.out.println("The number "+a+" is not a Pronic number.");     
    }
}