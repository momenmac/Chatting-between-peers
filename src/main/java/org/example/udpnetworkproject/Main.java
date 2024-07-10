package org.example.udpnetworkproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Stage serverStage = new Stage();
        FXMLLoader fxmlLoaderServer = new FXMLLoader(Main.class.getResource("TCPServer.fxml"));
        Scene Serverscene = new Scene(fxmlLoaderServer.load(), 1061, 752);
        serverStage.setTitle("Server");
        serverStage.setScene(Serverscene);
        serverStage.setResizable(false);
        serverStage.setAlwaysOnTop(true);
        serverStage.show();
        serverStage.setAlwaysOnTop(false);


        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("UDPGUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1397, 815);
        stage.setTitle("UDP PART1 HW, 1st Window");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.show();
        stage.setAlwaysOnTop(false);


        Stage stage2 = new Stage();
        FXMLLoader fxmlLoader2 = new FXMLLoader(Main.class.getResource("UDPGUI.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load(), 1397, 815);
        stage2.setTitle("UDP PART1 HW, 2nd Window");
        stage2.setScene(scene2);
        stage2.setResizable(false);
        stage2.setAlwaysOnTop(true);
        stage2.show();
        stage2.setAlwaysOnTop(false);

        Stage stage3 = new Stage();
        FXMLLoader fxmlLoader3 = new FXMLLoader(Main.class.getResource("UDPGUI.fxml"));
        Scene scene3 = new Scene(fxmlLoader3.load(), 1397, 815);
        stage3.setTitle("UDP PART1 HW, 1st Window");
        stage3.setScene(scene3);
        stage3.setResizable(false);
        stage3.setAlwaysOnTop(true);
        stage3.show();
        stage3.setAlwaysOnTop(false);
    }

    public static void main(String[] args) {
        launch();
    }
}