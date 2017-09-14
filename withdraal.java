import java.util.Scanner;
class withdraal
{
    double withdrawal(double accbal,double wdbal)
    {

        double cb=0;
        Scanner kbd2=new Scanner(System.in);
        if(accbal>wdbal)//checking if enter amount is greater than net balance
        {
            if(wdbal<25000)
            {
                double n=wdbal%100.0;
                if(n==0.0)
                {
                    cb=accbal-wdbal;
                }
                else 
                {
                    System.out.println("Sorry ! Your Transaction Is Not Possible");
                    cb=accbal;
                }

            }
            else
            {
                System.out.println("Sorry ! Your Transaction Is Not Possible");
                cb=accbal;
            }
        }
        else 
        {
            System.out.println("Not Enough Balance !");
            cb=accbal;
        }
        return cb;
    }
}