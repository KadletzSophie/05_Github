import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
        Scene scene = new Scene(box_main,500,500);
        box_main.setBackground(new Background (new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        Label label_celsius = new Label("Grad Celsius");
        label_celsius.setMaxWidth(200);
        label_celsius.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        label_celsius.setStyle("-fx-font-size:20;-fx-font-weight: bold");

        Label label_fahrenheit = new Label("Grad Fahrenheit");
        label_fahrenheit.setMaxWidth(200);
        label_fahrenheit.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        label_fahrenheit.setStyle("-fx-font-size:20;-fx-font-weight: bold");


        box_main.getChildren().addAll(label_celsius,label_fahrenheit);

        stage.setTitle("Temp. Converter");
        stage.setScene(scene);
        stage.show();
    }
}
