import java.util.*;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        String output = angka % 2 == 0 ? "Genap" : "Ganjil";
        System.out.printf("%s", output);
    }
}
