import java.util.*;

public class NamaBulan {
    public static void main(String[] args) {

        String[] namabulan = {
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
        };

        Scanner input = new Scanner(System.in);
        int nomorbulan = input.nextInt();
        int Januari = 0;

        if (nomorbulan > 0 && nomorbulan <=12) {
            System.out.println( namabulan[nomorbulan-1] );
        }

        else  {
            System.out.println("Nomor tidak valid");
        }
    }
}
