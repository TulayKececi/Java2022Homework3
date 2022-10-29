module com.example.java2022homework3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java2022homework3 to javafx.fxml;
    exports com.example.java2022homework3;
}