package ScenesPopWindow;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

/**
 * Created by staLker on 01-07-2017.
 */
public class HelpScene {
    public static Scene getScene(){

        HBox hBox = new HBox();
        Label label = new Label("Help");
        hBox.getChildren().add(label);
        hBox.setAlignment(Pos.CENTER);



        Scene scene = new Scene(hBox,400,400);
        return scene;
    }
}
