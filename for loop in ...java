import java.util.Scanner;
public class Main{
    public static void main(String args[]){
     Scanner s= new Scanner(System.in);
     System.out.print("Enter The Number:");
     int a=s.nextInt();
     for(int i=1;i<=a;i++)
     {
         if(i%3==0)
           System.out.println(i);
     }
    }
}