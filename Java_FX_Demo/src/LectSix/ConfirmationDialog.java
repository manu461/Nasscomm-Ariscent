package LectSix;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by staLker on 27-06-2017.
 */
public class ConfirmationDialog {

    public static final int OPTION_YES = 142;
    public static final int OPTION_NO = 785;

    private static int answer = 0;

    public static int display(String title, String message) {

        Stage confirmationDialog = new Stage();

        Label label = new Label(message);

        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        yesButton.setOnAction((ActionEvent e) -> {
            answer = OPTION_YES;
            confirmationDialog.close();
        });

        noButton.setOnAction(e -> {
            answer = OPTION_NO;
            confirmationDialog.close();
        });

        VBox vLayout = new VBox(10);
        HBox hLayout  = new HBox(10);
        hLayout.getChildren().addAll(yesButton,noButton);
        hLayout.setAlignment(Pos.CENTER);
        vLayout.getChildren().addAll(label,hLayout);
        vLayout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vLayout);

        confirmationDialog.setTitle(title);
        confirmationDialog.initModality(Modality.APPLICATION_MODAL);
        confirmationDialog.setMinHeight(200);
        confirmationDialog.setMinWidth(400);
        confirmationDialog.setScene(scene);

        confirmationDialog.showAndWait();

        return answer;
    }
}
