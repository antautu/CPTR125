package Homework;
// Draws an image of the Big Dipper 
import javax.swing.JApplet;
import java.awt.*;

public class Dipper extends JApplet{

	public void paint(Graphics page){
		
		page.setColor(Color.black);
		page.fillRect(0, 0, 600, 400);
		
		page.setColor(Color.white);
		page.fillOval(90, 90, 10, 10);
		page.fillOval(190,  110,  10,  10);
		page.fillOval(240, 160, 10, 10);
		page.fillOval(290, 210, 10, 10);
		page.fillOval(290,  270,  10,  10);
		page.fillOval(390,  290,  10,  10);
		page.fillOval(420,  230,  10,  10);
		
		page.drawLine(95, 95, 195, 115);
		page.drawLine(195, 115, 245, 165);
		page.drawLine(245, 165, 295, 215);
		page.drawLine(295, 215, 295, 275);
		page.drawLine(295, 275, 395, 295);
		page.drawLine(395, 295, 425, 235);
		
		
	}
}
