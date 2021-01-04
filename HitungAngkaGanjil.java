import java.util.*;

public class HitungAngkaGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int angka = 0;
        int ganjil = 0;

        try{
            while (true) {
                angka = input.nextInt();
                if (angka %2 != 0){
                    ganjil++;
                }
            }
        }
        catch(NumberFormatException err){
            System.out.println(ganjil);
        }
        catch (Exception err){
            System.out.println(ganjil);
        }
    }
}
