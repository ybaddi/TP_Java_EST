/**
 * @author Youssef BADDI
 * Consid ́erons une classe Java appel ́ee Point ayant les attributs suivants :
 * • abs : un attribut priv ́e de type double
 * • ord : un attribut priv ́e de type double
 * 1. Cr ́eez la classe Point
 * 2. G ́en ́erez les getters et setters pour les deux attributs.
 * 3. D ́efinissez la m ́ethode toString() qui retourne la repr ́esentation math ́ematique d’un point : (abs, ord).
 * 4. D ́efinissez un constructeur avec deux param`etres Point(double abs, double ord)
 * 5. E ́crivez la m ́ethode calculerDistance(Point p) qui permet de calculer la distance entre le point de l’objet courant (this) et l’objet p pass ́e en param`etre. Nous rappelons que la distance entre deux points A(x1,y1) et B(x2,y2), en math ́ematiques, est  ́egale `a :
 * 􏰀(x1 − x2)2 + (y1 − y2)2)
 * Utiliser la m ́ethode statique sqrt(double a) de la classe Math
 * 6. E ́crivez la calculerMilieu(Point p) qui permet de calculer et de retourner un objet corres- pondant au milieu du segment d ́efini par le point de l’objet courant (this) et l’objet p pass ́e en param`etre. Nous rappelons que les coordonn ́ees d’un point M(xM ,yM ) milieu de A(x1,y1) et B(x2,y2), en math ́ematiques, sont :
 * • xM = x1 + x2 2
 * • yM = y1 + y2 2
 * La m ́ethode doit retourner un objet Point et pas les coordonn ́ees.
 * Consid ́erons maintenant une deuxi`eme classe appel ́ee TroisPoints ayant les attributs suivants :
 * • premier : un attribut priv ́e de type Point
 * • deuxie`me : un attribut priv ́e de type Point
 * • troisie`me : un attribut priv ́e de type Point
 * 7. G ́en ́erez les getters/setters et le constructeur avec trois param`etres de la classe TroisPoints.
 * 8. E ́crivez une m ́ethode sontAlignes() qui retourne true si les trois points premier, deuxie`me et troisie`me sont align ́es, false sinon. Nous rappelons que trois points A, B et C sont align ́es si AB = AC + BC, AC = AB + BC ou BC = AC + AB (AB d ́esigne la distance s ́eparant le point A du point B, pareillement pour AC et BC).
 * 9. E ́crivez une m ́ethode estIsocele() qui retourne true si les trois points premier, deuxie`me et troisie`me forment un triangle isoc`ele, false sinon. Nous rappelons qu’un triangle ABC est isoc`ele si AB = AC ou AB = BC ou BC = AC.
 * 10. Dans la m ́ethode main() de la classe principale Main, demandez a` l’utilisateur de saisir les coordonn ́ees de trois points. Ensuite, utilisez les classes et les m ́ethodes pr ́ec ́edentes pour afficher tous les d ́etails sur ces trois points, les milieux, les distances qui les s ́eparent, afficher s’ils sont align ́es, s’ils forment un triangle isoc`ele...
 */



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

public Point calculeMilieu(Point p){
    return new Point((abs + p.getAbs())/2,(ord + p.getOrd())/2);
}

    public static void main( String[] args){
        Point p = new Point(14,15);

        Point p2 = new Point(15,16);
//        p.setAbs(12.56);
//        p.setOrd(13.69);
        System.out.println(p);
        System.out.println(p.calculeDistance(p2));

        System.out.println(p.calculerMilieu(p2));
    }

}
