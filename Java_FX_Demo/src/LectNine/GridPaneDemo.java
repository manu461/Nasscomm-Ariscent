package LectNine;/**
 * Created by staLker on 27-06-2017.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GridPaneDemo extends Application {
    private Stage window;
    private Scene scene;
    private Label userNameLabel;
    private Label passwordLabel;
    private TextField inputUsername;
    private PasswordField inputPassword;
    private Button loginButton;
    private Image logoImage;
    private ImageView imageView;
    private ComboBox<String> themeChoice;
    private String theme;
    private static final String RESSBER_THEME = "Ressber";
    private static final String NEVIKE_THEME = "Nevike";


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        //setUserAgentStylesheet(STYLESHEET_MODENA);
        GridPane gridPane = new GridPane();
        gridPane.setHgap(6);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20,20,20,20));

        HBox hBoxForLogo = new HBox(10);
        HBox hBoxForLogin = new HBox(10);

        VBox vBoxRoot = new VBox(10);



        userNameLabel = new Label("Username :");

        logoImage = new Image("logo.png");

        passwordLabel = new Label("Password :");

        inputUsername = new TextField();
        inputUsername.setPromptText("Enter your username");

        inputPassword = new PasswordField();
        inputPassword.setPromptText("Enter your password");

        loginButton = new Button("Login!");

        themeChoice = new ComboBox<>();
        themeChoice.getItems().addAll(NEVIKE_THEME,RESSBER_THEME);
        themeChoice.setPromptText("Set Theme");

        try {
            logoImage = new Image(new FileInputStream("logo.png"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found\n");
        }

        imageView = new ImageView(logoImage);
        imageView.setFitHeight(200);
        imageView.setFitWidth(400);


        GridPane.setConstraints(userNameLabel,0,1);
        GridPane.setConstraints(inputUsername,1,1);
        GridPane.setConstraints(passwordLabel,0,2);
        GridPane.setConstraints(inputPassword,1,2);
        GridPane.setConstraints(loginButton,1,3);
        GridPane.setConstraints(themeChoice,1,7);
        //GridPane.setConstraints(imageView,1,0);


        hBoxForLogo.getChildren().add(imageView);
        hBoxForLogo.setPadding(new Insets(10,10,10,100));
        hBoxForLogin.setPadding(new Insets(10,10,10,120));
        gridPane.getChildren().addAll(userNameLabel,inputUsername,passwordLabel,inputPassword,loginButton,themeChoice);
        hBoxForLogin.getChildren().add(gridPane);
        vBoxRoot.getChildren().addAll(hBoxForLogo,hBoxForLogin);
        vBoxRoot.setAlignment(Pos.CENTER);
        scene = new Scene(vBoxRoot,600,600);
        scene.getStylesheets().add("Ressber.css");

        themeChoice.setOnAction(e -> {
            theme = themeChoice.getValue();
            System.out.print(theme+" "+RESSBER_THEME+" "+NEVIKE_THEME+"\n");
            if(theme.equals(RESSBER_THEME)){
                scene.getStylesheets().remove("Nevike.css");
                if(!scene.getStylesheets().contains("Ressber.css")) scene.getStylesheets().add("Ressber.css");

            }
            if(theme.equals(NEVIKE_THEME)){
                scene.getStylesheets().remove("Ressber.css");
                if(!scene.getStylesheets().contains("Nevike.css")) scene.getStylesheets().add("Nevike.css");
            }
        });


        window.setTitle("Login Screen");
        window.setScene(scene);

        window.setOpacity(0.93);
        window.show();

    }
}
