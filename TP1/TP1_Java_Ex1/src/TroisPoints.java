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
//        if(ab == ac+bc || bc == ac+ab || ac == ab+bc)
//            return true;
//        else return false;
        return (ab == ac+bc || bc == ac+ab || ac == ab+bc) ;
    }

    public boolean estIsocele(){
        double ab = premier.calculeDistance(deuxieme);
        double ac = premier.calculeDistance(troisieme);
        double bc = deuxieme.calculeDistance(troisieme);
//        if(ab == ac || bc == ac || bc == ab)
//            return true;
//        else return false;
        return (ab == ac || bc == ac || bc == ab) ;
    }

    public static void main( String[] args){
        Point p1 = new Point(14,15);
        Point p2 = new Point(15,16);
        Point p3 = new Point(15,16);
        TroisPoints tp = new TroisPoints(p1,p2,p3);
        System.out.println(tp.estIsocele());
        System.out.println(tp.sontAlignes());
    }
}
