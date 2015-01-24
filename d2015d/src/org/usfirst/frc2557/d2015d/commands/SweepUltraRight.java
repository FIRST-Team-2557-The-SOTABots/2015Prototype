package org.usfirst.frc2557.d2015d.commands;

import org.usfirst.frc2557.d2015d.Robot;
import org.usfirst.frc2557.d2015d.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SweepUltraRight extends Command {
	private double x;

    public SweepUltraRight() {
    	requires(Robot.Servos);
    	requires(Robot.drivetrain);
    }
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

    // Called just before this Command runs the first time
    protected void initialize() {
    	x = RobotMap.rightServo.getAngle();
    }

    // Called repeatedly when this Command is scheduled to run
    // The fourth ultrasonic sensor(the one on the right) pans to find which side is more adequately covered;
    // The robot then moves away from that side until both sides are covered equally
    protected void execute() {
    	RobotMap.rightServo.setAngle(-85);
    	while(RobotMap.ultra4.getRangeInches() > 30){
    		 Robot.drivetrain.mecanumDrive_Cartesian123(1,0,0,0);
    }
    	
    	RobotMap.rightServo.setAngle(-95);
    	while(RobotMap.ultra4.getRangeInches() > 30){
    		Robot.drivetrain.mecanumDrive_Cartesian123(-1,0,0,0);
    	}
    	
    	RobotMap.rightServo.set(x);
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
