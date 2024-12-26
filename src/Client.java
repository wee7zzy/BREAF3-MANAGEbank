import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    Scanner scanner = new Scanner(System.in);

    private int id;
    private String nom, prenom, email, adresse;
    private String telephone;

    String regexEmail="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    String regexTelephone="^(?:6|7|5)[0-9]{8}$";

    public ArrayList<Client> clients = new ArrayList<>();

    public Client(int id, String nom, String prenom, String email, String adresse, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public  void ajouterclient(){
        try {
            System.out.print("Entrez id : ");
            this.setId(scanner.nextInt());
            for(Client client:clients){
                if(client.getId()==this.getId()){
                    System.out.println("ID EXISTE DEJA ENTRER NOUVELLE ID :");
                    this.setId(scanner.nextInt());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Erreur : Entrée invalide !");
        }

        System.out.print("entrer nom :");
        this.setNom(scanner.next());
        scanner.nextLine();
        System.out.print("entrer prenom :");
        this.setPrenom(scanner.nextLine());
        System.out.print("entrer email :");
        this.email=scanner.next();
        scanner.nextLine();
        if (!email.matches(regexEmail)) {
            do {
                System.out.println("email invalid entrer EMAIL VALIDE :");
                email = scanner.nextLine();
            } while (!email.matches(regexEmail));
        }
        System.out.print("entrer adresse :");
        this.setAdresse(scanner.nextLine());
        System.out.print("entrer telephone : (+212)");
        this.telephone=scanner.nextLine();

        if (!telephone.matches(regexTelephone)) {
            do {
                System.out.println("telephone invalid entrer numero VALIDE :");
                telephone = scanner.nextLine();
            } while (!telephone.matches(regexTelephone));
        }

        clients.add(new Client(id,nom,prenom,email,adresse,telephone));
        System.out.println("CLIENTS AJOUTER AVEC SUCCES");
    }



    public void menuclient(){
        System.out.print("------MENU CLIENT-------\n"+
                "1-ajouter\n"+
                "2-modifier\n"+
                "3-supprimer\n"+
                "4-afficher\n"+
                "----- ENTREZ VOTRE CHOIX :");

        int choix=scanner.nextInt();

        switch (choix){
            case 1:
                ajouterclient();
                break;
            default:
                System.out.println("choix invalide");
                break;
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone=+212" + telephone +
                '}';
    }
}