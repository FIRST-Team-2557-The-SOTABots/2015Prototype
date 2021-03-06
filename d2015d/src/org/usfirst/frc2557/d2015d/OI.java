// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2557.d2015d;

import org.usfirst.frc2557.d2015d.commands.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	// All usable joysticks are defined here
    public JoystickButton joystickButton5;
    public Joystick joystick1;
    public Joystick joystick2;
    public JoystickButton Button3;
    public JoystickButton Button5;
    public Joystick leftJoystick;
    public Joystick rightJoystick;
    public Joystick XboxController;
    // All joystick buttons are defined here
    //XBox360 Controller:
    public JoystickButton XboxA;
    public JoystickButton XboxB;
    public JoystickButton XboxX;
    public JoystickButton XboxY;
    public JoystickButton XboxLB;
    public JoystickButton XboxRB;
    public JoystickButton XboxBACK;
    public JoystickButton XboxSTART;
    public JoystickButton XboxLJB;
    public JoystickButton XboxRJB;
    public JoystickButton XboxButton;
    //Right Joystick:
    public JoystickButton RJST;
    public JoystickButton RJSTB;
    public JoystickButton RJS3;
    public JoystickButton RJS4;
    public JoystickButton RJS5;
    public JoystickButton RJS6;
    public JoystickButton RJS7;
    public JoystickButton RJS8;
    public JoystickButton RJS9;
    public JoystickButton RJS10;
    public JoystickButton RJS11;
    public JoystickButton RJS12;
    //Left Joystick:
    public JoystickButton LJST;
    public JoystickButton LJSTB;
    public JoystickButton LJS3;
    public JoystickButton LJS4;
    public JoystickButton LJS5;
    public JoystickButton LJS6;
    public JoystickButton LJS7;
    public JoystickButton LJS8;
    public JoystickButton LJS9;
    public JoystickButton LJS10;
    public JoystickButton LJS11;
    public JoystickButton LJS12;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	// Connects each variable in the operator interface to a port

        joystick2 = new Joystick(1);
        
        joystick1 = new Joystick(0); 
        
        joystickButton5 = new JoystickButton(joystick1, 1);
      //  joystickButton5.whileHeld(new CloseGrabber());
        Button3 = new JoystickButton(joystick1, 3);
        Button3.whenPressed(new UltraReading());
        Button5.whenPressed(new ChangeServoAngle());
        XboxA = new JoystickButton(XboxController, 1);       
        XboxB = new JoystickButton(XboxController, 2);
        XboxX = new JoystickButton(XboxController, 3);
        XboxY = new JoystickButton(XboxController, 4);
        XboxLB = new JoystickButton(XboxController, 5);
        XboxRB = new JoystickButton(XboxController, 6);
        XboxBACK = new JoystickButton(XboxController, 7);
        XboxSTART = new JoystickButton(XboxController, 8);
        XboxLJB = new JoystickButton(XboxController, 9);
        XboxRJB = new JoystickButton(XboxController, 10);

        //Right Joystick Buttons:
        RJST = new JoystickButton(rightJoystick, 1);
        RJSTB = new JoystickButton(rightJoystick, 2);
        RJS3 = new JoystickButton(rightJoystick, 3);
        RJS4 = new JoystickButton(rightJoystick, 4);
        RJS5 = new JoystickButton(rightJoystick, 5);
        RJS6 = new JoystickButton(rightJoystick, 6);
        RJS7 = new JoystickButton(rightJoystick, 7);
        RJS8 = new JoystickButton(rightJoystick, 8);
        RJS9 = new JoystickButton(rightJoystick, 9);
        RJS10 = new JoystickButton(rightJoystick, 10);
        RJS11 = new JoystickButton(rightJoystick, 11);
        RJS12 = new JoystickButton(rightJoystick, 12);
        //Left Joystick Buttons:
        LJST = new JoystickButton(leftJoystick, 1);
        LJSTB = new JoystickButton(leftJoystick, 2);
        LJS3 = new JoystickButton(leftJoystick, 3);
        LJS4 = new JoystickButton(leftJoystick, 4);
        LJS5 = new JoystickButton(leftJoystick, 5);
        LJS6 = new JoystickButton(leftJoystick, 6);
        LJS7 = new JoystickButton(leftJoystick, 7);
        LJS8 = new JoystickButton(leftJoystick, 8);
        LJS9 = new JoystickButton(leftJoystick, 9);
        LJS10 = new JoystickButton(leftJoystick, 10);
        LJS11 = new JoystickButton(leftJoystick, 11);
        LJS12 = new JoystickButton(leftJoystick, 12);
        
        // Ties each button to a purpose
        
	    XboxLJB.whenPressed(new LiftElevatorToToteHeight());
	    XboxRJB.whenPressed(new SetElevator());
	    XboxA.whenPressed(new GetRotation());
	    XboxX.whenPressed(new SweepUltraLeft());
	    XboxY.whenPressed(new SweepUltraRight());
	    XboxB.whenPressed(new UltraReadingBack());
	    XboxLB.whenPressed(new UltraReading());
	    XboxRB.whenPressed(new ChangeServoAngle());
	    XboxSTART.whenPressed(new SetBins());
	    XboxBACK.whenPressed(new ManipulateGrabber());
	  //  XboxButton.whenPressed(new CloseGrabber());
	    
        
	    // SmartDashboard Buttons
        

     //   SmartDashboard.putData("CloseGrabber", new CloseGrabber());

        SmartDashboard.putData("LiftElevator", new LiftElevator());

        SmartDashboard.putData("Drive", new Drive());


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    // Feedback from the joysticks themselves(axes)
    public Joystick getJoystick1() {
        return joystick1;
    }

    public Joystick getJoystick2() {
        return joystick2;
    }
    


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

