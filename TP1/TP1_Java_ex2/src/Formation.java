public class Formation {

    private String intitulé;
    private int nbrJours; // : un attribut priv ́e de type entier
    private Stagiaire[] stagiaires; // : un tableau d’objets de type Stagiaire

    public Formation(String intitulé, int nbrJours, Stagiaire[] stagiaires) {
        this.intitulé = intitulé;
        this.nbrJours = nbrJours;
        this.stagiaires = stagiaires;
    }

    public String getIntitulé() {
        return intitulé;
    }

    public int getNbrJours() {
        return nbrJours;
    }

    public Stagiaire[] getStagiaires() {
        return stagiaires;
    }

    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }

    public void setNbrJours(int nbrJours) {
        this.nbrJours = nbrJours;
    }

    public void setStagiaires(Stagiaire[] stagiaires) {
        this.stagiaires = stagiaires;
    }

    public float calculerMoyenneFormation(){
            float sum=0;
            for(Stagiaire item : stagiaires){
                sum+=item.calculerMoyenne();
            }
            return sum/stagiaires.length;
        }

    public int getIndexMax(){
        int index =-1;
        if(stagiaires.length==0){
            return -1;
        }
        float moyenneInitial = stagiaires[0].calculerMoyenne();
        index=0;
        for(int i =0; i< stagiaires.length; i++){
            if(stagiaires[i].calculerMoyenne() > moyenneInitial)
                index=i;
        }

        return index;
    }

    public void afficherNomMax(){
        System.out.println(stagiaires[getIndexMax()].getNom());
    }

    public void afficherMinMax(){
        System.out.println(stagiaires[getIndexMax()].trouverMin());
    }

    public void trouverMoyenneParNom(String nom){
        for(int i =0; i< stagiaires.length; i++){
            if(stagiaires[i].getNom().equals(nom)) {
                System.out.println(stagiaires[i].calculerMoyenne());
                return;
            }

        }
        System.out.println("no stagiaire avec ce Nom");
    }

    public static void main(String[] args){
        float[] notes = new float[]{12, 13,15,16,19};
        Stagiaire s = new Stagiaire("stagaire1", notes);
        System.out.println(s.calculerMoyenne());
        System.out.println(s.trouverMax());
        System.out.println(s.trouverMin());

        Stagiaire s2 = new Stagiaire("stagaire2", notes);
        Stagiaire s3 = new Stagiaire("stagaire3", notes);
        Stagiaire s4 = new Stagiaire("stagaire4", notes);
        Stagiaire[] stagiaires = new Stagiaire[4];
        stagiaires[0] = s;
        stagiaires[1] = s2;
        stagiaires[2] = s3;
        stagiaires[3] = s4;

        Formation f = new Formation("GI", 60, stagiaires);
        System.out.println(f.calculerMoyenneFormation());
        System.out.println(f.getIndexMax());
        f.afficherMinMax();
        f.afficherNomMax();

    }


}
