package brando.miranda.primecookies;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimeCookies extends Application {

    Stage windows;

    @Override
    public void start(Stage stage) throws Exception {

        windows = stage;

        Parent screen = FXMLLoader.load(getClass().getResource("admin.fxml"));

        Scene scene = new Scene(screen);

        windows.setScene(scene);
        windows.show();

    }
}
