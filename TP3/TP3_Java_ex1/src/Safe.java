public class Safe {
    private User user;
    private int valeur;

    public Safe(User user, int valeur) {
        this.user = user;
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    public boolean isAuthorized(User user){
        return this.user.equals(user);
    }

}
