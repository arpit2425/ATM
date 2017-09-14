import java.util.Calendar;
class ca
{
    public String man()
    {
        String a="";
        Calendar calendar=Calendar.getInstance();
        System.out.println("Date:");
        System.out.print(calendar.get(Calendar.YEAR)+"/");
        System.out.print(calendar.get(Calendar.MONTH)+"/");
        System.out.print(calendar.get(Calendar.DATE));
        a=calendar.get(Calendar.YEAR)+"/"+calendar.get(Calendar.MONTH)+"/"+calendar.get(Calendar.DATE);
        calendar.set(Calendar.YEAR,10);
        calendar.set(Calendar.MONTH,29);
        calendar.set(Calendar.DATE,22);
        return a;
    }
}