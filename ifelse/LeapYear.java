import java.io.*;
import java.util.*;
class Leapyear
{
    public static void main(String[] args)
    {
        int y;
    Scanner sc=new Scanner(System.in);
        System.out.println("enter year:");
        y=sc.nextInt();
        if(y!=0 && y%4==0)
        {
            System.out.println("year is leaf year");
        }
        else{
            System.out.println("year is not leap year");
        }
    }
}
