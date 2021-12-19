import java.util.Objects;

public class User {

    private String nom;

    public User(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "User{" +
                "nom='" + nom + '\'' +
                '}';
    }

    public void afficher(){
        System.out.println(this);  // System.out.println(nom);
    }

    public String getNom() {
        return nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nom, user.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
}
