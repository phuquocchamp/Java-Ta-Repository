module com.example.exercise_login {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise_login to javafx.fxml;
    exports com.example.exercise_login;
}