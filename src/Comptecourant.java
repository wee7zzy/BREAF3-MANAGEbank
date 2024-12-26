import java.util.ArrayList;
import java.util.Scanner;

public class Comptecourant extends Compte{

    double fraisbancaires;

    Scanner scanner=new Scanner(System.in);

    public Comptecourant(String proprieatire, double solde, long numero, double fraisbancaires) {
        super(proprieatire, solde, numero);
        this.fraisbancaires = fraisbancaires;
    }

    public Comptecourant() {

    }

    public double getFraisbancaires() {
        return fraisbancaires;
    }

    public void setFraisbancaires(double fraisbancaires) {
        this.fraisbancaires = fraisbancaires;
    }
}
