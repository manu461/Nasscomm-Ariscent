package Scenes;

import ImageSlider.ImageSlider;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by staLker on 30-06-2017.
 */
public class UserLoginScene {
    public static Scene getScene(){

        HBox imageHMIHBox = new HBox(10);
        HBox userNameHBox = new HBox(10);
        HBox passwordHBox = new HBox(10);
        //HBox userNamePassword = new HBox(20);
        HBox bothButtonHBox = new HBox(10);
        VBox loginPanelHBox = new VBox(10);
        HBox imageSliderHBox = ImageSlider.getLayout();
        VBox root = new VBox(10);
        HBox imageLoginPanel = new HBox(10);

        Label userNameLabel = new Label("Username :");
        Label passwordLabel = new Label("Password :");
        TextField inputUsername = new TextField();
        PasswordField inputPassword = new PasswordField();
        Button loginButton = new Button("Login!");
        Button signUpButton = new Button("SignUp!");
        inputPassword.setPromptText("Enter your password");
        inputUsername.setPromptText("Enter your username");
        ImageView logoImageView = new ImageView(new Image("/ImageSlider/logo.png"));
        logoImageView.setFitHeight(80);
        logoImageView.setFitWidth(160);

        userNameHBox.getChildren().addAll(userNameLabel,inputUsername);
        passwordHBox.getChildren().addAll(passwordLabel,inputPassword);
        imageHMIHBox.getChildren().add(logoImageView);
       // userNamePassword.getChildren().addAll(userNameHBox,passwordHBox);
        //userNamePassword.setPadding(new Insets(30,10,10,10));
        bothButtonHBox.getChildren().addAll(loginButton,signUpButton);
        loginPanelHBox.setPadding(new Insets(70,10,10,50));
        bothButtonHBox.setPadding(new Insets(10,10,10,90));
        imageHMIHBox.setPadding(new Insets(70,0,10,60));
        loginPanelHBox.getChildren().addAll(userNameHBox,passwordHBox,bothButtonHBox);
        imageLoginPanel.getChildren().addAll(imageHMIHBox,loginPanelHBox);
        root.getChildren().addAll(imageLoginPanel,imageSliderHBox);




        Scene scene = new Scene(root,600,600);
        return scene;
    }
}
