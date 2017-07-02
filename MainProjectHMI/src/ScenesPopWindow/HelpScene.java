package ScenesPopWindow;

import Utils.HyperText;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class HelpScene {
    public static Scene getScene(){


        VBox labels = new VBox(20);
        VBox textFields = new VBox(10);
        HBox hBox = new HBox(20);
        VBox vBox = new VBox(30);
        HBox facebookPane = new HBox(5);
        HBox instaPane = new HBox(5);
        HBox twitterPane = new HBox(5);
        VBox links = new VBox(5);
        links.setAlignment(Pos.CENTER_LEFT);

        Label lMail_id = new Label("e-mail :");
        Label lDescription = new Label("Description :");
        TextField tMail_id = new TextField();
        tMail_id.setPromptText("enter your mail");
        TextArea tDescription = new TextArea();
        tDescription.setPrefColumnCount(20);
        tDescription.setPrefRowCount(2);
        tDescription.setPromptText("specify your problem ");

        Button facebookLink = new Button("FaceBook Link");
        Button instagramLink = new Button("Instagram Link");
        Button twitterLink = new Button("Twitter Link");
        Button submitquery = new Button("Submit");
        submitquery.getStyleClass().add("button-blue");
        facebookLink.setOnAction(e -> HyperText.openWebpage("https://www.facebook.com/"));
        instagramLink.setOnAction(e -> HyperText.openWebpage("https://www.instagram.com/"));
        twitterLink.setOnAction(e -> HyperText.openWebpage("https://twitter.com/"));
        submitquery.setOnAction(e -> System.out.println("mail and description succesfully submitted"));

        ImageView facebookIcon = new ImageView(new Image("/ImageResource/facebook_logo.png"));
        facebookIcon.setFitWidth(13);
        facebookIcon.setFitHeight(13);
        ImageView instagramIcon = new ImageView(new Image("/ImageResource/instagram_logo.png"));
        instagramIcon.setFitWidth(13);
        instagramIcon.setFitHeight(13);
        ImageView twitterIcon = new ImageView(new Image("/ImageResource/twitter_logo.png"));
        twitterIcon.setFitWidth(13);
        twitterIcon.setFitHeight(13);

        facebookPane.getChildren().addAll(facebookIcon, facebookLink);facebookPane.setAlignment(Pos.CENTER);
        instaPane.getChildren().addAll(instagramIcon, instagramLink);instaPane.setAlignment(Pos.CENTER);
        twitterPane.getChildren().addAll(twitterIcon, twitterLink);twitterPane.setAlignment(Pos.CENTER);

        links.getChildren().addAll(facebookPane,instaPane,twitterPane);

        labels.getChildren().addAll(lMail_id,lDescription);
        textFields.getChildren().addAll(tMail_id,tDescription);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(labels,textFields);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(links,hBox,submitquery);

        return new Scene(vBox,400,400);
    }
}
