import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);

    }

    @Override
    public void start(Stage stage){
        HBox root = new HBox();
        ObservableList root_list = root.getChildren();

        Scene scene = new Scene(root,500,500);
        stage.setTitle("");
        stage.setScene(scene);
        stage.show();
    }
}
