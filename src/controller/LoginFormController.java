package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    public TextField txtName;
    public PasswordField txtPassword;
    public AnchorPane pane;
    static String userName;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        userName=txtName.getText();
        Stage window =(Stage) pane.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ClientChatController.fxml"))));
        window.centerOnScreen();
        window.setTitle(userName + "'s ChatRoom");
    }
}
