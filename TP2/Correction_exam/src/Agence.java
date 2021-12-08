import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Agence {

private String nom;
private ListVoitures vs;
private Map<Client, ListVoitures> ClientVoitureLoue;

public Agence(String nom) {
this.nom=nom;
vs=new ListVoitures();
ClientVoitureLoue=new HashMap<Client, ListVoitures>();
}

public void ajoutVoiture(Voiture v) throws
VoitureException{
	vs.ajoutVoiture(v);
}

public void suppVoiture(Voiture v)throws
VoitureException{
vs.supprimeVoiture(v);
}

public void loueClientVoiture(Client cl, Voiture
v)throws VoitureException{
ClientVoitureLoue.put(cl, vs);
}

public void retourClientVoiture(Client cl , Voiture v)
throws VoitureException{
ClientVoitureLoue.remove(cl);
}

public List<Voiture> selectVoitureSelonCritere(Critere
c){

	c.estSatisfaitPar(v)
}
public Set<Client> ensembleClientsLoueurs(){
// � completer
}
public Collection<ListVoitures>
collectionVoituresLouees(){
// � completer
}
public void afficheLesClientsEtLeursListesVoitures(){
//� compl�ter
}
public Map<Client, ListVoitures> triCodeCroissant(){
// � completer
}
public Map<Client, ListVoitures> triNomCroissant(){
// � completer
}
}