import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if (n<=2)
        {
            System.out.println(n-1);
        }
        else
        {
            System.out.print("2");
        }
    }
}