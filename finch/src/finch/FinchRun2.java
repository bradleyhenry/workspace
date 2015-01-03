package finch;

import java.awt.Color;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class FinchRun2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finch f = new Finch();
		f.setLED(Color.MAGENTA);
		f.setWheelVelocities(20,300,1000);
		
		//f.addKeyListener(this);
		
	}

}
