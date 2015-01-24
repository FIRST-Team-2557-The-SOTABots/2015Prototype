package org.usfirst.frc2557.d2015d.commands;

import org.usfirst.frc2557.d2015d.Robot;
import org.usfirst.frc2557.d2015d.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ChangeServoAngle extends Command {

    public ChangeServoAngle() {

    	requires(Robot.Servos);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    // Rotates the servos inward or outward based on current position
    protected void execute() {
    	if(RobotMap.leftServo.getAngle() == 0 && RobotMap.rightServo.getAngle() == 0){
    	RobotMap.leftServo.setAngle(90);
    	RobotMap.rightServo.setAngle(-90);
    	}
    	
    	if(RobotMap.leftServo.getAngle() == 90 && RobotMap.rightServo.getAngle() == -90){
    	RobotMap.leftServo.setAngle(0);
    	RobotMap.rightServo.setAngle(0);
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
