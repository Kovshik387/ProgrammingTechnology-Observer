module com.example.programmingtechnologyobserver {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.example.programmingtechnologyobserver to javafx.fxml;
    exports com.example.programmingtechnologyobserver;
}