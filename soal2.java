import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //meminta input untuk ukuran n
        System.out.print("Masukkan ukuran tangga (n): ");
        int n = scanner.nextInt();

        //mencetak tangga
        for (int i = 1; i <= n; i++) {
            //mencetak spasi (n - i) kali
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //mencetak simbol # sebanyak i kali
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            //pindah ke baris berikutnya
            System.out.println();
        }

        scanner.close();
    }
}
