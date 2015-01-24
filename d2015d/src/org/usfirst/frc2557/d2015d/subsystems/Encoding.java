package org.usfirst.frc2557.d2015d.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc2557.d2015d.RobotMap;

/**
 *
 */
public class Encoding extends Subsystem {
    
    Encoder leftFront = RobotMap.leftFront;
    Encoder leftBack = RobotMap.leftBack;
    Encoder rightBack = RobotMap.rightBack;
    Encoder rightFront = RobotMap.rightFront;
    Encoder liftEncoder = RobotMap.liftEncoder;
    Encoder binEncoder = RobotMap.binEncoder;
	// Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

