import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
class Greatest
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("ener 1st no:");
        a=sc.nextInt();
        System.out.println("enter second number:");
        b=sc.nextInt();
        System.out.println("enter 3rd number:");
        c=sc.nextInt();
        if(a>b&&a>c)
        {
                System.out.println("a is greater");
        }
        else if(b>c&&b>a)
        {
                System.out.println("b is greater");

        }
        else{
                System.out.println("c is greater");
            }
        }

    }





