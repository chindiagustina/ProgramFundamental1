import java.util.*;

public class LabelTanggal {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String[] bulan = {
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
        //untuk menginputkan tanggal
        int tanggal = input.nextInt();

        //untuk menginputkan bulan
        int nomorbulan = input.nextInt();

        //untuk menginputkan tahun
        int tahun = input.nextInt();

        //output
        System.out.println( tanggal + " " + bulan[nomorbulan-1]+ " " + tahun);

    }
}
