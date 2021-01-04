import java.util.*;

public class ArrayTerbalik {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int [] arrayIn = new int[5];
        for (int i= 0; i<5; i++){
            arrayIn[i] = in.nextInt();
        }
        for (int j = 4; j >= 0; j--) {
            System.out.println(arrayIn[j]);
        }
    }
}
