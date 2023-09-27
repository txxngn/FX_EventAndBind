package com.example.fx_eventandbind;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class BindedTextProperty extends Application{
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Twin Text");

        FlowPane pane = new FlowPane();
        TextField text1 = new TextField();
        TextField text2 = new TextField();

        //uni-direction: change text1 will change text2 but not reverse
        //text2.textProperty().bind(text1.textProperty()); //bind bị trói buộc bởi

        //Bi-direction: changes in any text1 or text2 will affect the others
        text2.textProperty().bindBidirectional(text1.textProperty());


        pane.getChildren().addAll(text1,text2);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){ launch(args); }
}
