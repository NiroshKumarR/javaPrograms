public class FirstLastDigitSum {
     public static int sumFirstAndLastDigit(int number) {
          if (number < 0) {
               return -1;
          } else {
               int len = (int) (Math.log10(number) + 1);
               int lastdigit = number % 10;
               int firstDigit;
               int divisor = (int) Math.pow(10, len - 1);
               firstDigit = number / divisor;

               int sum = firstDigit + lastdigit;
               return sum;
          }
     }
}
