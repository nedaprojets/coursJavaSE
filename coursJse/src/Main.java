import Ex2.Etudiant;
import Ex2.Filiere;

import java.util.*;

import static java.lang.Character.toLowerCase;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //ex 1
        //System.out.print("Entrez un chiffre");
       // int numero = sc.nextInt();

       // if(numero%2==0){
            //System.out.println("Le numero est paire!");
       // }
      //  else {
           // System.out.println("Le numero est impaire!");
        //}
       /*
        //ex 2
        double sum=0;
        double moyenne=0;
        for(int i=1;i<4;i++){
            System.out.print("Entrez un chiffre");
            double note_i = sc.nextDouble();
            sum=sum+note_i;
        }
        moyenne=Math.round(sum/3);
        if(moyenne>=10){

            System.out.println("la moyenne est : "+ moyenne + "\n Admis");
        }
        else{
            System.out.println(moyenne + ": non-admis");
        }*/

        //ex 3
       /* System.out.print("Entrez un chiffre");
         int numero = sc.nextInt();
         int result = 0;
         for(int i=1;i<=10;i++){
             result=numero*i;
             System.out.println(numero +"*"+ i + "=" + result);
         }*/

        //ex 4
        /* Random rand = new Random();

        int goalNum = rand.nextInt(101); // entier entre 0 et 99



        Do {
        System.out.print("Entrez un chiffre entre 1 et 100");
        int number = sc.nextInt();
        }
        while (goalNum != number) {
            System.out.print("essayez encore  "+ goalNum);
            number = sc.nextInt();
                if(number < goalNum ) {
                    System.out.println("Trop petit");
                }
                else if (number > goalNum ){
                    System.out.println("Trop grand");
                } else {
                    System.out.println("tres bien ! le chiffre est " + number );
                }
            }*/

            //ex 5
       /* System.out.print("combien de nombre voulez vosu saisir ? ");
        int number = sc.nextInt();
        int i=1;
        //int[] numbers = new int[number];
        double sum=0;
        double moyenne=0 ;
        while(i<number+1){
            System.out.print("entrez le chiffre " + i );
            double entry=sc.nextDouble();
            sum+=entry;
            i++ ;
        }
        moyenne=sum/number;
        System.out.println("Somme : "+ sum + " | Moyenne : "+moyenne); */

        // exo 6 : compter les voyelles
        /* int counter=0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        System.out.print("Entrez une phrase ");
        String sent = sc.nextLine();
        char[] letters = sent.toLowerCase().toCharArray();

       int lengthSent = sent.length();
        for (char letter : letters) {
            for (char vowel : vowels) {
                if (letter == vowel) {
                    counter++;
                }
            }

        }
        System.out.println(counter);*/


      /* Personne p_one=new Personne("John","Dublin" , 5) ;


        System.out.println(p_one.show());*/

        /*Specialite specialite_one = new Specialite("Java");
        Specialite specialite_two = new Specialite("JS");
        Specialite specialite_three = new Specialite("Gestion projet");
        Specialite specialite_four = new Specialite("PHP");
        Specialite specialite_five = new Specialite("Html/CSS");

        Enseignant enseignant_1=new Enseignant("Tom",specialite_one);
        Enseignant enseignant_2=new Enseignant("John",specialite_two);
        Enseignant enseignant_3=new Enseignant("James",specialite_three);
        Enseignant enseignant_4=new Enseignant("Simon",specialite_four);

        List<Enseignant> enseignants=new ArrayList<>(Arrays.asList(enseignant_1,enseignant_2,enseignant_3,enseignant_4));
        List<Specialite> specialiteList=new ArrayList<>(Arrays.asList(specialite_one,specialite_two,specialite_three,specialite_four,specialite_five));
       boolean found;


        for (Specialite specialite : specialiteList) {
            System.out.println(specialite.getNom());
            found = false;

            for (Enseignant enseignant : enseignants) {
                if (enseignant.getSpecialite().getNom().equals(specialite.getNom())) {
                    System.out.println(enseignant.getNom() + " : " + specialite.getNom());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(specialite.getNom() + " n'a pas d'enseignant");
            }
        }*/


        Filiere cda=new Filiere("1","CDA");
        Filiere marketing=new Filiere("2","Marketing");
        Filiere ass_vie=new Filiere("3","Assistance de vie");

        Etudiant et1=new Etudiant("Homer","Simpson",cda);
        Etudiant et2=new Etudiant("Bart","Simpson",cda);
        Etudiant et3=new Etudiant("Vanessa","Sultan",marketing);
        Etudiant et4=new Etudiant("Marge","Simpson",marketing);
        Etudiant et5=new Etudiant("Lisa","Simpson",marketing);

        List<Filiere> filiereList=new ArrayList<>(Arrays.asList(cda,marketing,ass_vie));
        List<Etudiant> etudiantList=new ArrayList<>(Arrays.asList(et1,et2,et3,et4,et5));

        System.out.println("Liste des filieres");
        boolean found;


        for (Filiere fil : filiereList) {
            System.out.println(fil.getLibelle());
            found=false;
            int i=1;

            for (Etudiant etud : etudiantList) {

                if (etud.getFiliere().equals(fil)) {

                    System.out.println(" "+ i +"-" + etud.getNom() + " " + etud.getPrenom()+ "\n");

                    found=true;
                    i++;
                }

            }
            if (!found) {
                System.out.println("Filiere : " +fil.getLibelle() + " \n Pas d'inscrit");
            }
        }


    }
}