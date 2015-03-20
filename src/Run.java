import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Alx Shcherbak on 20.03.2015.
 * @author Alx Shcherbak
 */
public class Run extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/labs.fxml"));
        primaryStage.setTitle("LABS MORJOV");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
