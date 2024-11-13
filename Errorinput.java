package SchoolWork.ManagementSystem;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Errorinput extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Image image = new Image("SchoolWork/ManagementSystem/Error.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(500);
        imageView.setFitWidth(900);

        pane.getChildren().add(imageView);

        Label label = new Label("输入的成绩为空");
        Font font = new Font(15);
        label.setTextFill(Color.RED);
        label.setFont(font);
        label.setLayoutY(35);
        label.setLayoutX(80);

        Button button = new Button("确定");
        button.setLayoutY(100);
        button.setLayoutX(110);
        pane.getChildren().add(button);

        button.setOnAction(event -> {
            primaryStage.hide();
        });

        pane.getChildren().add(label);

        Scene scene = new Scene(pane, 250, 150);

        primaryStage.setTitle("错误");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.getIcons().add(new Image("SchoolWork/ManagementSystem/Ego_KaKa.jpg"));
        primaryStage.setResizable(false);
    }
}
