class checkId  
{
    String checkId(String accnum,String pwd)
    {
        String result="error";
        String a,b,c;//declaring as String
        a="44725mypassword55500";
        String h=a.substring(0,5);
        String l=a.substring(5,15);
        String is=a.substring(16);
        if(accnum.equals(h)&&pwd.equals(l))
        {
            result=is;

        }
        return result;
    }
}