//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PR1 {
    public static void main(String[] args) {
        int cislo = 251;
        boolean prvocislo = true;

        for (int i = 2; i <cislo ; i++) {
           prvocislo = true;
            if(cislo%i==0){
                prvocislo=false;
                break;
        }else {
                prvocislo=true;
            }
        }
        if (prvocislo==true){
            System.out.println("je prvočíslo");
        }else{
            System.out.println("není prvočíslo");
        }
    }
}