package org.usfirst.frc2557.d2015d.subsystems;

import org.usfirst.frc2557.d2015d.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.wpilibj.Servo;

/**
 *
 */
public class Servos extends Subsystem {
	
	public Servo leftServo = RobotMap.leftServo;
	public Servo rightServo = RobotMap.rightServo;
	
	
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

