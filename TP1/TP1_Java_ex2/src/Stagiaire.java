public class Stagiaire {
    private String nom;
    private float[] notes;


    public Stagiaire(String nom, float[] notes) {
        this.nom = nom;
        this.notes = notes;
    }

    public String getNom() {
        return nom;
    }

    public float[] getNotes() {
        return notes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNotes(float[] notes) {
        this.notes = notes;
    }

    public float calculerMoyenne(){
        float sum=0;
        if(notes.length == 0){
            return 0;
        }
        for(float item : notes){
            sum+=item;
        }
        return sum/notes.length;
    }

    public float trouverMax(){
        float max=0;
        for(float item : notes){
            if(max < item) max = item;
        }
        return max;
    }

    public float trouverMin(){
        if(notes.length == 0){
            return -1;
        }
        float min=notes[0];
        for(int i =0; i< notes.length;i++){
            if(min > notes[i]) min = notes[i];
        }
        return min;
    }


}
