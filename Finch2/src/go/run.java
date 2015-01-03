package go;

import java.awt.Color;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finch f = new Finch();
		f.setLED(Color.MAGENTA);
		f.setWheelVelocities(-250,-250,10000);
		
		//f.addKeyListener(this);
		
	}

}
