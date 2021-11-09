import java.util.HashMap;
import java.util.Map;

public class Personne {

    private int num ; //  : un attribut priv ́e de type int
    private String nom ; // : un attribut priv ́e de type String
    private String prenom ; // : un attribut priv ́e de type String

    public Personne() {
    }

    public Personne(int num, String nom, String prenom) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomPrenom(){
        return nom + " " + prenom;
    }

    public static void main(String[] args) {
        Map<String, Personne> personnes = new HashMap<>();

        Personne p1 = new Personne(12, "adil", "ahmed");
        Personne p2 = new Personne(13, "adil1", "ahmed");
        Personne p3 = new Personne(14, "adil2", "ahmed");

        personnes.put(p1.getNomPrenom(), p1);
        personnes.put(p2.getNomPrenom(), p2);
        personnes.put(p3.getNomPrenom(), p3);
    }
}
