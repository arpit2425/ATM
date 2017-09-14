class aa1
{
    public void acca1(double d[],double w[],double f[],int c)
    {
        System.out.println("*********************************************************************************************************************************************");
        System.out.println();
        System.out.println();
        System.out.println("                                                PUNJAB NATIONAL BANK");
        System.out.println();
        System.out.println();
        System.out.println("                                                MINI STATEMENT");
        System.out.println();
        System.out.println();
        System.out.println("                    CARD NUMBER:4561*********893" );
        System.out.println();
        System.out.println();
        System.out.println();
        for(int i=0;i<c;i++)
        {
            if(d[i]!=0)
                System.out.println("Deposit Amount ="+d[i]);
            if(f[i]!=0)
                System.out.println("Withdrawal Amount ="+f[i]);                                                                                                                                                                                       
            else if(w[i]!=0)
                System.out.println("Withdrawal Amount ="+w[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                    TXN NO:760");
        System.out.println();
        System.out.println("                    BALANCE INQIURY  SAVINGS");
        System.out.println();
        System.out.println();
        System.out.println("                                              HAVE A NICE DAY !");
        System.out.println();
        System.out.println("*********************************************************************************************************************************************");
    }
}


