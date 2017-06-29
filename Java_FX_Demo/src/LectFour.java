/**
 * Created by staLker on 27-06-2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class LectFour extends Application implements EventHandler<ActionEvent>{
    Stage window;

    Scene sceneOne;
    Button buttonOne;
    Label labelOne;

    Scene sceneTwo;
    Button buttonTwo;
    Label labelTwo;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;

        buttonOne = new Button("Go to Scene Two!");
        buttonOne.setOnAction(this);
        labelOne = new Label("This is scene one");

        buttonTwo = new Button("Go to Scene One!");
        buttonTwo.setOnAction(this);
        labelTwo = new Label("This is scene Two");

        VBox layoutOne = new VBox();
        layoutOne.getChildren().addAll(buttonOne,labelOne);
        sceneOne = new Scene(layoutOne,400,400);

        VBox layoutTwo = new VBox();
        layoutTwo.getChildren().addAll(buttonTwo,labelTwo);
        sceneTwo = new Scene(layoutTwo,500,500);

        window.setScene(sceneOne);
        window.setTitle("scene switching demo");
        window.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == buttonOne){
            window.setScene(sceneTwo);
        }
        if(event.getSource() == buttonTwo){
            window.setScene(sceneOne);
        }
    }
}
