import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello there");

        Scanner sc = new Scanner(System.in);
        //System.out.print("Entrez un chiffre");
       // int numero = sc.nextInt();

       // if(numero%2==0){
            //System.out.println("Le numero est paire!");
       // }
      //  else {
           // System.out.println("Le numero est impaire!");
        //}
        double sum=0;
        double moyenne=0;
        for(int i=1;i<4;i++){
            System.out.print("Entrez un chiffre");
            double note_i = sc.nextDouble();
            sum=sum+note_i;
        }
        moyenne=Math.round(sum/3);
        if(moyenne>=10){
            System.out.println(moyenne + ": Admis");
        }
        else{
            System.out.println(moyenne + ": non-admis");
        }

    }
}