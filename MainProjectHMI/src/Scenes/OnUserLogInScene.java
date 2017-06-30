package Scenes;

import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

/**
 * Created by staLker on 30-06-2017.
 */
public class OnUserLogInScene {
    public static Scene getScene(){
        AnchorPane anchorPane = new AnchorPane();
        TabPane tabPane = new TabPane();
        Tab personalityTab = new Tab("Personality");
        Tab resumeTab = new Tab("Resume");
        Tab gdTab = new Tab("Group Discussion");
        Tab aboutTab = new Tab("About");
        Tab helpTab = new Tab("Help");
        tabPane.setTabMinWidth(10);

        personalityTab.setClosable(false);
        TextArea ta = new TextArea();
        personalityTab.setContent(ta);
        resumeTab.setClosable(false);
        gdTab.setClosable(false);
        aboutTab.setClosable(false);
        helpTab.setClosable(false);

        tabPane.getTabs().addAll(personalityTab,resumeTab,gdTab,aboutTab,helpTab);

        Button logOutButton = new Button("Logout!");
        HBox hBox = new HBox(logOutButton);
        AnchorPane.setRightAnchor(hBox,0.5);
        hBox.setPadding(new Insets(14,10,0,0));

        anchorPane.getChildren().addAll(tabPane,hBox);
        Scene scene = new Scene(anchorPane,600,600);
        return scene;

    }
}
