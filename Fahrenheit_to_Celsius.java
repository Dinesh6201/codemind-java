import java.util.Scanner;
class hgf
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float c,f;
        c = sc.nextInt();
        f = (float)((c-32)/1.8);
     System.out.format("%.2f",f);
    }
}