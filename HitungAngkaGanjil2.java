import java.util.*;

public class HitungAngkaGanjil2 {
    public static void main(String[] args) {
        Scanner bariskolom = new Scanner(System.in);

        int jumlah = 0;
        int a = bariskolom.nextInt();
        int b = bariskolom.nextInt();
        int[][]c = new int[a][b];

        for (int d = 0; d < a; d++){
            for (int e = 0; e < b; e++){
                c[d][e] = bariskolom.nextInt();
            }
        }
        for (int d = 0; d < a; d++){
            for (int e = 0; e < b; e++){
                if(c[d][e]%2!=0){

                    jumlah++;
                }
            }
            System.out.println(" " + jumlah);
            jumlah = 0;
        }
    }
}
