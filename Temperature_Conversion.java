import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        int C;
        float F;
        Scanner sc=new Scanner(System.in);
        C=sc.nextInt();
        F=(float)(C*9)/5+32;
        System.out.format("%.2f",(F));
    }
}
