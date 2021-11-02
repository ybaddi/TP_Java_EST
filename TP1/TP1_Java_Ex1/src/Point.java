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



    public static void main( String[] args){
        Point p = new Point();
        p.setAbs(12.56);
        p.setOrd(13.69);
        System.out.println(p);
    }

}
