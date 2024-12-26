public class Operation {

    String type;
    double montant;
    String date;
    int compteassocie;

    public Operation(String type, double montant, String date, int compteassocie) {
        this.type = type;
        this.montant = montant;
        this.date = date;
        this.compteassocie = compteassocie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCompteassocie() {
        return compteassocie;
    }

    public void setCompteassocie(int compteassocie) {
        this.compteassocie = compteassocie;
    }

}

