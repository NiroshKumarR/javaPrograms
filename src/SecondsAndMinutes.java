public class SecondsAndMinutes {
     public static String getDurationString(int minutes, int seconds) {
          if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
               int hours = minutes / 60;
               int leftoverminute = minutes % 60;
               return hours + "h " + leftoverminute + "m " + seconds + "s";
          } else {
               return "Invalid Value";
          }
     }

     public static String getDurationString(int seconds) {
          if (seconds >= 0) {
               int minutes = seconds / 60;
               int leftoverseconds = seconds % 60;
               return getDurationString(minutes, leftoverseconds);
          } else {
               return "Invalid Value";
          }
     }
}
