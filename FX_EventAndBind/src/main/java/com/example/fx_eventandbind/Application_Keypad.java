package com.example.fx_eventandbind;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class Application_Keypad extends Application{
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Keypad");

        GridPane pane = new GridPane();
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");

        //setsize
        btn1.setPrefSize(60,60);
        btn2.setPrefSize(60,60);
        btn3.setPrefSize(60,60);
        btn4.setPrefSize(60,60);
        btn5.setPrefSize(60,60);
        btn6.setPrefSize(60,60);
        btn7.setPrefSize(60,60);
        btn8.setPrefSize(60,60);
        btn9.setPrefSize(60,60);

        //Cách này (.addRow) hay hơn chỉ .add()
        pane.addRow(0,btn1,btn2,btn3);
        pane.addRow(1,btn4,btn5,btn6);
        pane.addRow(2,btn7,btn8,btn9);

 /*       pane.add(btn1,0,0);
        pane.add(btn4,0,1);
        pane.add(btn7,0,2);

        pane.add(btn2,1,0);
        pane.add(btn5,1,1);
        pane.add(btn8,1,2);

        pane.add(btn3,2,0);
        pane.add(btn6,2,1);
        pane.add(btn9,2,2);
*/




        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){ launch(args); }
}
