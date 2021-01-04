public class AngkaBerurutan {
    public static void main(String[] args) {
        //Array
        int[] deretanangka = {4,2,3,3,2,4,6,7,3,9};
        //output
        System.out.println(ujian(deretanangka)); }
    public static int ujian(int[] deretanangka) {
        int count =1, max =1;
        //perulangannya
        for (int a = 1; a < deretanangka.length; a++) {
            //percabangan
            if (deretanangka[a] > deretanangka[a - 1]) {
                count++;
            } else {
                count = 1;
            }
            //deretan angka paling panjang atau maksimalnya
            if (count >= max) {
                max = count; }
        }
        //mengembalikan elemen terbesar
        return max;
    }
}
