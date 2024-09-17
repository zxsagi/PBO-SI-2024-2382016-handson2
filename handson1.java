public class handson1 {
    public static void main(String[] args) {
        String[] buah = {"Apel", "Pisang", "Mangga", "Jeruk"};

        //menggunakan for loop
        System.out.println("Menampilkan hasil:");
        for (int i = 0; i < buah.length; i++) {
            System.out.println(buah[i]);
        }

        //menggunakan foreach loop
        System.out.println("\nMenampilkan hasil:");
        for (String b : buah) {
            System.out.println(b);
        }

        //menggunakan while loop
        System.out.println("\nMenampilkan hasil:");
        int i = 0;
        while (i < buah.length) {
            System.out.println(buah[i]);
            i++;
        }

        //menggunakan do-while loop
        System.out.println("\nMenampilkan hasil:");
        i = 0;
        do {
            System.out.println(buah[i]);
            i++;
        } while (i < buah.length);
    }
}
