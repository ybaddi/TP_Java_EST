public class TroisPoints {

    private Point premier;
    private Point deuxieme;
    private Point troisieme;

    public TroisPoints(Point premier, Point deuxieme, Point troisieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
        this.troisieme = troisieme;
    }

    public Point getPremier() {
        return premier;
    }

    public Point getDeuxieme() {
        return deuxieme;
    }

    public Point getTroisieme() {
        return troisieme;
    }

    public void setPremier(Point premier) {
        this.premier = premier;
    }

    public void setDeuxieme(Point deuxieme) {
        this.deuxieme = deuxieme;
    }

    public void setTroisieme(Point troisieme) {
        this.troisieme = troisieme;
    }
}
