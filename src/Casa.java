

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;


public class Casa extends JComponent{
	
	
	public Casa()
	{
							
	}
	
	public void paintComponent(Graphics g)
	{
		//Sol
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 1100, 400);
		
		g.setColor(Color.yellow);
		g.fillOval(50, 50,100,100);
		
		//Casa
		
		g.setColor(new Color(255,225,240));
		g.fillRect(300, 250, 710, 20);
		g.setColor(new Color(130,0,69));
		g.fillRect(350, 270, 600, 250);
		g.setColor(Color.darkGray);
		g.fillRect(610, 420, 80, 100);
		g.setColor(Color.GRAY);
		g.fillOval(615, 460, 10, 10);
		
		//ventanas
		
		g.setColor(new Color(121,151,217));
		g.fillRect(400, 300, 100, 100);
		g.fillRect(800, 300, 100, 100);
		g.setColor(Color.BLACK);
		g.drawLine(500, 350, 400, 350);
		g.drawLine(900, 350, 800, 350);
		g.drawLine(500, 355, 400, 355);
		g.drawLine(900, 355, 800, 355);
		
		//Arbol
		
		g.setColor(new Color(117,60,51));
		g.fillRect(100, 450, 50, 100);
		g.setColor(Color.green);
		g.fillOval(100, 400, 85, 75);
		g.fillOval(90, 310, 85, 86);
		g.fillOval(90, 340, 100, 70);
		g.fillOval(110, 320, 90, 85);
		g.fillOval(40, 360, 95, 85);
		
		g.setColor(Color.green);
		g.fillRect(0, 530, 1100, 30);
		
	}			

}
