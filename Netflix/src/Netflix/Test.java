package Netflix;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
 
public class Test extends Application {
	private double xOffset = 0;
	private double yOffset = 0;
     
    public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox= new HBox();
		Circle circle = new Circle(30,Color.RED);
		
		hbox.setPrefSize(400, 300);
		hbox.getChildren().add(circle);
		Scene scene = new Scene(hbox, 400, 300);
		
		hbox.setOnMousePressed(e->{
			xOffset = e.getSceneX();
			yOffset = e.getSceneY();
		});
		hbox.setOnMouseDragged(e->{
//			scene.xsetX(e.getScreenX()-xOffset);
//			scene.setY(e.getScreenY()-yOffset);
			circle.setOpacity(0.8f);
		});
		hbox.setOnDragDone(e-> {
			circle.setFill(Color.BLUE);
			circle.setOpacity(0.8f);
		});
		
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.show();
		
	}
	
	public void mouseEvent() {
		
	}
 
}