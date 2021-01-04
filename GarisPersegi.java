import java.util.*;

public class GarisPersegi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int batas = scan.nextInt();
        for(int i = 0; i < batas; i++){
            for (int j = 0; j < batas; j++) {
                if ((i==0) || (i==batas-1) || (j==0) || (j== batas-1)){
                    System.out.print("#");
                }
                else if (batas%2 == 0){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
