module brando.miranda.primecookies {
    requires javafx.controls;
    requires javafx.fxml;


    opens brando.miranda.primecookies to javafx.fxml;

    opens brando.miranda.primecookies.controller to javafx.fxml;



    exports brando.miranda.primecookies to javafx.graphics;
}