package LectSeven;/**
 * Created by staLker on 27-06-2017.
 */

import LectSix.ConfirmationDialog;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class CloseDemo extends Application {
    Stage window;
    Scene scene;
    Button closeButton;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        closeButton = new Button("Close Window!");
        closeButton.setOnAction(e -> closeWithWarning());
        StackPane layout = new StackPane();
        layout.getChildren().add(closeButton);

        scene = new Scene(layout, 400, 400);
        window.setScene(scene);
        window.setOnCloseRequest(e -> {
            e.consume();
            closeWithWarning();
        });
        window.setTitle("Close Demo window");
        window.show();


    }

    private void closeWithWarning() {
        int option = ConfirmationDialog.display("Warning", "Are you sure you want to exit ?");
        if (option == ConfirmationDialog.OPTION_YES) {
            window.close();
        }
    }
}

