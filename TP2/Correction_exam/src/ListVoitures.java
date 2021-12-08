import java.util.ArrayList;
import java.util.List;

public class ListVoitures {

    private List<Voiture> voitures;

    public ListVoitures() {
        this.voitures = new ArrayList<Voiture>();
    }

    public ListVoitures(List<Voiture> voitures) {
        this.voitures = voitures;
    }

    public List<Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(List<Voiture> voitures) {
        this.voitures = voitures;
    }

    public void setVoitures_2(List<Voiture> voitures) {
        this.voitures = new ArrayList<Voiture>();
        this.voitures.addAll(voitures);
    }

    public void ajoutVoiture(Voiture voiture) throws VoitureException{
        if(voitures.contains(voiture)){
            // TODO
            throw new VoitureException("IMPOSSIBLE D'AJOUTER , VOITURE ALREADY EXIST");
        }else {
            this.voitures.add(voiture);
        }
    }

    public void supprimeVoiture(Voiture voiture) throws VoitureException{
        if(voitures.contains(voiture)){
            this.voitures.remove(voiture);
        }else {
            // TODO
            throw new VoitureException("IMPOSSIBLE DE SUPPRIMER , VOITURE NOT EXIST");

        }
    }

    public int size(){
        return voitures.size();
    }


    public void affiche() {
        for (Voiture v: voitures) {
            System.out.println(v);
        }
    }
}
