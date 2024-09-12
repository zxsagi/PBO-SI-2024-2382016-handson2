import java.util.Scanner;

public class soal1 {
    /**
     * Buatlah sebuah program yang mengambil 2 input number dari user
     * program tersebut akan print out nilai yang paling besar
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan angka pertama : ");
        int number1 = scanner.nextInt();

        System.out.print("Masukan angka kedua : ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Angka terbesar : " + number1);
        }else if (number2 > number1) {
            System.out.println("Angka terbesar : " + number2);
        }else {
            System.out.println("Kedua angka sama besarnya : " + number1);
        }
        scanner.close();
    }
}
