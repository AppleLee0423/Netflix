package Netflix;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class WelcomeController extends Controller implements Initializable{
	private Parent root;
	@FXML private AnchorPane container;
	@FXML private AnchorPane imagePane1;
	@FXML private AnchorPane imagePane2;
	@FXML private AnchorPane imagePane3;
	@FXML private AnchorPane imagePane4;
	@FXML private ImageView imageView1;
	@FXML private ImageView imageView2;
	@FXML private ImageView imageView3;
	@FXML private ImageView imageView4;
	@FXML private Button joinBtn;
	@FXML private Button loginBtn;
	@FXML private Button personalBtn;
	@FXML private Circle c1;
	@FXML private Circle c2;
	@FXML private Circle c3;
	@FXML private Circle c4;
	
	@Override
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		for(int cnt=0; cnt<5; cnt++) {
			viewChange();
			cnt = 0;
		}
	}
	
	public void viewChange() {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
				
			@Override
			public void run() {
				// TODO Auto-generated method stub
				imagePane1.setVisible(false);
				imagePane2.setVisible(true);
				imagePane3.setVisible(false);
				imagePane4.setVisible(false);
				
				c1.setFill(Color.web("#737373"));
				c2.setFill(Color.web("#dd0912"));
				c3.setFill(Color.web("#737373"));
				c4.setFill(Color.web("#737373"));
			}
		};
		
		timer.schedule(task,2000);
		
		Timer timer2 = new Timer();
		TimerTask task2 = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				imagePane1.setVisible(false);
				imagePane2.setVisible(false);
				imagePane3.setVisible(true);
				imagePane4.setVisible(false);
				
				c1.setFill(Color.web("#737373"));
				c2.setFill(Color.web("#737373"));
				c3.setFill(Color.web("#dd0912"));
				c4.setFill(Color.web("#737373"));
			}
		};
		
		timer2.schedule(task2,4000);
		
		Timer timer3 = new Timer();
		TimerTask task3 = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				imagePane1.setVisible(false);
				imagePane2.setVisible(false);
				imagePane3.setVisible(false);
				imagePane4.setVisible(true);
				
				c1.setFill(Color.web("#737373"));
				c2.setFill(Color.web("#737373"));
				c3.setFill(Color.web("#737373"));
				c4.setFill(Color.web("#dd0912"));
			}
		};
		
		timer3.schedule(task3,6000);
		
		Timer timer4 = new Timer();
		TimerTask task4 = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				imagePane1.setVisible(true);
				imagePane2.setVisible(false);
				imagePane3.setVisible(false);
				imagePane4.setVisible(false);
				
				c1.setFill(Color.web("#dd0912"));
				c2.setFill(Color.web("#737373"));
				c3.setFill(Color.web("#737373"));
				c4.setFill(Color.web("#737373"));
			}
		};
		
		timer4.schedule(task4,8000);
	}
}