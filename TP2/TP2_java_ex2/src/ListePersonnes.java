import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListePersonnes {

    Map<String, Personne> personnes = new HashMap<>();


    public void ajouterPersonne(Personne personne) throws PersonneException{
        if(personnes.containsKey(personne.getNomPrenom())){
            throw new PersonneException();
        }else personnes.put(personne.getNomPrenom(), personne);
    }

    public static void main(String[] args) {
        ListePersonnes lp = new ListePersonnes();
        Scanner sc =new Scanner(System.in);
        Integer num = 0;
        do {
            System.out.println("veuillez enter le numero");
            num = sc.nextInt();
            if(num>0) {
                System.out.println("veuillez enter le nom");
                String nom = sc.next();
                System.out.println("veuillez enter le prenom");
                String prenom = sc.next();
                Personne p = new Personne(num, nom, prenom);
                try {
                    lp.ajouterPersonne(p);
                } catch (PersonneException ex) {
                    System.out.println("personne already exist");
                }
            }
        }while(num>0 && num !=null);

        for (Map.Entry<String,Personne> p1: lp.personnes.entrySet()) {
            System.out.println(p1.getKey() + " => " + p1.getValue());

        }

    }



}
