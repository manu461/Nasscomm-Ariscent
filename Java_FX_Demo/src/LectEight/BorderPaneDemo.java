package LectEight;/**
 * Created by staLker on 27-06-2017.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class BorderPaneDemo extends Application {
    Stage window;
    Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        HBox hLayout = new HBox(20);
        VBox vLayout = new VBox(30);
        Button buttonFile = new Button("File");
        Button buttonEdit = new Button("Edit");
        Button buttonView = new Button("View");
        hLayout.getChildren().addAll(buttonFile,buttonEdit,buttonView);
        hLayout.setPadding(new Insets(10,10,10,10));
        Label labelOne = new Label("One");
        Label labelTwo = new Label("Two");
        Label labelThree = new Label("Three");
        Label labelFour = new Label("Four");
        Label labelFive = new Label("Five");
        Label labelSix = new Label("Six");
        vLayout.getChildren().addAll(labelOne,labelTwo,labelThree,labelFour,labelFive,labelSix);
        vLayout.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(vLayout);
        borderPane.setTop(hLayout);

        scene = new Scene(borderPane,400,400);

        window.setTitle("Border Pane Demo");
        window.setScene(scene);
        window.show();


    }
}
