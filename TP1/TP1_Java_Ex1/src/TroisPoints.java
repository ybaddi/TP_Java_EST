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

    public boolean sontAlignes(){
        double ab = premier.calculeDistance(deuxieme);
        double ac = premier.calculeDistance(troisieme);
        double bc = deuxieme.calculeDistance(troisieme);
        if(ab == ac+bc || bc == ac+ab || ac == ab+bc)
            return true;
        else return false;
    }
}
