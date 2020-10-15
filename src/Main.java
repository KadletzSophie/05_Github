import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);

    }

    @Override
    public void start(Stage stage){
        VBox box_main = new VBox();
        box_main.setPadding(new Insets(500));
        box_main.setBackground(new Background (new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));



        Scene scene = new Scene(box_main,500,500);
        stage.setTitle("");
        stage.setScene(scene);
        stage.show();
    }
}
