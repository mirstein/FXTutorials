module fxtutorials {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;
    requires java.desktop;

    opens com.almasb.calc to javafx.fxml;
    exports com.almasb.calc;
}