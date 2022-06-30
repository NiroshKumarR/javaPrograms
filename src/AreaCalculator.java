public class AreaCalculator {
     public static double area(double radius) {
          if (radius < 0) {
               return -1.0;
          } else {
               double PI = Math.PI;
               double area = radius * radius;
               double areaSqr = area * PI;
               return areaSqr;
          }
     }

     public static double area(double x, double y) {
          if ((x < 0) || (y < 0)) {
               return -1.0;
          } else {
               double area = x * y;
               return area;
          }
     }
}