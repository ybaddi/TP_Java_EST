import java.util.Date;

public class MaDate {

    private int jour; //  : un attribut priv ́e de type entier.
    private int mois // : un attribut priv ́e de type entier.
    private int annee // : un attribut priv ́e de type entier.

    public MaDate(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void ajouterUnJour(){
        // all month have 31 day
        if(jour == 31){
            jour = 1;
            if(mois == 12){
                mois =1;
                annee ++;
            }else mois++;
        }else{
            jour++;
        }

    }

    // TODO propose a noter solution for ajouterUnJour

    @Override
    public String toString() {
        return "MaDate{" +
                "jour=" + jour +
                ", mois=" + mois +
                ", annee=" + annee +
                '}';
    }
}
