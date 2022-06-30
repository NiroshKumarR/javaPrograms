public class MegaBytesConverter {
     public static void printMegaBytesAndKiloBytes(int kiloBytes) {
          if (kiloBytes < 0) {
               System.out.println("Invalid Value");
          } else {
               Integer megabytes = kiloBytes / 1024;
               Integer kilobytes = kiloBytes % 1024;
               System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kilobytes + " KB");
          }
     }
}
