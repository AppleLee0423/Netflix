package Netflix;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class OpenController extends Controller implements Initializable {
	private Parent root;
	private CommonService comServ;
	private	MediaPlayer mediaPlayer;
	@FXML private AnchorPane opening;
	@FXML private ImageView logo;
	@FXML private Circle circle;

	@Override
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		comServ = new CommonServiceImpl();
		comServ.stageDrag(opening);
		
		openingSound();
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
				
			@Override
			public void run() {
				// TODO Auto-generated method stub
				logoSet();
			}
		};
		timer.schedule(task,1000);
		
		TimerTask task2 = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				circleSet();
			}
		};
		timer.schedule(task2, 1300);
		
		TimerTask task3 = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				comServ.nextPage(opening, "/Netflix/Welcome.fxml");
			}
		};
		timer.schedule(task3, 5000);
	}
	
	public void logoSet(){
		Timeline timeline1 = new Timeline();
		timeline1.setCycleCount(1);
		timeline1.setAutoReverse(false);
		KeyValue kv = new KeyValue(logo.xProperty(), -126);
		KeyFrame kf = new KeyFrame(Duration.millis(2000), kv);
		timeline1.getKeyFrames().add(kf);
		timeline1.play();
	}
	
	public void circleSet() {
		Timeline timeline2 = new Timeline();
		timeline2.setCycleCount(1);
		timeline2.setAutoReverse(false);
		KeyValue kv2 = new KeyValue(circle.centerXProperty(), 150);
		KeyFrame kf2 = new KeyFrame(Duration.millis(1500), kv2);
		timeline2.getKeyFrames().add(kf2);
		timeline2.play();
	}
	
	public void openingSound() {
		Media media = new Media(getClass().getResource("/Netflix/sound/opening.mp3").toString());
		mediaPlayer = new MediaPlayer(media);
		mediaPlayer.setVolume(0.5);
		mediaPlayer.play();
	}
}