package Netflix;

import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public interface CommonService {
	// 마우스 드래그 창 이동
	public void stageDrag(AnchorPane root);
	// 페이지 변경
	public void nextPage(AnchorPane rootPane, String url);
	// Scene 생성
	public Parent openScene(Stage stage, String url);
}
