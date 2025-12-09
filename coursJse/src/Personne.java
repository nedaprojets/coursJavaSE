public class Personne {

    private String nom;
    private String prenom;
    private int age;


    public Personne(String nom , String prenom,int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show(){
        return getNom() + " " + getPrenom() +  " , " + getAge() + " years old ";
    }

}
