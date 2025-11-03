import java.util.Scanner;
public class UKLSSU1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int n = in.nextInt();
        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nilai siswa ke-" + i + ": ");
            double nilai = in.nextDouble();
            total += nilai;
        }

        double rata = total / n;

        System.out.println("\nRata-rata nilai = " + rata);

        in.close();
    }
}