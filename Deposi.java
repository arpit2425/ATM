class Deposi
{
    double Deposit(double accountbalance,double deppositAmount)
    {
        double bal;
        if(deppositAmount<50000)
        {
            bal= accountbalance+deppositAmount;
        }
        else
        {
            bal=accountbalance;
            System.out.println("Sorry ! Your Transaction Is Not Possible");
        }
        return bal;
    }
}