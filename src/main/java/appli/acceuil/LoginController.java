package appli.acceuil;

import appli.StartApplication;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField email;

    @FXML
    private PasswordField mdp;

    @FXML
    void btnConnexion(ActionEvent event) {
        String emailUser = email.getText();
        String mdpUser = mdp.getText();

        System.out.println(emailUser);
        System.out.println(mdpUser);
        if (emailUser.equals("e@lprs.fr") && mdpUser.equals("elias")) {
            System.out.println("connexion avec succes!");

        } else {
            System.out.println("erreur lors de la connexion");
        }


    }

    public void redirectionInscription(ActionEvent actionEvent) throws IOException {
        StartApplication.changeScene("accueil/Login");
    }

    public void btnMdpOublie(ActionEvent actionEvent) {
        System.out.println("Donnez votre adresse e-mail");

    }
}
