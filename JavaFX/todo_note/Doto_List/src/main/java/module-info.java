module com.example.doto_list {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.doto_list to javafx.fxml;
    exports com.example.doto_list;
}