package Netflix;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CommonServiceImpl implements CommonService{
	private double xOffset;
	private double yOffset;
	private Stage stage = null;
	
	public CommonServiceImpl() {
		// TODO Auto-generated constructor stub
		xOffset = 0;
		yOffset = 0;
	}
	

	@Override
	public void stageDrag(AnchorPane pane) {
		// TODO Auto-generated method stub
		pane.setOnMousePressed(e->{
			xOffset = e.getSceneX();
			yOffset = e.getSceneY();
		});
		
		pane.setOnMouseDragged(e-> {
			stage = (Stage) pane.getScene().getWindow();
			stage.setX(e.getScreenX()-xOffset);
			stage.setY(e.getScreenY()-yOffset);
			stage.setOpacity(0.8f);
		});
		pane.setOnDragDone(e-> {
			stage = (Stage) pane.getScene().getWindow();
			stage.setOpacity(1.0f);
		});
		pane.setOnMouseReleased(e->{
			stage = (Stage) pane.getScene().getWindow();
			stage.setOpacity(1.0f);
		});
	}

	@Override
	public void nextPage(AnchorPane rootPane, String url) {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					AnchorPane pane = FXMLLoader.load(getClass().getResource(url));
					rootPane.getChildren().setAll(pane);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}


	@Override
	public Parent openScene(Stage stage, String url) {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(getClass().getResource(url));
		
		Parent root = null;
		
		try {
			root = loader.load();
			stage.setScene(new Scene(root, Color.web("#010101")));
//			stage.initStyle(StageStyle.TRANSPARENT);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Controller ctl = loader.getController();
		ctl.setRoot(root);
		
		stage.show();
		
		return root;
	}
}