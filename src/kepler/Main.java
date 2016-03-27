/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kepler;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Пользователь
 */
public class Main extends Application {
    private  Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader load = new FXMLLoader();
        AnchorPane root = (AnchorPane) load.load(getClass().getResourceAsStream("GUI.fxml"));
        primaryStage.setTitle("Kepler - город мечты, Транспортная сеть");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
