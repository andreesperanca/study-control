package date_time;

import java.util.Date;

class DateDemo3 {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();

      // display time and date
      System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
   }
}