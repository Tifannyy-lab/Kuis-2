import java.util.Scanner;
public class Kuis24Fanny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam;
        int total = 0;
        int jumlahKendaraan = 0;
        int terlama = 0;
        int lebihDari3Jam = 0;
        System.out.print("Lama parkir (jam, 0 = selesai): ");
        jam = sc.nextInt();
        while (jam != 0) {
            if (jam < 1 || jam > 24) {
                System.out.println("Input tidak valid");
            } else {
                int biaya = 5000 + (jam - 1) * 3000;
                total += biaya;
                jumlahKendaraan++;
                if (jam > terlama) {
                    terlama = jam;
                }
                if (jam > 3) {
                    lebihDari3Jam++;
                }
                System.out.println("Biaya parkir: Rp " + biaya);
            }
            System.out.print("Lama parkir (jam, 0 = selesai): ");
            jam = sc.nextInt();
        }
        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("Parkir terlama   : " + terlama + " jam");
        System.out.println("Parkir > 3 jam   : " + lebihDari3Jam + " kendaraan");
    }
}