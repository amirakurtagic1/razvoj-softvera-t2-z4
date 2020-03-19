package ba.unsa.etf.tutorijal2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Ispit Test");
        primaryStage.setScene(new Scene(root, 450, 320));
        primaryStage.setMinWidth(450);
        primaryStage.setMinHeight(320);
        primaryStage.setResizable(false);

        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
