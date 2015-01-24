package org.usfirst.frc2557.d2015d.commands;

import org.usfirst.frc2557.d2015d.Robot;
import org.usfirst.frc2557.d2015d.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTo extends Command {
	private double x;
	private double y;
	private double rotation;
	private double gyroAngle;
	
    public DriveTo(double x1, double y1, double rotation1, double gyroAngle1) {
    	this.x = x1;
    	this.y = y1;
    	this.rotation = rotation1;
    	this.gyroAngle = gyroAngle1;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    // Drives until the object is 2 inches away
    protected void execute() {
    	while(RobotMap.ultra.getRangeInches() > 2){
    		 //Robot.drivetrain.mecanumDrive_Cartesian123(x, y, rotation, gyroAngle);
    		 //Robot.drivetrain.mecanumDrive_Cartesian123(0,-1,0,0);
    		 
    		 Robot.drivetrain.mecanumDrive_Cartesian123(this.x, this.y, this.rotation, this.gyroAngle);
    		
    	}
    	}

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
