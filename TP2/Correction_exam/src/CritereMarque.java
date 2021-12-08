public class CritereMarque implements  Critere{
    String marque;

    public CritereMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public boolean estSatisfaitPar(Voiture v) {
        return this.marque.compareTo(v.getMarque())==0;
    }
}
