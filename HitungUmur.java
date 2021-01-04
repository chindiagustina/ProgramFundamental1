import java.util.*;

public class HitungUmur {
    public static void main(String[] args) {
        System.out.print("");
        Scanner input = new Scanner(System.in);

        int tahun = input.nextInt();
        int umur = 2020 - tahun;

        System.out.println( "Umur anda " + umur + " tahun" );
    }
}
