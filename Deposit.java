class Deposit
{
    double Deposit(double accountbalance,double deppositAmount)
    {
        double bal=0;
        double n=deppositAmount%100.0;
        if(n==0.0)
        {
            if(deppositAmount<50000)
            {
                bal= accountbalance+deppositAmount;
            }
            else
            {
                bal=accountbalance;
                System.out.println("Sorry ! Your Transaction Is Not Possible");
            }    
        }

        else
        {
            bal=accountbalance;
            System.out.println("Sorry ! Your Transaction Is Not Possible");
        }

        return bal;
    }
}