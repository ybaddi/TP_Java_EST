import java.util.Arrays;

public class Personne {

    private String nom; //: un attribut priv ́e de type chaˆıne de caract`ere.
    private char sexe; // : un attribut priv ́e de type caract`ere (cet attribut aura comme valeur soit ’M’ soit ’F’).
    private Adresse[] adresses; //: un attribut priv ́e de type tableau d’objet de la classe Adresse.

    public Personne(String nom, char sexe, Adresse[] adresses) {
        this.nom = nom;
        this.sexe = sexe;
        this.adresses = adresses;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public Adresse[] getAdresses() {
        return adresses;
    }

    public void setAdresses(Adresse[] adresses) {
        this.adresses = adresses;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", sexe=" + sexe +
                ", adresses=" + Arrays.toString(adresses) +
                '}';
    }
}
