package Stages;

import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by staLker on 01-07-2017.
 */
public class PopUpStage {
    public static void show(String title, Scene scene){
        Stage window = new Stage();
        window.setTitle(title);
        window.setScene(scene);
        window.initModality(Modality.APPLICATION_MODAL);
        window.showAndWait();
    }
}
