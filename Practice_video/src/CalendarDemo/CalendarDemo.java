package CalendarDemo;
import sun.text.resources.cldr.to.FormatData_to;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

/**
 * @ author:Tony
 * @ date 2022/5/23 17:33
 * @ version 1.0
 * @ description:TODO
 */

public class CalendarDemo {
        public static void main(String[] args) {
                //Calendar��һ�������࣬һ��������GregorianCalendarʵ��
                Calendar cal = Calendar.getInstance();
                //ʹ��������ӡ��ǰ��ʱ��
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH) + 1;
                int day = cal.get(Calendar.DATE);
                int hours = cal.get(Calendar.HOUR_OF_DAY);
                int minutes = cal.get(Calendar.MINUTE);
                int seconds = cal.get(Calendar.SECOND);
                System.out.println("��ǰʱ��");
                String strTime = String.format("%d-%02d-%d-%d-%d-%d"
                ,year,month,day,hours,minutes,seconds);
                System.out.println(strTime);

                //Ϊ���������趨ʱ��
                cal.set(2013,4,23,2,32,32);
                Date date = cal.getTime();
                System.out.println(date.toLocaleString());
        }
}
