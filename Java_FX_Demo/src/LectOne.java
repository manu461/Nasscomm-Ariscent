/**
 * Created by staLker on 27-06-2017.
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class LectOne extends Application {

    Stage window;
    Scene scene1;
    Button button;

    public static void main(String[] args) {

        launch(args);//this method calls start method, and setups the application as java FX application.
    }

    @Override
    //start method is the abstract method
    public void start(Stage primaryStage) {
        this.window = primaryStage;
        window.setTitle("My Window");
        this.button = new Button();
        button.setText("My Button");
        StackPane layout = new StackPane();//this layout makes the button to lie at the centre.
        layout.getChildren().add(button);
        scene1 = new Scene(layout,400,400);
        window.setScene(scene1);
        window.show();

    }
}
