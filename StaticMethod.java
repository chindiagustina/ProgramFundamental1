public class StaticMethod {
    public static void main(String[] args) {
        String hasil = StaticMethod.salam();
        System.out.println(hasil);

    }
    public static String salam(){
        String hasil = "Salam Programmer!";
        return hasil;
    }
}
