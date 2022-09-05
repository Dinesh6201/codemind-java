import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float s,area;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(float)(a+b+c)/2;
        area=s*((s-a)*(s-b)*(s-c));
        System.out.format("%.2f",(Math.sqrt(area)));
    }
}