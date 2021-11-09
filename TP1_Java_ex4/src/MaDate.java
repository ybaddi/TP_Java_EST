import java.util.Calendar;
import java.util.Date;

public class MaDate {

    private int jour; //  : un attribut priv ́e de type entier.
    private int mois; // : un attribut priv ́e de type entier.
    private int annee; // : un attribut priv ́e de type entier.

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

    public void ajouterUnJour(boolean t){
        // all month have 31 day
        Date dt = new Date();

        Calendar dr = Calendar.getInstance();
        dr.set(annee, mois,jour);
        dr.add(Calendar.DATE,1);
        jour = dr.get(Calendar.DAY_OF_YEAR);
        mois = dr.get(Calendar.MONTH) +1;  // Jan = 0, fev = 1
        annee = dr.get(Calendar.YEAR);
    }


    public void ajouterPlusieursJour(int nbrMois){
        for(int i=0; i <= nbrMois; i++){
            ajouterUnJour(true);
        }
    }

    public void ajouterUnMois(){

        ajouterPlusieursJour(31);

    }

    public void ajouterUnAn(){

        ajouterPlusieursJour(372);

    }
    @Override
    public String toString() {
        return "MaDate{" +
                "jour=" + jour +
                ", mois=" + mois +
                ", annee=" + annee +
                '}';
    }

    public static void main(String[] args) {
        MaDate dt = new MaDate(31,11,202);
        System.out.println(dt);
        dt.ajouterUnJour(true);
        System.out.println(dt);
        dt.ajouterPlusieursJour(30);
        System.out.println(dt);

        dt.ajouterUnMois();
        System.out.println(dt);

        dt.ajouterUnAn();
        System.out.println(dt);


    }
}
