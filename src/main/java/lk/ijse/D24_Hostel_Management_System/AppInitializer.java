package lk.ijse.D24_Hostel_Management_System;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppInitializer extends Application {
    @Override
    public void start(Stage primarystage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/logingForm.fxml"));
        Scene mainScene = new Scene(root);
        primarystage.setScene(mainScene);
        primarystage.setTitle("Login Page");
        primarystage.centerOnScreen();
        primarystage.show();
    }
}

