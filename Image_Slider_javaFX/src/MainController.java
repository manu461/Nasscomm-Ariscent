/**
 * Created by staLker on 30-06-2017.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class MainController extends Application {
    Stage window;
    Scene scene;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        Button button1 = new Button("Hello");
        Button button2 = new Button("HaHaHa");
        HBox hBox1 = new HBox(10);
        hBox1.getChildren().addAll(button1,button2);
        HBox hBox2 = ImageSliderAutomatic.getScene();
        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(hBox1,hBox2);
        scene = new Scene(vBox,800,800);
        window.setTitle("ImageSlider");
        window.setScene(scene);
        window.show();

    }
}
