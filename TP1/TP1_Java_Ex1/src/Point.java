public class Point {
    private double abs;
    private double ord;


    public Point(double abs, double ord) {
        this.abs = abs;
        this.ord = ord;
    }

    public double getAbs() {
        return abs;
    }

    public double getOrd() {
        return ord;
    }

    public void setAbs(double abs) {
        this.abs = abs;
    }

    public void setOrd(double ord) {
        this.ord = ord;
    }

    @Override
    public String toString() {
        return "Point{" +
                "abs=" + abs +
                ", ord=" + ord +
                '}';
    }

public double calculeDistance(Point p){
        return Math.sqrt(Math.pow(abs - p.getAbs() , 2) + Math.pow(ord - p.getOrd() , 2) );
}

    public static void main( String[] args){
        Point p = new Point(14,15);

        Point p2 = new Point(15,16);
//        p.setAbs(12.56);
//        p.setOrd(13.69);
        System.out.println(p);
        System.out.println(p.calculeDistance(p2));
    }

}
