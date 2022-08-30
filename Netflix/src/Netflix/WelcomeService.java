package Netflix;

import java.util.Timer;
import java.util.TimerTask;

import javafx.scene.layout.AnchorPane;

public class WelcomeService {
	
	public void viewChange(AnchorPane p1, AnchorPane p2, AnchorPane p3, AnchorPane p4) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
				
			@Override
			public void run() {
				// TODO Auto-generated method stub
				p1.setVisible(false);
				p2.setVisible(true);
				p3.setVisible(false);
				p4.setVisible(false);
			}
		};
		
		timer.schedule(task,2000);
		
		Timer timer2 = new Timer();
		TimerTask task2 = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				p1.setVisible(false);
				p2.setVisible(false);
				p3.setVisible(true);
				p4.setVisible(false);
			}
		};
		
		timer2.schedule(task2,4000);
		
		Timer timer3 = new Timer();
		TimerTask task3 = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				p1.setVisible(false);
				p2.setVisible(false);
				p3.setVisible(false);
				p4.setVisible(true);
			}
		};
		
		timer3.schedule(task3,6000);
		
		Timer timer4 = new Timer();
		TimerTask task4 = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				p1.setVisible(true);
				p2.setVisible(false);
				p3.setVisible(false);
				p4.setVisible(false);
			}
		};
		
		timer4.schedule(task4,8000);
	} 
}
