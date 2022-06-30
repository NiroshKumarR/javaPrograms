public class NumberOfDaysInMonth {
     public static void isLeapYear(int year) {
          if (year <= 1 && year <= 9999) {
               System.out.println("false");
          } else if (((year % 4 == 0) && (year % 100 != 0)) && year % 400 == 0) {
               System.out.println(year + " is a leap year");
          } else {
               System.out.println(year + " not a leap year");
          }
     }

     public static int getDaysInMonth(int month, int year) {
          int noOfDays = 0;
          if (month < 1 || month > 12 || year < 1 || year > 9999) {
               return -1;
          } else {

               switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                         noOfDays = 31;

                         break;
                    case 2:
                         if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
                              noOfDays = 29;
                              break;
                         }
                         noOfDays = 28;
                         break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                         noOfDays = 30;
                         break;
                    default:
                         noOfDays = -1;
                         break;

               }

          }
          return noOfDays;
     }

}
