import java.util.Objects;

public class Voiture {
    private int immatriculation;
    private String marque;
    private float prixLocation;

    public Voiture(int immatriculation, String marque, float prixLocation) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.prixLocation = prixLocation;
    }

    public int getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(int immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrixLocation() {
        return prixLocation;
    }

    public void setPrixLocation(float prixLocation) {
        this.prixLocation = prixLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voiture voiture = (Voiture) o;
        return immatriculation == voiture.immatriculation
                && marque.compareTo(voiture.marque) == 0;
    }

    @Override
    public int hashCode() {
        return immatriculation;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "immatriculation='" + immatriculation + '\'' +
                ", marque='" + marque + '\'' +
                ", prixLocation=" + prixLocation +
                '}';
    }
}
