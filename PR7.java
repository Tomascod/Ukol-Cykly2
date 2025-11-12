public class PR7 {
    public static void main(String[] args) {
        int[] cisla = {10,2,226,4,5,6,7,8,9,38,2,3,20,5,6,7,8,9,1105,10,1,2,3,15};
        int nejvetsi=cisla[0];
        for( int cislo:cisla)
            if (cislo>nejvetsi){
                nejvetsi =cislo;
            }
        System.out.println(nejvetsi);
    }
}
