public class PR4 {
    public static void main(String[] args) {
        int faktorial =5;
        int vysledek = 1;
        if (faktorial == 0) {
            vysledek = 1;
            System.out.println(vysledek);
        } else if (faktorial>0) {
            for (int i = 1; i <= faktorial; i++) {
                vysledek *= i;
            }
            System.out.println(vysledek);
        }else {
            System.out.println("není definováno");
        }
    }
}
