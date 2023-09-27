package com.example.fx_eventandbind;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class Application_AddEvent extends Application{
    //Phải declare outside start() method
    TextField tf_fnum;
    TextField tf_snum;
    TextField tf_result;

    //cách 2, dùng methods outside start() method
    public double getFirstNumber(){
        String fn = tf_fnum.getText();
        double num1 = Double.parseDouble(fn);
        return num1;
    }

    public double getSecondNumber(){
        String sn = tf_snum.getText();
        double num2 = Double.parseDouble(sn);
        return num2;
    }


    public void addNumber(){
        double num1 = getFirstNumber();
        double num2 = getSecondNumber();
        double result = num1 + num2;
        setResult(result);
    }

    public void setResult(double value){
        tf_result.setText(value + "");
    }


    public void start(Stage primaryStage) {
        primaryStage.setTitle("AddEvent");

        GridPane pane = new GridPane();
        Button add = new Button("Add");

        Label fnum = new Label("First Number");
        Label snum = new Label("Second Number");
        Label result = new Label("Result");
        tf_fnum = new TextField();
        tf_snum = new TextField();
        tf_result = new TextField();



        pane.addRow(0, fnum, tf_fnum);
        pane.addRow(1, snum, tf_snum);
        pane.addRow(2, result, tf_result);
        pane.add(add, 1,3);

        add.setOnAction(e -> addNumber());

        //add.setOnAction(e -> Add_button());



        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    //method outside start() method
    public void Add_button(){
        //get the input
        String FirstNumber = tf_fnum.getText();
        String SecondNumber = tf_snum.getText();

        // do the math
        int num1 = Integer.parseInt(FirstNumber);
        int num2 = Integer.parseInt(SecondNumber);
        int result_button = num1 + num2;

        // update result
        tf_result.setText(""+result_button);

    }
    public static void main(String[] args){ launch(args); }
}
