import java.util.Scanner;
public class Kuis24Fanny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam;
        int total = 0;
        int jumlahKendaraan = 0;
        System.out.print("Lama parkir (jam, 0 = selesai): ");
        jam = sc.nextInt();
        while (jam != 0) {
            int biaya = 5000 + (jam - 1) * 3000;
            total += biaya;         
            jumlahKendaraan++;      
            System.out.println("Biaya parkir: Rp " + biaya);
            System.out.print("Lama parkir (jam, 0 = selesai): ");
            jam = sc.nextInt();     
        }
        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
    }
}