import java.util.Scanner;
class simple
{
    public static boolean prime(int n)
    {
        int cont=0;
        for(int i=2;i<=(int)(Math.sqrt(n));i++)
        {
            if(n%i==0)
            cont++;
        }
        if(cont==0)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,d1=0,d2=0,t;
        t = sc.nextInt();
        while(t>0)
        {
        a = sc.nextInt();
       for(int i=a;i>1;i--)
       {
           if(prime(i))
           {
                        d1 = i;
                        break;
           }
       }
        for(int i=a;;i++)
       {
           if(prime(i))
           {
                d2 = i;
                break;
           }
       }
       
        if((a-d1)<=(d2-a))
          System.out.println(d1);
        else
          System.out.println(d2); 
        }
        t--;
        
    }
}