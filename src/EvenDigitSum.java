public class EvenDigitSum {
     public static int getEvenDigitSum(int number) {
          if (number < 0) {
               return -1;
          }

          int len = (int) Math.log10(number) + 1;

          String temp = Integer.toString(number);

          int sum = 0;
          for (int i = 0; i < len; i++) {
               String tempString = String.valueOf(temp.charAt(i));
               int value = Integer.parseInt(tempString);

               if (value % 2 == 0) {
                    sum += value;
               }
          }
          return sum;
     }
}
