package Netflix;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		CommonService comServ = new CommonServiceImpl();
		comServ.openScene(primaryStage, "/Netflix/Opening.fxml");
	}

	public static void main(String[] args) {
		launch();
	}
}