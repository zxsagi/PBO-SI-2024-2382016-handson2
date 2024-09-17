public class handson2 {
    public static void main(String[] args) {
        //menggunakan for loop
        System.out.println("menampilkan hasil bilangan genap dari 1 hingga 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //menggunakan foreach loop(array yang berisi bilangan 1 samapi 20)
        int[] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("\nmenampilkan hasil bilangan genap dari 1 hingga 20:");
        for (int num : angka) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        //menggunakan while loop
        System.out.println("\nmenampilkan hasil bilangan genap dari 1 hingga 20:");
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        //menggunakan do-while loop
        System.out.println("\nmenampilkan hasil bilangan genap dari 1 hingga 20:");
        i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 20);
    }
}
