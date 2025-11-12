public class PR6 {
    public static void main(String[] args) {

        String ANSI_RED = "\u001B[31m";
        String ANSI_reset = "\u001B[0m";

        for (int i = 1; i <=100 ; i++) {
            byte kostka1 =(byte)(Math.random()*5+1);
            byte kostka2=(byte)(Math.random()*5+1);
            byte kostka3=(byte)(Math.random()*5+1);
            boolean stejne = (kostka1==kostka2)&&(kostka1==kostka3);
            if (stejne){
                System.out.println(ANSI_RED+kostka1+" , "+kostka2+" , "+kostka3+ANSI_reset);
            }else {
                System.out.println(kostka1+" , "+kostka2+" , "+kostka3);
            }
        }
    }
}
