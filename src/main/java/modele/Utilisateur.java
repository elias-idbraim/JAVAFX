package modele;

import javafx.application.Application;
import javafx.stage.Stage;

public class Utilisateur extends Application {
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private int id;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", mdp='" + mdp + '\'' +
                ", id=" + id +
                '}';
    }

    public Utilisateur(String nom, String prenom, String email, String mdp, int id) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
        this.id = id;
    }

    public Utilisateur(String nom, String prenom, String email, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
    }

    public Utilisateur(String mdp, String email) {
        this.mdp = mdp;
        this.email = email;
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

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
