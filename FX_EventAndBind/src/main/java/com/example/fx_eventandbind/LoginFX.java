package com.example.fx_eventandbind;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class LoginFX extends Application{
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");

        FlowPane pane = new FlowPane();
        TextField username = new TextField();
        PasswordField pass= new PasswordField();
        Button login = new Button("Log in");

        //disableProperty cho nút nghĩa là nút bị ẩn, k click được
        //explain: nút sẽ disable nếu user OR password bị bỏ trống
        login.disableProperty().bind(
                username.textProperty().isEmpty().or(pass.textProperty().isEmpty()));



        pane.getChildren().addAll(username, pass, login);


        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){ launch(args); }
}
