package Udemy;

public class KBtoMB {
    public static void main(String[] args) {
    PrintMegaBytesAndKiloBytes(10250);
    }

    public static int ToMB(int KiloBytes) {
        if (KiloBytes < 0) {
            return -1;
        }
        return (int) Math.floor(KiloBytes / 1024);
    }

    public static void PrintMegaBytesAndKiloBytes(int KiloBytes) {
        if (KiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int MB = ToMB(KiloBytes);
            int RemainKB= KiloBytes%1024;
            System.out.println(KiloBytes + "KB" + "=" + MB + "MB" + " and " + RemainKB + "KB");//(KiloBytes%1024) + "KB");
        }
    }

}
