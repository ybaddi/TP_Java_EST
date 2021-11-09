public class Adresse {

    /**
     * @para rue
     * @desc
     */
    private String rue; // : un attribut priv ́e de type chaˆıne de caract`ere.
    private String ville; // : un attribut priv ́e de type chaˆıne de caract`ere.
    private String codePostal; // : un attribut priv ́e de type chaˆıne de caract`ere.

    public Adresse(String rue, String ville, String codePostal) {
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "rue='" + rue + '\'' +
                ", ville='" + ville + '\'' +
                ", codePostal='" + codePostal + '\'' +
                '}';
    }
}
