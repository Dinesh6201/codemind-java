import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int m,n,p;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        p=m*n;
        System.out.println(p);
        sc.close();
    }
}