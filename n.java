class n
{
    public void as(double acc)
    {
        int i=(int)acc/1000;
        acc-=i*1000;
        int l=(int)acc/500;
        acc-=l*500;
        int j=(int)acc/100;
        acc-=j*100;

        System.out.println("            $1000  *"+i+"="+1000*i);
        System.out.println("               $500   *"+l+"="+500*l);
        System.out.println("               $100   *"+j+"="+100*j);
    }
}