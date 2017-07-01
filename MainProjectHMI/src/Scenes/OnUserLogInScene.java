package Scenes;

import ScenesPopWindow.AboutScene;
import ScenesPopWindow.HelpScene;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by staLker on 30-06-2017.
 */
public class OnUserLogInScene {
    public static void passControl(Stage window){
        AnchorPane anchorPane = new AnchorPane();
        TabPane tabPane = new TabPane();
        Tab personalityTab = new Tab("Personality");
        Tab resumeTab = new Tab("Resume");
        Tab gdTab = new Tab("Group Discussion");
        Tab aboutTab = new Tab("About");
        Tab helpTab = new Tab("Help");
        tabPane.setTabMinWidth(10);



        TextArea ta = new TextArea();
        ta.setMinWidth(600);
        ta.setMinHeight(600);



        personalityTab.setClosable(false);
        resumeTab.setClosable(false);
        gdTab.setClosable(false);
        aboutTab.setClosable(false);
        helpTab.setClosable(false);

        tabPane.getTabs().addAll(personalityTab,resumeTab,gdTab,aboutTab,helpTab);

        Button logOutButton = new Button("Logout!");
        HBox hBox = new HBox(logOutButton);
        AnchorPane.setRightAnchor(hBox,0.5);
        hBox.setPadding(new Insets(14,10,0,0));



        personalityTab.setContent(ta);
        aboutTab.setContent(AboutScene.getScene().getRoot());
        helpTab.setContent(HelpScene.getScene().getRoot());


        logOutButton.setOnAction(e -> {UserLoginScene.passControl(window);});






        anchorPane.getChildren().addAll(tabPane,hBox);
        Scene scene = new Scene(anchorPane,600,600);
        scene.getStylesheets().add("Themes/Nevike.css");
        window.setScene(scene);
        window.show();

    }
}
