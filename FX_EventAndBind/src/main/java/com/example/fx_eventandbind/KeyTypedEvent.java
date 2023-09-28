package com.example.fx_eventandbind;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class KeyTypedEvent extends Application{
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Twin Text");

        FlowPane pane = new FlowPane();
        TextField text1 = new TextField();
        TextField text2 = new TextField();

        //text1.setOnKeyTyped(e -> { System.out.println(text1.getText());});

        text1.setOnKeyTyped(e -> text2.setText(text1.getText())); //SET text of text2 by GET text from text1

        //text1.setOnKeyTyped(e -> {text2.setText(text1.getText());
        //   System.out.println(text1.getText());});


        pane.getChildren().addAll(text1,text2);



        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){ launch(args); }
}
