import java.util.logging.SocketHandler;

public class Compte {
    private String titulaire;
    private double solde;

    public Compte(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public Compte(String titulaire) {
        this.titulaire = titulaire;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    public void debiter(double montant) throws SoldeInsuffisantException{
        if (montant > this.solde) {
             throw new SoldeInsuffisantException();
            
        } else {
            this.solde -= montant; 
        }
        
    }

    @Override
    public String toString() {
        return "[Compte titulaire: " + titulaire + ", solde: " + solde + "]";
    }
}
