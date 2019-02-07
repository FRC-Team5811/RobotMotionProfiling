package org.usfirst.frc.team5811.robot;



import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public Joystick joy1 = new Joystick(0);
	JoystickButton a = new JoystickButton(joy1, 2);
	JoystickButton b = new JoystickButton(joy1, 3);
	AxisButton leftJoyY = new AxisButton(joy1, 1);
	AxisButton leftJoyX = new AxisButton(joy1, 0);
	AxisButton rightJoyY = new AxisButton(joy1, 3);
	AxisButton rightJoyX = new AxisButton(joy1, 2);
	AxisButton righttrigger = new AxisButton(joy1, 4);
	DPadButton DPUp = new DPadButton(joy1, 0);
	DPadButton DRight = new DPadButton(joy1, 90);
	DPadButton DDown = new DPadButton(joy1, 180);
	DPadButton DLeft = new DPadButton(joy1, 270);

	//
	// Joystick joy2 = new Joystick(1);
	// JoystickButton aManip = new JoystickButton(joy2, 2);
	// JoystickButton bManip = new JoystickButton(joy2, 3);
	// JoystickButton yManip = new JoystickButton(joy2, 4);
	// JoystickButton xManip = new JoystickButton(joy2, 1);
	// ComboButton RLbumpers = new ComboButton(joy2, 5, 6);

	public Joystick joy2 = new Joystick(1);
	JoystickButton aManip = new JoystickButton(joy2, 2);
	JoystickButton bManip = new JoystickButton(joy2, 3);
	JoystickButton yManip = new JoystickButton(joy2, 4);
	JoystickButton xManip = new JoystickButton(joy2, 1);
	ComboButton RLbumpers = new ComboButton(joy2, 5, 6);
	AxisButton manipLeftJoyY = new AxisButton(joy2, 1);
	DPadButton manipDPUp = new DPadButton(joy2, 0);
	DPadButton manipDRight = new DPadButton(joy2, 90);
	DPadButton manipDDown = new DPadButton(joy2, 180);
	DPadButton manipDLeft = new DPadButton(joy2, 270);

	int dPadVals = joy1.getPOV();

	public OI() {

	}

	public double getLeftY() {
		return joy1.getRawAxis(1);
	}

	public double getRightY() {
		return joy1.getRawAxis(3);
	}

	public double getLeftX() {
		return joy1.getRawAxis(0);
	}

	public double getRightX() {
		return joy1.getRawAxis(2);
	}

	public double getManipLeftY() {
		return joy2.getRawAxis(1);
	}

	public int getPov() {
		return joy2.getPOV();
	}

}
