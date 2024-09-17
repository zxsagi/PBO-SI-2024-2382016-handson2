import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //meminta input
        System.out.print("Masukkan kata dalam format camelCase: ");
        String input = scanner.nextLine();

        //menginisialisasi jumlah kata, mulai dari 1 karena kata pertama selalu huruf kecil
        int jumlahKata = 1;

        //loop melalui setiap karakter dalam string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            //jika karakter adalah huruf kapital, itu menandakan awal dari kata baru
            if (Character.isUpperCase(c)) {
                jumlahKata++;
            }
        }

        //menampilkan hasil jumlah kata
        System.out.println("Jumlah kata dalam camelCase: " + jumlahKata);

        scanner.close();
    }
}
