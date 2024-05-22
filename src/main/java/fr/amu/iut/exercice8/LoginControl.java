package fr.amu.iut.exercice8;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class LoginControl extends GridPane {

    @FXML
    Label usernameLabel;
    @FXML
    Label passwordLabel;
    @FXML
    Button loginButton;
    @FXML
    Button cancelButton;
    @FXML
    TextField usernameField;
    @FXML
    PasswordField passwordField;

    @FXML
    private void okClicked() {
    }

    @FXML
    private void cancelClicked() {
    }
}