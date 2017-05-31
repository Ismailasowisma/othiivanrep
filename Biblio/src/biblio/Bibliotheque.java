package biblio;

import java.util.ArrayList;

public class Bibliotheque {
    private int nbEtage;
    private ArrayList<Etagere> biblio =new ArrayList<Etagere>();

    public void ajout_etage(Etagere etage){
        biblio.add(etage);
    }
}
