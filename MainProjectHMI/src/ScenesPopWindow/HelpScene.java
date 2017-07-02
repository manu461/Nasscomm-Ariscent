package ScenesPopWindow;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;


public class HelpScene {
    public static Scene getScene(){

        HBox hBox = new HBox();
        Label label = new Label("Help coming soon...");
        hBox.getChildren().add(label);
        hBox.setAlignment(Pos.CENTER);



        Scene scene = new Scene(hBox,400,400);
        return scene;
    }
}
