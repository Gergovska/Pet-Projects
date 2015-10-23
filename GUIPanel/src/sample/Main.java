package sample;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Text text = new Text("LABEL TEXT");
        text.setFont(new Font(40));
        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        double screenHeight = primScreenBounds.getHeight();
        //VBox box = new VBox();
        GridPane bar = new GridPane();
        bar.setAlignment(Pos.TOP_CENTER);
        bar.add(text,0,0,4,1);
        CheckBox chkbx1 = new CheckBox("42");
        CheckBox checkbox2 = new CheckBox("101");
        CheckBox checkbox3 = new CheckBox("34");
        bar.add(chkbx1,1,1);
        bar.add(checkbox2,3,1);
        bar.add(checkbox3,5,1);
        final Scene scene = new Scene(bar,375, screenHeight);
        scene.setFill(null);
        stage.setScene(scene);

        stage.show();
        stage.setX(primScreenBounds.getWidth() - stage.getWidth());
        stage.setY(0d);


    }

    public static void main(String[] args) {
        launch(args);
    }
}
