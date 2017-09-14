
import java.util.Calendar;
class cal
{
    public String man()
    {
        String a="";
        Calendar calendar=Calendar.getInstance();
        System.out.println("Time:");
        System.out.print(calendar.get(Calendar.HOUR)+":");
        System.out.print(calendar.get(Calendar.MINUTE)+":");
        System.out.print(calendar.get(Calendar.SECOND));
        a=calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND);
        calendar.set(Calendar.HOUR,10);
        calendar.set(Calendar.MINUTE,29);
        calendar.set(Calendar.SECOND,22);
        return a;
    }
}