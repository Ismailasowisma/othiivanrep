
public class Roman extends Livre {
    public Roman(int num_renseignement, String titre, String auteur, int nbPage) {
        super(num_renseignement, titre, auteur, nbPage);
    }
    private String prix;

    public Roman(int num_renseignement, String titre, String auteur, int nbPage, String prix) {
        super(num_renseignement, titre, auteur, nbPage);
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Roman{" +
                "prix litteraire='" + prix + '\'' +
                ", auteur='" + auteur + '\'' +
                ", nbPage=" + nbPage +
                ", num_renseignement=" + num_renseignement +
                ", titre='" + titre + '\'' +
                '}';
    }
}