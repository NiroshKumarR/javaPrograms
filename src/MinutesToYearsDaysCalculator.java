public class MinutesToYearsDaysCalculator {
     public static void printYearsAndDays(long minutes) {
          if (minutes < 0) {
               System.out.println("Invalid Value");
          } else {
               Long YY = minutes / 24 / 60 / 365;
               Long ZZ = (minutes % (60 * 24 * 365)) / (60 * 24);
               System.out.println(minutes + " min = " + YY + " y and " + ZZ + " d");
          }
     }
}
