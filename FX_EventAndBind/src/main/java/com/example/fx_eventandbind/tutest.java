package com.example.fx_eventandbind;
import com.almasb.fxgl.app.PrimaryStageWindow;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import org.w3c.dom.Text;

public class tutest extends Application{
    TextField num1;
    TextField num2;
    TextField result;

    public double getNum1(){
        double getnum1 = Double.parseDouble(num1.getText());
        return getnum1;
    }

    public double getNum2(){
        double getnum2 = Double.parseDouble(num2.getText());
        return getnum2;
    }

    public void calculate(){
        double final_resul = getNum1()+getNum2();
        result.setText(final_resul+"");
    }



    public void start (Stage primaryStage){
        primaryStage.setTitle("tutest");

        GridPane pane = new GridPane();
        Label Number1 = new Label("Num 1");
        Label Number2 = new Label("Num 2");
        Label REsult = new Label("Result");
        num1 = new TextField();
        num2 = new TextField();
        result = new TextField();
        Button Calculate = new Button("Calculate");
        GridPane.setHalignment(Calculate, HPos.CENTER);

        pane.addRow(0,Number1,num1);
        pane.addRow(1,Number2,num2);
        pane.addRow(2,REsult,result);
        pane.add(Calculate,0,3,3,1);

        Calculate.setOnAction(e -> calculate());




    Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
}
    public static void main(String[] args){ launch(args); }
}

