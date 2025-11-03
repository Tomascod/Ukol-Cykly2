public class PR2 {
    public static void main(String[] args) {
        int cislo = 99;
        String cis = Integer.toString(cislo);

        for (var i = 1;i<=7;i++){
            if (cis.length()<7){
                cis = "0"+cis;
            }
        }
        System.out.println(cis);
    }
}
