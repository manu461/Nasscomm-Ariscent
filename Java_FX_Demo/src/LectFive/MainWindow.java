package LectFive;/**
 * Created by staLker on 27-06-2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class MainWindow extends Application implements EventHandler<ActionEvent> {
    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        button = new Button("Launch Alert Dialog!");
        button.setOnAction(this);
        VBox layout = new VBox(10);
        layout.getChildren().add(button);
        layout.setAlignment(Pos.CENTER);
        scene = new Scene(layout,600,600);
        window.setScene(scene);
        window.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == button){
            AlertDialog.display("Alert Title","This demo was fro alert dialog");
        }
    }
}
