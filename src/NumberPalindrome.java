/**
 * NumberPalindrome
 */
public class NumberPalindrome {
     public static boolean isPalindrome(int number) {
          int reversedNum = 0, remaninder, ogNum = number;
          if (number < 0) {
               number = Math.abs(number);
               ogNum = number;
          }
          while (number > 0) {
               remaninder = number % 10;
               reversedNum = (reversedNum * 10) + remaninder;
               number /= 10;
          }

          if (ogNum == reversedNum)
               return true;
          else
               return false;
     }

}