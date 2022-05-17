package date_time;

import java.util.Date;

class DateDemo2 {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();

      // display time and date
      String str = String.format("Current Date/Time : %tc", date );

      System.out.printf(str);
   }
}