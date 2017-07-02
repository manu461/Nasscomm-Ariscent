package ScenesPopWindow;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javax.swing.*;
import javax.xml.soap.Text;

/**
 * Created by staLker on 01-07-2017.
 */
public class HelpScene {
    public static Scene getScene(){


        VBox labels = new VBox(20);
        VBox textfields = new VBox(10);
        HBox hBox = new HBox(20);
        VBox vBox = new VBox(30);

        Label lMail_id = new Label("e-mail :");
        Label lDescription = new Label("Description :");
        TextField tMail_id = new TextField();
        tMail_id.setPromptText("enter your mail");
        TextArea tDescription = new TextArea();
        tDescription.setPrefColumnCount(30);
        tDescription.setPrefRowCount(2);

        Button githubLink = new Button("Github Link");


        labels.getChildren().addAll(lMail_id,lDescription);
        textfields.getChildren().addAll(tMail_id,tDescription);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(labels,textfields);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(hBox);


        Scene scene = new Scene(vBox,400,400);
        return scene;
    }
}
