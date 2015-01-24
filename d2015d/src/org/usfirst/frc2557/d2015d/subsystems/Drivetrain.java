// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2557.d2015d.subsystems;

import org.usfirst.frc2557.d2015d.RobotMap;
import org.usfirst.frc2557.d2015d.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drivetrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController speedController1 = RobotMap.drivetrainSpeedController1;
    SpeedController speedController2 = RobotMap.drivetrainSpeedController2;
    SpeedController speedController3 = RobotMap.drivetrainSpeedController3;
    SpeedController speedController4 = RobotMap.drivetrainSpeedController4;
    RobotDrive robotDrive41 = RobotMap.drivetrainRobotDrive41;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void arcadeDrive(Joystick joystick1){
    	robotDrive41.arcadeDrive(joystick1);
    	
    
    }
    
    public void mecanumDrive_Cartesian123(double x,double y,double rotation,double gyroAngle){
    	robotDrive41.mecanumDrive_Cartesian(x, y, rotation, gyroAngle);
    }

}