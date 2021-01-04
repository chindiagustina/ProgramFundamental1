import java.util.*;

public class AngkaRibuan {
    public static void main(String[] args) {
        Locale bahasa = new Locale("id"); //bahasa yang digunakan id=indonesia
        Scanner input = new Scanner(System.in);
        int harga = input.nextInt();
        System.out.printf(bahasa, "Rp%,d,-", harga);
    }
}
