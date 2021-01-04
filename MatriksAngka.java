import java.util.*;

public class MatriksAngka {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int batas = scan.nextInt();
        for(int i =0; i < batas; i++){
            for (int j = 0; j < batas; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
