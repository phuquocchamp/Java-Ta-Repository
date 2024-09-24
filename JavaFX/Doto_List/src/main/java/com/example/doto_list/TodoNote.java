package com.example.doto_list;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;


public class TodoNote extends Application {
    static ListView<HBox> taskList = new ListView<>();
    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField nameOfTask = new TextField();
        Button add = new Button("Add");
        add.setOnAction(e-> addStask(nameOfTask.getText()));
        Button clearAll = new Button("Clear all");
        clearAll.setOnAction(e -> clearAll());

        nameOfTask.setOnAction(e-> addStask(nameOfTask.getText()));
        Button clearButton = new Button("Clear done tasks");
        clearButton.setOnAction(e->clearTask());
        HBox inputBotton = new HBox(10, add,nameOfTask, clearAll

        );
        VBox layout = new VBox(10, inputBotton,  taskList, clearButton);
        layout.setPadding(new Insets(10));

        Scene scene = new Scene(layout, 300,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Todo List");
        primaryStage.show();

    }
        private void addStask (String copy){
            if(copy == null || copy.trim().isEmpty() )
                return;
            CheckBox check = new CheckBox(copy);
            HBox taskBox = new HBox(check);
            taskList.getItems().add(taskBox);

        }

        private String deteteTextField (String a){
            a = "";
            return a;
        }

        private void clearTask () {
            taskList.getItems().removeIf(item -> {
                CheckBox clear = (CheckBox) item.getChildren().get(0);
                return clear.isSelected();
            });
        }

        private void clearAll(){
            taskList.getItems().clear();
        }


        public static void main (String[]args){
            launch(args);
        }
    }
