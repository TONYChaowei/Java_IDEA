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
                //Calendar是一个抽象类，一般由子类GregorianCalendar实现
                Calendar cal = Calendar.getInstance();
                //使用日历打印当前的时间
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH) + 1;
                int day = cal.get(Calendar.DATE);
                int hours = cal.get(Calendar.HOUR_OF_DAY);
                int minutes = cal.get(Calendar.MINUTE);
                int seconds = cal.get(Calendar.SECOND);
                System.out.println("当前时间");
                String strTime = String.format("%d-%02d-%d-%d-%d-%d"
                ,year,month,day,hours,minutes,seconds);
                System.out.println(strTime);

                //为日历对象设定时间
                cal.set(2013,4,23,2,32,32);
                Date date = cal.getTime();
                System.out.println(date.toLocaleString());
        }
}
