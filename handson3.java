public class handson3 {
    public static void main(String[] args) {
        //menggunakan for loop
        System.out.println("menampilkan hasil angka:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue; //melewati angka yang habis dibagi 3
            }
            if (i > 15) {
                break; //berhenti setelah mencapai angka 15
            }
            System.out.println(i);
        }

        //menggunakan foreach loop(array 1 hingga 20)
        int[] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("\nmenampilkan hasil angka:");
        for (int num : angka) {
            if (num % 3 == 0) {
                continue;
            }
            if (num > 15) {
                break; //berhenti setelah mencapai angka 15
            }
            System.out.println(num);
        }

        //menggunakan while loop
        System.out.println("\nmenampilkan hasil angka:");
        int i = 1;
        while (i <= 20) {
            if (i % 3 == 0) {
                i++;
                continue; //melewati angka yang habis dibagi 3
            }
            if (i > 15) {
                break; //berhenti setelah mencapai angka 15
            }
            System.out.println(i);
            i++;
        }

        //menggunakan do-while loop
        System.out.println("\nmenampilkan hasil angka:");
        i = 1;
        do {
            if (i % 3 == 0) {
                i++;
                continue; //melewati angka yang habis dibagi 3
            }
            if (i > 15) {
                break; //berhenti setelah mencapai angka 15
            }
            System.out.println(i);
            i++;
        } while (i <= 20);
    }
}
