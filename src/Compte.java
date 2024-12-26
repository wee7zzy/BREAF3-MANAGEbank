public abstract class Compte {

    long numero;
    double solde;
    String proprieatire;

    public Compte(String proprieatire, double solde, long numero) {
        this.proprieatire = proprieatire;
        this.solde = solde;
        this.numero = numero;
    }

    public Compte() {
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getProprieatire() {
        return proprieatire;
    }

    public void setProprieatire(String proprieatire) {
        this.proprieatire = proprieatire;
    }
}