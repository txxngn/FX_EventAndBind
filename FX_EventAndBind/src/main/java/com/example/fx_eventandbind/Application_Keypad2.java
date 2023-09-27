package com.example.fx_eventandbind;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class Application_Keypad2 extends Application{
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Keypad Size Binding");

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

        //size của nút sẽ bị bind với size của pane (thay đổi cửa sổ lớn nhỏ sẽ thay đổi nút)
        //k có prefSizeProperty()
        btn1.prefHeightProperty().bind(pane.heightProperty().divide(3));
        btn1.prefWidthProperty().bind(pane.widthProperty().divide(3));
        btn2.prefHeightProperty().bind(pane.heightProperty().divide(3));
        btn2.prefWidthProperty().bind(pane.widthProperty().divide(3));
        btn3.prefHeightProperty().bind(pane.heightProperty().divide(3));
        btn3.prefWidthProperty().bind(pane.widthProperty().divide(3));
        btn4.prefHeightProperty().bind(pane.heightProperty().divide(3));
        btn4.prefWidthProperty().bind(pane.widthProperty().divide(3));
        btn5.prefHeightProperty().bind(pane.heightProperty().divide(3));
        btn5.prefWidthProperty().bind(pane.widthProperty().divide(3));
        btn6.prefHeightProperty().bind(pane.heightProperty().divide(3));
        btn6.prefWidthProperty().bind(pane.widthProperty().divide(3));
        btn7.prefHeightProperty().bind(pane.heightProperty().divide(3));
        btn7.prefWidthProperty().bind(pane.widthProperty().divide(3));
        btn8.prefHeightProperty().bind(pane.heightProperty().divide(3));
        btn8.prefWidthProperty().bind(pane.widthProperty().divide(3));
        btn9.prefHeightProperty().bind(pane.heightProperty().divide(3));
        btn9.prefWidthProperty().bind(pane.widthProperty().divide(3));



        pane.addRow(0,btn1, btn2, btn3);
        pane.addRow(1,btn4, btn5, btn6);
        pane.addRow(2,btn7, btn8, btn9);





        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){ launch(args); }
}
