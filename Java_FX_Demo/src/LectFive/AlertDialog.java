package LectFive;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;



/**
 * Created by staLker on 27-06-2017.
 */
public class AlertDialog {
    public static void display(String title,String message){

        Stage dialog = new Stage();

        Label label = new Label(message);

        Button button = new Button("Close dialog");
        button.setOnAction(e -> dialog.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,button);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);

        dialog.setTitle(title);

        dialog.initModality(Modality.APPLICATION_MODAL);//makes the dialog window MODAL.

        dialog.setMinWidth(400);
        dialog.setMinHeight(200);
        dialog.setScene(scene);
        dialog.showAndWait();//show and wait until not closed, till then the user cant interact with the calling window.
    }
}
