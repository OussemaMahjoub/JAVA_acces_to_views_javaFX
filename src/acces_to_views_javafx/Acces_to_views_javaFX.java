/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acces_to_views_javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author mahjoub
 */
public class Acces_to_views_javaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();

        /*
        try {
                Parent root1 = FXMLLoader.load(getClass().getResource("Yourfile.fxml"));
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Yourfile.fxml"));
                Parent root = fxmlLoader.load();
                HomeFrontEndController cc=fxmlLoader.getController();
                
                cc.borderpane.setCenter(root1);
                Scene scene = new Scene(root);
                
                Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                app_stage.setScene(scene);                
                app_stage.show();
         
            } catch (IOException ex) {
                Logger.getLogger(OthersBackOfficeProfileController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         */
 /*
        
         try {
          
           Parent root = FXMLLoader.load(getClass().getResource("Yourfile.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("E-NERSERY");
            primaryStage.setScene(scene);
            
            primaryStage.show();
            
            
            
        } catch (IOException ex) {
            ex.getMessage();
        }
         */
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
