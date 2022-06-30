public class TeenNumberChecker {
     public static boolean hasTeen(int one, int two, int three) {

          if ((one == 13 || one == 14 || one == 15 || one == 16 || one == 17 || one == 18 || one == 19)
                    || (two == 13 || two == 14 || two == 15 || two == 16 || two == 17 || two == 18 || two == 19)
                    || (three == 13 || three == 14 || three == 15 || three == 16 || three == 17 || three == 18
                              || three == 19)) {
               return true;

          } else {
               return false;
          }

     }

     public static boolean isTeen(int one) {

          if (one == 13 || one == 14 || one == 15 || one == 16 || one == 17 || one == 18 || one == 19) {
               return true;

          } else {
               return false;
          }

     }
}
