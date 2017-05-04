package Labs;

import javax.swing.JApplet;
import java.awt.*;

public class My_Animal extends JApplet{

	public void paint(Graphics page){
		// Creates the sky
		page.setColor(Color.cyan);
		page.fillRect(0, 0, 750, 500); 
		
		// Creates the grass
		page.setColor(Color.green);
		page.fillRect(0, 500, 750, 100); 
		
		// Creates the sun 
		page.setColor(Color.yellow);
		page.fillOval(-40, -40, 100, 100); 
		
		// Creates a tree
		Color customColor_brown = new Color(156, 93, 82);
		page.setColor(customColor_brown);
		page.fillRect(600, 200, 50, 300);
		page.setColor(Color.green);
		page.fillOval(550, 125, 100, 100);
		page.fillOval(600, 125, 100, 100);
		page.fillOval(575, 75, 100, 100);
		
		// Creates a dog
		page.setColor(customColor_brown);
		page.fillOval(300, 400, 75, 100); // Body
		page.fillOval(306, 355, 60, 60); // Head
		page.fillOval(300, 375, 8, 28); // Left ear
		page.fillOval(364, 375, 8, 28); // Right ear
		page.fillOval(295, 455, 15, 45); // Left hind leg
		page.fillOval(365, 455, 15, 45); // Right hind leg
		page.fillOval(310, 465, 15, 35); // Left front leg
		page.fillOval(350, 465, 15, 35); // Right front leg
		page.setColor(Color.red); 
		page.drawArc(306, 355, 60, 60, 230, 84); // Collar
		page.setColor(Color.yellow);
		page.fillOval(334, 415, 8, 8); // Tag
		page.setColor(Color.black); 
		page.fillOval(325, 375, 5, 5); // Left eye
		page.fillOval(345, 375, 5, 5); // Right eye
		page.drawArc(327, 387, 20, 12, 190, 160); // Ugly mouth
		page.fillOval(335, 383, 5, 5); // Nose
		
		// Creates a bird
		page.setColor(Color.blue);
		page.fillOval(600, 125, 15, 15); // Head
		page.fillOval(597, 136, 20, 25); // Body
		page.setColor(Color.black);
		page.fillOval(605, 128, 5, 5); // Eye
		page.setColor(Color.orange);
		page.fillPolygon(new int[] {614, 620, 614}, new int[] {128, 130, 132}, 3); // Beak
		
		// Creates a cloud
		page.setColor(Color.white);
		page.fillOval(300, 30, 100, 100);
		page.fillOval(250, 50, 100, 100);
		page.fillOval(350, 50, 100, 100);
		page.fillOval(300, 80, 100, 100);
			
	}
}
