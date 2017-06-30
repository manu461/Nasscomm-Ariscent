/**
 * Created by staLker on 30-06-2017.
 */

import Scenes.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainStage extends Application {
    Stage window;
    Scene scene;
    Button managerSceneLoginButton;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        scene = OnUserLogInScene.getScene();
//        ManagerLoginScene.getLoginButton().setOnAction(e -> {
//            System.out.println(
//                    ManagerLoginScene.getInputUsername().getText() +" "+
//                    ManagerLoginScene.getInputPassword().getText());
//        });
        scene.getStylesheets().add("Themes/Nevike.css");
        window.setScene(scene);
        window.setTitle("Help My Interview!");
        window.setOpacity(0.93);
        window.show();
    }
}
