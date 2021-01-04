import java.util.*;

public class LuasDanKeliling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double panjang = input.nextDouble();
        double lebar = input.nextDouble();

    }
    public static double keliling (double panjang,double lebar){
        double hasil= (panjang + lebar) *2;
        return hasil;
    }
    public static double luas(double panjang,double lebar){
        double hasil = panjang * lebar;
        return hasil;
    }
}

