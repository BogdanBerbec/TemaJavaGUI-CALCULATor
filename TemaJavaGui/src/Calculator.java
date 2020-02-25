import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox nodParinte = new VBox();
        nodParinte.setSpacing(30);

        TextField text1 = new TextField();

        TextField text2 = new TextField();

        HBox hBox = new HBox();
        hBox.setSpacing(20);
        Button plus = new Button("+");
        Button minus = new Button("-");
        Button inmultit = new Button("*");
        Button impartit = new Button("/");
        hBox.getChildren().addAll(plus, minus, inmultit, impartit);

        /*Button egal = new Button("=");*/

        Label rezultat = new Label();

        plus.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    String input1 = text1.getText();
                    double numar1 = Double.parseDouble(input1);

                    String input2 = text2.getText();
                    double numar2 = Double.parseDouble(input2);

                    rezultat.setText("Rezultat: " + (numar1 + numar2));
                }
            });


        minus.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    String input1 = text1.getText();
                    double numar1 = Double.parseDouble(input1);

                    String input2 = text2.getText();
                    double numar2 = Double.parseDouble(input2);

                    rezultat.setText("Rezultat: " + (numar1 - numar2));
                }
        });



        inmultit.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    String input1 = text1.getText();
                    double numar1 = Double.parseDouble(input1);

                    String input2 = text2.getText();
                    double numar2 = Double.parseDouble(input2);

                    rezultat.setText("Rezultat: " + (numar1 * numar2));
                }
        });


        impartit.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    String input1 = text1.getText();
                    double numar1 = Double.parseDouble(input1);

                    String input2 = text2.getText();
                    double numar2 = Double.parseDouble(input2);

                    rezultat.setText("Rezultat: " + (numar1 / numar2));
                }
        });


        nodParinte.getChildren().addAll(text1, text2, hBox, rezultat);

        Scene scene = new Scene(nodParinte);

        primaryStage.setScene(scene);
        primaryStage.setHeight(600);
        primaryStage.setWidth(600);

        primaryStage.show();
    }
}
