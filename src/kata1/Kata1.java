package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1949, 9, 24);
        
        Person person = new Person ("Blas", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
                
        
    }
    
}
