
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {

	public static void main(String[] args) {

		
		int length = 100;
		Robot C3P0 = new Robot("batman");
		
		String sideInput = JOptionPane.showInputDialog("How many sides do you want?");
		
		int sides = Integer.parseInt(sideInput);
		
		String colorInput = JOptionPane.showInputDialog("What is your favorite color of the rainbow?");
		
	
		if(colorInput.equalsIgnoreCase("red")){
			C3P0.setPenColor(Color.RED);
		}
		if(colorInput.equalsIgnoreCase("orange")){
			C3P0.setPenColor(Color.ORANGE);
		}
		if(colorInput.equalsIgnoreCase("yellow")){
			C3P0.setPenColor(Color.YELLOW);
}
		if(colorInput.equalsIgnoreCase("green")){
			C3P0.setPenColor(Color.GREEN);
}
		if(colorInput.equalsIgnoreCase("blue")){
			C3P0.setPenColor(Color.BLUE);
}
		if(colorInput.equalsIgnoreCase("indigo")){
			C3P0.setPenColor(75, 0, 130);
}
		if(colorInput.equalsIgnoreCase("violet")){
			C3P0.setPenColor(148, 0, 211);
		}
		C3P0.sparkle();
		C3P0.penDown();
		C3P0.setSpeed(100);
		for(int i = 0;i<sides;i++)
	{
		C3P0.move(length);
		C3P0.turn(360 / sides);
	}
}

}
