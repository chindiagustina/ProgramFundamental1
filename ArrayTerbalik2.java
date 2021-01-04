import java.util.*;

public class ArrayTerbalik2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Buat array
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];

        // Input nilai
        for (int i = 0; i < jumlah; i++) {
            nilai[i] = input.nextInt();
        }

        // Output
        for (int i = jumlah-1; i >= 0; i--) {
            System.out.print(nilai[i]);
        }

    }
}
