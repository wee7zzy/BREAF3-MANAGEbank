import java.util.ArrayList;
import java.util.Scanner;

public class Compteepargne extends Compte {

    double tauxinteret;

    Scanner scanner=new Scanner(System.in);

    ArrayList<Compteepargne> compteepargnes=new ArrayList<>();

    public Compteepargne(String proprieatire, double solde, long numero, double tauxinteret) {
        super(proprieatire, solde, numero);
        this.tauxinteret = tauxinteret;
    }

    public Compteepargne() {
    }

    public double getTauxinteret() {
        return tauxinteret;
    }

    public void setTauxinteret(double tauxinteret) {
        this.tauxinteret = tauxinteret;
    }

    public void addComptepargne(){
        System.out.print("entrer numero acount :" );
        this.setNumero(scanner.nextLong());
        System.out.print("entrer solde initial :");
        this.setSolde(scanner.nextDouble());
        compteepargnes.add(new Compteepargne(proprieatire,solde,numero,tauxinteret));
        System.out.println("compte epargne ajouter avec succes");
    }

    public void affichercompteepargne(){
        for(Compteepargne compte:compteepargnes){
            System.out.println(compte);
        }
    }



    public void menuCopmteepargne(){
        System.out.print("-----MENU COMPTE EPARGNE------\n"+
                "1-creer compte epargne\n"+
                "2-associer comptes/client\n"+
                "         -------entrer choix :");
        int choix= scanner.nextInt();

        switch (choix){
            case 1:
                addComptepargne();
                break;
            default:
                System.out.println("choix invalide");
                break;

        }
    }

    @Override
    public String toString() {
        return "Compteepargne{" +
                "numero=" + numero +
                ", proprieatire=" + proprieatire +
                ", solde=" + solde +
                '}';
    }


}

