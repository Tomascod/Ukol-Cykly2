public class PR8 {
    public static void main(String[] args) {
        int[] tazenaCisla = {1,17,25,4,29,9,7,24,6,12};
        int[] tipovanaCisla = {1,3,5,7,8,9,14,4,25,17};
        String ANSI_red = "\u001B[31m";
        String ANSI_reset = "\u001B[0m";
        boolean uhodnuto;

        for (int i = 0; i < tipovanaCisla.length; i++) {
            uhodnuto=true;
            for (int j = 0; j < tazenaCisla.length-1; j++) {
                 uhodnuto = false;
                if (tipovanaCisla[i] == tazenaCisla[j]) {
                    uhodnuto=true;
                    break;
                }else {
                    uhodnuto=false;
                }
            }
            if (uhodnuto){
                System.out.println(ANSI_red+tipovanaCisla[i]+ANSI_reset);
        }else {
                System.out.println(tipovanaCisla[i]);
            }
        }
    }
}
