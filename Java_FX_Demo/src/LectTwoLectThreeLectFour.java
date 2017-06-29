/**
 * Created by staLker on 27-06-2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LectTwoLectThreeLectFour extends Application implements EventHandler<ActionEvent>{
    Stage window;
    Scene scene1;
    Button button1;//event handled using Event-Handler Class, requires the implementation of handle() method of EventHandler interface.
    Button button2;//event handled using anonymous-class , does not requires the "implements EventHandler<>" part.
    Button button3;//event handled using lambda expression, very easy, functionality added since Java 8.

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.window = primaryStage;
        this.button1 = new Button();
        this.button2 = new Button();
        this.button3 = new Button();
        window.setTitle("My Window");
        button1.setText("Button1");
        button2.setText("Button2");
        button3.setText("Button3");



        button1.setOnAction(this);//event handled using Event-Handler Class,see the handling mechanism in overridden 'handle()' method.



        button2.setOnAction(new EventHandler<ActionEvent>() { //event handled using anonymous-class.
            @Override
            public void handle(ActionEvent event) {
                System.out.print("Ha! Ha! Ha! y so serious?,I am anonymous handler\n");
            }
        });



        button3.setOnAction(e -> { // event handled using a lambda expression i.e. " e -> action " .
            System.out.print("Ha! Ha! Ha! y so serious?,");
            System.out.print("I am lambda handler\n");
        });



        VBox layout = new VBox();  //children are laid out in vertical column.
        layout.getChildren().addAll(button1,button2,button3); //addAll() method is used at the time of adding two or more items to the layout.
        scene1 = new Scene(layout,400,400);
        window.setScene(scene1);
        window.show();
    }




    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button1){
            System.out.print("Ha! Ha! Ha! y so serious?,I am simple event handler\n");
        }
    }
}
