import java.util.Scanner;
class fast
{
    public double fastcash(double accbal)
    {

        Scanner kbd2=new Scanner(System.in);
        double bal=0,asw=0;
        System.out.println("1. 1000");
        System.out.println("2. 2000");
        System.out.println("3. 5000");
        System.out.println("4. 10000");
        System.out.println("Enter your choice ");
        System.out.print("\t\t\t");  
        double choice=kbd2.nextDouble();
                   if(choice==1||choice==1000)
            {
                asw=1000;
            }
            else if(choice==2||choice==2000)
            {
                asw=2000;
            }
            else if(choice==3||choice==5000)
            {
                asw=5000;
            }
            else if(choice==4||choice==10000)
            {
                asw=10000;
            }
            if(accbal>asw)
            {
                bal=accbal-asw;
            }

                
                else if(accbal<asw)
        {
            System.out.println("Not Enough Balance !");
            bal=accbal;
        }
        return bal;
    }
}