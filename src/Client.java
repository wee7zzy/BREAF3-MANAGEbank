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

    public void modifierclient(){
        System.out.print("ENTREZ L'ID du client a modifier :");
        this.setId(scanner.nextInt());

        for(Client client : clients ){
            if(client.getId()==this.getId()){
                System.out.print("1-modifier id\n" +
                        "2-modifier nom\n"+
                        "3-modifier prenom\n"+
                        "4-modifier email\n"+
                        "5-modifier adresse\n"+
                        "6-modifier telephone\n"+
                        "----ENTRER CHOIX:");
                int choix= scanner.nextInt();

                switch(choix){
                    case 1:
                        System.out.print("entrer nouvelle id :");
                        client.setId(scanner.nextInt());
                        System.out.println("modifier avec succes ");
                        break;
                    case 2:
                        System.out.print("entrer nouveau nom : ");
                        client.setNom(scanner.next());
                        System.out.println("modifier avec succes ");
                        break;
                    case 3:
                        System.out.print("entrer nouveau prenom :");
                        client.setPrenom(scanner.next());
                        System.out.println("modifier avec succes");
                        break;
                    case 4:
                        System.out.print("entrer nouveau email :");
                        client.setEmail(scanner.next());
                        System.out.println("modifier avec succes");
                        break;
                    case 5:
                        System.out.print("entrer nouvelle adresse :");
                        client.setAdresse(scanner.next());
                        System.out.println("modifier avec succes");
                        break;
                    case 6:
                        System.out.print("entrer nouveau numero telephone :");
                        client.setTelephone(scanner.next());
                        System.out.println("modifier avec succes");
                        break;
                    default:
                        System.out.println("choix introuvable");
                        break;
                }
            }else System.out.println("LISTE VIDE");
        }
    }

    public void suuprimerclient(){
        System.out.print("entrer l'id du client a supprimer :");
        this.setId(scanner.nextInt());
        for(Client client: clients){
            if(client.getId()==this.getId()){
                clients.removeIf(a->a.getId()==this.getId());
                System.out.println("apprenant supprimer avec succes");
                break;
            }else System.out.println("client introuvable ou pas de client");
        }
    }

    public void afficherclient(){
        for(Client client:clients){
            System.out.println(client);
        }
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