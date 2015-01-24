package org.usfirst.frc2557.d2015d.subsystems;

import org.usfirst.frc2557.d2015d.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	SpeedController intake = RobotMap.intakeController;
	DoubleSolenoid feeler = RobotMap.feeler;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

