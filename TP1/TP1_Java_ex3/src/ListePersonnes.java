public class ListePersonnes {
    private Personne[] personnes = new Personne[10];

    public ListePersonnes(Personne[] personnes) {
        this.personnes = personnes;
    }

    public Personne[] getPersonnes() {
        return personnes;
    }

    public void setPersonnes(Personne[] personnes) {
        this.personnes = personnes;
    }

    public Personne findByNom(String s) {
        for (Personne p : personnes) {
            if (p.getNom().equals(s)) return p;
        }
        return null;
    }

    public Personne findByCodePostal(String cp) {
        for (Personne p : personnes) {
            for (Adresse a : p.getAdresses()) {
                if (a.getCodePostal().equals(cp)) return p;
            }
        }
        return null;
    }

    public int countPersonneVille(String ville){
        int res=0;
        loop1:for (Personne p : personnes) {
            loop2:for (Adresse a : p.getAdresses()) {
                if (a.getVille().equals(ville))
                {res++;
                break loop2;
                }
            }
        }
        return res;
    }

    public void editPersonneNom(String oldNom, String newNom){
        findByNom(oldNom).setNom(newNom);
    }
    public void publeditPersonneVille(String nom, String newVille){
        for(Adresse a : findByNom(nom).getAdresses()){
            a.setVille(newVille);
        }
    }

    public static void main(String[] args) {
        Adresse a = new Adresse("JEdida", "JEdida", "123456");
        Adresse a2 = new Adresse("JEdida", "JEdida", "123456");
        Adresse a3 = new Adresse("JEdida", "JEdida", "123456");

        Personne p = new Personne("p1", 'h', new Adresse[]{a,a2,a3});

        ListePersonnes lp = new ListePersonnes(new Personne[]{p,p,p,p,p,p,p,p,p,p});

        System.out.println(lp.countPersonneVille("JEdida"));
        System.out.println(lp.findByNom("p1"));
        lp.publeditPersonneVille("p1","sidibennour");
        lp.editPersonneNom("p1", "p2");
        System.out.println(lp.findByNom("p2"));

        1- citer deux protocoles de routage
        2- citer la liste des cmds pour la config
    d'une interface d'un routeur
        3- citer le delai de convergence du protocole OSPF
        4- citer la diff entre routage static et
        routage dynamique
        5 citer la cmd de configuration d'une route static


    }
}
