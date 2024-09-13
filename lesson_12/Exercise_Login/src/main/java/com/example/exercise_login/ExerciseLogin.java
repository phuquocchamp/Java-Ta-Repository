package com.example.exercise_login;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class ExerciseLogin extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Text name = new Text("Name");
        Text date = new Text("Date of birth");
        Text gender = new Text("Gender");
        Text reservation = new Text("Reservation");
        Text tech = new Text("Technologies Known");
        Text edu = new Text("Educational qualification");
        Text location = new Text("Location");

        TextField fillName = new TextField();
        DatePicker fillDate = new DatePicker();
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        Button yes = new Button("Yes");
        Button no = new  Button("No");
        CheckBox checkJava = new CheckBox("Java");
        CheckBox checkDotNet = new CheckBox("DotNet");
        ChoiceBox <String> fillEdu = new ChoiceBox<String>(
                FXCollections.observableArrayList("Engineering", "MCA", "MBA")
        );

        ChoiceBox <String> fillLocation= new ChoiceBox<String>(
                FXCollections.observableArrayList("Hyderabad", "Tokyo", "Ha Noi")
        );
        Button register = new Button("Register");

        GridPane layout = new GridPane();
        layout.setVgap(5);
        layout.setHgap(5);
        layout.add(name,1,0);
        layout.add(fillName,4,0);
        layout.add(date, 1,1);
        layout.add(fillDate,4,1);
        layout.add(gender,1,2);
        layout.add(male, 4,2);
        layout.add(female, 7,2);
        layout.add(reservation, 1,3);
        layout.add(yes, 4,3);
        layout.add(no, 7,3);
        layout.add(tech,1,4);
        layout.add(checkJava,4,4);
        layout.add(checkDotNet,7,4);
        layout.add(edu,1,5);
        layout.add(fillEdu,4,5);
        layout.add(location,1,6);
        layout.add(fillLocation,4,6);
        layout.add(register,7,7);
        Scene scene = new Scene(layout, 450, 250);
        stage.setScene(scene);
        stage.setTitle("Registration Form");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}