module com.example.caculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.scripting;


    opens com.example.caculator to javafx.fxml;
    exports com.example.caculator;
}