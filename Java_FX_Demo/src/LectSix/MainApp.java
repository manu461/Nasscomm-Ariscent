package LectSix;/**
 * Created by staLker on 27-06-2017.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    Stage window;

    Scene scene;

    Button button;
    Label label;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        label = new Label("Pressed nothing till now");
        button = new Button("Launch the confirmation dialog");

        button.setOnAction(e -> {
            int option = ConfirmationDialog.display("Title","Message");
            if(option == ConfirmationDialog.OPTION_YES){
                label.setText("you pressed yes!");
            }
            if(option == ConfirmationDialog.OPTION_NO){
                label.setText("you pressed no!");
            }
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,button);
        layout.setAlignment(Pos.CENTER);

        scene = new Scene(layout,600,600);

        window.setScene(scene);
        window.setTitle("Confirmation Demo");
        window.show();
    }
}
